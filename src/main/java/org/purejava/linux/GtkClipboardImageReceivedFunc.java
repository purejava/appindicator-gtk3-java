// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface GtkClipboardImageReceivedFunc {

    void apply(java.lang.foreign.MemoryAddress clipboard, java.lang.foreign.MemoryAddress pixbuf, java.lang.foreign.MemoryAddress data);
    static MemorySegment allocate(GtkClipboardImageReceivedFunc fi, MemorySession session) {
        return RuntimeHelper.upcallStub(GtkClipboardImageReceivedFunc.class, fi, constants$1729.GtkClipboardImageReceivedFunc$FUNC, session);
    }
    static GtkClipboardImageReceivedFunc ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _clipboard, java.lang.foreign.MemoryAddress _pixbuf, java.lang.foreign.MemoryAddress _data) -> {
            try {
                constants$1729.GtkClipboardImageReceivedFunc$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_clipboard, (java.lang.foreign.Addressable)_pixbuf, (java.lang.foreign.Addressable)_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


