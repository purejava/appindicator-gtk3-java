// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*__compar_fn_t)(void*,void*);
 * }
 */
public interface __compar_fn_t {

    int apply(java.lang.foreign.MemorySegment filter_info, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(__compar_fn_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$57.__compar_fn_t_UP$MH, fi, constants$57.__compar_fn_t$FUNC, scope);
    }
    static __compar_fn_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _filter_info, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$57.__compar_fn_t_DOWN$MH.invokeExact(symbol, _filter_info, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

