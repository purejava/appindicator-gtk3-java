// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$127 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$127() {}
    static final FunctionDescriptor g_build_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_path$MH = RuntimeHelper.downcallHandleVariadic(
        "g_build_path",
        constants$127.g_build_path$FUNC
    );
    static final FunctionDescriptor g_build_pathv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_pathv$MH = RuntimeHelper.downcallHandle(
        "g_build_pathv",
        constants$127.g_build_pathv$FUNC
    );
    static final FunctionDescriptor g_build_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_filename$MH = RuntimeHelper.downcallHandleVariadic(
        "g_build_filename",
        constants$127.g_build_filename$FUNC
    );
    static final FunctionDescriptor g_build_filenamev$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_filenamev$MH = RuntimeHelper.downcallHandle(
        "g_build_filenamev",
        constants$127.g_build_filenamev$FUNC
    );
    static final FunctionDescriptor g_build_filename_valist$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_build_filename_valist$MH = RuntimeHelper.downcallHandle(
        "g_build_filename_valist",
        constants$127.g_build_filename_valist$FUNC
    );
    static final FunctionDescriptor g_mkdir_with_parents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mkdir_with_parents$MH = RuntimeHelper.downcallHandle(
        "g_mkdir_with_parents",
        constants$127.g_mkdir_with_parents$FUNC
    );
}


