// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1786 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1786() {}
    static final VarHandle const$0 = constants$1785.const$0.varHandle(MemoryLayout.PathElement.groupElement("state"));
    static final StructLayout const$1 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        MemoryLayout.paddingLayout(7),
        RuntimeHelper.POINTER.withName("selection"),
        RuntimeHelper.POINTER.withName("target"),
        RuntimeHelper.POINTER.withName("property"),
        JAVA_INT.withName("time"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("requestor")
    ).withName("_GdkEventSelection");
    static final VarHandle const$2 = constants$1786.const$1.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$3 = constants$1786.const$1.varHandle(MemoryLayout.PathElement.groupElement("window"));
    static final VarHandle const$4 = constants$1786.const$1.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    static final VarHandle const$5 = constants$1786.const$1.varHandle(MemoryLayout.PathElement.groupElement("selection"));
}


