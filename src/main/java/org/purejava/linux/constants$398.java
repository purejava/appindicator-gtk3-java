// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$398 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$398() {}
    static final FunctionDescriptor g_param_value_set_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_value_set_default$MH = RuntimeHelper.downcallHandle(
        "g_param_value_set_default",
        constants$398.g_param_value_set_default$FUNC
    );
    static final FunctionDescriptor g_param_value_defaults$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_value_defaults$MH = RuntimeHelper.downcallHandle(
        "g_param_value_defaults",
        constants$398.g_param_value_defaults$FUNC
    );
    static final FunctionDescriptor g_param_value_validate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_value_validate$MH = RuntimeHelper.downcallHandle(
        "g_param_value_validate",
        constants$398.g_param_value_validate$FUNC
    );
    static final FunctionDescriptor g_param_value_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_value_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_param_value_is_valid",
        constants$398.g_param_value_is_valid$FUNC
    );
    static final FunctionDescriptor g_param_value_convert$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_param_value_convert$MH = RuntimeHelper.downcallHandle(
        "g_param_value_convert",
        constants$398.g_param_value_convert$FUNC
    );
    static final FunctionDescriptor g_param_values_cmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_values_cmp$MH = RuntimeHelper.downcallHandle(
        "g_param_values_cmp",
        constants$398.g_param_values_cmp$FUNC
    );
}


