// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$236 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$236() {}
    static final FunctionDescriptor g_variant_type_new_dict_entry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_new_dict_entry$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_new_dict_entry",
        constants$236.g_variant_type_new_dict_entry$FUNC
    );
    static final FunctionDescriptor g_variant_type_checked_$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_checked_$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_checked_",
        constants$236.g_variant_type_checked_$FUNC
    );
    static final FunctionDescriptor g_variant_type_string_get_depth_$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_string_get_depth_$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_string_get_depth_",
        constants$236.g_variant_type_string_get_depth_$FUNC
    );
    static final FunctionDescriptor g_variant_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_unref$MH = RuntimeHelper.downcallHandle(
        "g_variant_unref",
        constants$236.g_variant_unref$FUNC
    );
    static final FunctionDescriptor g_variant_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_ref$MH = RuntimeHelper.downcallHandle(
        "g_variant_ref",
        constants$236.g_variant_ref$FUNC
    );
    static final FunctionDescriptor g_variant_ref_sink$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_ref_sink$MH = RuntimeHelper.downcallHandle(
        "g_variant_ref_sink",
        constants$236.g_variant_ref_sink$FUNC
    );
}


