// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GCallback)();
 * }
 */
public interface GCallback {

    void apply();
    static MemorySegment allocate(GCallback fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$402.GCallback_UP$MH, fi, constants$402.GCallback$FUNC, scope);
    }
    static GCallback ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                constants$402.GCallback_DOWN$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


