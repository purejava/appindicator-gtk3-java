// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GHookFinalizeFunc)(struct _GHookList* hook_list,struct _GHook* hook);
 * }
 */
public interface GHookFinalizeFunc {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GHookFinalizeFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$156.GHookFinalizeFunc_UP$MH, fi, constants$156.GHookFinalizeFunc$FUNC, scope);
    }
    static GHookFinalizeFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$156.GHookFinalizeFunc_DOWN$MH.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


