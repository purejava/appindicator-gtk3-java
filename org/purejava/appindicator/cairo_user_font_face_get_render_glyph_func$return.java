// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum _cairo_status (*cairo_user_font_face_get_render_glyph_func$return)(struct _cairo_scaled_font*,unsigned long,struct _cairo*,struct cairo_text_extents_t*);
 * }
 */
public interface cairo_user_font_face_get_render_glyph_func$return {

    int apply(java.lang.foreign.MemorySegment scaled_font, long glyph, java.lang.foreign.MemorySegment cr, java.lang.foreign.MemorySegment extents);
    static MemorySegment allocate(cairo_user_font_face_get_render_glyph_func$return fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1714.const$0, fi, constants$393.const$4, scope);
    }
    static cairo_user_font_face_get_render_glyph_func$return ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _scaled_font, long _glyph, java.lang.foreign.MemorySegment _cr, java.lang.foreign.MemorySegment _extents) -> {
            try {
                return (int)constants$1080.const$4.invokeExact(symbol, _scaled_font, _glyph, _cr, _extents);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


