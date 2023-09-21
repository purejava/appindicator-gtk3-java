// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GParamSpecUInt {
 *     struct _GParamSpec parent_instance;
 *     unsigned int minimum;
 *     unsigned int maximum;
 *     unsigned int default_value;
 * };
 * }
 */
public class _GParamSpecUInt {

    public static MemoryLayout $LAYOUT() {
        return constants$656.const$4;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static VarHandle minimum$VH() {
        return constants$656.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int minimum;
     * }
     */
    public static int minimum$get(MemorySegment seg) {
        return (int)constants$656.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int minimum;
     * }
     */
    public static void minimum$set(MemorySegment seg, int x) {
        constants$656.const$5.set(seg, x);
    }
    public static int minimum$get(MemorySegment seg, long index) {
        return (int)constants$656.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void minimum$set(MemorySegment seg, long index, int x) {
        constants$656.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle maximum$VH() {
        return constants$657.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int maximum;
     * }
     */
    public static int maximum$get(MemorySegment seg) {
        return (int)constants$657.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int maximum;
     * }
     */
    public static void maximum$set(MemorySegment seg, int x) {
        constants$657.const$0.set(seg, x);
    }
    public static int maximum$get(MemorySegment seg, long index) {
        return (int)constants$657.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void maximum$set(MemorySegment seg, long index, int x) {
        constants$657.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle default_value$VH() {
        return constants$657.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int default_value;
     * }
     */
    public static int default_value$get(MemorySegment seg) {
        return (int)constants$657.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int default_value;
     * }
     */
    public static void default_value$set(MemorySegment seg, int x) {
        constants$657.const$1.set(seg, x);
    }
    public static int default_value$get(MemorySegment seg, long index) {
        return (int)constants$657.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void default_value$set(MemorySegment seg, long index, int x) {
        constants$657.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

