// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GToggleNotify)(void* data,struct _GObject* object,int is_last_ref);
 * }
 */
public interface GToggleNotify {

    void apply(java.lang.foreign.MemorySegment screen, java.lang.foreign.MemorySegment colors, int n_colors);
    static MemorySegment allocate(GToggleNotify fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$437.GToggleNotify_UP$MH, fi, constants$437.GToggleNotify$FUNC, scope);
    }
    static GToggleNotify ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _screen, java.lang.foreign.MemorySegment _colors, int _n_colors) -> {
            try {
                constants$437.GToggleNotify_DOWN$MH.invokeExact(symbol, _screen, _colors, _n_colors);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


