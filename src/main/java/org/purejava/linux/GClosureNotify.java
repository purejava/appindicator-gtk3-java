// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GClosureNotify {

    void apply(java.lang.foreign.MemoryAddress data, java.lang.foreign.MemoryAddress closure);
    static MemorySegment allocate(GClosureNotify fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GClosureNotify.class, fi, constants$442.GClosureNotify$FUNC, session);
    }
    static GClosureNotify ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _data, java.lang.foreign.MemoryAddress _closure) -> {
            try {
                constants$442.GClosureNotify$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_data, (java.lang.foreign.Addressable)_closure);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

