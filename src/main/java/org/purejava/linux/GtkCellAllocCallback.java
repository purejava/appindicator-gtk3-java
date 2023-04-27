// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GtkCellAllocCallback)(struct _GtkCellRenderer* renderer,struct _cairo_rectangle_int* cell_area,struct _cairo_rectangle_int* cell_background,void* data);
 * }
 */
public interface GtkCellAllocCallback {

    int apply(java.lang.foreign.MemorySegment completion, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkCellAllocCallback fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1379.GtkCellAllocCallback_UP$MH, fi, constants$1379.GtkCellAllocCallback$FUNC, scope);
    }
    static GtkCellAllocCallback ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _completion, java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1380.GtkCellAllocCallback_DOWN$MH.invokeExact(symbol, _completion, _key, _iter, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


