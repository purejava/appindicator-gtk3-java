// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$761 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$761() {}
    static final FunctionDescriptor g_socket_get_socket_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_socket_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_socket_type",
        constants$761.g_socket_get_socket_type$FUNC
    );
    static final FunctionDescriptor g_socket_get_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_protocol$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_protocol",
        constants$761.g_socket_get_protocol$FUNC
    );
    static final FunctionDescriptor g_socket_get_local_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_local_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_local_address",
        constants$761.g_socket_get_local_address$FUNC
    );
    static final FunctionDescriptor g_socket_get_remote_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_remote_address$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_remote_address",
        constants$761.g_socket_get_remote_address$FUNC
    );
    static final FunctionDescriptor g_socket_set_blocking$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_set_blocking$MH = RuntimeHelper.downcallHandle(
        "g_socket_set_blocking",
        constants$761.g_socket_set_blocking$FUNC
    );
    static final FunctionDescriptor g_socket_get_blocking$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_get_blocking$MH = RuntimeHelper.downcallHandle(
        "g_socket_get_blocking",
        constants$761.g_socket_get_blocking$FUNC
    );
}


