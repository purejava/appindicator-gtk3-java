// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1082 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1082() {}
    static final FunctionDescriptor gdk_window_set_accept_focus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_accept_focus$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_accept_focus",
        constants$1082.gdk_window_set_accept_focus$FUNC
    );
    static final FunctionDescriptor gdk_window_get_focus_on_map$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_focus_on_map$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_focus_on_map",
        constants$1082.gdk_window_get_focus_on_map$FUNC
    );
    static final FunctionDescriptor gdk_window_set_focus_on_map$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_focus_on_map$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_focus_on_map",
        constants$1082.gdk_window_set_focus_on_map$FUNC
    );
    static final FunctionDescriptor gdk_window_add_filter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_add_filter$MH = RuntimeHelper.downcallHandle(
        "gdk_window_add_filter",
        constants$1082.gdk_window_add_filter$FUNC
    );
    static final FunctionDescriptor gdk_window_remove_filter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_remove_filter$MH = RuntimeHelper.downcallHandle(
        "gdk_window_remove_filter",
        constants$1082.gdk_window_remove_filter$FUNC
    );
    static final FunctionDescriptor gdk_window_scroll$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_scroll$MH = RuntimeHelper.downcallHandle(
        "gdk_window_scroll",
        constants$1082.gdk_window_scroll$FUNC
    );
}


