// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GtkActionEntry {
 *     const gchar* name;
 *     const gchar* stock_id;
 *     const gchar* label;
 *     const gchar* accelerator;
 *     const gchar* tooltip;
 *     GCallback callback;
 * };
 * }
 */
public class _GtkActionEntry {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_POINTER$LAYOUT.withName("stock_id"),
        Constants$root.C_POINTER$LAYOUT.withName("label"),
        Constants$root.C_POINTER$LAYOUT.withName("accelerator"),
        Constants$root.C_POINTER$LAYOUT.withName("tooltip"),
        Constants$root.C_POINTER$LAYOUT.withName("callback")
    ).withName("_GtkActionEntry");
    public static MemoryLayout $LAYOUT() {
        return _GtkActionEntry.$struct$LAYOUT;
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _GtkActionEntry.name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        _GtkActionEntry.name$VH.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkActionEntry.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle stock_id$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("stock_id"));
    public static VarHandle stock_id$VH() {
        return _GtkActionEntry.stock_id$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* stock_id;
     * }
     */
    public static MemorySegment stock_id$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.stock_id$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* stock_id;
     * }
     */
    public static void stock_id$set(MemorySegment seg, MemorySegment x) {
        _GtkActionEntry.stock_id$VH.set(seg, x);
    }
    public static MemorySegment stock_id$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.stock_id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void stock_id$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkActionEntry.stock_id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle label$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("label"));
    public static VarHandle label$VH() {
        return _GtkActionEntry.label$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* label;
     * }
     */
    public static MemorySegment label$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.label$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* label;
     * }
     */
    public static void label$set(MemorySegment seg, MemorySegment x) {
        _GtkActionEntry.label$VH.set(seg, x);
    }
    public static MemorySegment label$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.label$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void label$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkActionEntry.label$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle accelerator$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("accelerator"));
    public static VarHandle accelerator$VH() {
        return _GtkActionEntry.accelerator$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* accelerator;
     * }
     */
    public static MemorySegment accelerator$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.accelerator$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* accelerator;
     * }
     */
    public static void accelerator$set(MemorySegment seg, MemorySegment x) {
        _GtkActionEntry.accelerator$VH.set(seg, x);
    }
    public static MemorySegment accelerator$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.accelerator$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void accelerator$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkActionEntry.accelerator$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tooltip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tooltip"));
    public static VarHandle tooltip$VH() {
        return _GtkActionEntry.tooltip$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* tooltip;
     * }
     */
    public static MemorySegment tooltip$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.tooltip$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* tooltip;
     * }
     */
    public static void tooltip$set(MemorySegment seg, MemorySegment x) {
        _GtkActionEntry.tooltip$VH.set(seg, x);
    }
    public static MemorySegment tooltip$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.tooltip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tooltip$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkActionEntry.tooltip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle callback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("callback"));
    public static VarHandle callback$VH() {
        return _GtkActionEntry.callback$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GCallback callback;
     * }
     */
    public static MemorySegment callback$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.callback$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GCallback callback;
     * }
     */
    public static void callback$set(MemorySegment seg, MemorySegment x) {
        _GtkActionEntry.callback$VH.set(seg, x);
    }
    public static MemorySegment callback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkActionEntry.callback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void callback$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkActionEntry.callback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GCallback callback(MemorySegment segment, SegmentScope scope) {
        return GCallback.ofAddress(callback$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

