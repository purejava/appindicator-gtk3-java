// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$1776 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1776() {}
    static final VarHandle const$0 = constants$1774.const$0.varHandle(MemoryLayout.PathElement.groupElement("x_root"));
    static final VarHandle const$1 = constants$1774.const$0.varHandle(MemoryLayout.PathElement.groupElement("y_root"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("window"),
        JAVA_BYTE.withName("send_event"),
        MemoryLayout.paddingLayout(3),
        JAVA_INT.withName("time"),
        JAVA_DOUBLE.withName("x"),
        JAVA_DOUBLE.withName("y"),
        JAVA_INT.withName("state"),
        JAVA_INT.withName("direction"),
        RuntimeHelper.POINTER.withName("device"),
        JAVA_DOUBLE.withName("x_root"),
        JAVA_DOUBLE.withName("y_root"),
        JAVA_DOUBLE.withName("delta_x"),
        JAVA_DOUBLE.withName("delta_y"),
        MemoryLayout.paddingLayout(8)
    ).withName("_GdkEventScroll");
    static final VarHandle const$3 = constants$1776.const$2.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final VarHandle const$4 = constants$1776.const$2.varHandle(MemoryLayout.PathElement.groupElement("window"));
    static final VarHandle const$5 = constants$1776.const$2.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
}

