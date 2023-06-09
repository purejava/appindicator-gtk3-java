// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GErrorClearFunc)(struct _GError* error);
 * }
 */
public interface GErrorClearFunc {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GErrorClearFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$35.GErrorClearFunc_UP$MH, fi, constants$35.GErrorClearFunc$FUNC, scope);
    }
    static GErrorClearFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$35.GErrorClearFunc_DOWN$MH.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


