// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * int (*hb_font_get_font_extents_func_t)(struct hb_font_t* font,void* font_data,struct hb_font_extents_t* extents,void* user_data);
 * }
 */
public interface hb_font_get_font_extents_func_t {

    int apply(java.lang.foreign.MemorySegment completion, java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_font_get_font_extents_func_t fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1476.const$0, fi, constants$34.const$5, scope);
    }
    static hb_font_get_font_extents_func_t ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _completion, java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$382.const$0.invokeExact(symbol, _completion, _key, _iter, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

