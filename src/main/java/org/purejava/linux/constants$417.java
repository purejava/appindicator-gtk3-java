// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$417 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$417() {}
    static final FunctionDescriptor g_signal_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_name$MH = RuntimeHelper.downcallHandle(
        "g_signal_name",
        constants$417.g_signal_name$FUNC
    );
    static final FunctionDescriptor g_signal_query$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_query$MH = RuntimeHelper.downcallHandle(
        "g_signal_query",
        constants$417.g_signal_query$FUNC
    );
    static final FunctionDescriptor g_signal_list_ids$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_list_ids$MH = RuntimeHelper.downcallHandle(
        "g_signal_list_ids",
        constants$417.g_signal_list_ids$FUNC
    );
    static final FunctionDescriptor g_signal_is_valid_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_is_valid_name$MH = RuntimeHelper.downcallHandle(
        "g_signal_is_valid_name",
        constants$417.g_signal_is_valid_name$FUNC
    );
    static final FunctionDescriptor g_signal_parse_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_parse_name$MH = RuntimeHelper.downcallHandle(
        "g_signal_parse_name",
        constants$417.g_signal_parse_name$FUNC
    );
    static final FunctionDescriptor g_signal_get_invocation_hint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_get_invocation_hint$MH = RuntimeHelper.downcallHandle(
        "g_signal_get_invocation_hint",
        constants$417.g_signal_get_invocation_hint$FUNC
    );
}


