// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*hb_font_funcs_set_glyph_shape_func$func)(struct hb_font_t*,void*,unsigned int,struct hb_draw_funcs_t*,void*,void*);
 * }
 */
public interface hb_font_funcs_set_glyph_shape_func$func {

    void apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int glyph, java.lang.foreign.MemorySegment draw_funcs, java.lang.foreign.MemorySegment draw_data, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_funcs_set_glyph_shape_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1521.const$3, fi, constants$584.const$3, scope);
    }
    static hb_font_funcs_set_glyph_shape_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _glyph, java.lang.foreign.MemorySegment _draw_funcs, java.lang.foreign.MemorySegment _draw_data, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$584.const$5.invokeExact(symbol, _font, _font_data, _glyph, _draw_funcs, _draw_data, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


