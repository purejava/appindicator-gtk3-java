// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$495 {

    static final FunctionDescriptor g_signal_group_block$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_group_block$MH = RuntimeHelper.downcallHandle(
        "g_signal_group_block",
        constants$495.g_signal_group_block$FUNC
    );
    static final FunctionDescriptor g_signal_group_unblock$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_group_unblock$MH = RuntimeHelper.downcallHandle(
        "g_signal_group_unblock",
        constants$495.g_signal_group_unblock$FUNC
    );
    static final FunctionDescriptor g_signal_group_connect_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_group_connect_object$MH = RuntimeHelper.downcallHandle(
        "g_signal_group_connect_object",
        constants$495.g_signal_group_connect_object$FUNC
    );
    static final FunctionDescriptor g_signal_group_connect_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_signal_group_connect_data$MH = RuntimeHelper.downcallHandle(
        "g_signal_group_connect_data",
        constants$495.g_signal_group_connect_data$FUNC
    );
    static final FunctionDescriptor g_signal_group_connect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_group_connect$MH = RuntimeHelper.downcallHandle(
        "g_signal_group_connect",
        constants$495.g_signal_group_connect$FUNC
    );
    static final FunctionDescriptor g_signal_group_connect_after$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_signal_group_connect_after$MH = RuntimeHelper.downcallHandle(
        "g_signal_group_connect_after",
        constants$495.g_signal_group_connect_after$FUNC
    );
}


