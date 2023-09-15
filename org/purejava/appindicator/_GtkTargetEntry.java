// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkTargetEntry {
 *     char* target;
 *     unsigned int flags;
 *     unsigned int info;
 * };
 * }
 */
public class _GtkTargetEntry {

    public static MemoryLayout $LAYOUT() {
        return constants$2384.const$3;
    }
    public static VarHandle target$VH() {
        return constants$2384.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* target;
     * }
     */
    public static MemorySegment target$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$2384.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* target;
     * }
     */
    public static void target$set(MemorySegment seg, MemorySegment x) {
        constants$2384.const$4.set(seg, x);
    }
    public static MemorySegment target$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$2384.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void target$set(MemorySegment seg, long index, MemorySegment x) {
        constants$2384.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$2384.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$2384.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$2384.const$5.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$2384.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$2384.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle info$VH() {
        return constants$2385.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int info;
     * }
     */
    public static int info$get(MemorySegment seg) {
        return (int)constants$2385.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int info;
     * }
     */
    public static void info$set(MemorySegment seg, int x) {
        constants$2385.const$0.set(seg, x);
    }
    public static int info$get(MemorySegment seg, long index) {
        return (int)constants$2385.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void info$set(MemorySegment seg, long index, int x) {
        constants$2385.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


