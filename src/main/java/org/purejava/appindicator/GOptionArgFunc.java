// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*GOptionArgFunc)(char* option_name,char* value,void* data,struct _GError** error);
 * }
 */
public interface GOptionArgFunc {

    int apply(java.lang.foreign.MemorySegment completion, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GOptionArgFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$263.GOptionArgFunc_UP$MH, fi, constants$263.GOptionArgFunc$FUNC, scope);
    }
    static GOptionArgFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _completion, java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$263.GOptionArgFunc_DOWN$MH.invokeExact(symbol, _completion, _key, _iter, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


