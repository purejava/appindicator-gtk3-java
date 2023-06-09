// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * void (*GtkClipboardClearFunc)(struct _GtkClipboard* clipboard,void* user_data_or_owner);
 * }
 */
public interface GtkClipboardClearFunc {

    void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
    static MemorySegment allocate(GtkClipboardClearFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1539.GtkClipboardClearFunc_UP$MH, fi, constants$1539.GtkClipboardClearFunc$FUNC, scope);
    }
    static GtkClipboardClearFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
            try {
                constants$1540.GtkClipboardClearFunc_DOWN$MH.invokeExact(symbol, _tag, _data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


