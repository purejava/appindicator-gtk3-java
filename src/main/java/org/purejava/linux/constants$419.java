// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$419 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$419() {}
    static final FunctionDescriptor g_signal_connect_closure$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_connect_closure$MH = RuntimeHelper.downcallHandle(
        "g_signal_connect_closure",
        constants$419.g_signal_connect_closure$FUNC
    );
    static final FunctionDescriptor g_signal_connect_data$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_connect_data$MH = RuntimeHelper.downcallHandle(
        "g_signal_connect_data",
        constants$419.g_signal_connect_data$FUNC
    );
    static final FunctionDescriptor g_signal_handler_block$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_signal_handler_block$MH = RuntimeHelper.downcallHandle(
        "g_signal_handler_block",
        constants$419.g_signal_handler_block$FUNC
    );
    static final FunctionDescriptor g_signal_handler_unblock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_signal_handler_unblock$MH = RuntimeHelper.downcallHandle(
        "g_signal_handler_unblock",
        constants$419.g_signal_handler_unblock$FUNC
    );
    static final FunctionDescriptor g_signal_handler_disconnect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_signal_handler_disconnect$MH = RuntimeHelper.downcallHandle(
        "g_signal_handler_disconnect",
        constants$419.g_signal_handler_disconnect$FUNC
    );
    static final FunctionDescriptor g_signal_handler_is_connected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_signal_handler_is_connected$MH = RuntimeHelper.downcallHandle(
        "g_signal_handler_is_connected",
        constants$419.g_signal_handler_is_connected$FUNC
    );
}


