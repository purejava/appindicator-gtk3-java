// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GTestFixtureFunc)(void* fixture,void* user_data);
 * }
 */
public interface GTestFixtureFunc {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GTestFixtureFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$313.GTestFixtureFunc_UP$MH, fi, constants$313.GTestFixtureFunc$FUNC, scope);
    }
    static GTestFixtureFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$313.GTestFixtureFunc_DOWN$MH.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


