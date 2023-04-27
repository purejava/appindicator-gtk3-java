// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoLayoutLine {
 *     PangoLayout* layout;
 *     gint start_index;
 *     gint length;
 *     GSList* runs;
 *      *     guint is_paragraph_start;
 *     guint resolved_dir;
 * };
 * }
 */
public class _PangoLayoutLine {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("layout"),
        Constants$root.C_INT$LAYOUT.withName("start_index"),
        Constants$root.C_INT$LAYOUT.withName("length"),
        Constants$root.C_POINTER$LAYOUT.withName("runs"),
        MemoryLayout.paddingLayout(64)
    ).withName("_PangoLayoutLine");
    public static MemoryLayout $LAYOUT() {
        return _PangoLayoutLine.$struct$LAYOUT;
    }
    static final VarHandle layout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("layout"));
    public static VarHandle layout$VH() {
        return _PangoLayoutLine.layout$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoLayout* layout;
     * }
     */
    public static MemorySegment layout$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoLayoutLine.layout$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoLayout* layout;
     * }
     */
    public static void layout$set(MemorySegment seg, MemorySegment x) {
        _PangoLayoutLine.layout$VH.set(seg, x);
    }
    public static MemorySegment layout$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoLayoutLine.layout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void layout$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoLayoutLine.layout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle start_index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("start_index"));
    public static VarHandle start_index$VH() {
        return _PangoLayoutLine.start_index$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint start_index;
     * }
     */
    public static int start_index$get(MemorySegment seg) {
        return (int)_PangoLayoutLine.start_index$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint start_index;
     * }
     */
    public static void start_index$set(MemorySegment seg, int x) {
        _PangoLayoutLine.start_index$VH.set(seg, x);
    }
    public static int start_index$get(MemorySegment seg, long index) {
        return (int)_PangoLayoutLine.start_index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void start_index$set(MemorySegment seg, long index, int x) {
        _PangoLayoutLine.start_index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return _PangoLayoutLine.length$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)_PangoLayoutLine.length$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        _PangoLayoutLine.length$VH.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)_PangoLayoutLine.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        _PangoLayoutLine.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle runs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("runs"));
    public static VarHandle runs$VH() {
        return _PangoLayoutLine.runs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSList* runs;
     * }
     */
    public static MemorySegment runs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoLayoutLine.runs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSList* runs;
     * }
     */
    public static void runs$set(MemorySegment seg, MemorySegment x) {
        _PangoLayoutLine.runs$VH.set(seg, x);
    }
    public static MemorySegment runs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoLayoutLine.runs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void runs$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoLayoutLine.runs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


