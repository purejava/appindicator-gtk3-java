// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$860 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$860() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_send_message_with_reply_finish",
        constants$23.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_send_message_with_reply_sync",
        constants$860.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_emit_signal",
        constants$164.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_dbus_connection_call$callback.class, "apply", constants$14.const$3);
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_call",
        constants$860.const$5
    );
}


