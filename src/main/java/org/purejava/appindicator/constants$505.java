// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$505 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$505() {}
    static final FunctionDescriptor g_output_stream_writev_all$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_writev_all$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_writev_all",
        constants$505.g_output_stream_writev_all$FUNC
    );
    static final FunctionDescriptor g_output_stream_printf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_printf$MH = RuntimeHelper.downcallHandleVariadic(
        "g_output_stream_printf",
        constants$505.g_output_stream_printf$FUNC
    );
    static final FunctionDescriptor g_output_stream_vprintf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_vprintf$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_vprintf",
        constants$505.g_output_stream_vprintf$FUNC
    );
    static final FunctionDescriptor g_output_stream_write_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_write_bytes$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_write_bytes",
        constants$505.g_output_stream_write_bytes$FUNC
    );
    static final FunctionDescriptor g_output_stream_splice$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_splice$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_splice",
        constants$505.g_output_stream_splice$FUNC
    );
    static final FunctionDescriptor g_output_stream_flush$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_flush$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_flush",
        constants$505.g_output_stream_flush$FUNC
    );
}


