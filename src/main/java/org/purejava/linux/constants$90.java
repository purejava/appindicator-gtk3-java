// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$90 {

    static final FunctionDescriptor g_date_time_to_timeval$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_to_timeval$MH = RuntimeHelper.downcallHandle(
        "g_date_time_to_timeval",
        constants$90.g_date_time_to_timeval$FUNC
    );
    static final FunctionDescriptor g_date_time_get_utc_offset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_get_utc_offset$MH = RuntimeHelper.downcallHandle(
        "g_date_time_get_utc_offset",
        constants$90.g_date_time_get_utc_offset$FUNC
    );
    static final FunctionDescriptor g_date_time_get_timezone$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_get_timezone$MH = RuntimeHelper.downcallHandle(
        "g_date_time_get_timezone",
        constants$90.g_date_time_get_timezone$FUNC
    );
    static final FunctionDescriptor g_date_time_get_timezone_abbreviation$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_get_timezone_abbreviation$MH = RuntimeHelper.downcallHandle(
        "g_date_time_get_timezone_abbreviation",
        constants$90.g_date_time_get_timezone_abbreviation$FUNC
    );
    static final FunctionDescriptor g_date_time_is_daylight_savings$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_is_daylight_savings$MH = RuntimeHelper.downcallHandle(
        "g_date_time_is_daylight_savings",
        constants$90.g_date_time_is_daylight_savings$FUNC
    );
    static final FunctionDescriptor g_date_time_to_timezone$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_to_timezone$MH = RuntimeHelper.downcallHandle(
        "g_date_time_to_timezone",
        constants$90.g_date_time_to_timezone$FUNC
    );
}


