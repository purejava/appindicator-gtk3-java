// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$100 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$100() {}
    static final FunctionDescriptor g_bookmark_file_move_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_move_item$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_move_item",
        constants$100.g_bookmark_file_move_item$FUNC
    );
    static final FunctionDescriptor g_bytes_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bytes_new$MH = RuntimeHelper.downcallHandle(
        "g_bytes_new",
        constants$100.g_bytes_new$FUNC
    );
    static final FunctionDescriptor g_bytes_new_take$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bytes_new_take$MH = RuntimeHelper.downcallHandle(
        "g_bytes_new_take",
        constants$100.g_bytes_new_take$FUNC
    );
    static final FunctionDescriptor g_bytes_new_static$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bytes_new_static$MH = RuntimeHelper.downcallHandle(
        "g_bytes_new_static",
        constants$100.g_bytes_new_static$FUNC
    );
    static final FunctionDescriptor g_bytes_new_with_free_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bytes_new_with_free_func$MH = RuntimeHelper.downcallHandle(
        "g_bytes_new_with_free_func",
        constants$100.g_bytes_new_with_free_func$FUNC
    );
    static final FunctionDescriptor g_bytes_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bytes_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_bytes_new_from_bytes",
        constants$100.g_bytes_new_from_bytes$FUNC
    );
}


