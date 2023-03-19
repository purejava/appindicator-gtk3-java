// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GDoubleIEEE754 {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("v_double"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32).withName("mantissa_low"),
                MemoryLayout.paddingLayout(20).withName("mantissa_high"),
                MemoryLayout.paddingLayout(11).withName("biased_exponent"),
                MemoryLayout.paddingLayout(1).withName("sign")
            )
        ).withName("mpn")
    ).withName("_GDoubleIEEE754");
    public static MemoryLayout $LAYOUT() {
        return _GDoubleIEEE754.$union$LAYOUT;
    }
    static final VarHandle v_double$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_double"));
    public static VarHandle v_double$VH() {
        return _GDoubleIEEE754.v_double$VH;
    }
    public static double v_double$get(MemorySegment seg) {
        return (double)_GDoubleIEEE754.v_double$VH.get(seg);
    }
    public static void v_double$set( MemorySegment seg, double x) {
        _GDoubleIEEE754.v_double$VH.set(seg, x);
    }
    public static double v_double$get(MemorySegment seg, long index) {
        return (double)_GDoubleIEEE754.v_double$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_double$set(MemorySegment seg, long index, double x) {
        _GDoubleIEEE754.v_double$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class mpn {

        static final  GroupLayout mpn$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(32).withName("mantissa_low"),
                MemoryLayout.paddingLayout(20).withName("mantissa_high"),
                MemoryLayout.paddingLayout(11).withName("biased_exponent"),
                MemoryLayout.paddingLayout(1).withName("sign")
            )
        );
        public static MemoryLayout $LAYOUT() {
            return mpn.mpn$struct$LAYOUT;
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
    }

    public static MemorySegment mpn$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


