// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum _cairo_status (*cairo_user_scaled_font_text_to_glyphs_func_t)(struct _cairo_scaled_font* scaled_font,char* utf8,int utf8_len,struct ** glyphs,int* num_glyphs,struct ** clusters,int* num_clusters,enum _cairo_text_cluster_flags* cluster_flags);
 * }
 */
public interface cairo_user_scaled_font_text_to_glyphs_func_t {

    int apply(java.lang.foreign.MemorySegment scaled_font, java.lang.foreign.MemorySegment utf8, int utf8_len, java.lang.foreign.MemorySegment glyphs, java.lang.foreign.MemorySegment num_glyphs, java.lang.foreign.MemorySegment clusters, java.lang.foreign.MemorySegment num_clusters, java.lang.foreign.MemorySegment cluster_flags);
    static MemorySegment allocate(cairo_user_scaled_font_text_to_glyphs_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1020.cairo_user_scaled_font_text_to_glyphs_func_t_UP$MH, fi, constants$1020.cairo_user_scaled_font_text_to_glyphs_func_t$FUNC, scope);
    }
    static cairo_user_scaled_font_text_to_glyphs_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _scaled_font, java.lang.foreign.MemorySegment _utf8, int _utf8_len, java.lang.foreign.MemorySegment _glyphs, java.lang.foreign.MemorySegment _num_glyphs, java.lang.foreign.MemorySegment _clusters, java.lang.foreign.MemorySegment _num_clusters, java.lang.foreign.MemorySegment _cluster_flags) -> {
            try {
                return (int)constants$1020.cairo_user_scaled_font_text_to_glyphs_func_t_DOWN$MH.invokeExact(symbol, _scaled_font, _utf8, _utf8_len, _glyphs, _num_glyphs, _clusters, _num_clusters, _cluster_flags);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


