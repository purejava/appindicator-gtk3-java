// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$99 {

    static final FunctionDescriptor g_bookmark_file_remove_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_remove_group$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_remove_group",
        constants$99.g_bookmark_file_remove_group$FUNC
    );
    static final FunctionDescriptor g_bookmark_file_remove_application$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_remove_application$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_remove_application",
        constants$99.g_bookmark_file_remove_application$FUNC
    );
    static final FunctionDescriptor g_bookmark_file_remove_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_remove_item$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_remove_item",
        constants$99.g_bookmark_file_remove_item$FUNC
    );
    static final FunctionDescriptor g_bookmark_file_move_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_move_item$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_move_item",
        constants$99.g_bookmark_file_move_item$FUNC
    );
    static final FunctionDescriptor g_bytes_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bytes_new$MH = RuntimeHelper.downcallHandle(
        "g_bytes_new",
        constants$99.g_bytes_new$FUNC
    );
    static final FunctionDescriptor g_bytes_new_take$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bytes_new_take$MH = RuntimeHelper.downcallHandle(
        "g_bytes_new_take",
        constants$99.g_bytes_new_take$FUNC
    );
}

