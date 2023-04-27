// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union _GDoubleIEEE754 {
 *     gdouble v_double;
 *     struct  mpn;
 * };
 * }
 */
public class _GDoubleIEEE754 {

    static final UnionLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("v_double"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(64)
        ).withName("mpn")
    ).withName("_GDoubleIEEE754");
    public static MemoryLayout $LAYOUT() {
        return _GDoubleIEEE754.$union$LAYOUT;
    }
    static final VarHandle v_double$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("v_double"));
    public static VarHandle v_double$VH() {
        return _GDoubleIEEE754.v_double$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble v_double;
     * }
     */
    public static double v_double$get(MemorySegment seg) {
        return (double)_GDoubleIEEE754.v_double$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble v_double;
     * }
     */
    public static void v_double$set(MemorySegment seg, double x) {
        _GDoubleIEEE754.v_double$VH.set(seg, x);
    }
    public static double v_double$get(MemorySegment seg, long index) {
        return (double)_GDoubleIEEE754.v_double$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void v_double$set(MemorySegment seg, long index, double x) {
        _GDoubleIEEE754.v_double$VH.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
     * struct {
     *          *     guint mantissa_low;
     *     guint mantissa_high;
     *     guint biased_exponent;
     *     guint sign;
     * };
     * }
     */
    public static final class mpn {

        // Suppresses default constructor, ensuring non-instantiability.
        private mpn() {}
        static final StructLayout mpn$struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(64)
        );
        public static MemoryLayout $LAYOUT() {
            return mpn.mpn$struct$LAYOUT;
        }
        public static long sizeof() { return $LAYOUT().byteSize(); }
        public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
        public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
        }
        public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
    }

    public static MemorySegment mpn$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


