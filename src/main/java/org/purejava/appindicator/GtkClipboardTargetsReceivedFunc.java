// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*GtkClipboardTargetsReceivedFunc)(struct _GtkClipboard* clipboard,struct _GdkAtom** atoms,int n_atoms,void* data);
 * }
 */
public interface GtkClipboardTargetsReceivedFunc {

    void apply(java.lang.foreign.MemorySegment clipboard, java.lang.foreign.MemorySegment atoms, int n_atoms, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GtkClipboardTargetsReceivedFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2625.const$1, fi, constants$464.const$4, scope);
    }
    static GtkClipboardTargetsReceivedFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _clipboard, java.lang.foreign.MemorySegment _atoms, int _n_atoms, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$737.const$4.invokeExact(symbol, _clipboard, _atoms, _n_atoms, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


