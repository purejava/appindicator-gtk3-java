// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1069 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1069() {}
    static final FunctionDescriptor gdk_event_get_scroll_deltas$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_get_scroll_deltas$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get_scroll_deltas",
        constants$1069.gdk_event_get_scroll_deltas$FUNC
    );
    static final FunctionDescriptor gdk_event_is_scroll_stop_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_is_scroll_stop_event$MH = RuntimeHelper.downcallHandle(
        "gdk_event_is_scroll_stop_event",
        constants$1069.gdk_event_is_scroll_stop_event$FUNC
    );
    static final FunctionDescriptor gdk_event_get_axis$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_get_axis$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get_axis",
        constants$1069.gdk_event_get_axis$FUNC
    );
    static final FunctionDescriptor gdk_event_set_device$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_set_device$MH = RuntimeHelper.downcallHandle(
        "gdk_event_set_device",
        constants$1069.gdk_event_set_device$FUNC
    );
    static final FunctionDescriptor gdk_event_get_device$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_get_device$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get_device",
        constants$1069.gdk_event_get_device$FUNC
    );
    static final FunctionDescriptor gdk_event_set_source_device$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_set_source_device$MH = RuntimeHelper.downcallHandle(
        "gdk_event_set_source_device",
        constants$1069.gdk_event_set_source_device$FUNC
    );
}

