// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface hb_font_get_glyph_advances_func_t {

    void apply(java.lang.foreign.MemoryAddress font, java.lang.foreign.MemoryAddress font_data, int count, java.lang.foreign.MemoryAddress first_glyph, int glyph_stride, java.lang.foreign.MemoryAddress first_advance, int advance_stride, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(hb_font_get_glyph_advances_func_t fi, MemorySession session) {
        return RuntimeHelper.upcallStub(hb_font_get_glyph_advances_func_t.class, fi, constants$1012.hb_font_get_glyph_advances_func_t$FUNC, session);
    }
    static hb_font_get_glyph_advances_func_t ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _font, java.lang.foreign.MemoryAddress _font_data, int _count, java.lang.foreign.MemoryAddress _first_glyph, int _glyph_stride, java.lang.foreign.MemoryAddress _first_advance, int _advance_stride, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                constants$1013.hb_font_get_glyph_advances_func_t$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_font, (java.lang.foreign.Addressable)_font_data, _count, (java.lang.foreign.Addressable)_first_glyph, _glyph_stride, (java.lang.foreign.Addressable)_first_advance, _advance_stride, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

