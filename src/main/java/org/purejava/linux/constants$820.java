// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$820 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$820() {}
    static final FunctionDescriptor g_unix_connection_receive_credentials_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_connection_receive_credentials_async$MH = RuntimeHelper.downcallHandle(
        "g_unix_connection_receive_credentials_async",
        constants$820.g_unix_connection_receive_credentials_async$FUNC
    );
    static final FunctionDescriptor g_unix_connection_receive_credentials_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_connection_receive_credentials_finish$MH = RuntimeHelper.downcallHandle(
        "g_unix_connection_receive_credentials_finish",
        constants$820.g_unix_connection_receive_credentials_finish$FUNC
    );
    static final FunctionDescriptor g_unix_credentials_message_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_unix_credentials_message_get_type$MH = RuntimeHelper.downcallHandle(
        "g_unix_credentials_message_get_type",
        constants$820.g_unix_credentials_message_get_type$FUNC
    );
    static final FunctionDescriptor g_unix_credentials_message_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_unix_credentials_message_new$MH = RuntimeHelper.downcallHandle(
        "g_unix_credentials_message_new",
        constants$820.g_unix_credentials_message_new$FUNC
    );
    static final FunctionDescriptor g_unix_credentials_message_new_with_credentials$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_credentials_message_new_with_credentials$MH = RuntimeHelper.downcallHandle(
        "g_unix_credentials_message_new_with_credentials",
        constants$820.g_unix_credentials_message_new_with_credentials$FUNC
    );
    static final FunctionDescriptor g_unix_credentials_message_get_credentials$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_credentials_message_get_credentials$MH = RuntimeHelper.downcallHandle(
        "g_unix_credentials_message_get_credentials",
        constants$820.g_unix_credentials_message_get_credentials$FUNC
    );
}


