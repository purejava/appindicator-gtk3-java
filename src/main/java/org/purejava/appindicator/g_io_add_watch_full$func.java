// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*g_io_add_watch_full$func)(struct _GIOChannel*,enum GIOCondition,void*);
 * }
 */
public interface g_io_add_watch_full$func {

    int apply(java.lang.foreign.MemorySegment datagram_based, int condition, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(g_io_add_watch_full$func fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$320.const$5, fi, constants$150.const$0, scope);
    }
    static g_io_add_watch_full$func ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _datagram_based, int _condition, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$315.const$3.invokeExact(symbol, _datagram_based, _condition, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


