// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GSourceDisposeFunc)(struct _GSource* source);
 * }
 */
public interface GSourceDisposeFunc {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GSourceDisposeFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$167.GSourceDisposeFunc_UP$MH, fi, constants$167.GSourceDisposeFunc$FUNC, scope);
    }
    static GSourceDisposeFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$167.GSourceDisposeFunc_DOWN$MH.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


