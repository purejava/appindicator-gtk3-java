// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoItem {
 *     int offset;
 *     int length;
 *     int num_chars;
 *     struct _PangoAnalysis analysis;
 * };
 * }
 */
public class _PangoItem {

    public static MemoryLayout $LAYOUT() {
        return constants$1582.const$2;
    }
    public static VarHandle offset$VH() {
        return constants$1582.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int offset;
     * }
     */
    public static int offset$get(MemorySegment seg) {
        return (int)constants$1582.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int offset;
     * }
     */
    public static void offset$set(MemorySegment seg, int x) {
        constants$1582.const$3.set(seg, x);
    }
    public static int offset$get(MemorySegment seg, long index) {
        return (int)constants$1582.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, int x) {
        constants$1582.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle length$VH() {
        return constants$1582.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)constants$1582.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        constants$1582.const$4.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)constants$1582.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        constants$1582.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle num_chars$VH() {
        return constants$1582.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int num_chars;
     * }
     */
    public static int num_chars$get(MemorySegment seg) {
        return (int)constants$1582.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int num_chars;
     * }
     */
    public static void num_chars$set(MemorySegment seg, int x) {
        constants$1582.const$5.set(seg, x);
    }
    public static int num_chars$get(MemorySegment seg, long index) {
        return (int)constants$1582.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void num_chars$set(MemorySegment seg, long index, int x) {
        constants$1582.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment analysis$slice(MemorySegment seg) {
        return seg.asSlice(16, 48);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


