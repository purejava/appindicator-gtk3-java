// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1780 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1780() {}
    static final VarHandle const$0 = constants$1778.const$4.varHandle(MemoryLayout.PathElement.groupElement("string"));
    static final VarHandle const$1 = constants$1778.const$4.varHandle(MemoryLayout.PathElement.groupElement("hardware_keycode"));
    static final VarHandle const$2 = constants$1778.const$4.varHandle(MemoryLayout.PathElement.groupElement("group"));
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        MemoryLayout.paddingLayout(7),
        RuntimeHelper.POINTER.withName("subwindow"),
        JAVA_INT.withName("time"),
        MemoryLayout.paddingLayout(4),
        JAVA_DOUBLE.withName("x"),
        JAVA_DOUBLE.withName("y"),
        JAVA_DOUBLE.withName("x_root"),
        JAVA_DOUBLE.withName("y_root"),
        JAVA_INT.withName("mode"),
        JAVA_INT.withName("detail"),
        JAVA_INT.withName("focus"),
        JAVA_INT.withName("state")
    ).withName("_GdkEventCrossing");
    static final VarHandle const$4 = constants$1780.const$3.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$5 = constants$1780.const$3.varHandle(MemoryLayout.PathElement.groupElement("window"));
}


