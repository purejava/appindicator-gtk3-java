// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$311 {

    static final FunctionDescriptor g_test_fail$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_test_fail$MH = RuntimeHelper.downcallHandle(
        "g_test_fail",
        constants$311.g_test_fail$FUNC
    );
    static final FunctionDescriptor g_test_fail_printf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_fail_printf$MH = RuntimeHelper.downcallHandleVariadic(
        "g_test_fail_printf",
        constants$311.g_test_fail_printf$FUNC
    );
    static final FunctionDescriptor g_test_incomplete$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_incomplete$MH = RuntimeHelper.downcallHandle(
        "g_test_incomplete",
        constants$311.g_test_incomplete$FUNC
    );
    static final FunctionDescriptor g_test_incomplete_printf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_incomplete_printf$MH = RuntimeHelper.downcallHandleVariadic(
        "g_test_incomplete_printf",
        constants$311.g_test_incomplete_printf$FUNC
    );
    static final FunctionDescriptor g_test_skip$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_skip$MH = RuntimeHelper.downcallHandle(
        "g_test_skip",
        constants$311.g_test_skip$FUNC
    );
    static final FunctionDescriptor g_test_skip_printf$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_skip_printf$MH = RuntimeHelper.downcallHandleVariadic(
        "g_test_skip_printf",
        constants$311.g_test_skip_printf$FUNC
    );
}


