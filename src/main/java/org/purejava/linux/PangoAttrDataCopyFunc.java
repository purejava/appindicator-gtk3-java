// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void* (*PangoAttrDataCopyFunc)(void* user_data);
 * }
 */
public interface PangoAttrDataCopyFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(PangoAttrDataCopyFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$919.PangoAttrDataCopyFunc_UP$MH, fi, constants$919.PangoAttrDataCopyFunc$FUNC, scope);
    }
    static PangoAttrDataCopyFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$920.PangoAttrDataCopyFunc_DOWN$MH.invokeExact(symbol, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


