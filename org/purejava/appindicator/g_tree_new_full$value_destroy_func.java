// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*g_tree_new_full$value_destroy_func)(void*);
 * }
 */
public interface g_tree_new_full$value_destroy_func {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(g_tree_new_full$value_destroy_func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$474.const$3, fi, constants$13.const$1, scope);
    }
    static g_tree_new_full$value_destroy_func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$13.const$3.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


