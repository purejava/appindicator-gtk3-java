// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$806 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$806() {}
    static final FunctionDescriptor g_tls_certificate_get_issuer_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_issuer_name$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_issuer_name",
        constants$806.g_tls_certificate_get_issuer_name$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_get_dns_names$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_dns_names$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_dns_names",
        constants$806.g_tls_certificate_get_dns_names$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_get_ip_addresses$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_ip_addresses$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_ip_addresses",
        constants$806.g_tls_certificate_get_ip_addresses$FUNC
    );
    static final FunctionDescriptor g_tls_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_type",
        constants$806.g_tls_connection_get_type$FUNC
    );
    static final FunctionDescriptor g_tls_connection_set_use_system_certdb$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_tls_connection_set_use_system_certdb$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_set_use_system_certdb",
        constants$806.g_tls_connection_set_use_system_certdb$FUNC
    );
    static final FunctionDescriptor g_tls_connection_get_use_system_certdb$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_connection_get_use_system_certdb$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_use_system_certdb",
        constants$806.g_tls_connection_get_use_system_certdb$FUNC
    );
}


