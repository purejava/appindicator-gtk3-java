// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$555 {

    static final FunctionDescriptor g_output_stream_is_closing$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_is_closing$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_is_closing",
        constants$555.g_output_stream_is_closing$FUNC
    );
    static final FunctionDescriptor g_output_stream_has_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_has_pending$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_has_pending",
        constants$555.g_output_stream_has_pending$FUNC
    );
    static final FunctionDescriptor g_output_stream_set_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_set_pending$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_set_pending",
        constants$555.g_output_stream_set_pending$FUNC
    );
    static final FunctionDescriptor g_output_stream_clear_pending$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_output_stream_clear_pending$MH = RuntimeHelper.downcallHandle(
        "g_output_stream_clear_pending",
        constants$555.g_output_stream_clear_pending$FUNC
    );
    static final FunctionDescriptor g_filter_output_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_filter_output_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_filter_output_stream_get_type",
        constants$555.g_filter_output_stream_get_type$FUNC
    );
    static final FunctionDescriptor g_filter_output_stream_get_base_stream$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filter_output_stream_get_base_stream$MH = RuntimeHelper.downcallHandle(
        "g_filter_output_stream_get_base_stream",
        constants$555.g_filter_output_stream_get_base_stream$FUNC
    );
}

