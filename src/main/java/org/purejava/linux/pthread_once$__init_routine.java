// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface pthread_once$__init_routine {

    void apply();
    static MemorySegment allocate(pthread_once$__init_routine fi, MemorySession session) {
        return RuntimeHelper.upcallStub(pthread_once$__init_routine.class, fi, constants$356.pthread_once$__init_routine$FUNC, session);
    }
    static pthread_once$__init_routine ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return () -> {
            try {
                constants$356.pthread_once$__init_routine$MH.invokeExact((Addressable)symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


