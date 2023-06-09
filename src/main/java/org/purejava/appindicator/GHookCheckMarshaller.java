// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*GHookCheckMarshaller)(struct _GHook* hook,void* marshal_data);
 * }
 */
public interface GHookCheckMarshaller {

    int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GHookCheckMarshaller fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$155.GHookCheckMarshaller_UP$MH, fi, constants$155.GHookCheckMarshaller$FUNC, scope);
    }
    static GHookCheckMarshaller ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$155.GHookCheckMarshaller_DOWN$MH.invokeExact(symbol, _filter_info, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


