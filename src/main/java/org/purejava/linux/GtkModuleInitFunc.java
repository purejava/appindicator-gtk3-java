// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkModuleInitFunc {

    void apply(java.lang.foreign.MemoryAddress argc, java.lang.foreign.MemoryAddress argv);
    static MemorySegment allocate(GtkModuleInitFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkModuleInitFunc.class, fi, constants$1904.GtkModuleInitFunc$FUNC, session);
    }
    static GtkModuleInitFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _argc, java.lang.foreign.MemoryAddress _argv) -> {
            try {
                constants$1904.GtkModuleInitFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_argc, (java.lang.foreign.Addressable)_argv);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


