// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$798 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$798() {}
    static final FunctionDescriptor g_tcp_connection_get_graceful_disconnect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tcp_connection_get_graceful_disconnect$MH = RuntimeHelper.downcallHandle(
        "g_tcp_connection_get_graceful_disconnect",
        constants$798.g_tcp_connection_get_graceful_disconnect$FUNC
    );
    static final FunctionDescriptor g_tcp_wrapper_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tcp_wrapper_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tcp_wrapper_connection_get_type",
        constants$798.g_tcp_wrapper_connection_get_type$FUNC
    );
    static final FunctionDescriptor g_tcp_wrapper_connection_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tcp_wrapper_connection_new$MH = RuntimeHelper.downcallHandle(
        "g_tcp_wrapper_connection_new",
        constants$798.g_tcp_wrapper_connection_new$FUNC
    );
    static final FunctionDescriptor g_tcp_wrapper_connection_get_base_io_stream$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tcp_wrapper_connection_get_base_io_stream$MH = RuntimeHelper.downcallHandle(
        "g_tcp_wrapper_connection_get_base_io_stream",
        constants$798.g_tcp_wrapper_connection_get_base_io_stream$FUNC
    );
    static final FunctionDescriptor g_test_dbus_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_test_dbus_get_type$MH = RuntimeHelper.downcallHandle(
        "g_test_dbus_get_type",
        constants$798.g_test_dbus_get_type$FUNC
    );
    static final FunctionDescriptor g_test_dbus_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_test_dbus_new$MH = RuntimeHelper.downcallHandle(
        "g_test_dbus_new",
        constants$798.g_test_dbus_new$FUNC
    );
}


