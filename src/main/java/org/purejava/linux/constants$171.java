// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$171 {

    static final FunctionDescriptor g_main_context_get_thread_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_main_context_get_thread_default$MH = RuntimeHelper.downcallHandle(
        "g_main_context_get_thread_default",
        constants$171.g_main_context_get_thread_default$FUNC
    );
    static final FunctionDescriptor g_main_context_ref_thread_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_main_context_ref_thread_default$MH = RuntimeHelper.downcallHandle(
        "g_main_context_ref_thread_default",
        constants$171.g_main_context_ref_thread_default$FUNC
    );
    static final FunctionDescriptor g_main_context_pusher_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_pusher_new$MH = RuntimeHelper.downcallHandle(
        "g_main_context_pusher_new",
        constants$171.g_main_context_pusher_new$FUNC
    );
    static final FunctionDescriptor g_main_context_pusher_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_context_pusher_free$MH = RuntimeHelper.downcallHandle(
        "g_main_context_pusher_free",
        constants$171.g_main_context_pusher_free$FUNC
    );
    static final FunctionDescriptor g_main_loop_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_main_loop_new$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_new",
        constants$171.g_main_loop_new$FUNC
    );
    static final FunctionDescriptor g_main_loop_run$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_main_loop_run$MH = RuntimeHelper.downcallHandle(
        "g_main_loop_run",
        constants$171.g_main_loop_run$FUNC
    );
}


