// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1114 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1114() {}
    static final FunctionDescriptor gdk_display_set_double_click_distance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_display_set_double_click_distance$MH = RuntimeHelper.downcallHandle(
        "gdk_display_set_double_click_distance",
        constants$1114.gdk_display_set_double_click_distance$FUNC
    );
    static final FunctionDescriptor gdk_display_get_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_display_get_default$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_default",
        constants$1114.gdk_display_get_default$FUNC
    );
    static final FunctionDescriptor gdk_display_get_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_pointer$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_pointer",
        constants$1114.gdk_display_get_pointer$FUNC
    );
    static final FunctionDescriptor gdk_display_get_window_at_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_window_at_pointer$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_window_at_pointer",
        constants$1114.gdk_display_get_window_at_pointer$FUNC
    );
    static final FunctionDescriptor gdk_display_warp_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_display_warp_pointer$MH = RuntimeHelper.downcallHandle(
        "gdk_display_warp_pointer",
        constants$1114.gdk_display_warp_pointer$FUNC
    );
    static final FunctionDescriptor gdk_display_open_default_libgtk_only$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_display_open_default_libgtk_only$MH = RuntimeHelper.downcallHandle(
        "gdk_display_open_default_libgtk_only",
        constants$1114.gdk_display_open_default_libgtk_only$FUNC
    );
}


