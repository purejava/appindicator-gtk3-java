// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*pthread_key_create$__destr_function)(void*);
 * }
 */
public interface pthread_key_create$__destr_function {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(pthread_key_create$__destr_function fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$372.pthread_key_create$__destr_function_UP$MH, fi, constants$372.pthread_key_create$__destr_function$FUNC, scope);
    }
    static pthread_key_create$__destr_function ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$372.pthread_key_create$__destr_function_DOWN$MH.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


