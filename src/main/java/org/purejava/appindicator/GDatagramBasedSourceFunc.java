// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*GDatagramBasedSourceFunc)(struct _GDatagramBased* datagram_based,enum  condition,void* data);
 * }
 */
public interface GDatagramBasedSourceFunc {

    int apply(java.lang.foreign.MemorySegment datagram_based, int condition, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GDatagramBasedSourceFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$471.GDatagramBasedSourceFunc_UP$MH, fi, constants$471.GDatagramBasedSourceFunc$FUNC, scope);
    }
    static GDatagramBasedSourceFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _datagram_based, int _condition, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$471.GDatagramBasedSourceFunc_DOWN$MH.invokeExact(symbol, _datagram_based, _condition, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


