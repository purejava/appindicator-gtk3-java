// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1253 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1253() {}
    static final VarHandle const$0 = constants$1252.const$0.varHandle(MemoryLayout.PathElement.groupElement("writable_change_event"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GSettingsClass.change_event.class, "apply", constants$62.const$0);
    static final VarHandle const$2 = constants$1252.const$0.varHandle(MemoryLayout.PathElement.groupElement("change_event"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            JAVA_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("qdata")
        ).withName("parent_instance"),
        RuntimeHelper.POINTER.withName("priv")
    ).withName("_GSettings");
    static final VarHandle const$4 = constants$1253.const$3.varHandle(MemoryLayout.PathElement.groupElement("priv"));
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_settings_get_type",
        constants$3.const$5
    );
}


