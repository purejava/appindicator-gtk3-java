// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1095 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1095() {}
    static final FunctionDescriptor gdk_window_get_children_with_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_children_with_user_data$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_children_with_user_data",
        constants$1095.gdk_window_get_children_with_user_data$FUNC
    );
    static final FunctionDescriptor gdk_window_get_events$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_events$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_events",
        constants$1095.gdk_window_get_events$FUNC
    );
    static final FunctionDescriptor gdk_window_set_events$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_events$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_events",
        constants$1095.gdk_window_set_events$FUNC
    );
    static final FunctionDescriptor gdk_window_set_device_events$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_device_events$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_device_events",
        constants$1095.gdk_window_set_device_events$FUNC
    );
    static final FunctionDescriptor gdk_window_get_device_events$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_device_events$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_device_events",
        constants$1095.gdk_window_get_device_events$FUNC
    );
    static final FunctionDescriptor gdk_window_set_source_events$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_source_events$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_source_events",
        constants$1095.gdk_window_set_source_events$FUNC
    );
}


