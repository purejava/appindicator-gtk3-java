// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkStylePropertyParser {

    int apply(java.lang.foreign.MemoryAddress string, java.lang.foreign.MemoryAddress value, java.lang.foreign.MemoryAddress error);
    static MemorySegment allocate(GtkStylePropertyParser fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkStylePropertyParser.class, fi, constants$1821.GtkStylePropertyParser$FUNC, session);
    }
    static GtkStylePropertyParser ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _string, java.lang.foreign.MemoryAddress _value, java.lang.foreign.MemoryAddress _error) -> {
            try {
                return (int)constants$1821.GtkStylePropertyParser$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_string, (java.lang.foreign.Addressable)_value, (java.lang.foreign.Addressable)_error);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

