// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$666 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$666() {}
    static final FunctionDescriptor g_socket_address_get_family$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_address_get_family$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_get_family",
        constants$666.g_socket_address_get_family$FUNC
    );
    static final FunctionDescriptor g_socket_address_new_from_native$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_socket_address_new_from_native$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_new_from_native",
        constants$666.g_socket_address_new_from_native$FUNC
    );
    static final FunctionDescriptor g_socket_address_to_native$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_address_to_native$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_to_native",
        constants$666.g_socket_address_to_native$FUNC
    );
    static final FunctionDescriptor g_socket_address_get_native_size$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_address_get_native_size$MH = RuntimeHelper.downcallHandle(
        "g_socket_address_get_native_size",
        constants$666.g_socket_address_get_native_size$FUNC
    );
    static final FunctionDescriptor g_inet_socket_address_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_inet_socket_address_get_type$MH = RuntimeHelper.downcallHandle(
        "g_inet_socket_address_get_type",
        constants$666.g_inet_socket_address_get_type$FUNC
    );
    static final FunctionDescriptor g_inet_socket_address_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_inet_socket_address_new$MH = RuntimeHelper.downcallHandle(
        "g_inet_socket_address_new",
        constants$666.g_inet_socket_address_new$FUNC
    );
}


