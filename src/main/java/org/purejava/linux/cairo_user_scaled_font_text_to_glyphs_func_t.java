// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface cairo_user_scaled_font_text_to_glyphs_func_t {

    int apply(java.lang.foreign.MemoryAddress scaled_font, java.lang.foreign.MemoryAddress utf8, int utf8_len, java.lang.foreign.MemoryAddress glyphs, java.lang.foreign.MemoryAddress num_glyphs, java.lang.foreign.MemoryAddress clusters, java.lang.foreign.MemoryAddress num_clusters, java.lang.foreign.MemoryAddress cluster_flags);
    static MemorySegment allocate(cairo_user_scaled_font_text_to_glyphs_func_t fi, MemorySession session) {
        return RuntimeHelper.upcallStub(cairo_user_scaled_font_text_to_glyphs_func_t.class, fi, constants$1179.cairo_user_scaled_font_text_to_glyphs_func_t$FUNC, session);
    }
    static cairo_user_scaled_font_text_to_glyphs_func_t ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _scaled_font, java.lang.foreign.MemoryAddress _utf8, int _utf8_len, java.lang.foreign.MemoryAddress _glyphs, java.lang.foreign.MemoryAddress _num_glyphs, java.lang.foreign.MemoryAddress _clusters, java.lang.foreign.MemoryAddress _num_clusters, java.lang.foreign.MemoryAddress _cluster_flags) -> {
            try {
                return (int)constants$1179.cairo_user_scaled_font_text_to_glyphs_func_t$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_scaled_font, (java.lang.foreign.Addressable)_utf8, _utf8_len, (java.lang.foreign.Addressable)_glyphs, (java.lang.foreign.Addressable)_num_glyphs, (java.lang.foreign.Addressable)_clusters, (java.lang.foreign.Addressable)_num_clusters, (java.lang.foreign.Addressable)_cluster_flags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


