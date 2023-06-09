// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void* (*GCopyFunc)(void* src,void* data);
 * }
 */
public interface GCopyFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
    static MemorySegment allocate(GCopyFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$8.GCopyFunc_UP$MH, fi, constants$8.GCopyFunc$FUNC, scope);
    }
    static GCopyFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$8.GCopyFunc_DOWN$MH.invokeExact(symbol, _path, _func_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


