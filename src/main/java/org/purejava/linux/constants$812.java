// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$812 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$812() {}
    static final FunctionDescriptor g_tls_client_connection_set_use_ssl3$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_set_use_ssl3$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_set_use_ssl3",
        constants$812.g_tls_client_connection_set_use_ssl3$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_get_accepted_cas$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_get_accepted_cas$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_get_accepted_cas",
        constants$812.g_tls_client_connection_get_accepted_cas$FUNC
    );
    static final FunctionDescriptor g_tls_client_connection_copy_session_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_client_connection_copy_session_state$MH = RuntimeHelper.downcallHandle(
        "g_tls_client_connection_copy_session_state",
        constants$812.g_tls_client_connection_copy_session_state$FUNC
    );
    static final FunctionDescriptor g_tls_database_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_database_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_database_get_type",
        constants$812.g_tls_database_get_type$FUNC
    );
    static final FunctionDescriptor g_tls_database_verify_chain$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_database_verify_chain$MH = RuntimeHelper.downcallHandle(
        "g_tls_database_verify_chain",
        constants$812.g_tls_database_verify_chain$FUNC
    );
    static final FunctionDescriptor g_tls_database_verify_chain_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_database_verify_chain_async$MH = RuntimeHelper.downcallHandle(
        "g_tls_database_verify_chain_async",
        constants$812.g_tls_database_verify_chain_async$FUNC
    );
}


