// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GWeakNotify {

    void apply(java.lang.foreign.MemoryAddress data, java.lang.foreign.MemoryAddress where_the_object_was);
    static MemorySegment allocate(GWeakNotify fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GWeakNotify.class, fi, constants$470.GWeakNotify$FUNC, session);
    }
    static GWeakNotify ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _data, java.lang.foreign.MemoryAddress _where_the_object_was) -> {
            try {
                constants$470.GWeakNotify$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_data, (java.lang.foreign.Addressable)_where_the_object_was);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


