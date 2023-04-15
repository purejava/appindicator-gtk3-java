// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkClipboardTextReceivedFunc {

    void apply(java.lang.foreign.MemoryAddress clipboard, java.lang.foreign.MemoryAddress text, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(GtkClipboardTextReceivedFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkClipboardTextReceivedFunc.class, fi, constants$1728.GtkClipboardTextReceivedFunc$FUNC, session);
    }
    static GtkClipboardTextReceivedFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _clipboard, java.lang.foreign.MemoryAddress _text, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$1728.GtkClipboardTextReceivedFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_clipboard, (java.lang.foreign.Addressable)_text, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

