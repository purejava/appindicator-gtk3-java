// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GdkWindowInvalidateHandlerFunc {

    void apply(java.lang.foreign.MemoryAddress window, java.lang.foreign.MemoryAddress region);
    static MemorySegment allocate(GdkWindowInvalidateHandlerFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GdkWindowInvalidateHandlerFunc.class, fi, constants$1245.GdkWindowInvalidateHandlerFunc$FUNC, session);
    }
    static GdkWindowInvalidateHandlerFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _window, java.lang.foreign.MemoryAddress _region) -> {
            try {
                constants$1245.GdkWindowInvalidateHandlerFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_window, (java.lang.foreign.Addressable)_region);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


