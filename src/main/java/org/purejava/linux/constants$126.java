// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$126 {

    static final FunctionDescriptor g_file_open_tmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_open_tmp$MH = RuntimeHelper.downcallHandle(
        "g_file_open_tmp",
        constants$126.g_file_open_tmp$FUNC
    );
    static final FunctionDescriptor g_dir_make_tmp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dir_make_tmp$MH = RuntimeHelper.downcallHandle(
        "g_dir_make_tmp",
        constants$126.g_dir_make_tmp$FUNC
    );
    static final FunctionDescriptor g_build_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_path$MH = RuntimeHelper.downcallHandleVariadic(
        "g_build_path",
        constants$126.g_build_path$FUNC
    );
    static final FunctionDescriptor g_build_pathv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_pathv$MH = RuntimeHelper.downcallHandle(
        "g_build_pathv",
        constants$126.g_build_pathv$FUNC
    );
    static final FunctionDescriptor g_build_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_filename$MH = RuntimeHelper.downcallHandleVariadic(
        "g_build_filename",
        constants$126.g_build_filename$FUNC
    );
    static final FunctionDescriptor g_build_filenamev$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_filenamev$MH = RuntimeHelper.downcallHandle(
        "g_build_filenamev",
        constants$126.g_build_filenamev$FUNC
    );
}


