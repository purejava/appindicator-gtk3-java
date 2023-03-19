// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GVfsFileLookupFunc {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress vfs, java.lang.foreign.MemoryAddress identifier, java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GVfsFileLookupFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GVfsFileLookupFunc.class, fi, constants$873.GVfsFileLookupFunc$FUNC, session);
    }
    static GVfsFileLookupFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _vfs, java.lang.foreign.MemoryAddress _identifier, java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$873.GVfsFileLookupFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_vfs, (java.lang.foreign.Addressable)_identifier, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


