// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$809 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$809() {}
    static final FunctionDescriptor g_tls_connection_set_advertised_protocols$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_set_advertised_protocols$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_set_advertised_protocols",
        constants$809.g_tls_connection_set_advertised_protocols$FUNC
    );
    static final FunctionDescriptor g_tls_connection_get_negotiated_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_negotiated_protocol$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_negotiated_protocol",
        constants$809.g_tls_connection_get_negotiated_protocol$FUNC
    );
    static final FunctionDescriptor g_tls_connection_get_channel_binding_data$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_channel_binding_data$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_channel_binding_data",
        constants$809.g_tls_connection_get_channel_binding_data$FUNC
    );
    static final FunctionDescriptor g_tls_connection_handshake$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_handshake$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_handshake",
        constants$809.g_tls_connection_handshake$FUNC
    );
    static final FunctionDescriptor g_tls_connection_handshake_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_handshake_async$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_handshake_async",
        constants$809.g_tls_connection_handshake_async$FUNC
    );
    static final FunctionDescriptor g_tls_connection_handshake_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_handshake_finish$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_handshake_finish",
        constants$809.g_tls_connection_handshake_finish$FUNC
    );
}


