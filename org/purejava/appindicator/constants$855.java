// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$855 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$855() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_new_sync",
        constants$855.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_dbus_connection_new_for_address$callback.class, "apply", constants$14.const$3);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_new_for_address",
        constants$380.const$0
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_new_for_address_finish",
        constants$5.const$5
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_new_for_address_sync",
        constants$855.const$5
    );
}

