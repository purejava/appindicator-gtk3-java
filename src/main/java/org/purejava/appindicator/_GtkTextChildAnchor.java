// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkTextChildAnchor {
 *     struct _GObject parent_instance;
 *     void* segment;
 * };
 * }
 */
public class _GtkTextChildAnchor {

    public static MemoryLayout $LAYOUT() {
        return constants$2359.const$3;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static VarHandle segment$VH() {
        return constants$2359.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* segment;
     * }
     */
    public static MemorySegment segment$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2359.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* segment;
     * }
     */
    public static void segment$set(MemorySegment seg, MemorySegment x) {
        constants$2359.const$4.set(seg, x);
    }
    public static MemorySegment segment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2359.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void segment$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2359.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


