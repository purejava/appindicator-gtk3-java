// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$545 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$545() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_cond_free",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_cond_timed_wait",
        constants$12.const$2
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_LONG.withName("g_type")
    ).withName("_GTypeClass");
    static final VarHandle const$3 = constants$545.const$2.varHandle(MemoryLayout.PathElement.groupElement("g_type"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("g_class")
    ).withName("_GTypeInstance");
    static final VarHandle const$5 = constants$545.const$4.varHandle(MemoryLayout.PathElement.groupElement("g_class"));
}


