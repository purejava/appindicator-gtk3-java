// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct drand48_data {
 *     unsigned short __x[3];
 *     unsigned short __old_x[3];
 *     unsigned short __c;
 *     unsigned short __init;
 *     unsigned long long __a;
 * };
 * }
 */
public class drand48_data {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("__x"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_SHORT$LAYOUT).withName("__old_x"),
        Constants$root.C_SHORT$LAYOUT.withName("__c"),
        Constants$root.C_SHORT$LAYOUT.withName("__init"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("__a")
    ).withName("drand48_data");
    public static MemoryLayout $LAYOUT() {
        return drand48_data.$struct$LAYOUT;
    }
    public static MemorySegment __x$slice(MemorySegment seg) {
        return seg.asSlice(0, 6);
    }
    public static MemorySegment __old_x$slice(MemorySegment seg) {
        return seg.asSlice(6, 6);
    }
    static final VarHandle __c$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__c"));
    public static VarHandle __c$VH() {
        return drand48_data.__c$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short __c;
     * }
     */
    public static short __c$get(MemorySegment seg) {
        return (short)drand48_data.__c$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short __c;
     * }
     */
    public static void __c$set(MemorySegment seg, short x) {
        drand48_data.__c$VH.set(seg, x);
    }
    public static short __c$get(MemorySegment seg, long index) {
        return (short)drand48_data.__c$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __c$set(MemorySegment seg, long index, short x) {
        drand48_data.__c$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __init$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__init"));
    public static VarHandle __init$VH() {
        return drand48_data.__init$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short __init;
     * }
     */
    public static short __init$get(MemorySegment seg) {
        return (short)drand48_data.__init$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short __init;
     * }
     */
    public static void __init$set(MemorySegment seg, short x) {
        drand48_data.__init$VH.set(seg, x);
    }
    public static short __init$get(MemorySegment seg, long index) {
        return (short)drand48_data.__init$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __init$set(MemorySegment seg, long index, short x) {
        drand48_data.__init$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __a$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__a"));
    public static VarHandle __a$VH() {
        return drand48_data.__a$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long long __a;
     * }
     */
    public static long __a$get(MemorySegment seg) {
        return (long)drand48_data.__a$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long long __a;
     * }
     */
    public static void __a$set(MemorySegment seg, long x) {
        drand48_data.__a$VH.set(seg, x);
    }
    public static long __a$get(MemorySegment seg, long index) {
        return (long)drand48_data.__a$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __a$set(MemorySegment seg, long index, long x) {
        drand48_data.__a$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


