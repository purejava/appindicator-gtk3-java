// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1075 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1075() {}
    static final FunctionDescriptor gdk_frame_timings_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_timings_unref$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_timings_unref",
        constants$1075.gdk_frame_timings_unref$FUNC
    );
    static final FunctionDescriptor gdk_frame_timings_get_frame_counter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_timings_get_frame_counter$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_timings_get_frame_counter",
        constants$1075.gdk_frame_timings_get_frame_counter$FUNC
    );
    static final FunctionDescriptor gdk_frame_timings_get_complete$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_timings_get_complete$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_timings_get_complete",
        constants$1075.gdk_frame_timings_get_complete$FUNC
    );
    static final FunctionDescriptor gdk_frame_timings_get_frame_time$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_timings_get_frame_time$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_timings_get_frame_time",
        constants$1075.gdk_frame_timings_get_frame_time$FUNC
    );
    static final FunctionDescriptor gdk_frame_timings_get_presentation_time$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_timings_get_presentation_time$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_timings_get_presentation_time",
        constants$1075.gdk_frame_timings_get_presentation_time$FUNC
    );
    static final FunctionDescriptor gdk_frame_timings_get_refresh_interval$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_frame_timings_get_refresh_interval$MH = RuntimeHelper.downcallHandle(
        "gdk_frame_timings_get_refresh_interval",
        constants$1075.gdk_frame_timings_get_refresh_interval$FUNC
    );
}


