// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GtkClipboardTextReceivedFunc)(struct _GtkClipboard* clipboard,char* text,void* data);
 * }
 */
public interface GtkClipboardTextReceivedFunc {

    void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkClipboardTextReceivedFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1537.GtkClipboardTextReceivedFunc_UP$MH, fi, constants$1537.GtkClipboardTextReceivedFunc$FUNC, scope);
    }
    static GtkClipboardTextReceivedFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                constants$1538.GtkClipboardTextReceivedFunc_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


