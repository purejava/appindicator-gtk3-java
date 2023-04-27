// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*GtkKeySnoopFunc)(struct _GtkWidget* grab_widget,struct _GdkEventKey* event,void* func_data);
 * }
 */
public interface GtkKeySnoopFunc {

    int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkKeySnoopFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1681.GtkKeySnoopFunc_UP$MH, fi, constants$1681.GtkKeySnoopFunc$FUNC, scope);
    }
    static GtkKeySnoopFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _a, java.lang.foreign.MemorySegment _b, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1681.GtkKeySnoopFunc_DOWN$MH.invokeExact(symbol, _a, _b, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


