// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$776 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$776() {}
    static final FunctionDescriptor g_socket_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_get_type",
        constants$776.g_socket_connection_get_type$FUNC
    );
    static final FunctionDescriptor g_socket_connection_is_connected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_is_connected$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_is_connected",
        constants$776.g_socket_connection_is_connected$FUNC
    );
    static final FunctionDescriptor g_socket_connection_connect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_connect$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_connect",
        constants$776.g_socket_connection_connect$FUNC
    );
    static final FunctionDescriptor g_socket_connection_connect_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_connect_async$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_connect_async",
        constants$776.g_socket_connection_connect_async$FUNC
    );
    static final FunctionDescriptor g_socket_connection_connect_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_connect_finish$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_connect_finish",
        constants$776.g_socket_connection_connect_finish$FUNC
    );
    static final FunctionDescriptor g_socket_connection_get_socket$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_get_socket$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_get_socket",
        constants$776.g_socket_connection_get_socket$FUNC
    );
}


