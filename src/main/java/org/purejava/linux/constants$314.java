// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$314 {

    static final FunctionDescriptor g_test_trap_subprocess$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_test_trap_subprocess$MH = RuntimeHelper.downcallHandle(
        "g_test_trap_subprocess",
        constants$314.g_test_trap_subprocess$FUNC
    );
    static final FunctionDescriptor g_test_trap_has_passed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_test_trap_has_passed$MH = RuntimeHelper.downcallHandle(
        "g_test_trap_has_passed",
        constants$314.g_test_trap_has_passed$FUNC
    );
    static final FunctionDescriptor g_test_trap_reached_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_test_trap_reached_timeout$MH = RuntimeHelper.downcallHandle(
        "g_test_trap_reached_timeout",
        constants$314.g_test_trap_reached_timeout$FUNC
    );
    static final FunctionDescriptor g_test_rand_int$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_test_rand_int$MH = RuntimeHelper.downcallHandle(
        "g_test_rand_int",
        constants$314.g_test_rand_int$FUNC
    );
    static final FunctionDescriptor g_test_rand_int_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_test_rand_int_range$MH = RuntimeHelper.downcallHandle(
        "g_test_rand_int_range",
        constants$314.g_test_rand_int_range$FUNC
    );
    static final FunctionDescriptor g_test_rand_double$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT);
    static final MethodHandle g_test_rand_double$MH = RuntimeHelper.downcallHandle(
        "g_test_rand_double",
        constants$314.g_test_rand_double$FUNC
    );
}


