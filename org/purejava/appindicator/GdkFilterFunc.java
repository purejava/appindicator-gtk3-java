// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * enum GdkFilterReturn (*GdkFilterFunc)(void* xevent,union _GdkEvent* event,void* data);
 * }
 */
public interface GdkFilterFunc {

    int apply(java.lang.foreign.MemorySegment xevent, java.lang.foreign.MemorySegment event, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GdkFilterFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$1767.const$0, fi, constants$12.const$2, scope);
    }
    static GdkFilterFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _xevent, java.lang.foreign.MemorySegment _event, java.lang.foreign.MemorySegment _data) -> {
            try {
                return (int)constants$12.const$4.invokeExact(symbol, _xevent, _event, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


