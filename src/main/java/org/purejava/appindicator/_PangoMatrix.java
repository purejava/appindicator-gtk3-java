// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _PangoMatrix {
 *     double xx;
 *     double xy;
 *     double yx;
 *     double yy;
 *     double x0;
 *     double y0;
 * };
 * }
 */
public class _PangoMatrix {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("xx"),
        Constants$root.C_DOUBLE$LAYOUT.withName("xy"),
        Constants$root.C_DOUBLE$LAYOUT.withName("yx"),
        Constants$root.C_DOUBLE$LAYOUT.withName("yy"),
        Constants$root.C_DOUBLE$LAYOUT.withName("x0"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y0")
    ).withName("_PangoMatrix");
    public static MemoryLayout $LAYOUT() {
        return _PangoMatrix.$struct$LAYOUT;
    }
    static final VarHandle xx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xx"));
    public static VarHandle xx$VH() {
        return _PangoMatrix.xx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double xx;
     * }
     */
    public static double xx$get(MemorySegment seg) {
        return (double)_PangoMatrix.xx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double xx;
     * }
     */
    public static void xx$set(MemorySegment seg, double x) {
        _PangoMatrix.xx$VH.set(seg, x);
    }
    public static double xx$get(MemorySegment seg, long index) {
        return (double)_PangoMatrix.xx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xx$set(MemorySegment seg, long index, double x) {
        _PangoMatrix.xx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xy"));
    public static VarHandle xy$VH() {
        return _PangoMatrix.xy$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double xy;
     * }
     */
    public static double xy$get(MemorySegment seg) {
        return (double)_PangoMatrix.xy$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double xy;
     * }
     */
    public static void xy$set(MemorySegment seg, double x) {
        _PangoMatrix.xy$VH.set(seg, x);
    }
    public static double xy$get(MemorySegment seg, long index) {
        return (double)_PangoMatrix.xy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xy$set(MemorySegment seg, long index, double x) {
        _PangoMatrix.xy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yx"));
    public static VarHandle yx$VH() {
        return _PangoMatrix.yx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double yx;
     * }
     */
    public static double yx$get(MemorySegment seg) {
        return (double)_PangoMatrix.yx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double yx;
     * }
     */
    public static void yx$set(MemorySegment seg, double x) {
        _PangoMatrix.yx$VH.set(seg, x);
    }
    public static double yx$get(MemorySegment seg, long index) {
        return (double)_PangoMatrix.yx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yx$set(MemorySegment seg, long index, double x) {
        _PangoMatrix.yx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("yy"));
    public static VarHandle yy$VH() {
        return _PangoMatrix.yy$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double yy;
     * }
     */
    public static double yy$get(MemorySegment seg) {
        return (double)_PangoMatrix.yy$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double yy;
     * }
     */
    public static void yy$set(MemorySegment seg, double x) {
        _PangoMatrix.yy$VH.set(seg, x);
    }
    public static double yy$get(MemorySegment seg, long index) {
        return (double)_PangoMatrix.yy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yy$set(MemorySegment seg, long index, double x) {
        _PangoMatrix.yy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x0"));
    public static VarHandle x0$VH() {
        return _PangoMatrix.x0$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x0;
     * }
     */
    public static double x0$get(MemorySegment seg) {
        return (double)_PangoMatrix.x0$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x0;
     * }
     */
    public static void x0$set(MemorySegment seg, double x) {
        _PangoMatrix.x0$VH.set(seg, x);
    }
    public static double x0$get(MemorySegment seg, long index) {
        return (double)_PangoMatrix.x0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x0$set(MemorySegment seg, long index, double x) {
        _PangoMatrix.x0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y0$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y0"));
    public static VarHandle y0$VH() {
        return _PangoMatrix.y0$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double y0;
     * }
     */
    public static double y0$get(MemorySegment seg) {
        return (double)_PangoMatrix.y0$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double y0;
     * }
     */
    public static void y0$set(MemorySegment seg, double x) {
        _PangoMatrix.y0$VH.set(seg, x);
    }
    public static double y0$get(MemorySegment seg, long index) {
        return (double)_PangoMatrix.y0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y0$set(MemorySegment seg, long index, double x) {
        _PangoMatrix.y0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


