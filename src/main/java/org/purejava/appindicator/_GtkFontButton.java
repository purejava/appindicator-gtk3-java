// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkFontButton {
 *     struct _GtkButton button;
 *     struct _GtkFontButtonPrivate* priv;
 * };
 * }
 */
public class _GtkFontButton {

    public static MemoryLayout $LAYOUT() {
        return constants$2717.const$2;
    }
    public static MemorySegment button$slice(MemorySegment seg) {
        return seg.asSlice(0, 56);
    }
    public static VarHandle priv$VH() {
        return constants$2717.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkFontButtonPrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2717.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkFontButtonPrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        constants$2717.const$3.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2717.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2717.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


