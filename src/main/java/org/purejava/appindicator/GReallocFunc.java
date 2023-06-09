// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void* (*GReallocFunc)(void* data,unsigned long size);
 * }
 */
public interface GReallocFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment data, long size);
    static MemorySegment allocate(GReallocFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$693.GReallocFunc_UP$MH, fi, constants$693.GReallocFunc$FUNC, scope);
    }
    static GReallocFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _data, long _size) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$693.GReallocFunc_DOWN$MH.invokeExact(symbol, _data, _size);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


