// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkTreeModelFilterModifyFunc {

    void apply(java.lang.foreign.MemoryAddress model, java.lang.foreign.MemoryAddress iter, java.lang.foreign.MemoryAddress value, int column, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(GtkTreeModelFilterModifyFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkTreeModelFilterModifyFunc.class, fi, constants$1627.GtkTreeModelFilterModifyFunc$FUNC, session);
    }
    static GtkTreeModelFilterModifyFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _model, java.lang.foreign.MemoryAddress _iter, java.lang.foreign.MemoryAddress _value, int _column, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$1628.GtkTreeModelFilterModifyFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_model, (java.lang.foreign.Addressable)_iter, (java.lang.foreign.Addressable)_value, _column, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


