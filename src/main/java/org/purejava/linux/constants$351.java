// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$351 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$351() {}
    static final FunctionDescriptor g_relation_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_relation_count$MH = RuntimeHelper.downcallHandle(
        "g_relation_count",
        constants$351.g_relation_count$FUNC
    );
    static final FunctionDescriptor g_relation_exists$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_relation_exists$MH = RuntimeHelper.downcallHandleVariadic(
        "g_relation_exists",
        constants$351.g_relation_exists$FUNC
    );
    static final FunctionDescriptor g_relation_print$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_relation_print$MH = RuntimeHelper.downcallHandle(
        "g_relation_print",
        constants$351.g_relation_print$FUNC
    );
    static final FunctionDescriptor g_tuples_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tuples_destroy$MH = RuntimeHelper.downcallHandle(
        "g_tuples_destroy",
        constants$351.g_tuples_destroy$FUNC
    );
    static final FunctionDescriptor g_tuples_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tuples_index$MH = RuntimeHelper.downcallHandle(
        "g_tuples_index",
        constants$351.g_tuples_index$FUNC
    );
    static final StructLayout g_thread_functions_for_glib_use$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("mutex_new"),
        Constants$root.C_POINTER$LAYOUT.withName("mutex_lock"),
        Constants$root.C_POINTER$LAYOUT.withName("mutex_trylock"),
        Constants$root.C_POINTER$LAYOUT.withName("mutex_unlock"),
        Constants$root.C_POINTER$LAYOUT.withName("mutex_free"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_new"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_signal"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_broadcast"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_wait"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_timed_wait"),
        Constants$root.C_POINTER$LAYOUT.withName("cond_free"),
        Constants$root.C_POINTER$LAYOUT.withName("private_new"),
        Constants$root.C_POINTER$LAYOUT.withName("private_get"),
        Constants$root.C_POINTER$LAYOUT.withName("private_set"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_create"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_yield"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_join"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_exit"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_set_priority"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_self"),
        Constants$root.C_POINTER$LAYOUT.withName("thread_equal")
    ).withName("_GThreadFunctions");
    static final MemorySegment g_thread_functions_for_glib_use$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_thread_functions_for_glib_use", constants$351.g_thread_functions_for_glib_use$LAYOUT);
}


