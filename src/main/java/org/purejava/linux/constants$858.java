// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$858 {

    static final FunctionDescriptor g_tls_certificate_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_certificate_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_get_type",
        constants$858.g_tls_certificate_get_type$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_new_from_pem$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_pem$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_pem",
        constants$858.g_tls_certificate_new_from_pem$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_new_from_pkcs12$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_pkcs12$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_pkcs12",
        constants$858.g_tls_certificate_new_from_pkcs12$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_new_from_file_with_password$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_file_with_password$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_file_with_password",
        constants$858.g_tls_certificate_new_from_file_with_password$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_new_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_file$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_file",
        constants$858.g_tls_certificate_new_from_file$FUNC
    );
    static final FunctionDescriptor g_tls_certificate_new_from_files$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_certificate_new_from_files$MH = RuntimeHelper.downcallHandle(
        "g_tls_certificate_new_from_files",
        constants$858.g_tls_certificate_new_from_files$FUNC
    );
}


