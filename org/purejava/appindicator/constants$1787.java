// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1787 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1787() {}
    static final VarHandle const$0 = constants$1786.const$1.varHandle(MemoryLayout.PathElement.groupElement("target"));
    static final VarHandle const$1 = constants$1786.const$1.varHandle(MemoryLayout.PathElement.groupElement("property"));
    static final VarHandle const$2 = constants$1786.const$1.varHandle(MemoryLayout.PathElement.groupElement("time"));
    static final VarHandle const$3 = constants$1786.const$1.varHandle(MemoryLayout.PathElement.groupElement("requestor"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        MemoryLayout.paddingLayout(7),
        RuntimeHelper.POINTER.withName("owner"),
        JAVA_INT.withName("reason"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("selection"),
        JAVA_INT.withName("time"),
        JAVA_INT.withName("selection_time")
    ).withName("_GdkEventOwnerChange");
    static final VarHandle const$5 = constants$1787.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
}

