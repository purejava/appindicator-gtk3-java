// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$816 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$816() {}
    static final FunctionDescriptor g_tls_interaction_invoke_request_certificate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_interaction_invoke_request_certificate$MH = RuntimeHelper.downcallHandle(
        "g_tls_interaction_invoke_request_certificate",
        constants$816.g_tls_interaction_invoke_request_certificate$FUNC
    );
    static final FunctionDescriptor g_tls_interaction_request_certificate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_interaction_request_certificate$MH = RuntimeHelper.downcallHandle(
        "g_tls_interaction_request_certificate",
        constants$816.g_tls_interaction_request_certificate$FUNC
    );
    static final FunctionDescriptor g_tls_interaction_request_certificate_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_interaction_request_certificate_async$MH = RuntimeHelper.downcallHandle(
        "g_tls_interaction_request_certificate_async",
        constants$816.g_tls_interaction_request_certificate_async$FUNC
    );
    static final FunctionDescriptor g_tls_interaction_request_certificate_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_interaction_request_certificate_finish$MH = RuntimeHelper.downcallHandle(
        "g_tls_interaction_request_certificate_finish",
        constants$816.g_tls_interaction_request_certificate_finish$FUNC
    );
    static final FunctionDescriptor g_tls_password_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_tls_password_get_type$MH = RuntimeHelper.downcallHandle(
        "g_tls_password_get_type",
        constants$816.g_tls_password_get_type$FUNC
    );
    static final FunctionDescriptor g_tls_password_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_tls_password_new$MH = RuntimeHelper.downcallHandle(
        "g_tls_password_new",
        constants$816.g_tls_password_new$FUNC
    );
}

