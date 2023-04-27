// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GtkFileFilterFunc)(struct _GtkFileFilterInfo* filter_info,void* data);
 * }
 */
public interface GtkFileFilterFunc {

    int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkFileFilterFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1567.GtkFileFilterFunc_UP$MH, fi, constants$1567.GtkFileFilterFunc$FUNC, scope);
    }
    static GtkFileFilterFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1567.GtkFileFilterFunc_DOWN$MH.invokeExact(symbol, _filter_info, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


