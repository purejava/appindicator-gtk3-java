// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$264 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$264() {}
    static final FunctionDescriptor GOptionErrorFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GOptionErrorFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$264.GOptionErrorFunc_DOWN$FUNC
    );
    static final FunctionDescriptor g_option_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_option_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_option_error_quark",
        constants$264.g_option_error_quark$FUNC
    );
    static final FunctionDescriptor g_option_context_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_new$MH = RuntimeHelper.downcallHandle(
        "g_option_context_new",
        constants$264.g_option_context_new$FUNC
    );
    static final FunctionDescriptor g_option_context_set_summary$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_set_summary$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_summary",
        constants$264.g_option_context_set_summary$FUNC
    );
    static final FunctionDescriptor g_option_context_get_summary$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_summary$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_summary",
        constants$264.g_option_context_get_summary$FUNC
    );
    static final FunctionDescriptor g_option_context_set_description$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_set_description$MH = RuntimeHelper.downcallHandle(
        "g_option_context_set_description",
        constants$264.g_option_context_set_description$FUNC
    );
}


