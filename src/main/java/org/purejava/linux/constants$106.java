// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$106 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$106() {}
    static final FunctionDescriptor g_iconv_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_iconv_close$MH = RuntimeHelper.downcallHandle(
        "g_iconv_close",
        constants$106.g_iconv_close$FUNC
    );
    static final FunctionDescriptor g_convert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_convert$MH = RuntimeHelper.downcallHandle(
        "g_convert",
        constants$106.g_convert$FUNC
    );
    static final FunctionDescriptor g_convert_with_iconv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_convert_with_iconv$MH = RuntimeHelper.downcallHandle(
        "g_convert_with_iconv",
        constants$106.g_convert_with_iconv$FUNC
    );
    static final FunctionDescriptor g_convert_with_fallback$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_convert_with_fallback$MH = RuntimeHelper.downcallHandle(
        "g_convert_with_fallback",
        constants$106.g_convert_with_fallback$FUNC
    );
    static final FunctionDescriptor g_locale_to_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_locale_to_utf8$MH = RuntimeHelper.downcallHandle(
        "g_locale_to_utf8",
        constants$106.g_locale_to_utf8$FUNC
    );
    static final FunctionDescriptor g_locale_from_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_locale_from_utf8$MH = RuntimeHelper.downcallHandle(
        "g_locale_from_utf8",
        constants$106.g_locale_from_utf8$FUNC
    );
}


