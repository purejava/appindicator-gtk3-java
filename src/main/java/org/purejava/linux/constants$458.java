// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$458 {

    static final FunctionDescriptor g_signal_remove_emission_hook$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_signal_remove_emission_hook$MH = RuntimeHelper.downcallHandle(
        "g_signal_remove_emission_hook",
        constants$458.g_signal_remove_emission_hook$FUNC
    );
    static final FunctionDescriptor g_signal_has_handler_pending$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_has_handler_pending$MH = RuntimeHelper.downcallHandle(
        "g_signal_has_handler_pending",
        constants$458.g_signal_has_handler_pending$FUNC
    );
    static final FunctionDescriptor g_signal_connect_closure_by_id$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_connect_closure_by_id$MH = RuntimeHelper.downcallHandle(
        "g_signal_connect_closure_by_id",
        constants$458.g_signal_connect_closure_by_id$FUNC
    );
    static final FunctionDescriptor g_signal_connect_closure$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_connect_closure$MH = RuntimeHelper.downcallHandle(
        "g_signal_connect_closure",
        constants$458.g_signal_connect_closure$FUNC
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
        constants$458.g_signal_connect_data$FUNC
    );
    static final FunctionDescriptor g_signal_handler_block$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_signal_handler_block$MH = RuntimeHelper.downcallHandle(
        "g_signal_handler_block",
        constants$458.g_signal_handler_block$FUNC
    );
}


