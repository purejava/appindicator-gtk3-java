// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*GdkPixbufSaveFunc)(char* buf,unsigned long count,struct _GError** error,void* data);
 * }
 */
public interface GdkPixbufSaveFunc {

    int apply(java.lang.foreign.MemorySegment buf, long count, java.lang.foreign.MemorySegment error, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GdkPixbufSaveFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1134.GdkPixbufSaveFunc_UP$MH, fi, constants$1134.GdkPixbufSaveFunc$FUNC, scope);
    }
    static GdkPixbufSaveFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _buf, long _count, java.lang.foreign.MemorySegment _error, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$1134.GdkPixbufSaveFunc_DOWN$MH.invokeExact(symbol, _buf, _count, _error, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


