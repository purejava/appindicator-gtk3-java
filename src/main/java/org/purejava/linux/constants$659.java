// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$659 {

    static final FunctionDescriptor g_dtls_connection_get_ciphersuite_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_get_ciphersuite_name$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_ciphersuite_name",
        constants$659.g_dtls_connection_get_ciphersuite_name$FUNC
    );
    static final FunctionDescriptor g_dtls_client_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dtls_client_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_type",
        constants$659.g_dtls_client_connection_get_type$FUNC
    );
    static final FunctionDescriptor g_dtls_client_connection_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_new$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_new",
        constants$659.g_dtls_client_connection_new$FUNC
    );
    static final FunctionDescriptor g_dtls_client_connection_get_validation_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_get_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_validation_flags",
        constants$659.g_dtls_client_connection_get_validation_flags$FUNC
    );
    static final FunctionDescriptor g_dtls_client_connection_set_validation_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_set_validation_flags$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_set_validation_flags",
        constants$659.g_dtls_client_connection_set_validation_flags$FUNC
    );
    static final FunctionDescriptor g_dtls_client_connection_get_server_identity$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_client_connection_get_server_identity$MH = RuntimeHelper.downcallHandle(
        "g_dtls_client_connection_get_server_identity",
        constants$659.g_dtls_client_connection_get_server_identity$FUNC
    );
}

