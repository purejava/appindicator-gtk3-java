// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1641 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1641() {}
    static final FunctionDescriptor gtk_icon_theme_set_screen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_set_screen$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_set_screen",
        constants$1641.gtk_icon_theme_set_screen$FUNC
    );
    static final FunctionDescriptor gtk_icon_theme_set_search_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_set_search_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_set_search_path",
        constants$1641.gtk_icon_theme_set_search_path$FUNC
    );
    static final FunctionDescriptor gtk_icon_theme_get_search_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_get_search_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_get_search_path",
        constants$1641.gtk_icon_theme_get_search_path$FUNC
    );
    static final FunctionDescriptor gtk_icon_theme_append_search_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_append_search_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_append_search_path",
        constants$1641.gtk_icon_theme_append_search_path$FUNC
    );
    static final FunctionDescriptor gtk_icon_theme_prepend_search_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_prepend_search_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_prepend_search_path",
        constants$1641.gtk_icon_theme_prepend_search_path$FUNC
    );
    static final FunctionDescriptor gtk_icon_theme_add_resource_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_theme_add_resource_path$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_add_resource_path",
        constants$1641.gtk_icon_theme_add_resource_path$FUNC
    );
}


