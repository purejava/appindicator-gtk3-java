// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GSourceDummyMarshal)();
 * }
 */
public interface GSourceDummyMarshal {

    void apply();
    static MemorySegment allocate(GSourceDummyMarshal fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$168.GSourceDummyMarshal_UP$MH, fi, constants$168.GSourceDummyMarshal$FUNC, scope);
    }
    static GSourceDummyMarshal ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                constants$168.GSourceDummyMarshal_DOWN$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


