// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$573 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$573() {}
    static final VarHandle const$0 = constants$571.const$3.varHandle(MemoryLayout.PathElement.groupElement("param_id"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type")
        ).withName("g_type_class"),
        JAVA_LONG.withName("value_type"),
        RuntimeHelper.POINTER.withName("finalize"),
        RuntimeHelper.POINTER.withName("value_set_default"),
        RuntimeHelper.POINTER.withName("value_validate"),
        RuntimeHelper.POINTER.withName("values_cmp"),
        RuntimeHelper.POINTER.withName("value_is_valid"),
        MemoryLayout.sequenceLayout(3, RuntimeHelper.POINTER).withName("dummy")
    ).withName("_GParamSpecClass");
    static final VarHandle const$2 = constants$573.const$1.varHandle(MemoryLayout.PathElement.groupElement("value_type"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GParamSpecClass.finalize.class, "apply", constants$13.const$1);
    static final VarHandle const$4 = constants$573.const$1.varHandle(MemoryLayout.PathElement.groupElement("finalize"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GParamSpecClass.value_set_default.class, "apply", constants$13.const$4);
}


