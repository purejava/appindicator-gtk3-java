// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$27 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$27() {}
    static final FunctionDescriptor g_ptr_array_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_foreach$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_foreach",
        constants$27.g_ptr_array_foreach$FUNC
    );
    static final FunctionDescriptor g_ptr_array_find$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_find$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_find",
        constants$27.g_ptr_array_find$FUNC
    );
    static final FunctionDescriptor g_ptr_array_find_with_equal_func$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_find_with_equal_func$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_find_with_equal_func",
        constants$27.g_ptr_array_find_with_equal_func$FUNC
    );
    static final FunctionDescriptor g_ptr_array_is_null_terminated$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ptr_array_is_null_terminated$MH = RuntimeHelper.downcallHandle(
        "g_ptr_array_is_null_terminated",
        constants$27.g_ptr_array_is_null_terminated$FUNC
    );
    static final FunctionDescriptor g_byte_array_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_byte_array_new$MH = RuntimeHelper.downcallHandle(
        "g_byte_array_new",
        constants$27.g_byte_array_new$FUNC
    );
    static final FunctionDescriptor g_byte_array_new_take$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_byte_array_new_take$MH = RuntimeHelper.downcallHandle(
        "g_byte_array_new_take",
        constants$27.g_byte_array_new_take$FUNC
    );
}


