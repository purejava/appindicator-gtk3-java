// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$502 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$502() {}
    static final FunctionDescriptor g_filter_input_stream_get_close_base_stream$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filter_input_stream_get_close_base_stream$MH = RuntimeHelper.downcallHandle(
        "g_filter_input_stream_get_close_base_stream",
        constants$502.g_filter_input_stream_get_close_base_stream$FUNC
    );
    static final FunctionDescriptor g_filter_input_stream_set_close_base_stream$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_filter_input_stream_set_close_base_stream$MH = RuntimeHelper.downcallHandle(
        "g_filter_input_stream_set_close_base_stream",
        constants$502.g_filter_input_stream_set_close_base_stream$FUNC
    );
    static final FunctionDescriptor g_buffered_input_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_buffered_input_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_get_type",
        constants$502.g_buffered_input_stream_get_type$FUNC
    );
    static final FunctionDescriptor g_buffered_input_stream_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_new$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_new",
        constants$502.g_buffered_input_stream_new$FUNC
    );
    static final FunctionDescriptor g_buffered_input_stream_new_sized$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_new_sized$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_new_sized",
        constants$502.g_buffered_input_stream_new_sized$FUNC
    );
    static final FunctionDescriptor g_buffered_input_stream_get_buffer_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_buffered_input_stream_get_buffer_size$MH = RuntimeHelper.downcallHandle(
        "g_buffered_input_stream_get_buffer_size",
        constants$502.g_buffered_input_stream_get_buffer_size$FUNC
    );
}


