// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$789 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$789() {}
    static final FunctionDescriptor g_subprocess_launcher_unsetenv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_launcher_unsetenv$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_launcher_unsetenv",
        constants$789.g_subprocess_launcher_unsetenv$FUNC
    );
    static final FunctionDescriptor g_subprocess_launcher_getenv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_launcher_getenv$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_launcher_getenv",
        constants$789.g_subprocess_launcher_getenv$FUNC
    );
    static final FunctionDescriptor g_subprocess_launcher_set_cwd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_launcher_set_cwd$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_launcher_set_cwd",
        constants$789.g_subprocess_launcher_set_cwd$FUNC
    );
    static final FunctionDescriptor g_subprocess_launcher_set_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_subprocess_launcher_set_flags$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_launcher_set_flags",
        constants$789.g_subprocess_launcher_set_flags$FUNC
    );
    static final FunctionDescriptor g_subprocess_launcher_set_stdin_file_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_subprocess_launcher_set_stdin_file_path$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_launcher_set_stdin_file_path",
        constants$789.g_subprocess_launcher_set_stdin_file_path$FUNC
    );
    static final FunctionDescriptor g_subprocess_launcher_take_stdin_fd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_subprocess_launcher_take_stdin_fd$MH = RuntimeHelper.downcallHandle(
        "g_subprocess_launcher_take_stdin_fd",
        constants$789.g_subprocess_launcher_take_stdin_fd$FUNC
    );
}


