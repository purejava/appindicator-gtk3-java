// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*pthread_create$__start_routine)(void*);
 * }
 */
public interface pthread_create$__start_routine {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(pthread_create$__start_routine fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$355.pthread_create$__start_routine_UP$MH, fi, constants$355.pthread_create$__start_routine$FUNC, scope);
    }
    static pthread_create$__start_routine ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$355.pthread_create$__start_routine_DOWN$MH.invokeExact(symbol, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


