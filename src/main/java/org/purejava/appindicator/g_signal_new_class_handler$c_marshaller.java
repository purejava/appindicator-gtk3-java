// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*g_signal_new_class_handler$c_marshaller)(struct _GClosure*,struct _GValue*,unsigned int,struct _GValue*,void*,void*);
 * }
 */
public interface g_signal_new_class_handler$c_marshaller {

    void apply(java.lang.foreign.MemorySegment font, java.lang.foreign.MemorySegment font_data, int glyph, java.lang.foreign.MemorySegment draw_funcs, java.lang.foreign.MemorySegment draw_data, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(g_signal_new_class_handler$c_marshaller fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$604.const$4, fi, constants$584.const$3, scope);
    }
    static g_signal_new_class_handler$c_marshaller ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _font, java.lang.foreign.MemorySegment _font_data, int _glyph, java.lang.foreign.MemorySegment _draw_funcs, java.lang.foreign.MemorySegment _draw_data, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$584.const$5.invokeExact(symbol, _font, _font_data, _glyph, _draw_funcs, _draw_data, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


