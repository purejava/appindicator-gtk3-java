// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1599 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1599() {}
    static final StructLayout const$0 = MemoryLayout.structLayout(
        JAVA_INT.withName("glyph"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("width"),
            JAVA_INT.withName("x_offset"),
            JAVA_INT.withName("y_offset")
        ).withName("geometry"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(4)
        ).withName("attr")
    ).withName("_PangoGlyphInfo");
    static final VarHandle const$1 = constants$1599.const$0.varHandle(MemoryLayout.PathElement.groupElement("glyph"));
    static final StructLayout const$2 = MemoryLayout.structLayout(
        JAVA_INT.withName("num_glyphs"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("glyphs"),
        RuntimeHelper.POINTER.withName("log_clusters"),
        JAVA_INT.withName("space"),
        MemoryLayout.paddingLayout(4)
    ).withName("_PangoGlyphString");
    static final VarHandle const$3 = constants$1599.const$2.varHandle(MemoryLayout.PathElement.groupElement("num_glyphs"));
    static final VarHandle const$4 = constants$1599.const$2.varHandle(MemoryLayout.PathElement.groupElement("glyphs"));
    static final VarHandle const$5 = constants$1599.const$2.varHandle(MemoryLayout.PathElement.groupElement("log_clusters"));
}


