// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GScannerMsgFunc {

    void apply(java.lang.foreign.MemoryAddress scanner, java.lang.foreign.MemoryAddress message, int error);
    static MemorySegment allocate(GScannerMsgFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GScannerMsgFunc.class, fi, constants$281.GScannerMsgFunc$FUNC, session);
    }
    static GScannerMsgFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _scanner, java.lang.foreign.MemoryAddress _message, int _error) -> {
            try {
                constants$281.GScannerMsgFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_scanner, (java.lang.foreign.Addressable)_message, _error);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

