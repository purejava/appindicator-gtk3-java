// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1601 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1601() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "pango_glyph_string_extents",
        constants$42.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "pango_glyph_string_get_width",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "pango_glyph_string_extents_range",
        constants$987.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "pango_glyph_string_get_logical_widths",
        constants$1457.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "pango_glyph_string_index_to_x",
        constants$1601.const$4
    );
}


