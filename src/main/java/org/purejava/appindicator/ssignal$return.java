// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*ssignal$return)(int);
 * }
 */
public interface ssignal$return {

    void apply(int _x0);
    static MemorySegment allocate(ssignal$return fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$124.const$3, fi, constants$80.const$1, scope);
    }
    static ssignal$return ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (int __x0) -> {
            try {
                constants$122.const$4.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


