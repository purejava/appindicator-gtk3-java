// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$860 {

    static final FunctionDescriptor g_tls_certificate_get_not_valid_after$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_not_valid_after$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_not_valid_after",
        constants$860.g_tls_certificate_get_not_valid_after$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_get_subject_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_subject_name$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_subject_name",
        constants$860.g_tls_certificate_get_subject_name$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_get_issuer_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_issuer_name$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_issuer_name",
        constants$860.g_tls_certificate_get_issuer_name$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_get_dns_names$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_dns_names$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_dns_names",
        constants$860.g_tls_certificate_get_dns_names$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_get_ip_addresses$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_get_ip_addresses$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_ip_addresses",
        constants$860.g_tls_certificate_get_ip_addresses$FUNC
    );
    static final FunctionDescriptor g_tls_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_connection_get_type",
        constants$860.g_tls_connection_get_type$FUNC
    );
}


