// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GTypePluginUse)(struct _GTypePlugin* plugin);
 * }
 */
public interface GTypePluginUse {

    void apply(java.lang.foreign.MemorySegment display);
    static MemorySegment allocate(GTypePluginUse fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$458.GTypePluginUse_UP$MH, fi, constants$458.GTypePluginUse$FUNC, scope);
    }
    static GTypePluginUse ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _display) -> {
            try {
                constants$458.GTypePluginUse_DOWN$MH.invokeExact(symbol, _display);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


