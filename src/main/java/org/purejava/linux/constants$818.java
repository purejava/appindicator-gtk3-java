// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$818 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$818() {}
    static final FunctionDescriptor g_tls_password_set_description$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_password_set_description$MH = RuntimeHelper.downcallHandle(
        "g_tls_password_set_description",
        constants$818.g_tls_password_set_description$FUNC
    );
    static final FunctionDescriptor g_tls_password_get_warning$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_password_get_warning$MH = RuntimeHelper.downcallHandle(
        "g_tls_password_get_warning",
        constants$818.g_tls_password_get_warning$FUNC
    );
    static final FunctionDescriptor g_tls_password_set_warning$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_password_set_warning$MH = RuntimeHelper.downcallHandle(
        "g_tls_password_set_warning",
        constants$818.g_tls_password_set_warning$FUNC
    );
    static final FunctionDescriptor g_tls_server_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_server_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_server_connection_get_type",
        constants$818.g_tls_server_connection_get_type$FUNC
    );
    static final FunctionDescriptor g_tls_server_connection_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_server_connection_new$MH = RuntimeHelper.downcallHandle(
        "g_tls_server_connection_new",
        constants$818.g_tls_server_connection_new$FUNC
    );
    static final FunctionDescriptor g_unix_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_unix_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_unix_connection_get_type",
        constants$818.g_unix_connection_get_type$FUNC
    );
}


