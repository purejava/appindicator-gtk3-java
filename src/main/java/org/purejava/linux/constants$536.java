// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$536 {

    static final FunctionDescriptor g_application_set_option_context_description$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_set_option_context_description$MH = RuntimeHelper.downcallHandle(
        "g_application_set_option_context_description",
        constants$536.g_application_set_option_context_description$FUNC
    );
    static final FunctionDescriptor g_application_get_is_registered$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_is_registered$MH = RuntimeHelper.downcallHandle(
        "g_application_get_is_registered",
        constants$536.g_application_get_is_registered$FUNC
    );
    static final FunctionDescriptor g_application_get_is_remote$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_is_remote$MH = RuntimeHelper.downcallHandle(
        "g_application_get_is_remote",
        constants$536.g_application_get_is_remote$FUNC
    );
    static final FunctionDescriptor g_application_register$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_register$MH = RuntimeHelper.downcallHandle(
        "g_application_register",
        constants$536.g_application_register$FUNC
    );
    static final FunctionDescriptor g_application_hold$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_hold$MH = RuntimeHelper.downcallHandle(
        "g_application_hold",
        constants$536.g_application_hold$FUNC
    );
    static final FunctionDescriptor g_application_release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_release$MH = RuntimeHelper.downcallHandle(
        "g_application_release",
        constants$536.g_application_release$FUNC
    );
}

