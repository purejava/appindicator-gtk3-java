// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$236 {

    static final FunctionDescriptor g_variant_get_data_as_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_data_as_bytes$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_data_as_bytes",
        constants$236.g_variant_get_data_as_bytes$FUNC
    );
    static final FunctionDescriptor g_variant_store$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_store$MH = RuntimeHelper.downcallHandle(
        "g_variant_store",
        constants$236.g_variant_store$FUNC
    );
    static final FunctionDescriptor g_variant_print$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_print$MH = RuntimeHelper.downcallHandle(
        "g_variant_print",
        constants$236.g_variant_print$FUNC
    );
    static final FunctionDescriptor g_variant_print_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_print_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_print_string",
        constants$236.g_variant_print_string$FUNC
    );
    static final FunctionDescriptor g_variant_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_hash$MH = RuntimeHelper.downcallHandle(
        "g_variant_hash",
        constants$236.g_variant_hash$FUNC
    );
    static final FunctionDescriptor g_variant_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_equal$MH = RuntimeHelper.downcallHandle(
        "g_variant_equal",
        constants$236.g_variant_equal$FUNC
    );
}


