// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GInstanceInitFunc)(struct _GTypeInstance* instance,void* g_class);
 * }
 */
public interface GInstanceInitFunc {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GInstanceInitFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$385.GInstanceInitFunc_UP$MH, fi, constants$385.GInstanceInitFunc$FUNC, scope);
    }
    static GInstanceInitFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$385.GInstanceInitFunc_DOWN$MH.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


