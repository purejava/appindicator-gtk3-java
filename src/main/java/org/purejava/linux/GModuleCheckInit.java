// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GModuleCheckInit {

    java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress module);
    static MemorySegment allocate(GModuleCheckInit fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GModuleCheckInit.class, fi, constants$730.GModuleCheckInit$FUNC, session);
    }
    static GModuleCheckInit ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _module) -> {
            try {
                return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)constants$730.GModuleCheckInit$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_module);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


