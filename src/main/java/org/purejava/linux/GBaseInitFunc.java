// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GBaseInitFunc {

    void apply(java.lang.foreign.MemoryAddress g_class);
    static MemorySegment allocate(GBaseInitFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GBaseInitFunc.class, fi, constants$423.GBaseInitFunc$FUNC, session);
    }
    static GBaseInitFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _g_class) -> {
            try {
                constants$424.GBaseInitFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_g_class);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


