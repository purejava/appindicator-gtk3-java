// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$586 {

    static final FunctionDescriptor g_datagram_based_receive_messages$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datagram_based_receive_messages$MH = RuntimeHelper.downcallHandle(
        "g_datagram_based_receive_messages",
        constants$586.g_datagram_based_receive_messages$FUNC
    );
    static final FunctionDescriptor g_datagram_based_send_messages$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datagram_based_send_messages$MH = RuntimeHelper.downcallHandle(
        "g_datagram_based_send_messages",
        constants$586.g_datagram_based_send_messages$FUNC
    );
    static final FunctionDescriptor g_datagram_based_create_source$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datagram_based_create_source$MH = RuntimeHelper.downcallHandle(
        "g_datagram_based_create_source",
        constants$586.g_datagram_based_create_source$FUNC
    );
    static final FunctionDescriptor g_datagram_based_condition_check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_datagram_based_condition_check$MH = RuntimeHelper.downcallHandle(
        "g_datagram_based_condition_check",
        constants$586.g_datagram_based_condition_check$FUNC
    );
    static final FunctionDescriptor g_datagram_based_condition_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datagram_based_condition_wait$MH = RuntimeHelper.downcallHandle(
        "g_datagram_based_condition_wait",
        constants$586.g_datagram_based_condition_wait$FUNC
    );
    static final FunctionDescriptor g_data_input_stream_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_data_input_stream_get_type$MH = RuntimeHelper.downcallHandle(
        "g_data_input_stream_get_type",
        constants$586.g_data_input_stream_get_type$FUNC
    );
}

