// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$869 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$869() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_signal_subscribe",
        constants$869.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_dbus_connection_signal_unsubscribe",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(GDBusMessageFilterFunction.class, "apply", constants$482.const$3);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$482.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_dbus_connection_add_filter$filter_function.class, "apply", constants$482.const$3);
}

