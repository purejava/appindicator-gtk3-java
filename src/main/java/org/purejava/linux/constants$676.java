// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$676 {

    static final FunctionDescriptor g_file_move_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_move_async$MH = RuntimeHelper.downcallHandle(
        "g_file_move_async",
        constants$676.g_file_move_async$FUNC
    );
    static final FunctionDescriptor g_file_move_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_move_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_move_finish",
        constants$676.g_file_move_finish$FUNC
    );
    static final FunctionDescriptor g_file_make_directory$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_make_directory$MH = RuntimeHelper.downcallHandle(
        "g_file_make_directory",
        constants$676.g_file_make_directory$FUNC
    );
    static final FunctionDescriptor g_file_make_directory_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_make_directory_async$MH = RuntimeHelper.downcallHandle(
        "g_file_make_directory_async",
        constants$676.g_file_make_directory_async$FUNC
    );
    static final FunctionDescriptor g_file_make_directory_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_make_directory_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_make_directory_finish",
        constants$676.g_file_make_directory_finish$FUNC
    );
    static final FunctionDescriptor g_file_make_directory_with_parents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_make_directory_with_parents$MH = RuntimeHelper.downcallHandle(
        "g_file_make_directory_with_parents",
        constants$676.g_file_make_directory_with_parents$FUNC
    );
}


