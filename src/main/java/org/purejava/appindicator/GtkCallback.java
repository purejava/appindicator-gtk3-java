// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GtkCallback)(struct _GtkWidget* widget,void* data);
 * }
 */
public interface GtkCallback {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GtkCallback fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1246.GtkCallback_UP$MH, fi, constants$1246.GtkCallback$FUNC, scope);
    }
    static GtkCallback ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$1246.GtkCallback_DOWN$MH.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


