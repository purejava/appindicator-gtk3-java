// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1254 {

    static final FunctionDescriptor gdk_window_peek_children$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_peek_children$MH = RuntimeHelper.downcallHandle(
        "gdk_window_peek_children",
        constants$1254.gdk_window_peek_children$FUNC
    );
    static final FunctionDescriptor gdk_window_get_children_with_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_children_with_user_data$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_children_with_user_data",
        constants$1254.gdk_window_get_children_with_user_data$FUNC
    );
    static final FunctionDescriptor gdk_window_get_events$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_events$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_events",
        constants$1254.gdk_window_get_events$FUNC
    );
    static final FunctionDescriptor gdk_window_set_events$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_events$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_events",
        constants$1254.gdk_window_set_events$FUNC
    );
    static final FunctionDescriptor gdk_window_set_device_events$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_device_events$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_device_events",
        constants$1254.gdk_window_set_device_events$FUNC
    );
    static final FunctionDescriptor gdk_window_get_device_events$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_device_events$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_device_events",
        constants$1254.gdk_window_get_device_events$FUNC
    );
}


