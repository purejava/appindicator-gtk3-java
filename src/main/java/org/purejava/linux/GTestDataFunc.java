// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GTestDataFunc {

    void apply(java.lang.foreign.MemoryAddress user_data);
    static MemorySegment allocate(GTestDataFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GTestDataFunc.class, fi, constants$308.GTestDataFunc$FUNC, session);
    }
    static GTestDataFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _user_data) -> {
            try {
                constants$308.GTestDataFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


