// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$544 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$544() {}
    static final FunctionDescriptor g_data_input_stream_read_until_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_read_until_async$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_read_until_async",
        constants$544.g_data_input_stream_read_until_async$FUNC
    );
    static final FunctionDescriptor g_data_input_stream_read_until_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_read_until_finish$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_read_until_finish",
        constants$544.g_data_input_stream_read_until_finish$FUNC
    );
    static final FunctionDescriptor g_data_input_stream_read_upto$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_read_upto$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_read_upto",
        constants$544.g_data_input_stream_read_upto$FUNC
    );
    static final FunctionDescriptor g_data_input_stream_read_upto_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_read_upto_async$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_read_upto_async",
        constants$544.g_data_input_stream_read_upto_async$FUNC
    );
    static final FunctionDescriptor g_data_input_stream_read_upto_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_data_input_stream_read_upto_finish$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_read_upto_finish",
        constants$544.g_data_input_stream_read_upto_finish$FUNC
    );
    static final FunctionDescriptor g_data_output_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_data_output_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_data_output_stream_get_type",
        constants$544.g_data_output_stream_get_type$FUNC
    );
}


