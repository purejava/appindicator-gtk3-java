// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$817 {

    static final FunctionDescriptor g_socket_set_listen_backlog$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_listen_backlog$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_listen_backlog",
        constants$817.g_socket_set_listen_backlog$FUNC
    );
    static final FunctionDescriptor g_socket_get_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_timeout$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_timeout",
        constants$817.g_socket_get_timeout$FUNC
    );
    static final FunctionDescriptor g_socket_set_timeout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_timeout$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_timeout",
        constants$817.g_socket_set_timeout$FUNC
    );
    static final FunctionDescriptor g_socket_get_ttl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_ttl$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_ttl",
        constants$817.g_socket_get_ttl$FUNC
    );
    static final FunctionDescriptor g_socket_set_ttl$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_ttl$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_ttl",
        constants$817.g_socket_set_ttl$FUNC
    );
    static final FunctionDescriptor g_socket_get_broadcast$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_broadcast$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_broadcast",
        constants$817.g_socket_get_broadcast$FUNC
    );
}

