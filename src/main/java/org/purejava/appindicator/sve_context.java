// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct sve_context {
 *     struct _aarch64_ctx head;
 *     unsigned short vl;
 *     unsigned short flags;
 *     unsigned short __reserved[2];
 * };
 * }
 */
public class sve_context {

    public static MemoryLayout $LAYOUT() {
        return constants$133.const$1;
    }
    public static MemorySegment head$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle vl$VH() {
        return constants$133.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short vl;
     * }
     */
    public static short vl$get(MemorySegment seg) {
        return (short)constants$133.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short vl;
     * }
     */
    public static void vl$set(MemorySegment seg, short x) {
        constants$133.const$2.set(seg, x);
    }
    public static short vl$get(MemorySegment seg, long index) {
        return (short)constants$133.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void vl$set(MemorySegment seg, long index, short x) {
        constants$133.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$133.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short flags;
     * }
     */
    public static short flags$get(MemorySegment seg) {
        return (short)constants$133.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short flags;
     * }
     */
    public static void flags$set(MemorySegment seg, short x) {
        constants$133.const$3.set(seg, x);
    }
    public static short flags$get(MemorySegment seg, long index) {
        return (short)constants$133.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, short x) {
        constants$133.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __reserved$slice(MemorySegment seg) {
        return seg.asSlice(12, 4);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

