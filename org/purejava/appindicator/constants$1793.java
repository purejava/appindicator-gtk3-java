// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1793 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1793() {}
    static final VarHandle const$0 = constants$1792.const$1.varHandle(MemoryLayout.PathElement.groupElement("implicit"));
    static final VarHandle const$1 = constants$1792.const$1.varHandle(MemoryLayout.PathElement.groupElement("grab_window"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        MemoryLayout.paddingLayout(7),
        RuntimeHelper.POINTER.withName("context"),
        JAVA_INT.withName("time"),
        JAVA_SHORT.withName("x_root"),
        JAVA_SHORT.withName("y_root")
    ).withName("_GdkEventDND");
    static final VarHandle const$3 = constants$1793.const$2.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$4 = constants$1793.const$2.varHandle(MemoryLayout.PathElement.groupElement("window"));
    static final VarHandle const$5 = constants$1793.const$2.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
}


