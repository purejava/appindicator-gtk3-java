// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*GFileReadMoreCallback)(char* file_contents,long file_size,void* callback_data);
 * }
 */
public interface GFileReadMoreCallback {

    int apply(java.lang.foreign.MemorySegment file_contents, long file_size, java.lang.foreign.MemorySegment callback_data);
    static MemorySegment allocate(GFileReadMoreCallback fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$469.GFileReadMoreCallback_UP$MH, fi, constants$469.GFileReadMoreCallback$FUNC, scope);
    }
    static GFileReadMoreCallback ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _file_contents, long _file_size, java.lang.foreign.MemorySegment _callback_data) -> {
            try {
                return (int)constants$469.GFileReadMoreCallback_DOWN$MH.invokeExact(symbol, _file_contents, _file_size, _callback_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


