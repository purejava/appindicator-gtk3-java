// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct __pthread_mutex_s {
 *     int __lock;
 *     unsigned int __count;
 *     int __owner;
 *     unsigned int __nusers;
 *     int __kind;
 *     int __spins;
 *     struct __pthread_internal_list __list;
 * };
 * }
 */
public class __pthread_mutex_s {

    public static MemoryLayout $LAYOUT() {
        return constants$73.const$0;
    }
    public static VarHandle __lock$VH() {
        return constants$73.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __lock;
     * }
     */
    public static int __lock$get(MemorySegment seg) {
        return (int)constants$73.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __lock;
     * }
     */
    public static void __lock$set(MemorySegment seg, int x) {
        constants$73.const$1.set(seg, x);
    }
    public static int __lock$get(MemorySegment seg, long index) {
        return (int)constants$73.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void __lock$set(MemorySegment seg, long index, int x) {
        constants$73.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle __count$VH() {
        return constants$73.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __count;
     * }
     */
    public static int __count$get(MemorySegment seg) {
        return (int)constants$73.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __count;
     * }
     */
    public static void __count$set(MemorySegment seg, int x) {
        constants$73.const$2.set(seg, x);
    }
    public static int __count$get(MemorySegment seg, long index) {
        return (int)constants$73.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void __count$set(MemorySegment seg, long index, int x) {
        constants$73.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle __owner$VH() {
        return constants$73.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __owner;
     * }
     */
    public static int __owner$get(MemorySegment seg) {
        return (int)constants$73.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __owner;
     * }
     */
    public static void __owner$set(MemorySegment seg, int x) {
        constants$73.const$3.set(seg, x);
    }
    public static int __owner$get(MemorySegment seg, long index) {
        return (int)constants$73.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void __owner$set(MemorySegment seg, long index, int x) {
        constants$73.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle __nusers$VH() {
        return constants$73.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int __nusers;
     * }
     */
    public static int __nusers$get(MemorySegment seg) {
        return (int)constants$73.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int __nusers;
     * }
     */
    public static void __nusers$set(MemorySegment seg, int x) {
        constants$73.const$4.set(seg, x);
    }
    public static int __nusers$get(MemorySegment seg, long index) {
        return (int)constants$73.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void __nusers$set(MemorySegment seg, long index, int x) {
        constants$73.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle __kind$VH() {
        return constants$73.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __kind;
     * }
     */
    public static int __kind$get(MemorySegment seg) {
        return (int)constants$73.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __kind;
     * }
     */
    public static void __kind$set(MemorySegment seg, int x) {
        constants$73.const$5.set(seg, x);
    }
    public static int __kind$get(MemorySegment seg, long index) {
        return (int)constants$73.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void __kind$set(MemorySegment seg, long index, int x) {
        constants$73.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle __spins$VH() {
        return constants$74.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __spins;
     * }
     */
    public static int __spins$get(MemorySegment seg) {
        return (int)constants$74.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __spins;
     * }
     */
    public static void __spins$set(MemorySegment seg, int x) {
        constants$74.const$0.set(seg, x);
    }
    public static int __spins$get(MemorySegment seg, long index) {
        return (int)constants$74.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void __spins$set(MemorySegment seg, long index, int x) {
        constants$74.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __list$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

