// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$256 {

    static final FunctionDescriptor g_option_context_get_help$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_context_get_help$MH = RuntimeHelper.downcallHandle(
        "g_option_context_get_help",
        constants$256.g_option_context_get_help$FUNC
    );
    static final FunctionDescriptor g_option_group_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_new$MH = RuntimeHelper.downcallHandle(
        "g_option_group_new",
        constants$256.g_option_group_new$FUNC
    );
    static final FunctionDescriptor g_option_group_set_parse_hooks$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_set_parse_hooks$MH = RuntimeHelper.downcallHandle(
        "g_option_group_set_parse_hooks",
        constants$256.g_option_group_set_parse_hooks$FUNC
    );
    static final FunctionDescriptor g_option_group_set_error_hook$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_set_error_hook$MH = RuntimeHelper.downcallHandle(
        "g_option_group_set_error_hook",
        constants$256.g_option_group_set_error_hook$FUNC
    );
    static final FunctionDescriptor g_option_group_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_free$MH = RuntimeHelper.downcallHandle(
        "g_option_group_free",
        constants$256.g_option_group_free$FUNC
    );
    static final FunctionDescriptor g_option_group_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_option_group_ref$MH = RuntimeHelper.downcallHandle(
        "g_option_group_ref",
        constants$256.g_option_group_ref$FUNC
    );
}


