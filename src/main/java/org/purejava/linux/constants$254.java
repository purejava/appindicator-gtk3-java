// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$254 {

    static final FunctionDescriptor g_option_context_set_ignore_unknown_options$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_option_context_set_ignore_unknown_options$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_ignore_unknown_options",
        constants$254.g_option_context_set_ignore_unknown_options$FUNC
    );
    static final FunctionDescriptor g_option_context_get_ignore_unknown_options$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_ignore_unknown_options$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_ignore_unknown_options",
        constants$254.g_option_context_get_ignore_unknown_options$FUNC
    );
    static final FunctionDescriptor g_option_context_set_strict_posix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_option_context_set_strict_posix$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_strict_posix",
        constants$254.g_option_context_set_strict_posix$FUNC
    );
    static final FunctionDescriptor g_option_context_get_strict_posix$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_strict_posix$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_strict_posix",
        constants$254.g_option_context_get_strict_posix$FUNC
    );
    static final FunctionDescriptor g_option_context_add_main_entries$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_add_main_entries$MH = RuntimeHelper.downcallHandle(
        "g_option_context_add_main_entries",
        constants$254.g_option_context_add_main_entries$FUNC
    );
    static final FunctionDescriptor g_option_context_parse$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_parse$MH = RuntimeHelper.downcallHandle(
        "g_option_context_parse",
        constants$254.g_option_context_parse$FUNC
    );
}

