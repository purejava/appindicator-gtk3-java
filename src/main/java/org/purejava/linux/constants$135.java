// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$135 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$135() {}
    static final FunctionDescriptor g_node_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_destroy$MH = RuntimeHelper.downcallHandle(
        "g_node_destroy",
        constants$135.g_node_destroy$FUNC
    );
    static final FunctionDescriptor g_node_unlink$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_unlink$MH = RuntimeHelper.downcallHandle(
        "g_node_unlink",
        constants$135.g_node_unlink$FUNC
    );
    static final FunctionDescriptor g_node_copy_deep$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_copy_deep$MH = RuntimeHelper.downcallHandle(
        "g_node_copy_deep",
        constants$135.g_node_copy_deep$FUNC
    );
    static final FunctionDescriptor g_node_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_copy$MH = RuntimeHelper.downcallHandle(
        "g_node_copy",
        constants$135.g_node_copy$FUNC
    );
    static final FunctionDescriptor g_node_insert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_insert$MH = RuntimeHelper.downcallHandle(
        "g_node_insert",
        constants$135.g_node_insert$FUNC
    );
    static final FunctionDescriptor g_node_insert_before$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_insert_before$MH = RuntimeHelper.downcallHandle(
        "g_node_insert_before",
        constants$135.g_node_insert_before$FUNC
    );
}


