// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$117 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$117() {}
    static final VarHandle const$0 = constants$116.const$4.varHandle(MemoryLayout.PathElement.groupElement("si_uid"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("si_pid"),
        JAVA_INT.withName("si_uid"),
        JAVA_INT.withName("si_status"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("si_utime"),
        JAVA_LONG.withName("si_stime")
    ).withName("");
    static final VarHandle const$2 = constants$117.const$1.varHandle(MemoryLayout.PathElement.groupElement("si_pid"));
    static final VarHandle const$3 = constants$117.const$1.varHandle(MemoryLayout.PathElement.groupElement("si_uid"));
    static final VarHandle const$4 = constants$117.const$1.varHandle(MemoryLayout.PathElement.groupElement("si_status"));
    static final VarHandle const$5 = constants$117.const$1.varHandle(MemoryLayout.PathElement.groupElement("si_utime"));
}

