// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*g_option_group_set_error_hook$error_func)(struct _GOptionContext*,struct _GOptionGroup*,void*,struct _GError**);
 * }
 */
public interface g_option_group_set_error_hook$error_func {

    void apply(java.lang.foreign.MemorySegment model, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(g_option_group_set_error_hook$error_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$388.const$4, fi, constants$42.const$1, scope);
    }
    static g_option_group_set_error_hook$error_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _model, java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$259.const$4.invokeExact(symbol, _model, _path, _iter, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


