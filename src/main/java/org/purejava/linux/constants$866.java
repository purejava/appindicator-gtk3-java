// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$866 {

    static final FunctionDescriptor g_tls_client_connection_set_server_identity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_set_server_identity$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_set_server_identity",
        constants$866.g_tls_client_connection_set_server_identity$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_get_use_ssl3$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_get_use_ssl3$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_get_use_ssl3",
        constants$866.g_tls_client_connection_get_use_ssl3$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_set_use_ssl3$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_set_use_ssl3$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_set_use_ssl3",
        constants$866.g_tls_client_connection_set_use_ssl3$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_get_accepted_cas$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_get_accepted_cas$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_get_accepted_cas",
        constants$866.g_tls_client_connection_get_accepted_cas$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_copy_session_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_copy_session_state$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_copy_session_state",
        constants$866.g_tls_client_connection_copy_session_state$FUNC
    );
    static final FunctionDescriptor g_tls_database_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_database_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_database_get_type",
        constants$866.g_tls_database_get_type$FUNC
    );
}

