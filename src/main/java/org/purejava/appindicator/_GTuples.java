// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GTuples {
 *     unsigned int len;
 * };
 * }
 */
public class _GTuples {

    public static MemoryLayout $LAYOUT() {
        return constants$499.const$3;
    }
    public static VarHandle len$VH() {
        return constants$499.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int len;
     * }
     */
    public static int len$get(MemorySegment seg) {
        return (int)constants$499.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int len;
     * }
     */
    public static void len$set(MemorySegment seg, int x) {
        constants$499.const$4.set(seg, x);
    }
    public static int len$get(MemorySegment seg, long index) {
        return (int)constants$499.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void len$set(MemorySegment seg, long index, int x) {
        constants$499.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

