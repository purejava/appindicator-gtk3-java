// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1078 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1078() {}
    static final FunctionDescriptor gdk_window_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_new$MH = RuntimeHelper.downcallHandle(
        "gdk_window_new",
        constants$1078.gdk_window_new$FUNC
    );
    static final FunctionDescriptor gdk_window_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_destroy$MH = RuntimeHelper.downcallHandle(
        "gdk_window_destroy",
        constants$1078.gdk_window_destroy$FUNC
    );
    static final FunctionDescriptor gdk_window_get_window_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_window_type$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_window_type",
        constants$1078.gdk_window_get_window_type$FUNC
    );
    static final FunctionDescriptor gdk_window_is_destroyed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_is_destroyed$MH = RuntimeHelper.downcallHandle(
        "gdk_window_is_destroyed",
        constants$1078.gdk_window_is_destroyed$FUNC
    );
    static final FunctionDescriptor gdk_window_get_visual$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_visual$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_visual",
        constants$1078.gdk_window_get_visual$FUNC
    );
    static final FunctionDescriptor gdk_window_get_screen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_screen$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_screen",
        constants$1078.gdk_window_get_screen$FUNC
    );
}


