// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*hb_unicode_decompose_func_t)(struct hb_unicode_funcs_t* ufuncs,unsigned int ab,unsigned int* a,unsigned int* b,void* user_data);
 * }
 */
public interface hb_unicode_decompose_func_t {

    int apply(java.lang.foreign.MemorySegment ufuncs, int ab, java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_unicode_decompose_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$840.hb_unicode_decompose_func_t_UP$MH, fi, constants$840.hb_unicode_decompose_func_t$FUNC, scope);
    }
    static hb_unicode_decompose_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _ufuncs, int _ab, java.lang.foreign.MemorySegment _a, java.lang.foreign.MemorySegment _b, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$840.hb_unicode_decompose_func_t_DOWN$MH.invokeExact(symbol, _ufuncs, _ab, _a, _b, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


