// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$100 {

    static final FunctionDescriptor g_bytes_new_static$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bytes_new_static$MH = RuntimeHelper.downcallHandle(
        "g_bytes_new_static",
        constants$100.g_bytes_new_static$FUNC
    );
    static final FunctionDescriptor g_bytes_new_with_free_func$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bytes_new_with_free_func$MH = RuntimeHelper.downcallHandle(
        "g_bytes_new_with_free_func",
        constants$100.g_bytes_new_with_free_func$FUNC
    );
    static final FunctionDescriptor g_bytes_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bytes_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_bytes_new_from_bytes",
        constants$100.g_bytes_new_from_bytes$FUNC
    );
    static final FunctionDescriptor g_bytes_get_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bytes_get_data$MH = RuntimeHelper.downcallHandle(
        "g_bytes_get_data",
        constants$100.g_bytes_get_data$FUNC
    );
    static final FunctionDescriptor g_bytes_get_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bytes_get_size$MH = RuntimeHelper.downcallHandle(
        "g_bytes_get_size",
        constants$100.g_bytes_get_size$FUNC
    );
    static final FunctionDescriptor g_bytes_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bytes_ref$MH = RuntimeHelper.downcallHandle(
        "g_bytes_ref",
        constants$100.g_bytes_ref$FUNC
    );
}


