// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GAsyncReadyCallback {

    void apply(java.lang.foreign.MemoryAddress source_object, java.lang.foreign.MemoryAddress res, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GAsyncReadyCallback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GAsyncReadyCallback.class, fi, constants$515.GAsyncReadyCallback$FUNC, session);
    }
    static GAsyncReadyCallback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _source_object, java.lang.foreign.MemoryAddress _res, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                constants$515.GAsyncReadyCallback$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_source_object, (java.lang.foreign.Addressable)_res, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


