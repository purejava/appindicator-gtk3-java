// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1695 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1695() {}
    static final VarHandle const$0 = constants$1694.const$3.varHandle(MemoryLayout.PathElement.groupElement("y"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "cairo_glyph_allocate",
        constants$24.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "cairo_glyph_free",
        constants$13.const$1
    );
    static final StructLayout const$3 = MemoryLayout.structLayout(
        JAVA_INT.withName("num_bytes"),
        JAVA_INT.withName("num_glyphs")
    ).withName("cairo_text_cluster_t");
    static final VarHandle const$4 = constants$1695.const$3.varHandle(MemoryLayout.PathElement.groupElement("num_bytes"));
    static final VarHandle const$5 = constants$1695.const$3.varHandle(MemoryLayout.PathElement.groupElement("num_glyphs"));
}


