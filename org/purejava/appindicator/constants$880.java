// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$880 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$880() {}
    static final VarHandle const$0 = constants$879.const$5.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    static final VarHandle const$1 = constants$879.const$5.varHandle(MemoryLayout.PathElement.groupElement("key"));
    static final VarHandle const$2 = constants$879.const$5.varHandle(MemoryLayout.PathElement.groupElement("value"));
    static final VarHandle const$3 = constants$879.const$5.varHandle(MemoryLayout.PathElement.groupElement("annotations"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("name"),
        RuntimeHelper.POINTER.withName("signature"),
        RuntimeHelper.POINTER.withName("annotations")
    ).withName("_GDBusArgInfo");
    static final VarHandle const$5 = constants$880.const$4.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
}

