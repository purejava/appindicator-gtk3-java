// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GVoidFunc)();
 * }
 */
public interface GVoidFunc {

    void apply();
    static MemorySegment allocate(GVoidFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$42.GVoidFunc_UP$MH, fi, constants$42.GVoidFunc$FUNC, scope);
    }
    static GVoidFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                constants$42.GVoidFunc_DOWN$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


