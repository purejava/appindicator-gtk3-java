// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _cairo_surface* (*cairo_raster_source_acquire_func_t)(struct _cairo_pattern* pattern,void* callback_data,struct _cairo_surface* target,struct _cairo_rectangle_int* extents);
 * }
 */
public interface cairo_raster_source_acquire_func_t {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data, java.lang.foreign.MemorySegment target, java.lang.foreign.MemorySegment extents);
    static MemorySegment allocate(cairo_raster_source_acquire_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1736.const$5, fi, constants$39.const$1, scope);
    }
    static cairo_raster_source_acquire_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _pattern, java.lang.foreign.MemorySegment _callback_data, java.lang.foreign.MemorySegment _target, java.lang.foreign.MemorySegment _extents) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$865.const$5.invokeExact(symbol, _pattern, _callback_data, _target, _extents);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


