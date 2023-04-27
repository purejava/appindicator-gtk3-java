// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GtkTreeViewColumnDropFunc)(struct _GtkTreeView* tree_view,struct _GtkTreeViewColumn* column,struct _GtkTreeViewColumn* prev_column,struct _GtkTreeViewColumn* next_column,void* data);
 * }
 */
public interface GtkTreeViewColumnDropFunc {

    int apply(java.lang.foreign.MemorySegment tree_view, java.lang.foreign.MemorySegment column, java.lang.foreign.MemorySegment prev_column, java.lang.foreign.MemorySegment next_column, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GtkTreeViewColumnDropFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1463.GtkTreeViewColumnDropFunc_UP$MH, fi, constants$1463.GtkTreeViewColumnDropFunc$FUNC, scope);
    }
    static GtkTreeViewColumnDropFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tree_view, java.lang.foreign.MemorySegment _column, java.lang.foreign.MemorySegment _prev_column, java.lang.foreign.MemorySegment _next_column, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$1463.GtkTreeViewColumnDropFunc_DOWN$MH.invokeExact(symbol, _tree_view, _column, _prev_column, _next_column, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


