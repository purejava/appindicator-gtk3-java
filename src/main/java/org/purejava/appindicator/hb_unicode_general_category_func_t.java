// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * enum  (*hb_unicode_general_category_func_t)(struct hb_unicode_funcs_t* ufuncs,unsigned int unicode,void* user_data);
 * }
 */
public interface hb_unicode_general_category_func_t {

    int apply(java.lang.foreign.MemorySegment ufuncs, int unicode, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_unicode_general_category_func_t fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$838.hb_unicode_general_category_func_t_UP$MH, fi, constants$838.hb_unicode_general_category_func_t$FUNC, scope);
    }
    static hb_unicode_general_category_func_t ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _ufuncs, int _unicode, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$839.hb_unicode_general_category_func_t_DOWN$MH.invokeExact(symbol, _ufuncs, _unicode, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


