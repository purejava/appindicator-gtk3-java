// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$850 {

    static final FunctionDescriptor g_task_return_boolean$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_task_return_boolean$MH = RuntimeHelper.downcallHandle(
        "g_task_return_boolean",
        constants$850.g_task_return_boolean$FUNC
    );
    static final FunctionDescriptor g_task_return_int$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_task_return_int$MH = RuntimeHelper.downcallHandle(
        "g_task_return_int",
        constants$850.g_task_return_int$FUNC
    );
    static final FunctionDescriptor g_task_return_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_return_error$MH = RuntimeHelper.downcallHandle(
        "g_task_return_error",
        constants$850.g_task_return_error$FUNC
    );
    static final FunctionDescriptor g_task_return_new_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_return_new_error$MH = RuntimeHelper.downcallHandleVariadic(
        "g_task_return_new_error",
        constants$850.g_task_return_new_error$FUNC
    );
    static final FunctionDescriptor g_task_return_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_return_value$MH = RuntimeHelper.downcallHandle(
        "g_task_return_value",
        constants$850.g_task_return_value$FUNC
    );
    static final FunctionDescriptor g_task_return_error_if_cancelled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_return_error_if_cancelled$MH = RuntimeHelper.downcallHandle(
        "g_task_return_error_if_cancelled",
        constants$850.g_task_return_error_if_cancelled$FUNC
    );
}


