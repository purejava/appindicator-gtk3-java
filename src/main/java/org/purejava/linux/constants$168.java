// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$168 {

    static final FunctionDescriptor g_main_context_find_source_by_funcs_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_find_source_by_funcs_user_data$MH = RuntimeHelper.downcallHandle(
        "g_main_context_find_source_by_funcs_user_data",
        constants$168.g_main_context_find_source_by_funcs_user_data$FUNC
    );
    static final FunctionDescriptor g_main_context_wakeup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_wakeup$MH = RuntimeHelper.downcallHandle(
        "g_main_context_wakeup",
        constants$168.g_main_context_wakeup$FUNC
    );
    static final FunctionDescriptor g_main_context_acquire$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_acquire$MH = RuntimeHelper.downcallHandle(
        "g_main_context_acquire",
        constants$168.g_main_context_acquire$FUNC
    );
    static final FunctionDescriptor g_main_context_release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_release$MH = RuntimeHelper.downcallHandle(
        "g_main_context_release",
        constants$168.g_main_context_release$FUNC
    );
    static final FunctionDescriptor g_main_context_is_owner$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_is_owner$MH = RuntimeHelper.downcallHandle(
        "g_main_context_is_owner",
        constants$168.g_main_context_is_owner$FUNC
    );
    static final FunctionDescriptor g_main_context_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_wait$MH = RuntimeHelper.downcallHandle(
        "g_main_context_wait",
        constants$168.g_main_context_wait$FUNC
    );
}

