// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$488 {

    static final FunctionDescriptor g_enum_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_enum_to_string$MH = RuntimeHelper.downcallHandle(
        "g_enum_to_string",
        constants$488.g_enum_to_string$FUNC
    );
    static final FunctionDescriptor g_flags_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_flags_to_string$MH = RuntimeHelper.downcallHandle(
        "g_flags_to_string",
        constants$488.g_flags_to_string$FUNC
    );
    static final FunctionDescriptor g_value_set_enum$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_value_set_enum$MH = RuntimeHelper.downcallHandle(
        "g_value_set_enum",
        constants$488.g_value_set_enum$FUNC
    );
    static final FunctionDescriptor g_value_get_enum$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_enum$MH = RuntimeHelper.downcallHandle(
        "g_value_get_enum",
        constants$488.g_value_get_enum$FUNC
    );
    static final FunctionDescriptor g_value_set_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_value_set_flags$MH = RuntimeHelper.downcallHandle(
        "g_value_set_flags",
        constants$488.g_value_set_flags$FUNC
    );
    static final FunctionDescriptor g_value_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_value_get_flags",
        constants$488.g_value_get_flags$FUNC
    );
}


