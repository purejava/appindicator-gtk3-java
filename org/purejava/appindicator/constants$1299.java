// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1299 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1299() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_socket_client_add_application_proxy",
        constants$13.const$4
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("enumerate"),
        RuntimeHelper.POINTER.withName("proxy_enumerate"),
        RuntimeHelper.POINTER.withName("to_string")
    ).withName("_GSocketConnectableIface");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GSocketConnectableIface.enumerate.class, "apply", constants$5.const$2);
    static final VarHandle const$3 = constants$1299.const$1.varHandle(MemoryLayout.PathElement.groupElement("enumerate"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GSocketConnectableIface.proxy_enumerate.class, "apply", constants$5.const$2);
    static final VarHandle const$5 = constants$1299.const$1.varHandle(MemoryLayout.PathElement.groupElement("proxy_enumerate"));
}

