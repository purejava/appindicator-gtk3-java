// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1503 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1503() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "hb_font_set_var_coords_normalized",
        constants$164.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "hb_font_get_var_coords_normalized",
        constants$5.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "hb_font_set_var_named_instance",
        constants$40.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "hb_font_get_var_named_instance",
        constants$10.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("codepoint"),
        JAVA_INT.withName("mask"),
        JAVA_INT.withName("cluster"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("u32"),
            JAVA_INT.withName("i32"),
            MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("u16"),
            MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("i16"),
            MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("u8"),
            MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("i8")
        ).withName("var1"),
        MemoryLayout.unionLayout(
            JAVA_INT.withName("u32"),
            JAVA_INT.withName("i32"),
            MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("u16"),
            MemoryLayout.sequenceLayout(2, JAVA_SHORT).withName("i16"),
            MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("u8"),
            MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("i8")
        ).withName("var2")
    ).withName("hb_glyph_info_t");
    static final VarHandle const$5 = constants$1503.const$4.varHandle(MemoryLayout.PathElement.groupElement("codepoint"));
}


