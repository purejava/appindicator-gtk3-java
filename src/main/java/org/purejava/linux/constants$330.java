// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$330 {

    static final FunctionDescriptor g_tree_foreach_node$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_foreach_node$MH = RuntimeHelper.downcallHandle(
        "g_tree_foreach_node",
        constants$330.g_tree_foreach_node$FUNC
    );
    static final FunctionDescriptor g_tree_traverse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_traverse$MH = RuntimeHelper.downcallHandle(
        "g_tree_traverse",
        constants$330.g_tree_traverse$FUNC
    );
    static final FunctionDescriptor g_tree_search_node$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_search_node$MH = RuntimeHelper.downcallHandle(
        "g_tree_search_node",
        constants$330.g_tree_search_node$FUNC
    );
    static final FunctionDescriptor g_tree_search$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_search$MH = RuntimeHelper.downcallHandle(
        "g_tree_search",
        constants$330.g_tree_search$FUNC
    );
    static final FunctionDescriptor g_tree_lower_bound$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_lower_bound$MH = RuntimeHelper.downcallHandle(
        "g_tree_lower_bound",
        constants$330.g_tree_lower_bound$FUNC
    );
    static final FunctionDescriptor g_tree_upper_bound$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_upper_bound$MH = RuntimeHelper.downcallHandle(
        "g_tree_upper_bound",
        constants$330.g_tree_upper_bound$FUNC
    );
}


