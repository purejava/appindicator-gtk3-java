// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkTextTagTableForeach {

    void apply(java.lang.foreign.MemoryAddress tag, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(GtkTextTagTableForeach fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkTextTagTableForeach.class, fi, constants$2020.GtkTextTagTableForeach$FUNC, session);
    }
    static GtkTextTagTableForeach ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _tag, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$2020.GtkTextTagTableForeach$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_tag, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

