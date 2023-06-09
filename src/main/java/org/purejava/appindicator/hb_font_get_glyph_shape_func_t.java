// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*hb_font_get_glyph_shape_func_t)(struct hb_font_t* font,void* font_data,unsigned int glyph,struct hb_draw_funcs_t* draw_funcs,void* draw_data,void* user_data);
 * }
 */
public interface hb_font_get_glyph_shape_func_t {

    void apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int glyph, java.lang.foreign.MemorySegment draw_funcs, java.lang.foreign.MemorySegment draw_data, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_get_glyph_shape_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$865.hb_font_get_glyph_shape_func_t_UP$MH, fi, constants$865.hb_font_get_glyph_shape_func_t$FUNC, scope);
    }
    static hb_font_get_glyph_shape_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _glyph, java.lang.foreign.MemorySegment _draw_funcs, java.lang.foreign.MemorySegment _draw_data, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$865.hb_font_get_glyph_shape_func_t_DOWN$MH.invokeExact(symbol, _font, _font_data, _glyph, _draw_funcs, _draw_data, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


