// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GObjectFinalizeFunc)(struct _GObject* object);
 * }
 */
public interface GObjectFinalizeFunc {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GObjectFinalizeFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$430.GObjectFinalizeFunc_UP$MH, fi, constants$430.GObjectFinalizeFunc$FUNC, scope);
    }
    static GObjectFinalizeFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$431.GObjectFinalizeFunc_DOWN$MH.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


