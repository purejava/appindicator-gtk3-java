// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1303 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1303() {}
    static final VarHandle const$0 = constants$1301.const$0.varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    RuntimeHelper.POINTER.withName("g_class")
                ).withName("g_type_instance"),
                JAVA_INT.withName("ref_count"),
                MemoryLayout.paddingLayout(4),
                RuntimeHelper.POINTER.withName("qdata")
            ).withName("parent_instance"),
            RuntimeHelper.POINTER.withName("priv")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GSocketConnection");
    static final VarHandle const$2 = constants$1303.const$1.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_socket_connection_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_socket_connection_is_connected",
        constants$10.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_socket_connection_connect",
        constants$34.const$5
    );
}

