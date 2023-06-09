// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GtkBindingSet {
 *     gchar* set_name;
 *     gint priority;
 *     GSList* widget_path_pspecs;
 *     GSList* widget_class_pspecs;
 *     GSList* class_branch_pspecs;
 *     GtkBindingEntry* entries;
 *     GtkBindingEntry* current;
 *      *     guint parsed;
 * };
 * }
 */
public class _GtkBindingSet {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("set_name"),
        Constants$root.C_INT$LAYOUT.withName("priority"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("widget_path_pspecs"),
        Constants$root.C_POINTER$LAYOUT.withName("widget_class_pspecs"),
        Constants$root.C_POINTER$LAYOUT.withName("class_branch_pspecs"),
        Constants$root.C_POINTER$LAYOUT.withName("entries"),
        Constants$root.C_POINTER$LAYOUT.withName("current"),
        MemoryLayout.paddingLayout(64)
    ).withName("_GtkBindingSet");
    public static MemoryLayout $LAYOUT() {
        return _GtkBindingSet.$struct$LAYOUT;
    }
    static final VarHandle set_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_name"));
    public static VarHandle set_name$VH() {
        return _GtkBindingSet.set_name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* set_name;
     * }
     */
    public static MemorySegment set_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.set_name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* set_name;
     * }
     */
    public static void set_name$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingSet.set_name$VH.set(seg, x);
    }
    public static MemorySegment set_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.set_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_name$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingSet.set_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle priority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priority"));
    public static VarHandle priority$VH() {
        return _GtkBindingSet.priority$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint priority;
     * }
     */
    public static int priority$get(MemorySegment seg) {
        return (int)_GtkBindingSet.priority$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint priority;
     * }
     */
    public static void priority$set(MemorySegment seg, int x) {
        _GtkBindingSet.priority$VH.set(seg, x);
    }
    public static int priority$get(MemorySegment seg, long index) {
        return (int)_GtkBindingSet.priority$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void priority$set(MemorySegment seg, long index, int x) {
        _GtkBindingSet.priority$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle widget_path_pspecs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("widget_path_pspecs"));
    public static VarHandle widget_path_pspecs$VH() {
        return _GtkBindingSet.widget_path_pspecs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSList* widget_path_pspecs;
     * }
     */
    public static MemorySegment widget_path_pspecs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.widget_path_pspecs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSList* widget_path_pspecs;
     * }
     */
    public static void widget_path_pspecs$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingSet.widget_path_pspecs$VH.set(seg, x);
    }
    public static MemorySegment widget_path_pspecs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.widget_path_pspecs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void widget_path_pspecs$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingSet.widget_path_pspecs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle widget_class_pspecs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("widget_class_pspecs"));
    public static VarHandle widget_class_pspecs$VH() {
        return _GtkBindingSet.widget_class_pspecs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSList* widget_class_pspecs;
     * }
     */
    public static MemorySegment widget_class_pspecs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.widget_class_pspecs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSList* widget_class_pspecs;
     * }
     */
    public static void widget_class_pspecs$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingSet.widget_class_pspecs$VH.set(seg, x);
    }
    public static MemorySegment widget_class_pspecs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.widget_class_pspecs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void widget_class_pspecs$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingSet.widget_class_pspecs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle class_branch_pspecs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("class_branch_pspecs"));
    public static VarHandle class_branch_pspecs$VH() {
        return _GtkBindingSet.class_branch_pspecs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSList* class_branch_pspecs;
     * }
     */
    public static MemorySegment class_branch_pspecs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.class_branch_pspecs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSList* class_branch_pspecs;
     * }
     */
    public static void class_branch_pspecs$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingSet.class_branch_pspecs$VH.set(seg, x);
    }
    public static MemorySegment class_branch_pspecs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.class_branch_pspecs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void class_branch_pspecs$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingSet.class_branch_pspecs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("entries"));
    public static VarHandle entries$VH() {
        return _GtkBindingSet.entries$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkBindingEntry* entries;
     * }
     */
    public static MemorySegment entries$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.entries$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkBindingEntry* entries;
     * }
     */
    public static void entries$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingSet.entries$VH.set(seg, x);
    }
    public static MemorySegment entries$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void entries$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingSet.entries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle current$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("current"));
    public static VarHandle current$VH() {
        return _GtkBindingSet.current$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkBindingEntry* current;
     * }
     */
    public static MemorySegment current$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.current$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkBindingEntry* current;
     * }
     */
    public static void current$set(MemorySegment seg, MemorySegment x) {
        _GtkBindingSet.current$VH.set(seg, x);
    }
    public static MemorySegment current$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkBindingSet.current$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void current$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkBindingSet.current$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


