// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GObjectSetPropertyFunc)(struct _GObject* object,unsigned int property_id,struct _GValue* value,struct _GParamSpec* pspec);
 * }
 */
public interface GObjectSetPropertyFunc {

    void apply(java.lang.foreign.MemorySegment object, int property_id, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment pspec);
    static MemorySegment allocate(GObjectSetPropertyFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$430.GObjectSetPropertyFunc_UP$MH, fi, constants$430.GObjectSetPropertyFunc$FUNC, scope);
    }
    static GObjectSetPropertyFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _object, int _property_id, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _pspec) -> {
            try {
                constants$430.GObjectSetPropertyFunc_DOWN$MH.invokeExact(symbol, _object, _property_id, _value, _pspec);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


