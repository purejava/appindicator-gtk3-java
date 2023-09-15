// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * unsigned int (*GHashFunc)(void* key);
 * }
 */
public interface GHashFunc {

    int apply(java.lang.foreign.MemorySegment key);
    static MemorySegment allocate(GHashFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$14.const$1, fi, constants$10.const$5, scope);
    }
    static GHashFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _key) -> {
            try {
                return (int)constants$14.const$2.invokeExact(symbol, _key);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


