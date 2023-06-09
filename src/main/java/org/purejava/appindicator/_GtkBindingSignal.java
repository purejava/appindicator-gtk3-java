// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GtkBindingSignal {
 *     GtkBindingSignal* next;
 *     gchar* signal_name;
 *     guint n_args;
 *     GtkBindingArg* args;
 * };
 * }
 */
public class _GtkBindingSignal {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("next"),
        Constants$root.C_POINTER$LAYOUT.withName("signal_name"),
        Constants$root.C_INT$LAYOUT.withName("n_args"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("args")
    ).withName("_GtkBindingSignal");
    public static MemoryLayout $LAYOUT() {
        return _GtkBindingSignal.$struct$LAYOUT;
    }
    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return _GtkBindingSignal.next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkBindingSignal* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSignal.next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkBindingSignal* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingSignal.next$VH.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSignal.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingSignal.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle signal_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("signal_name"));
    public static VarHandle signal_name$VH() {
        return _GtkBindingSignal.signal_name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* signal_name;
     * }
     */
    public static MemorySegment signal_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSignal.signal_name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* signal_name;
     * }
     */
    public static void signal_name$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingSignal.signal_name$VH.set(seg, x);
    }
    public static MemorySegment signal_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSignal.signal_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void signal_name$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingSignal.signal_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle n_args$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("n_args"));
    public static VarHandle n_args$VH() {
        return _GtkBindingSignal.n_args$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint n_args;
     * }
     */
    public static int n_args$get(MemorySegment seg) {
        return (int)_GtkBindingSignal.n_args$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint n_args;
     * }
     */
    public static void n_args$set(MemorySegment seg, int x) {
        _GtkBindingSignal.n_args$VH.set(seg, x);
    }
    public static int n_args$get(MemorySegment seg, long index) {
        return (int)_GtkBindingSignal.n_args$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n_args$set(MemorySegment seg, long index, int x) {
        _GtkBindingSignal.n_args$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle args$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("args"));
    public static VarHandle args$VH() {
        return _GtkBindingSignal.args$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkBindingArg* args;
     * }
     */
    public static MemorySegment args$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSignal.args$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkBindingArg* args;
     * }
     */
    public static void args$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingSignal.args$VH.set(seg, x);
    }
    public static MemorySegment args$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSignal.args$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void args$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingSignal.args$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


