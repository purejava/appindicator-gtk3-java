// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$219 {

    static final FunctionDescriptor g_markup_escape_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_markup_escape_text$MH = RuntimeHelper.downcallHandle(
        "g_markup_escape_text",
        constants$219.g_markup_escape_text$FUNC
    );
    static final FunctionDescriptor g_markup_printf_escaped$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_markup_printf_escaped$MH = RuntimeHelper.downcallHandleVariadic(
        "g_markup_printf_escaped",
        constants$219.g_markup_printf_escaped$FUNC
    );
    static final FunctionDescriptor g_markup_vprintf_escaped$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_markup_vprintf_escaped$MH = RuntimeHelper.downcallHandle(
        "g_markup_vprintf_escaped",
        constants$219.g_markup_vprintf_escaped$FUNC
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
        constants$219.g_markup_collect_attributes$FUNC
    );
    static final FunctionDescriptor g_variant_type_string_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_string_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_string_is_valid",
        constants$219.g_variant_type_string_is_valid$FUNC
    );
    static final FunctionDescriptor g_variant_type_string_scan$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_type_string_scan$MH = RuntimeHelper.downcallHandle(
        "g_variant_type_string_scan",
        constants$219.g_variant_type_string_scan$FUNC
    );
}

