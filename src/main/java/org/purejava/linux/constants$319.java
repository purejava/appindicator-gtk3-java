// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$319 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$319() {}
    static final FunctionDescriptor g_test_rand_double$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT);
    static final MethodHandle g_test_rand_double$MH = RuntimeHelper.downcallHandle(
        "g_test_rand_double",
        constants$319.g_test_rand_double$FUNC
    );
    static final FunctionDescriptor g_test_rand_double_range$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle g_test_rand_double_range$MH = RuntimeHelper.downcallHandle(
        "g_test_rand_double_range",
        constants$319.g_test_rand_double_range$FUNC
    );
    static final FunctionDescriptor g_test_create_case$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_create_case$MH = RuntimeHelper.downcallHandle(
        "g_test_create_case",
        constants$319.g_test_create_case$FUNC
    );
    static final FunctionDescriptor g_test_create_suite$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_create_suite$MH = RuntimeHelper.downcallHandle(
        "g_test_create_suite",
        constants$319.g_test_create_suite$FUNC
    );
    static final FunctionDescriptor g_test_get_root$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_test_get_root$MH = RuntimeHelper.downcallHandle(
        "g_test_get_root",
        constants$319.g_test_get_root$FUNC
    );
    static final FunctionDescriptor g_test_suite_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_suite_add$MH = RuntimeHelper.downcallHandle(
        "g_test_suite_add",
        constants$319.g_test_suite_add$FUNC
    );
}


