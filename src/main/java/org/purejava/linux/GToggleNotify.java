// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GToggleNotify {

    void apply(java.lang.foreign.MemoryAddress data, java.lang.foreign.MemoryAddress object, int is_last_ref);
    static MemorySegment allocate(GToggleNotify fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GToggleNotify.class, fi, constants$477.GToggleNotify$FUNC, session);
    }
    static GToggleNotify ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _data, java.lang.foreign.MemoryAddress _object, int _is_last_ref) -> {
            try {
                constants$477.GToggleNotify$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_data, (java.lang.foreign.Addressable)_object, _is_last_ref);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

