// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$833 {

    static final FunctionDescriptor g_socket_control_message_serialize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_control_message_serialize$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_serialize",
        constants$833.g_socket_control_message_serialize$FUNC
    );
    static final FunctionDescriptor g_socket_control_message_deserialize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_control_message_deserialize$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_deserialize",
        constants$833.g_socket_control_message_deserialize$FUNC
    );
    static final FunctionDescriptor g_socket_listener_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_listener_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_get_type",
        constants$833.g_socket_listener_get_type$FUNC
    );
    static final FunctionDescriptor g_socket_listener_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_socket_listener_new$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_new",
        constants$833.g_socket_listener_new$FUNC
    );
    static final FunctionDescriptor g_socket_listener_set_backlog$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_listener_set_backlog$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_set_backlog",
        constants$833.g_socket_listener_set_backlog$FUNC
    );
    static final FunctionDescriptor g_socket_listener_add_socket$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listener_add_socket$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_add_socket",
        constants$833.g_socket_listener_add_socket$FUNC
    );
}

