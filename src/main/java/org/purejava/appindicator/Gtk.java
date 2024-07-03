package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static org.purejava.appindicator.app_indicator_h.*;

public final class Gtk {

    /**
     * Creates a new GtkMenu.
     * @return A new GtkMenu.
     */
    public static MemorySegment newMenu() {
        return gtk_menu_new();
    }

    /**
     * Sets the sensitivity of a widget. A widget is sensitive if the user can interact with it. Insensitive widgets
     * are “grayed out” and the user can’t interact with them. Insensitive widgets are known as “inactive”, “disabled”,
     * or “ghosted” in some other toolkits.
     * @param widget    A GtkWidget.
     * @param sensitive TRUE to make the widget sensitive.
     */
    public static void widgetSetSensitive(MemorySegment widget, boolean sensitive) {
        if (null != widget) {
            gtk_widget_set_sensitive(widget, sensitive ? 1 : 0);
        }
    }

    /**
     * Recursively shows a widget, and any child widgets (if the widget is a container).
     * @param widget A GtkWidget.
     */
    public static void widgetShowAll(MemorySegment widget) {
        if (null != widget) {
            gtk_widget_show_all(widget);
        }
    }

    /**
     * Creates a new GtkMenuItem.
     * @return The newly created GtkMenuItem.
     */
    public static MemorySegment newMenuItem() {
        return gtk_menu_item_new();
    }

    /**
     * Sets text on the menu_item label.
     * @param menuItem A GtkMenuItem.
     * @param label    The text you want to set.
     */
    public static void menuItemSetLabel(MemorySegment menuItem, String label) {
        if (null != menuItem && null!= label) {
            try (var arena = Arena.ofConfined()) {
                gtk_menu_item_set_label(menuItem, arena.allocateFrom(label));
            }
        }
    }

    /**
     * Adds a new GtkMenuItem to the end of the menu shell’s item list.
     * @param menuShell A GtkMenuShell:
     * @param child     The GtkMenuItem to add.
     */
    public static void menuShellAppend(MemorySegment menuShell, MemorySegment child) {
        if (null != menuShell && null!= child) {
            gtk_menu_shell_append(menuShell, child);
        }
    }

    /**
     * Sets or replaces the menu item’s submenu, or removes it when a NULL submenu is passed.
     * @param menuItem A GtkMenuItem.
     * @param submenu The submenu, or NULL.
     */
    public static void menuItemSetSubmenu(MemorySegment menuItem, MemorySegment submenu) {
        if (null != menuItem) {
            gtk_menu_item_set_submenu(menuItem, submenu);
        }
    }
}
