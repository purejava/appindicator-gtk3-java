// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1783 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1783() {}
    static final VarHandle const$0 = constants$1782.const$5.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$1 = constants$1782.const$5.varHandle(MemoryLayout.PathElement.groupElement("window"));
    static final VarHandle const$2 = constants$1782.const$5.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    static final VarHandle const$3 = constants$1782.const$5.varHandle(MemoryLayout.PathElement.groupElement("in"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        MemoryLayout.paddingLayout(3),
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y"),
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GdkEventConfigure");
    static final VarHandle const$5 = constants$1783.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
}


