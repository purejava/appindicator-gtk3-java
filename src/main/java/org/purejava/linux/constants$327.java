// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$327 {

    static final FunctionDescriptor g_tree_node_previous$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_node_previous$MH = RuntimeHelper.downcallHandle(
        "g_tree_node_previous",
        constants$327.g_tree_node_previous$FUNC
    );
    static final FunctionDescriptor g_tree_node_next$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_node_next$MH = RuntimeHelper.downcallHandle(
        "g_tree_node_next",
        constants$327.g_tree_node_next$FUNC
    );
    static final FunctionDescriptor g_tree_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_ref$MH = RuntimeHelper.downcallHandle(
        "g_tree_ref",
        constants$327.g_tree_ref$FUNC
    );
    static final FunctionDescriptor g_tree_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_unref$MH = RuntimeHelper.downcallHandle(
        "g_tree_unref",
        constants$327.g_tree_unref$FUNC
    );
    static final FunctionDescriptor g_tree_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_destroy$MH = RuntimeHelper.downcallHandle(
        "g_tree_destroy",
        constants$327.g_tree_destroy$FUNC
    );
    static final FunctionDescriptor g_tree_insert_node$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tree_insert_node$MH = RuntimeHelper.downcallHandle(
        "g_tree_insert_node",
        constants$327.g_tree_insert_node$FUNC
    );
}


