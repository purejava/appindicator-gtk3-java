// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$265 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$265() {}
    static final FunctionDescriptor g_option_context_get_description$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_description$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_description",
        constants$265.g_option_context_get_description$FUNC
    );
    static final FunctionDescriptor g_option_context_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_free$MH = RuntimeHelper.downcallHandle(
        "g_option_context_free",
        constants$265.g_option_context_free$FUNC
    );
    static final FunctionDescriptor g_option_context_set_help_enabled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_option_context_set_help_enabled$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_help_enabled",
        constants$265.g_option_context_set_help_enabled$FUNC
    );
    static final FunctionDescriptor g_option_context_get_help_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_help_enabled$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_help_enabled",
        constants$265.g_option_context_get_help_enabled$FUNC
    );
    static final FunctionDescriptor g_option_context_set_ignore_unknown_options$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_option_context_set_ignore_unknown_options$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_ignore_unknown_options",
        constants$265.g_option_context_set_ignore_unknown_options$FUNC
    );
    static final FunctionDescriptor g_option_context_get_ignore_unknown_options$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_ignore_unknown_options$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_ignore_unknown_options",
        constants$265.g_option_context_get_ignore_unknown_options$FUNC
    );
}


