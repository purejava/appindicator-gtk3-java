// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkFileFilterFunc {

    int apply(java.lang.foreign.MemoryAddress filter_info, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(GtkFileFilterFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkFileFilterFunc.class, fi, constants$1758.GtkFileFilterFunc$FUNC, session);
    }
    static GtkFileFilterFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _filter_info, java.lang.foreign.MemoryAddress _data) -> {
            try {
                return (int)constants$1758.GtkFileFilterFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_filter_info, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

