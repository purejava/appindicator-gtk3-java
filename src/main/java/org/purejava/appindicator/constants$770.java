// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$770 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$770() {}
    static final FunctionDescriptor g_socket_client_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_socket_client_new$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_new",
        constants$770.g_socket_client_new$FUNC
    );
    static final FunctionDescriptor g_socket_client_get_family$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_family$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_family",
        constants$770.g_socket_client_get_family$FUNC
    );
    static final FunctionDescriptor g_socket_client_set_family$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_family$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_family",
        constants$770.g_socket_client_set_family$FUNC
    );
    static final FunctionDescriptor g_socket_client_get_socket_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_socket_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_socket_type",
        constants$770.g_socket_client_get_socket_type$FUNC
    );
    static final FunctionDescriptor g_socket_client_set_socket_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_socket_client_set_socket_type$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_set_socket_type",
        constants$770.g_socket_client_set_socket_type$FUNC
    );
    static final FunctionDescriptor g_socket_client_get_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_socket_client_get_protocol$MH = RuntimeHelper.downcallHandle(
        "g_socket_client_get_protocol",
        constants$770.g_socket_client_get_protocol$FUNC
    );
}

