// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$194 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$194() {}
    static final FunctionDescriptor g_ucs4_to_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_ucs4_to_utf8$MH = RuntimeHelper.downcallHandle(
        "g_ucs4_to_utf8",
        constants$194.g_ucs4_to_utf8$FUNC
    );
    static final FunctionDescriptor g_unichar_to_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unichar_to_utf8$MH = RuntimeHelper.downcallHandle(
        "g_unichar_to_utf8",
        constants$194.g_unichar_to_utf8$FUNC
    );
    static final FunctionDescriptor g_utf8_validate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_validate$MH = RuntimeHelper.downcallHandle(
        "g_utf8_validate",
        constants$194.g_utf8_validate$FUNC
    );
    static final FunctionDescriptor g_utf8_validate_len$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_validate_len$MH = RuntimeHelper.downcallHandle(
        "g_utf8_validate_len",
        constants$194.g_utf8_validate_len$FUNC
    );
    static final FunctionDescriptor g_utf8_strup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_strup$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strup",
        constants$194.g_utf8_strup$FUNC
    );
    static final FunctionDescriptor g_utf8_strdown$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_strdown$MH = RuntimeHelper.downcallHandle(
        "g_utf8_strdown",
        constants$194.g_utf8_strdown$FUNC
    );
}

