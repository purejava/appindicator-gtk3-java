// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$325 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$325() {}
    static final FunctionDescriptor g_thread_pool_unprocessed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_pool_unprocessed$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_unprocessed",
        constants$325.g_thread_pool_unprocessed$FUNC
    );
    static final FunctionDescriptor g_thread_pool_set_sort_function$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_pool_set_sort_function$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_set_sort_function",
        constants$325.g_thread_pool_set_sort_function$FUNC
    );
    static final FunctionDescriptor g_thread_pool_move_to_front$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_pool_move_to_front$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_move_to_front",
        constants$325.g_thread_pool_move_to_front$FUNC
    );
    static final FunctionDescriptor g_thread_pool_set_max_threads$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_pool_set_max_threads$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_set_max_threads",
        constants$325.g_thread_pool_set_max_threads$FUNC
    );
    static final FunctionDescriptor g_thread_pool_get_max_threads$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_pool_get_max_threads$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_get_max_threads",
        constants$325.g_thread_pool_get_max_threads$FUNC
    );
    static final FunctionDescriptor g_thread_pool_get_num_threads$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_pool_get_num_threads$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_get_num_threads",
        constants$325.g_thread_pool_get_num_threads$FUNC
    );
}


