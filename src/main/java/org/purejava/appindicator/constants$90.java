// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$90 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$90() {}
    static final FunctionDescriptor g_date_time_get_seconds$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_get_seconds$MH = RuntimeHelper.downcallHandle(
        "g_date_time_get_seconds",
        constants$90.g_date_time_get_seconds$FUNC
    );
    static final FunctionDescriptor g_date_time_to_unix$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_date_time_to_unix$MH = RuntimeHelper.downcallHandle(
        "g_date_time_to_unix",
        constants$90.g_date_time_to_unix$FUNC
    );
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
}


