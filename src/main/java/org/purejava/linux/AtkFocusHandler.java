// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface AtkFocusHandler {

    void apply(java.lang.foreign.MemoryAddress object, int focus_in);
    static MemorySegment allocate(AtkFocusHandler fi, MemorySession session) {
        return RuntimeHelper.upcallStub(AtkFocusHandler.class, fi, constants$1386.AtkFocusHandler$FUNC, session);
    }
    static AtkFocusHandler ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _object, int _focus_in) -> {
            try {
                constants$1386.AtkFocusHandler$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_object, _focus_in);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

