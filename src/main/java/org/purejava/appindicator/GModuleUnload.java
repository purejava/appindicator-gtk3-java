// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GModuleUnload)(struct _GModule* module);
 * }
 */
public interface GModuleUnload {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GModuleUnload fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$681.GModuleUnload_UP$MH, fi, constants$681.GModuleUnload$FUNC, scope);
    }
    static GModuleUnload ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$682.GModuleUnload_DOWN$MH.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


