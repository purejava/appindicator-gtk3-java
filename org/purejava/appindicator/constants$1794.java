// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1794 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1794() {}
    static final VarHandle const$0 = constants$1793.const$2.varHandle(MemoryLayout.PathElement.groupElement("context"));
    static final VarHandle const$1 = constants$1793.const$2.varHandle(MemoryLayout.PathElement.groupElement("time"));
    static final VarHandle const$2 = constants$1793.const$2.varHandle(MemoryLayout.PathElement.groupElement("x_root"));
    static final VarHandle const$3 = constants$1793.const$2.varHandle(MemoryLayout.PathElement.groupElement("y_root"));
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        JAVA_BYTE.withName("phase"),
        JAVA_BYTE.withName("n_fingers"),
        MemoryLayout.paddingLayout(1),
        JAVA_INT.withName("time"),
        JAVA_DOUBLE.withName("x"),
        JAVA_DOUBLE.withName("y"),
        JAVA_DOUBLE.withName("dx"),
        JAVA_DOUBLE.withName("dy"),
        JAVA_DOUBLE.withName("x_root"),
        JAVA_DOUBLE.withName("y_root"),
        JAVA_INT.withName("state"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GdkEventTouchpadSwipe");
    static final VarHandle const$5 = constants$1794.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
}


