// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void* (*GDuplicateFunc)(void* data,void* user_data);
 * }
 */
public interface GDuplicateFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
    static MemorySegment allocate(GDuplicateFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$109.GDuplicateFunc_UP$MH, fi, constants$109.GDuplicateFunc$FUNC, scope);
    }
    static GDuplicateFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$109.GDuplicateFunc_DOWN$MH.invokeExact(symbol, _path, _func_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


