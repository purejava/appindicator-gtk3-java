// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$933 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$933() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dbus_server_get_type",
        constants$3.const$5
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_dbus_server_new_sync",
        constants$933.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_dbus_server_get_client_address",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dbus_server_get_guid",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dbus_server_get_flags",
        constants$10.const$5
    );
}


