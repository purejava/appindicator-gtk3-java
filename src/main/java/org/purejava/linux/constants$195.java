// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$195 {

    static final FunctionDescriptor g_string_free_to_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_free_to_bytes$MH = RuntimeHelper.downcallHandle(
        "g_string_free_to_bytes",
        constants$195.g_string_free_to_bytes$FUNC
    );
    static final FunctionDescriptor g_string_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_equal$MH = RuntimeHelper.downcallHandle(
        "g_string_equal",
        constants$195.g_string_equal$FUNC
    );
    static final FunctionDescriptor g_string_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_hash$MH = RuntimeHelper.downcallHandle(
        "g_string_hash",
        constants$195.g_string_hash$FUNC
    );
    static final FunctionDescriptor g_string_assign$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_assign$MH = RuntimeHelper.downcallHandle(
        "g_string_assign",
        constants$195.g_string_assign$FUNC
    );
    static final FunctionDescriptor g_string_truncate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_truncate$MH = RuntimeHelper.downcallHandle(
        "g_string_truncate",
        constants$195.g_string_truncate$FUNC
    );
    static final FunctionDescriptor g_string_set_size$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_set_size$MH = RuntimeHelper.downcallHandle(
        "g_string_set_size",
        constants$195.g_string_set_size$FUNC
    );
}


