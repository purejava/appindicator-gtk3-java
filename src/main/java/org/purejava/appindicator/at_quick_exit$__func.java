// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*at_quick_exit$__func)();
 * }
 */
public interface at_quick_exit$__func {

    void apply();
    static MemorySegment allocate(at_quick_exit$__func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$90.const$0, fi, constants$7.const$5, scope);
    }
    static at_quick_exit$__func ofAddress(MemorySegment addr, Arena arena) {
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


