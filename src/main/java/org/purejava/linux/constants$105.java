// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$105 {

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
    static final FunctionDescriptor g_iconv_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_iconv_close$MH = RuntimeHelper.downcallHandle(
        "g_iconv_close",
        constants$105.g_iconv_close$FUNC
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
        constants$105.g_convert$FUNC
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
        constants$105.g_convert_with_iconv$FUNC
    );
}

