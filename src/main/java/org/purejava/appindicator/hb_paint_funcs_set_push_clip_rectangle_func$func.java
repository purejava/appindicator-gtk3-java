// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * void (*hb_paint_funcs_set_push_clip_rectangle_func$func)(struct hb_paint_funcs_t*,void*,float,float,float,float,void*);
 * }
 */
public interface hb_paint_funcs_set_push_clip_rectangle_func$func {

    void apply(java.lang.foreign.MemorySegment funcs, java.lang.foreign.MemorySegment paint_data, float xmin, float ymin, float xmax, float ymax, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(hb_paint_funcs_set_push_clip_rectangle_func$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1464.const$5, fi, constants$1456.const$3, scope);
    }
    static hb_paint_funcs_set_push_clip_rectangle_func$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _funcs, java.lang.foreign.MemorySegment _paint_data, float _xmin, float _ymin, float _xmax, float _ymax, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1456.const$5.invokeExact(symbol, _funcs, _paint_data, _xmin, _ymin, _xmax, _ymax, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

