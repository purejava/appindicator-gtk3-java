// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$467 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$467() {}
    static final FunctionDescriptor g_value_get_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_pointer$MH = RuntimeHelper.downcallHandle(
        "g_value_get_pointer",
        constants$467.g_value_get_pointer$FUNC
    );
    static final FunctionDescriptor g_gtype_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_gtype_get_type$MH = RuntimeHelper.downcallHandle(
        "g_gtype_get_type",
        constants$467.g_gtype_get_type$FUNC
    );
    static final FunctionDescriptor g_value_set_gtype$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_value_set_gtype$MH = RuntimeHelper.downcallHandle(
        "g_value_set_gtype",
        constants$467.g_value_set_gtype$FUNC
    );
    static final FunctionDescriptor g_value_get_gtype$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_gtype$MH = RuntimeHelper.downcallHandle(
        "g_value_get_gtype",
        constants$467.g_value_get_gtype$FUNC
    );
    static final FunctionDescriptor g_value_set_variant$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_variant$MH = RuntimeHelper.downcallHandle(
        "g_value_set_variant",
        constants$467.g_value_set_variant$FUNC
    );
    static final FunctionDescriptor g_value_take_variant$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_take_variant$MH = RuntimeHelper.downcallHandle(
        "g_value_take_variant",
        constants$467.g_value_take_variant$FUNC
    );
}


