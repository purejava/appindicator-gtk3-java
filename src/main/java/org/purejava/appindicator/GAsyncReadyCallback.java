// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GAsyncReadyCallback)(struct _GObject* source_object,struct _GAsyncResult* res,void* data);
 * }
 */
public interface GAsyncReadyCallback {

    void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GAsyncReadyCallback fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$469.GAsyncReadyCallback_UP$MH, fi, constants$469.GAsyncReadyCallback$FUNC, scope);
    }
    static GAsyncReadyCallback ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$469.GAsyncReadyCallback_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


