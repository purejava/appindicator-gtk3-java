// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$657 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$657() {}
    static final VarHandle const$0 = constants$656.const$4.varHandle(MemoryLayout.PathElement.groupElement("maximum"));
    static final VarHandle const$1 = constants$656.const$4.varHandle(MemoryLayout.PathElement.groupElement("default_value"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                RuntimeHelper.POINTER.withName("g_class")
            ).withName("g_type_instance"),
            RuntimeHelper.POINTER.withName("name"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("value_type"),
            JAVA_LONG.withName("owner_type"),
            RuntimeHelper.POINTER.withName("_nick"),
            RuntimeHelper.POINTER.withName("_blurb"),
            RuntimeHelper.POINTER.withName("qdata"),
            JAVA_INT.withName("ref_count"),
            JAVA_INT.withName("param_id")
        ).withName("parent_instance"),
        JAVA_LONG.withName("minimum"),
        JAVA_LONG.withName("maximum"),
        JAVA_LONG.withName("default_value")
    ).withName("_GParamSpecLong");
    static final VarHandle const$3 = constants$657.const$2.varHandle(MemoryLayout.PathElement.groupElement("minimum"));
    static final VarHandle const$4 = constants$657.const$2.varHandle(MemoryLayout.PathElement.groupElement("maximum"));
    static final VarHandle const$5 = constants$657.const$2.varHandle(MemoryLayout.PathElement.groupElement("default_value"));
}


