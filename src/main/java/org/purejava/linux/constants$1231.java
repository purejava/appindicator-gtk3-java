// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1231 {

    static final FunctionDescriptor gdk_event_get_seat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_get_seat$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get_seat",
        constants$1231.gdk_event_get_seat$FUNC
    );
    static final FunctionDescriptor gdk_set_show_events$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_set_show_events$MH = RuntimeHelper.downcallHandle(
        "gdk_set_show_events",
        constants$1231.gdk_set_show_events$FUNC
    );
    static final FunctionDescriptor gdk_get_show_events$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gdk_get_show_events$MH = RuntimeHelper.downcallHandle(
        "gdk_get_show_events",
        constants$1231.gdk_get_show_events$FUNC
    );
    static final FunctionDescriptor gdk_setting_get$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_setting_get$MH = RuntimeHelper.downcallHandle(
        "gdk_setting_get",
        constants$1231.gdk_setting_get$FUNC
    );
    static final FunctionDescriptor gdk_event_get_device_tool$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_get_device_tool$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get_device_tool",
        constants$1231.gdk_event_get_device_tool$FUNC
    );
    static final FunctionDescriptor gdk_event_set_device_tool$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_set_device_tool$MH = RuntimeHelper.downcallHandle(
        "gdk_event_set_device_tool",
        constants$1231.gdk_event_set_device_tool$FUNC
    );
}

