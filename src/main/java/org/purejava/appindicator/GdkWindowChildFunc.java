// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*GdkWindowChildFunc)(struct _GdkWindow* window,void* user_data);
 * }
 */
public interface GdkWindowChildFunc {

    int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GdkWindowChildFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1101.GdkWindowChildFunc_UP$MH, fi, constants$1101.GdkWindowChildFunc$FUNC, scope);
    }
    static GdkWindowChildFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1101.GdkWindowChildFunc_DOWN$MH.invokeExact(symbol, _filter_info, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


