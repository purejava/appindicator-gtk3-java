// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoAttrSize {
 *     struct _PangoAttribute attr;
 *     int size;
 *      *     unsigned int absolute;
 * };
 * }
 */
public class _PangoAttrSize {

    public static MemoryLayout $LAYOUT() {
        return constants$1565.const$0;
    }
    public static MemorySegment attr$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static VarHandle size$VH() {
        return constants$1565.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int size;
     * }
     */
    public static int size$get(MemorySegment seg) {
        return (int)constants$1565.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int size;
     * }
     */
    public static void size$set(MemorySegment seg, int x) {
        constants$1565.const$1.set(seg, x);
    }
    public static int size$get(MemorySegment seg, long index) {
        return (int)constants$1565.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, int x) {
        constants$1565.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

