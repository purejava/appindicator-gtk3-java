// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$515 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$515() {}
    static final FunctionDescriptor g_charset_converter_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_charset_converter_get_type$MH = RuntimeHelper.downcallHandle(
        "g_charset_converter_get_type",
        constants$515.g_charset_converter_get_type$FUNC
    );
    static final FunctionDescriptor g_charset_converter_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_charset_converter_new$MH = RuntimeHelper.downcallHandle(
        "g_charset_converter_new",
        constants$515.g_charset_converter_new$FUNC
    );
    static final FunctionDescriptor g_charset_converter_set_use_fallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_charset_converter_set_use_fallback$MH = RuntimeHelper.downcallHandle(
        "g_charset_converter_set_use_fallback",
        constants$515.g_charset_converter_set_use_fallback$FUNC
    );
    static final FunctionDescriptor g_charset_converter_get_use_fallback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_charset_converter_get_use_fallback$MH = RuntimeHelper.downcallHandle(
        "g_charset_converter_get_use_fallback",
        constants$515.g_charset_converter_get_use_fallback$FUNC
    );
    static final FunctionDescriptor g_charset_converter_get_num_fallbacks$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_charset_converter_get_num_fallbacks$MH = RuntimeHelper.downcallHandle(
        "g_charset_converter_get_num_fallbacks",
        constants$515.g_charset_converter_get_num_fallbacks$FUNC
    );
    static final FunctionDescriptor g_content_type_equals$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_content_type_equals$MH = RuntimeHelper.downcallHandle(
        "g_content_type_equals",
        constants$515.g_content_type_equals$FUNC
    );
}


