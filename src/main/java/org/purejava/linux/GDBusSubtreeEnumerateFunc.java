// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * char** (*GDBusSubtreeEnumerateFunc)(struct _GDBusConnection* connection,char* sender,char* object_path,void* user_data);
 * }
 */
public interface GDBusSubtreeEnumerateFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data, java.lang.foreign.MemorySegment target, java.lang.foreign.MemorySegment extents);
    static MemorySegment allocate(GDBusSubtreeEnumerateFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$556.GDBusSubtreeEnumerateFunc_UP$MH, fi, constants$556.GDBusSubtreeEnumerateFunc$FUNC, scope);
    }
    static GDBusSubtreeEnumerateFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _pattern, java.lang.foreign.MemorySegment _callback_data, java.lang.foreign.MemorySegment _target, java.lang.foreign.MemorySegment _extents) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$557.GDBusSubtreeEnumerateFunc_DOWN$MH.invokeExact(symbol, _pattern, _callback_data, _target, _extents);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


