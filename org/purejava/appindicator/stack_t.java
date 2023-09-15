// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct stack_t {
 *     void* ss_sp;
 *     int ss_flags;
 *     unsigned long ss_size;
 * };
 * }
 */
public class stack_t {

    public static MemoryLayout $LAYOUT() {
        return constants$134.const$5;
    }
    public static VarHandle ss_sp$VH() {
        return constants$135.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* ss_sp;
     * }
     */
    public static MemorySegment ss_sp$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$135.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* ss_sp;
     * }
     */
    public static void ss_sp$set(MemorySegment seg, MemorySegment x) {
        constants$135.const$0.set(seg, x);
    }
    public static MemorySegment ss_sp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$135.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_sp$set(MemorySegment seg, long index, MemorySegment x) {
        constants$135.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ss_flags$VH() {
        return constants$135.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int ss_flags;
     * }
     */
    public static int ss_flags$get(MemorySegment seg) {
        return (int)constants$135.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int ss_flags;
     * }
     */
    public static void ss_flags$set(MemorySegment seg, int x) {
        constants$135.const$1.set(seg, x);
    }
    public static int ss_flags$get(MemorySegment seg, long index) {
        return (int)constants$135.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_flags$set(MemorySegment seg, long index, int x) {
        constants$135.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ss_size$VH() {
        return constants$135.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long ss_size;
     * }
     */
    public static long ss_size$get(MemorySegment seg) {
        return (long)constants$135.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long ss_size;
     * }
     */
    public static void ss_size$set(MemorySegment seg, long x) {
        constants$135.const$2.set(seg, x);
    }
    public static long ss_size$get(MemorySegment seg, long index) {
        return (long)constants$135.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_size$set(MemorySegment seg, long index, long x) {
        constants$135.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


