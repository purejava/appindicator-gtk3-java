// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$105 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$105() {}
    static final FunctionDescriptor g_compute_checksum_for_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_compute_checksum_for_data$MH = RuntimeHelper.downcallHandle(
        "g_compute_checksum_for_data",
        constants$105.g_compute_checksum_for_data$FUNC
    );
    static final FunctionDescriptor g_compute_checksum_for_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_compute_checksum_for_string$MH = RuntimeHelper.downcallHandle(
        "g_compute_checksum_for_string",
        constants$105.g_compute_checksum_for_string$FUNC
    );
    static final FunctionDescriptor g_compute_checksum_for_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_compute_checksum_for_bytes$MH = RuntimeHelper.downcallHandle(
        "g_compute_checksum_for_bytes",
        constants$105.g_compute_checksum_for_bytes$FUNC
    );
    static final FunctionDescriptor g_convert_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_convert_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_convert_error_quark",
        constants$105.g_convert_error_quark$FUNC
    );
    static final FunctionDescriptor g_iconv_open$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_iconv_open$MH = RuntimeHelper.downcallHandle(
        "g_iconv_open",
        constants$105.g_iconv_open$FUNC
    );
    static final FunctionDescriptor g_iconv$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_iconv$MH = RuntimeHelper.downcallHandle(
        "g_iconv",
        constants$105.g_iconv$FUNC
    );
}


