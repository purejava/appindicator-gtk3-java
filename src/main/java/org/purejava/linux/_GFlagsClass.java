// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GFlagsClass {
 *     GTypeClass g_type_class;
 *     guint mask;
 *     guint n_values;
 *     GFlagsValue* values;
 * };
 * }
 */
public class _GFlagsClass {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
        ).withName("g_type_class"),
        Constants$root.C_INT$LAYOUT.withName("mask"),
        Constants$root.C_INT$LAYOUT.withName("n_values"),
        Constants$root.C_POINTER$LAYOUT.withName("values")
    ).withName("_GFlagsClass");
    public static MemoryLayout $LAYOUT() {
        return _GFlagsClass.$struct$LAYOUT;
    }
    public static MemorySegment g_type_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mask"));
    public static VarHandle mask$VH() {
        return _GFlagsClass.mask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint mask;
     * }
     */
    public static int mask$get(MemorySegment seg) {
        return (int)_GFlagsClass.mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint mask;
     * }
     */
    public static void mask$set(MemorySegment seg, int x) {
        _GFlagsClass.mask$VH.set(seg, x);
    }
    public static int mask$get(MemorySegment seg, long index) {
        return (int)_GFlagsClass.mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mask$set(MemorySegment seg, long index, int x) {
        _GFlagsClass.mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle n_values$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("n_values"));
    public static VarHandle n_values$VH() {
        return _GFlagsClass.n_values$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint n_values;
     * }
     */
    public static int n_values$get(MemorySegment seg) {
        return (int)_GFlagsClass.n_values$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint n_values;
     * }
     */
    public static void n_values$set(MemorySegment seg, int x) {
        _GFlagsClass.n_values$VH.set(seg, x);
    }
    public static int n_values$get(MemorySegment seg, long index) {
        return (int)_GFlagsClass.n_values$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n_values$set(MemorySegment seg, long index, int x) {
        _GFlagsClass.n_values$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle values$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("values"));
    public static VarHandle values$VH() {
        return _GFlagsClass.values$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GFlagsValue* values;
     * }
     */
    public static MemorySegment values$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GFlagsClass.values$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GFlagsValue* values;
     * }
     */
    public static void values$set(MemorySegment seg, MemorySegment x) {
        _GFlagsClass.values$VH.set(seg, x);
    }
    public static MemorySegment values$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GFlagsClass.values$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void values$set(MemorySegment seg, long index, MemorySegment x) {
        _GFlagsClass.values$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


