// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*hb_unicode_funcs_set_decompose_compatibility_func$destroy)(void*);
 * }
 */
public interface hb_unicode_funcs_set_decompose_compatibility_func$destroy {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(hb_unicode_funcs_set_decompose_compatibility_func$destroy fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1520.const$0, fi, constants$13.const$1, scope);
    }
    static hb_unicode_funcs_set_decompose_compatibility_func$destroy ofAddress(MemorySegment addr, Arena arena) {
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


