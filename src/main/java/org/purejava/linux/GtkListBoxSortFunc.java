// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkListBoxSortFunc {

    int apply(java.lang.foreign.MemoryAddress row1, java.lang.foreign.MemoryAddress row2, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GtkListBoxSortFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkListBoxSortFunc.class, fi, constants$1868.GtkListBoxSortFunc$FUNC, session);
    }
    static GtkListBoxSortFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _row1, java.lang.foreign.MemoryAddress _row2, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                return (int)constants$1868.GtkListBoxSortFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_row1, (java.lang.foreign.Addressable)_row2, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

