// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GPrintFunc)(char* string);
 * }
 */
public interface GPrintFunc {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GPrintFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$262.GPrintFunc_UP$MH, fi, constants$262.GPrintFunc$FUNC, scope);
    }
    static GPrintFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$262.GPrintFunc_DOWN$MH.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


