// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$662 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$662() {}
    static final VarHandle const$0 = constants$661.const$2.varHandle(MemoryLayout.PathElement.groupElement("epsilon"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
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
        JAVA_DOUBLE.withName("minimum"),
        JAVA_DOUBLE.withName("maximum"),
        JAVA_DOUBLE.withName("default_value"),
        JAVA_DOUBLE.withName("epsilon")
    ).withName("_GParamSpecDouble");
    static final VarHandle const$2 = constants$662.const$1.varHandle(MemoryLayout.PathElement.groupElement("minimum"));
    static final VarHandle const$3 = constants$662.const$1.varHandle(MemoryLayout.PathElement.groupElement("maximum"));
    static final VarHandle const$4 = constants$662.const$1.varHandle(MemoryLayout.PathElement.groupElement("default_value"));
    static final VarHandle const$5 = constants$662.const$1.varHandle(MemoryLayout.PathElement.groupElement("epsilon"));
}

