// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$273 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$273() {}
    static final FunctionDescriptor g_pattern_match_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pattern_match_string$MH = RuntimeHelper.downcallHandle(
        "g_pattern_match_string",
        constants$273.g_pattern_match_string$FUNC
    );
    static final FunctionDescriptor g_pattern_match_simple$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pattern_match_simple$MH = RuntimeHelper.downcallHandle(
        "g_pattern_match_simple",
        constants$273.g_pattern_match_simple$FUNC
    );
    static final FunctionDescriptor g_spaced_primes_closest$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_spaced_primes_closest$MH = RuntimeHelper.downcallHandle(
        "g_spaced_primes_closest",
        constants$273.g_spaced_primes_closest$FUNC
    );
    static final FunctionDescriptor g_qsort_with_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_qsort_with_data$MH = RuntimeHelper.downcallHandle(
        "g_qsort_with_data",
        constants$273.g_qsort_with_data$FUNC
    );
    static final FunctionDescriptor g_queue_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_queue_new$MH = RuntimeHelper.downcallHandle(
        "g_queue_new",
        constants$273.g_queue_new$FUNC
    );
    static final FunctionDescriptor g_queue_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_free$MH = RuntimeHelper.downcallHandle(
        "g_queue_free",
        constants$273.g_queue_free$FUNC
    );
}


