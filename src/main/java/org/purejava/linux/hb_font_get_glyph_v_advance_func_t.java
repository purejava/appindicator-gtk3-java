// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface hb_font_get_glyph_v_advance_func_t {

    int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemoryAddress _x3);
    static MemorySegment allocate(hb_font_get_glyph_v_advance_func_t fi, MemorySession session) {
        return RuntimeHelper.upcallStub(hb_font_get_glyph_v_advance_func_t.class, fi, constants$1012.hb_font_get_glyph_v_advance_func_t$FUNC, session);
    }
    static hb_font_get_glyph_v_advance_func_t ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemoryAddress __x3) -> {
            try {
                return (int)constants$1012.hb_font_get_glyph_v_advance_func_t$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

