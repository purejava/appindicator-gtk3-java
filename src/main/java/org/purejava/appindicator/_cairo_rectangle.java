// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _cairo_rectangle {
 *     double x;
 *     double y;
 *     double width;
 *     double height;
 * };
 * }
 */
public class _cairo_rectangle {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("width"),
        Constants$root.C_DOUBLE$LAYOUT.withName("height")
    ).withName("_cairo_rectangle");
    public static MemoryLayout $LAYOUT() {
        return _cairo_rectangle.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _cairo_rectangle.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x;
     * }
     */
    public static double x$get(MemorySegment seg) {
        return (double)_cairo_rectangle.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x;
     * }
     */
    public static void x$set(MemorySegment seg, double x) {
        _cairo_rectangle.x$VH.set(seg, x);
    }
    public static double x$get(MemorySegment seg, long index) {
        return (double)_cairo_rectangle.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, double x) {
        _cairo_rectangle.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _cairo_rectangle.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double y;
     * }
     */
    public static double y$get(MemorySegment seg) {
        return (double)_cairo_rectangle.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double y;
     * }
     */
    public static void y$set(MemorySegment seg, double x) {
        _cairo_rectangle.y$VH.set(seg, x);
    }
    public static double y$get(MemorySegment seg, long index) {
        return (double)_cairo_rectangle.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, double x) {
        _cairo_rectangle.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return _cairo_rectangle.width$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double width;
     * }
     */
    public static double width$get(MemorySegment seg) {
        return (double)_cairo_rectangle.width$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double width;
     * }
     */
    public static void width$set(MemorySegment seg, double x) {
        _cairo_rectangle.width$VH.set(seg, x);
    }
    public static double width$get(MemorySegment seg, long index) {
        return (double)_cairo_rectangle.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, double x) {
        _cairo_rectangle.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return _cairo_rectangle.height$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double height;
     * }
     */
    public static double height$get(MemorySegment seg) {
        return (double)_cairo_rectangle.height$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double height;
     * }
     */
    public static void height$set(MemorySegment seg, double x) {
        _cairo_rectangle.height$VH.set(seg, x);
    }
    public static double height$get(MemorySegment seg, long index) {
        return (double)_cairo_rectangle.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, double x) {
        _cairo_rectangle.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


