// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1801 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1801() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        MemoryLayout.paddingLayout(3),
        JAVA_INT.withName("time"),
        JAVA_INT.withName("group"),
        JAVA_INT.withName("index"),
        JAVA_INT.withName("mode"),
        MemoryLayout.paddingLayout(4),
        JAVA_DOUBLE.withName("value")
    ).withName("_GdkEventPadAxis");
    static final VarHandle const$1 = constants$1801.const$0.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$2 = constants$1801.const$0.varHandle(MemoryLayout.PathElement.groupElement("window"));
    static final VarHandle const$3 = constants$1801.const$0.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    static final VarHandle const$4 = constants$1801.const$0.varHandle(MemoryLayout.PathElement.groupElement("time"));
    static final VarHandle const$5 = constants$1801.const$0.varHandle(MemoryLayout.PathElement.groupElement("group"));
}


