// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*hb_paint_funcs_set_custom_palette_color_func$func)(struct hb_paint_funcs_t*,void*,unsigned int,unsigned int*,void*);
 * }
 */
public interface hb_paint_funcs_set_custom_palette_color_func$func {

    int apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int glyph, java.lang.foreign.MemorySegment extents, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_paint_funcs_set_custom_palette_color_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1469.const$2, fi, constants$859.const$1, scope);
    }
    static hb_paint_funcs_set_custom_palette_color_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _glyph, java.lang.foreign.MemorySegment _extents, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$985.const$1.invokeExact(symbol, _font, _font_data, _glyph, _extents, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

