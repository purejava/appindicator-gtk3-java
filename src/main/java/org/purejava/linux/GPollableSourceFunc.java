// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GPollableSourceFunc {

    int apply(java.lang.foreign.MemoryAddress pollable_stream, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GPollableSourceFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GPollableSourceFunc.class, fi, constants$518.GPollableSourceFunc$FUNC, session);
    }
    static GPollableSourceFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _pollable_stream, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                return (int)constants$518.GPollableSourceFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_pollable_stream, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


