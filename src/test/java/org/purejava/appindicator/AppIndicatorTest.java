package org.purejava.appindicator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

class AppIndicatorTest {
    private static final Logger LOG = LoggerFactory.getLogger(AppIndicatorTest.class);
    private static boolean isLoaded = false;
    private static final String LD_CONFIG = "/etc/ld.so.conf.d/";
    private static final String LIB_NAME_VERSION = "libappindicator3.so.1";
    private static final String FLATPAK_LIB_NAME_VERSION = "libappindicator3.so";
    private static final String LIBNAME_WITH_VERSION = "appindicator3";
    private static List<String> allPath = new LinkedList<>();

    @Test
    @Order(1)
    @DisplayName("Testing availability of native lib")
    @EnabledOnOs(OS.LINUX)
    public void shouldHaveNoErrors() {
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
                if (!path.equals("/app/lib")) {
                    System.load(path + File.separator + LIB_NAME_VERSION);
                } else {
                    // flatpak has an own, self-compiled version
                    System.load(path + File.separator + FLATPAK_LIB_NAME_VERSION);
                }
                isLoaded = true;
                break;
            } catch (UnsatisfiedLinkError ignored) { }
        }

        // When loading via System.load wasn't successful, try to load via System.loadLibrary
        if (!isLoaded) {
            try {
                System.loadLibrary(LIBNAME_WITH_VERSION);
                isLoaded = true;
            } catch (UnsatisfiedLinkError ignored) { }
        }
        LOG.info(isLoaded ? "Native code library libappindicator3 successfully loaded" : "Native code library libappindicator3 failed to load");
    }
}