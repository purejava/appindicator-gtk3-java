// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$248 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$248() {}
    static final FunctionDescriptor g_variant_print$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_print$MH = RuntimeHelper.downcallHandle(
        "g_variant_print",
        constants$248.g_variant_print$FUNC
    );
    static final FunctionDescriptor g_variant_print_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_print_string$MH = RuntimeHelper.downcallHandle(
        "g_variant_print_string",
        constants$248.g_variant_print_string$FUNC
    );
    static final FunctionDescriptor g_variant_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_hash$MH = RuntimeHelper.downcallHandle(
        "g_variant_hash",
        constants$248.g_variant_hash$FUNC
    );
    static final FunctionDescriptor g_variant_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_equal$MH = RuntimeHelper.downcallHandle(
        "g_variant_equal",
        constants$248.g_variant_equal$FUNC
    );
    static final FunctionDescriptor g_variant_get_normal_form$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_normal_form$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_normal_form",
        constants$248.g_variant_get_normal_form$FUNC
    );
    static final FunctionDescriptor g_variant_is_normal_form$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_is_normal_form$MH = RuntimeHelper.downcallHandle(
        "g_variant_is_normal_form",
        constants$248.g_variant_is_normal_form$FUNC
    );
}


