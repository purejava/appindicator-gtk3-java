// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$777 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$777() {}
    static final FunctionDescriptor g_socket_connection_get_local_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_get_local_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_get_local_address",
        constants$777.g_socket_connection_get_local_address$FUNC
    );
    static final FunctionDescriptor g_socket_connection_get_remote_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_get_remote_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_get_remote_address",
        constants$777.g_socket_connection_get_remote_address$FUNC
    );
    static final FunctionDescriptor g_socket_connection_factory_register_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_connection_factory_register_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_factory_register_type",
        constants$777.g_socket_connection_factory_register_type$FUNC
    );
    static final FunctionDescriptor g_socket_connection_factory_lookup_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_connection_factory_lookup_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_factory_lookup_type",
        constants$777.g_socket_connection_factory_lookup_type$FUNC
    );
    static final FunctionDescriptor g_socket_connection_factory_create_connection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_connection_factory_create_connection$MH = RuntimeHelper.downcallHandle(
        "g_socket_connection_factory_create_connection",
        constants$777.g_socket_connection_factory_create_connection$FUNC
    );
    static final FunctionDescriptor g_socket_control_message_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_socket_control_message_get_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_control_message_get_type",
        constants$777.g_socket_control_message_get_type$FUNC
    );
}


