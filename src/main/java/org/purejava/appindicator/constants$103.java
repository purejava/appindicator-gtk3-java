// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$103 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$103() {}
    static final FunctionDescriptor g_get_console_charset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_console_charset$MH = RuntimeHelper.downcallHandle(
        "g_get_console_charset",
        constants$103.g_get_console_charset$FUNC
    );
    static final FunctionDescriptor g_get_language_names$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_language_names$MH = RuntimeHelper.downcallHandle(
        "g_get_language_names",
        constants$103.g_get_language_names$FUNC
    );
    static final FunctionDescriptor g_get_language_names_with_category$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_language_names_with_category$MH = RuntimeHelper.downcallHandle(
        "g_get_language_names_with_category",
        constants$103.g_get_language_names_with_category$FUNC
    );
    static final FunctionDescriptor g_get_locale_variants$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_locale_variants$MH = RuntimeHelper.downcallHandle(
        "g_get_locale_variants",
        constants$103.g_get_locale_variants$FUNC
    );
    static final FunctionDescriptor g_checksum_type_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_checksum_type_get_length$MH = RuntimeHelper.downcallHandle(
        "g_checksum_type_get_length",
        constants$103.g_checksum_type_get_length$FUNC
    );
    static final FunctionDescriptor g_checksum_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_checksum_new$MH = RuntimeHelper.downcallHandle(
        "g_checksum_new",
        constants$103.g_checksum_new$FUNC
    );
}


