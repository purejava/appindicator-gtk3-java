// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1067 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1067() {}
    static final FunctionDescriptor gdk_event_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_copy$MH = RuntimeHelper.downcallHandle(
        "gdk_event_copy",
        constants$1067.gdk_event_copy$FUNC
    );
    static final FunctionDescriptor gdk_event_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_free$MH = RuntimeHelper.downcallHandle(
        "gdk_event_free",
        constants$1067.gdk_event_free$FUNC
    );
    static final FunctionDescriptor gdk_event_get_window$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_get_window$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get_window",
        constants$1067.gdk_event_get_window$FUNC
    );
    static final FunctionDescriptor gdk_event_get_time$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_get_time$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get_time",
        constants$1067.gdk_event_get_time$FUNC
    );
    static final FunctionDescriptor gdk_event_get_state$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_get_state$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get_state",
        constants$1067.gdk_event_get_state$FUNC
    );
    static final FunctionDescriptor gdk_event_get_coords$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_event_get_coords$MH = RuntimeHelper.downcallHandle(
        "gdk_event_get_coords",
        constants$1067.gdk_event_get_coords$FUNC
    );
}


