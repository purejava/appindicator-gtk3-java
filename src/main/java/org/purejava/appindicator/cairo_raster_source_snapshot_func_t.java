// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * enum _cairo_status (*cairo_raster_source_snapshot_func_t)(struct _cairo_pattern* pattern,void* callback_data);
 * }
 */
public interface cairo_raster_source_snapshot_func_t {

    int apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data);
    static MemorySegment allocate(cairo_raster_source_snapshot_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1039.cairo_raster_source_snapshot_func_t_UP$MH, fi, constants$1039.cairo_raster_source_snapshot_func_t$FUNC, scope);
    }
    static cairo_raster_source_snapshot_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pattern, java.lang.foreign.MemorySegment _callback_data) -> {
            try {
                return (int)constants$1039.cairo_raster_source_snapshot_func_t_DOWN$MH.invokeExact(symbol, _pattern, _callback_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


