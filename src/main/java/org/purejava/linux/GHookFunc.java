// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GHookFunc {

    void apply(java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(GHookFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GHookFunc.class, fi, constants$154.GHookFunc$FUNC, session);
    }
    static GHookFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$154.GHookFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


