// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$656 {

    static final FunctionDescriptor g_dtls_connection_set_require_close_notify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dtls_connection_set_require_close_notify$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_set_require_close_notify",
        constants$656.g_dtls_connection_set_require_close_notify$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_get_require_close_notify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_get_require_close_notify$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_require_close_notify",
        constants$656.g_dtls_connection_get_require_close_notify$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_set_rehandshake_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dtls_connection_set_rehandshake_mode$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_set_rehandshake_mode",
        constants$656.g_dtls_connection_set_rehandshake_mode$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_get_rehandshake_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_get_rehandshake_mode$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_rehandshake_mode",
        constants$656.g_dtls_connection_get_rehandshake_mode$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_handshake$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_handshake$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_handshake",
        constants$656.g_dtls_connection_handshake$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_handshake_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_handshake_async$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_handshake_async",
        constants$656.g_dtls_connection_handshake_async$FUNC
    );
}


