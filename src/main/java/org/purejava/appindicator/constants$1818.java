// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1818 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1818() {}
    static final VarHandle const$0 = constants$1816.const$2.varHandle(MemoryLayout.PathElement.groupElement("cursor"));
    static final VarHandle const$1 = constants$1816.const$2.varHandle(MemoryLayout.PathElement.groupElement("wmclass_name"));
    static final VarHandle const$2 = constants$1816.const$2.varHandle(MemoryLayout.PathElement.groupElement("wmclass_class"));
    static final VarHandle const$3 = constants$1816.const$2.varHandle(MemoryLayout.PathElement.groupElement("override_redirect"));
    static final VarHandle const$4 = constants$1816.const$2.varHandle(MemoryLayout.PathElement.groupElement("type_hint"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_INT.withName("min_width"),
        JAVA_INT.withName("min_height"),
        JAVA_INT.withName("max_width"),
        JAVA_INT.withName("max_height"),
        JAVA_INT.withName("base_width"),
        JAVA_INT.withName("base_height"),
        JAVA_INT.withName("width_inc"),
        JAVA_INT.withName("height_inc"),
        JAVA_DOUBLE.withName("min_aspect"),
        JAVA_DOUBLE.withName("max_aspect"),
        JAVA_INT.withName("win_gravity"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GdkGeometry");
}

