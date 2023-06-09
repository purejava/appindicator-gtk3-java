// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*GSignalAccumulator)(struct _GSignalInvocationHint* ihint,struct _GValue* return_accu,struct _GValue* handler_return,void* data);
 * }
 */
public interface GSignalAccumulator {

    int apply(java.lang.foreign.MemorySegment completion, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GSignalAccumulator fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$415.GSignalAccumulator_UP$MH, fi, constants$415.GSignalAccumulator$FUNC, scope);
    }
    static GSignalAccumulator ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _completion, java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$415.GSignalAccumulator_DOWN$MH.invokeExact(symbol, _completion, _key, _iter, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


