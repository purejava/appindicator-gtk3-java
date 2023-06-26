// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GtkRequestedSize {
 *     gpointer data;
 *     gint minimum_size;
 *     gint natural_size;
 * };
 * }
 */
public class _GtkRequestedSize {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_INT$LAYOUT.withName("minimum_size"),
        Constants$root.C_INT$LAYOUT.withName("natural_size")
    ).withName("_GtkRequestedSize");
    public static MemoryLayout $LAYOUT() {
        return _GtkRequestedSize.$struct$LAYOUT;
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return _GtkRequestedSize.data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer data;
     * }
     */
    public static MemorySegment data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkRequestedSize.data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer data;
     * }
     */
    public static void data$set(MemorySegment seg, MemorySegment x) {
        _GtkRequestedSize.data$VH.set(seg, x);
    }
    public static MemorySegment data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkRequestedSize.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkRequestedSize.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle minimum_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("minimum_size"));
    public static VarHandle minimum_size$VH() {
        return _GtkRequestedSize.minimum_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint minimum_size;
     * }
     */
    public static int minimum_size$get(MemorySegment seg) {
        return (int)_GtkRequestedSize.minimum_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint minimum_size;
     * }
     */
    public static void minimum_size$set(MemorySegment seg, int x) {
        _GtkRequestedSize.minimum_size$VH.set(seg, x);
    }
    public static int minimum_size$get(MemorySegment seg, long index) {
        return (int)_GtkRequestedSize.minimum_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void minimum_size$set(MemorySegment seg, long index, int x) {
        _GtkRequestedSize.minimum_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle natural_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("natural_size"));
    public static VarHandle natural_size$VH() {
        return _GtkRequestedSize.natural_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint natural_size;
     * }
     */
    public static int natural_size$get(MemorySegment seg) {
        return (int)_GtkRequestedSize.natural_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint natural_size;
     * }
     */
    public static void natural_size$set(MemorySegment seg, int x) {
        _GtkRequestedSize.natural_size$VH.set(seg, x);
    }
    public static int natural_size$get(MemorySegment seg, long index) {
        return (int)_GtkRequestedSize.natural_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void natural_size$set(MemorySegment seg, long index, int x) {
        _GtkRequestedSize.natural_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

