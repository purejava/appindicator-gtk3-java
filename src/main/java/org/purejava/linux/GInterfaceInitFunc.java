// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GInterfaceInitFunc {

    void apply(java.lang.foreign.MemoryAddress g_iface, java.lang.foreign.MemoryAddress iface_data);
    static MemorySegment allocate(GInterfaceInitFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GInterfaceInitFunc.class, fi, constants$425.GInterfaceInitFunc$FUNC, session);
    }
    static GInterfaceInitFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _g_iface, java.lang.foreign.MemoryAddress _iface_data) -> {
            try {
                constants$425.GInterfaceInitFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_g_iface, (java.lang.foreign.Addressable)_iface_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


