package org.purejava.appindicator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.purejava.appindicator.app_indicator_h.*;

public final class AppIndicator {

    private static final Logger LOG = LoggerFactory.getLogger(AppIndicator.class);
    private static boolean isLoaded = false;
    private static boolean ayatana = false;
    private static boolean appindicator = false;
    private static final String LD_CONFIG = "/etc/ld.so.conf.d/";
    private static final String APPINDICATOR_VERSION = "libappindicator3.so.1";
    private static final String FLATPAK_APPINDICATOR_VERSION = "libappindicator3.so";
    private static final String AYATANA_APPINDICATOR_VERSION = "libayatana-appindicator3.so.1";
    private static final String AYATANA_APPINDICATOR_LIBNAME_VERSION = "ayatana-appindicator3";
    private static final String APPINDICATOR_LIBNAME_VERSION = "appindicator3";
    private static  List<String> allPath = new LinkedList<>();

    static {
        try (Stream<Path> paths = Files.list(Path.of(LD_CONFIG))) {
            paths.forEach((file) -> {
                try (Stream<String> lines = Files.lines(file)) {
                    List<String> collection = lines.filter(line -> line.startsWith("/")).toList();
                    allPath.addAll(collection);
                } catch (IOException e) {
                    LOG.error("File '{}' could not be loaded", file);
                }
            });
        } catch (IOException e) {
            LOG.error("Directory '{}' does not exist", LD_CONFIG);
        }

        allPath.add("/usr/lib"); // for systems, that don't implement multiarch
        allPath.add("/app/lib"); // for flatpak and libraries in the flatpak sandbox
        for (String path : allPath) {
            try {
                System.load(path + File.separator + AYATANA_APPINDICATOR_VERSION);
                isLoaded = true;
                ayatana = true;
                break;
            } catch (UnsatisfiedLinkError e) {
                try {
                    if (!path.equals("/app/lib")) {
                        System.load(path + File.separator + APPINDICATOR_VERSION);
                    } else {
                        // flatpak has an own, self-compiled version
                        System.load(path + File.separator + FLATPAK_APPINDICATOR_VERSION);
                    }
                    isLoaded = true;
                    appindicator = true;
                    break;
                } catch (UnsatisfiedLinkError ignored) { }
            }
        }

        // When loading via System.load wasn't successful, try to load via System.loadLibrary
        if (!isLoaded) {
            try {
                System.loadLibrary(AYATANA_APPINDICATOR_LIBNAME_VERSION);
                isLoaded = true;
                ayatana = true;
            } catch (UnsatisfiedLinkError e) {
                try {
                    System.loadLibrary(APPINDICATOR_LIBNAME_VERSION);
                    isLoaded = true;
                    appindicator = true;
                } catch (UnsatisfiedLinkError ignored) { }
            }
        }
        LOG.info(ayatana ? "Native code library " + AYATANA_APPINDICATOR_VERSION + " successfully loaded" : "Native code library " + AYATANA_APPINDICATOR_VERSION + " failed to load");
        LOG.info(appindicator ? "Native code library libappindicator3 successfully loaded" : "Native code library libappindicator3 failed to load");
    }

    /**
     * Creates a new AppIndicator setting the properties: “id” with id , “category” with category and “icon-name” with iconName.
     * @param id       The unique id of the indicator to create.
     * @param iconName The icon name for this indicator.
     * @param category The category of indicator.
     * @return A pointer to a new AppIndicator object.
     */
    public static MemorySegment newIndicator(String id, String iconName, int category) {
        if (null != id && null != iconName) {
            try (var arena = Arena.ofConfined()) {
                return app_indicator_new(arena.allocateFrom(id), arena.allocateFrom(iconName), category);
            }
        } else {
            return MemorySegment.NULL;
        }
    }

    /**
     * This function allows for building the Application Indicator menu from a static desktop file.
     * @param self           The AppIndicator object to use.
     * @param desktopFile    A path to the desktop file to build the menu from.
     * @param desktopProfile Which entries should be used from the desktop file.
     */
    public static void buildMenuFromDesktop(MemorySegment self, String desktopFile, String desktopProfile) {
        if (null != self && null != desktopFile && null != desktopProfile) {
            try (var arena = Arena.ofConfined()) {
                app_indicator_build_menu_from_desktop(self, arena.allocateFrom(desktopFile), arena.allocateFrom(desktopProfile));
            }
        }
    }

    /**
     * Wrapper function for property “category”.
     * @param self The AppIndicator object to use.
     * @return The current category.
     */
    public static int getCategory(MemorySegment self) {
        return null != self ? app_indicator_get_category(self) : -1;
    }

    /**
     * Wrapper function for property “attention-icon-name”.
     * @param self The AppIndicator object to use.
     * @return The current attention icon name.
     */
    public static String getAttentionIcon(MemorySegment self) {
        return null != self ? app_indicator_get_attention_icon(self).getString(0) : "";
    }

    /**
     * Wrapper function for property “id”.
     * @param self The AppIndicator object to use.
     * @return The current ID.
     */
    public static String getID(MemorySegment self) {
        return null != self ? app_indicator_get_id(self).getString(0) : "";
    }

    /**
     * Wrapper function for property “icon-name”.
     * @param self The AppIndicator object to use.
     * @return The current icon name.
     */
    public static String getIcon(MemorySegment self) {
        return null != self ? app_indicator_get_icon(self).getString(0) : "";
    }

    /**
     * Wrapper function for property “label”.
     * @param self The AppIndicator object to use.
     * @return The current label.
     */
    public static String getLabel(MemorySegment self) {
        return null != self ? app_indicator_get_label(self).getString(0) : "";
    }

    /**
     * Gets the menu being used for this application indicator. Wrapper function for property “menu”.
     * @param self The AppIndicator object to use.
     * @return A GtkMenu object or NULL if one hasn't been set.
     */
    public static MemorySegment getMenu(MemorySegment self) {
        return null != self ? app_indicator_get_menu(self) : MemorySegment.NULL;
    }

    /**
     * Wrapper function for property “ordering-index”.
     * @param self The AppIndicator object to use.
     * @return The current ordering index.
     */
    public static int getOrderingIndex(MemorySegment self) {
        return null != self ? app_indicator_get_ordering_index(self) : 0;
    }

    /**
     * Wrapper function for property “status”.
     * @param self The AppIndicator object to use.
     * @return The current status.
     */
    public static int getStatus(MemorySegment self) {
        return null != self ? app_indicator_get_status(self) : -1;
    }

    public static boolean isLoaded() {
        return isLoaded;
    }
}
