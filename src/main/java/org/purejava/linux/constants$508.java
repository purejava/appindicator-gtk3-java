// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$508 {

    static final FunctionDescriptor g_value_set_gtype$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_value_set_gtype$MH = RuntimeHelper.downcallHandle(
        "g_value_set_gtype",
        constants$508.g_value_set_gtype$FUNC
    );
    static final FunctionDescriptor g_value_get_gtype$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_gtype$MH = RuntimeHelper.downcallHandle(
        "g_value_get_gtype",
        constants$508.g_value_get_gtype$FUNC
    );
    static final FunctionDescriptor g_value_set_variant$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_variant$MH = RuntimeHelper.downcallHandle(
        "g_value_set_variant",
        constants$508.g_value_set_variant$FUNC
    );
    static final FunctionDescriptor g_value_take_variant$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_take_variant$MH = RuntimeHelper.downcallHandle(
        "g_value_take_variant",
        constants$508.g_value_take_variant$FUNC
    );
    static final FunctionDescriptor g_value_get_variant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_variant$MH = RuntimeHelper.downcallHandle(
        "g_value_get_variant",
        constants$508.g_value_get_variant$FUNC
    );
    static final FunctionDescriptor g_value_dup_variant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_dup_variant$MH = RuntimeHelper.downcallHandle(
        "g_value_dup_variant",
        constants$508.g_value_dup_variant$FUNC
    );
}

