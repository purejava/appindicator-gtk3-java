// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GEqualFunc {

    int apply(java.lang.foreign.MemoryAddress a, java.lang.foreign.MemoryAddress b);
    static MemorySegment allocate(GEqualFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GEqualFunc.class, fi, constants$6.GEqualFunc$FUNC, session);
    }
    static GEqualFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _a, java.lang.foreign.MemoryAddress _b) -> {
            try {
                return (int)constants$6.GEqualFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_a, (java.lang.foreign.Addressable)_b);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


