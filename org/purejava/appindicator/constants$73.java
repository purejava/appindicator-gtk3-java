// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$73 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$73() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("__lock"),
        JAVA_INT.withName("__count"),
        JAVA_INT.withName("__owner"),
        JAVA_INT.withName("__nusers"),
        JAVA_INT.withName("__kind"),
        JAVA_INT.withName("__spins"),
        MemoryLayout.structLayout(
            RuntimeHelper.POINTER.withName("__prev"),
            RuntimeHelper.POINTER.withName("__next")
        ).withName("__list")
    ).withName("__pthread_mutex_s");
    static final VarHandle const$1 = constants$73.const$0.varHandle(MemoryLayout.PathElement.groupElement("__lock"));
    static final VarHandle const$2 = constants$73.const$0.varHandle(MemoryLayout.PathElement.groupElement("__count"));
    static final VarHandle const$3 = constants$73.const$0.varHandle(MemoryLayout.PathElement.groupElement("__owner"));
    static final VarHandle const$4 = constants$73.const$0.varHandle(MemoryLayout.PathElement.groupElement("__nusers"));
    static final VarHandle const$5 = constants$73.const$0.varHandle(MemoryLayout.PathElement.groupElement("__kind"));
}

