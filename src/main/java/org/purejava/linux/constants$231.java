// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$231 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$231() {}
    static final FunctionDescriptor g_markup_vprintf_escaped$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_markup_vprintf_escaped$MH = RuntimeHelper.downcallHandle(
        "g_markup_vprintf_escaped",
        constants$231.g_markup_vprintf_escaped$FUNC
    );
    static final FunctionDescriptor g_markup_collect_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_markup_collect_attributes$MH = RuntimeHelper.downcallHandleVariadic(
        "g_markup_collect_attributes",
        constants$231.g_markup_collect_attributes$FUNC
    );
    static final FunctionDescriptor g_variant_type_string_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_string_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_string_is_valid",
        constants$231.g_variant_type_string_is_valid$FUNC
    );
    static final FunctionDescriptor g_variant_type_string_scan$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_string_scan$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_string_scan",
        constants$231.g_variant_type_string_scan$FUNC
    );
    static final FunctionDescriptor g_variant_type_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_free$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_free",
        constants$231.g_variant_type_free$FUNC
    );
    static final FunctionDescriptor g_variant_type_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_copy$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_copy",
        constants$231.g_variant_type_copy$FUNC
    );
}


