// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$659 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$659() {}
    static final FunctionDescriptor g_file_monitor_set_rate_limit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_monitor_set_rate_limit$MH = RuntimeHelper.downcallHandle(
        "g_file_monitor_set_rate_limit",
        constants$659.g_file_monitor_set_rate_limit$FUNC
    );
    static final FunctionDescriptor g_file_monitor_emit_event$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_monitor_emit_event$MH = RuntimeHelper.downcallHandle(
        "g_file_monitor_emit_event",
        constants$659.g_file_monitor_emit_event$FUNC
    );
    static final FunctionDescriptor g_filename_completer_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_filename_completer_get_type$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_get_type",
        constants$659.g_filename_completer_get_type$FUNC
    );
    static final FunctionDescriptor g_filename_completer_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_filename_completer_new$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_new",
        constants$659.g_filename_completer_new$FUNC
    );
    static final FunctionDescriptor g_filename_completer_get_completion_suffix$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_completer_get_completion_suffix$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_get_completion_suffix",
        constants$659.g_filename_completer_get_completion_suffix$FUNC
    );
    static final FunctionDescriptor g_filename_completer_get_completions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_completer_get_completions$MH = RuntimeHelper.downcallHandle(
        "g_filename_completer_get_completions",
        constants$659.g_filename_completer_get_completions$FUNC
    );
}


