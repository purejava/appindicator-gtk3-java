// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$692 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$692() {}
    static final FunctionDescriptor g_memory_input_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_memory_input_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_get_type",
        constants$692.g_memory_input_stream_get_type$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_memory_input_stream_new$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_new",
        constants$692.g_memory_input_stream_new$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_new_from_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_new_from_data$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_new_from_data",
        constants$692.g_memory_input_stream_new_from_data$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_new_from_bytes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_new_from_bytes$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_new_from_bytes",
        constants$692.g_memory_input_stream_new_from_bytes$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_add_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_add_data$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_add_data",
        constants$692.g_memory_input_stream_add_data$FUNC
    );
    static final FunctionDescriptor g_memory_input_stream_add_bytes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_memory_input_stream_add_bytes$MH = RuntimeHelper.downcallHandle(
        "g_memory_input_stream_add_bytes",
        constants$692.g_memory_input_stream_add_bytes$FUNC
    );
}


