// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$61 {

    static final FunctionDescriptor g_thread_exit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_exit$MH = RuntimeHelper.downcallHandle(
        "g_thread_exit",
        constants$61.g_thread_exit$FUNC
    );
    static final FunctionDescriptor g_thread_join$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_join$MH = RuntimeHelper.downcallHandle(
        "g_thread_join",
        constants$61.g_thread_join$FUNC
    );
    static final FunctionDescriptor g_thread_yield$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_thread_yield$MH = RuntimeHelper.downcallHandle(
        "g_thread_yield",
        constants$61.g_thread_yield$FUNC
    );
    static final FunctionDescriptor g_mutex_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mutex_init$MH = RuntimeHelper.downcallHandle(
        "g_mutex_init",
        constants$61.g_mutex_init$FUNC
    );
    static final FunctionDescriptor g_mutex_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mutex_clear$MH = RuntimeHelper.downcallHandle(
        "g_mutex_clear",
        constants$61.g_mutex_clear$FUNC
    );
    static final FunctionDescriptor g_mutex_lock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mutex_lock$MH = RuntimeHelper.downcallHandle(
        "g_mutex_lock",
        constants$61.g_mutex_lock$FUNC
    );
}

