// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1056 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1056() {}
    static final FunctionDescriptor gdk_device_set_axis_use$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_set_axis_use$MH = RuntimeHelper.downcallHandle(
        "gdk_device_set_axis_use",
        constants$1056.gdk_device_set_axis_use$FUNC
    );
    static final FunctionDescriptor gdk_device_get_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_state$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_state",
        constants$1056.gdk_device_get_state$FUNC
    );
    static final FunctionDescriptor gdk_device_get_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_position$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_position",
        constants$1056.gdk_device_get_position$FUNC
    );
    static final FunctionDescriptor gdk_device_get_window_at_position$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_window_at_position$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_window_at_position",
        constants$1056.gdk_device_get_window_at_position$FUNC
    );
    static final FunctionDescriptor gdk_device_get_position_double$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_position_double$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_position_double",
        constants$1056.gdk_device_get_position_double$FUNC
    );
    static final FunctionDescriptor gdk_device_get_window_at_position_double$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_window_at_position_double$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_window_at_position_double",
        constants$1056.gdk_device_get_window_at_position_double$FUNC
    );
}


