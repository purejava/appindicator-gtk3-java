// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$320 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$320() {}
    static final FunctionDescriptor g_test_suite_add_suite$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_suite_add_suite$MH = RuntimeHelper.downcallHandle(
        "g_test_suite_add_suite",
        constants$320.g_test_suite_add_suite$FUNC
    );
    static final FunctionDescriptor g_test_run_suite$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_run_suite$MH = RuntimeHelper.downcallHandle(
        "g_test_run_suite",
        constants$320.g_test_run_suite$FUNC
    );
    static final FunctionDescriptor g_test_case_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_case_free$MH = RuntimeHelper.downcallHandle(
        "g_test_case_free",
        constants$320.g_test_case_free$FUNC
    );
    static final FunctionDescriptor g_test_suite_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_suite_free$MH = RuntimeHelper.downcallHandle(
        "g_test_suite_free",
        constants$320.g_test_suite_free$FUNC
    );
    static final FunctionDescriptor g_test_trap_assertions$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_trap_assertions$MH = RuntimeHelper.downcallHandle(
        "g_test_trap_assertions",
        constants$320.g_test_trap_assertions$FUNC
    );
    static final FunctionDescriptor g_assertion_message$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_assertion_message$MH = RuntimeHelper.downcallHandle(
        "g_assertion_message",
        constants$320.g_assertion_message$FUNC
    );
}


