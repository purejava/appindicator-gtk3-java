// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*g_cclosure_new_object_swap$callback_func)();
 * }
 */
public interface g_cclosure_new_object_swap$callback_func {

    void apply();
    static MemorySegment allocate(g_cclosure_new_object_swap$callback_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$639.const$0, fi, constants$7.const$5, scope);
    }
    static g_cclosure_new_object_swap$callback_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return () -> {
            try {
                constants$64.const$1.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


