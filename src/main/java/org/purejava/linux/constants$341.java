// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$341 {

    static final FunctionDescriptor g_list_pop_allocator$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_list_pop_allocator$MH = RuntimeHelper.downcallHandle(
        "g_list_pop_allocator",
        constants$341.g_list_pop_allocator$FUNC
    );
    static final FunctionDescriptor g_slist_push_allocator$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_push_allocator$MH = RuntimeHelper.downcallHandle(
        "g_slist_push_allocator",
        constants$341.g_slist_push_allocator$FUNC
    );
    static final FunctionDescriptor g_slist_pop_allocator$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_slist_pop_allocator$MH = RuntimeHelper.downcallHandle(
        "g_slist_pop_allocator",
        constants$341.g_slist_pop_allocator$FUNC
    );
    static final FunctionDescriptor g_node_push_allocator$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_push_allocator$MH = RuntimeHelper.downcallHandle(
        "g_node_push_allocator",
        constants$341.g_node_push_allocator$FUNC
    );
    static final FunctionDescriptor g_node_pop_allocator$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle g_node_pop_allocator$MH = RuntimeHelper.downcallHandle(
        "g_node_pop_allocator",
        constants$341.g_node_pop_allocator$FUNC
    );
    static final FunctionDescriptor GCacheNewFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
}

