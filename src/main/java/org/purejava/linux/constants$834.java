// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$834 {

    static final FunctionDescriptor g_socket_listener_add_address$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listener_add_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_add_address",
        constants$834.g_socket_listener_add_address$FUNC
    );
    static final FunctionDescriptor g_socket_listener_add_inet_port$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listener_add_inet_port$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_add_inet_port",
        constants$834.g_socket_listener_add_inet_port$FUNC
    );
    static final FunctionDescriptor g_socket_listener_add_any_inet_port$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listener_add_any_inet_port$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_add_any_inet_port",
        constants$834.g_socket_listener_add_any_inet_port$FUNC
    );
    static final FunctionDescriptor g_socket_listener_accept_socket$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listener_accept_socket$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_accept_socket",
        constants$834.g_socket_listener_accept_socket$FUNC
    );
    static final FunctionDescriptor g_socket_listener_accept_socket_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listener_accept_socket_async$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_accept_socket_async",
        constants$834.g_socket_listener_accept_socket_async$FUNC
    );
    static final FunctionDescriptor g_socket_listener_accept_socket_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_listener_accept_socket_finish$MH = RuntimeHelper.downcallHandle(
        "g_socket_listener_accept_socket_finish",
        constants$834.g_socket_listener_accept_socket_finish$FUNC
    );
}

