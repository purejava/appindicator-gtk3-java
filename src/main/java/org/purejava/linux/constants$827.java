// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$827 {

    static final FunctionDescriptor g_socket_client_get_tls_validation_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_tls_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_tls_validation_flags",
        constants$827.g_socket_client_get_tls_validation_flags$FUNC
    );
    static final FunctionDescriptor g_socket_client_set_tls_validation_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_tls_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_tls_validation_flags",
        constants$827.g_socket_client_set_tls_validation_flags$FUNC
    );
    static final FunctionDescriptor g_socket_client_get_proxy_resolver$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_proxy_resolver$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_proxy_resolver",
        constants$827.g_socket_client_get_proxy_resolver$FUNC
    );
    static final FunctionDescriptor g_socket_client_set_proxy_resolver$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_set_proxy_resolver$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_proxy_resolver",
        constants$827.g_socket_client_set_proxy_resolver$FUNC
    );
    static final FunctionDescriptor g_socket_client_connect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_connect$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_connect",
        constants$827.g_socket_client_connect$FUNC
    );
    static final FunctionDescriptor g_socket_client_connect_to_host$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_connect_to_host$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_connect_to_host",
        constants$827.g_socket_client_connect_to_host$FUNC
    );
}


