// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$25 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$25() {}
    static final FunctionDescriptor g_ptr_array_steal_index_fast$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_ptr_array_steal_index_fast$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_steal_index_fast",
        constants$25.g_ptr_array_steal_index_fast$FUNC
    );
    static final FunctionDescriptor g_ptr_array_remove$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_remove$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_remove",
        constants$25.g_ptr_array_remove$FUNC
    );
    static final FunctionDescriptor g_ptr_array_remove_fast$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_remove_fast$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_remove_fast",
        constants$25.g_ptr_array_remove_fast$FUNC
    );
    static final FunctionDescriptor g_ptr_array_remove_range$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_ptr_array_remove_range$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_remove_range",
        constants$25.g_ptr_array_remove_range$FUNC
    );
    static final FunctionDescriptor g_ptr_array_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_add$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_add",
        constants$25.g_ptr_array_add$FUNC
    );
    static final FunctionDescriptor g_ptr_array_extend$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_extend$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_extend",
        constants$25.g_ptr_array_extend$FUNC
    );
}


