// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GSpawnChildSetupFunc)(void* data);
 * }
 */
public interface GSpawnChildSetupFunc {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GSpawnChildSetupFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$307.GSpawnChildSetupFunc_UP$MH, fi, constants$307.GSpawnChildSetupFunc$FUNC, scope);
    }
    static GSpawnChildSetupFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$308.GSpawnChildSetupFunc_DOWN$MH.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


