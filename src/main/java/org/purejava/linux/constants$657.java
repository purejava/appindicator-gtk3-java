// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$657 {

    static final FunctionDescriptor g_dtls_connection_handshake_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_handshake_finish$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_handshake_finish",
        constants$657.g_dtls_connection_handshake_finish$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_shutdown$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_shutdown$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_shutdown",
        constants$657.g_dtls_connection_shutdown$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_shutdown_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_shutdown_async$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_shutdown_async",
        constants$657.g_dtls_connection_shutdown_async$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_shutdown_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_shutdown_finish$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_shutdown_finish",
        constants$657.g_dtls_connection_shutdown_finish$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_close$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_close",
        constants$657.g_dtls_connection_close$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_close_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_close_async$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_close_async",
        constants$657.g_dtls_connection_close_async$FUNC
    );
}


