// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkBindingSet {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("set_name"),
        Constants$root.C_INT$LAYOUT.withName("priority"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("widget_path_pspecs"),
        Constants$root.C_POINTER$LAYOUT.withName("widget_class_pspecs"),
        Constants$root.C_POINTER$LAYOUT.withName("class_branch_pspecs"),
        Constants$root.C_POINTER$LAYOUT.withName("entries"),
        Constants$root.C_POINTER$LAYOUT.withName("current"),
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(1).withName("parsed"),
            MemoryLayout.paddingLayout(63)
        )
    ).withName("_GtkBindingSet");
    public static MemoryLayout $LAYOUT() {
        return _GtkBindingSet.$struct$LAYOUT;
    }
    static final VarHandle set_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_name"));
    public static VarHandle set_name$VH() {
        return _GtkBindingSet.set_name$VH;
    }
    public static MemoryAddress set_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.set_name$VH.get(seg);
    }
    public static void set_name$set( MemorySegment seg, MemoryAddress x) {
        _GtkBindingSet.set_name$VH.set(seg, x);
    }
    public static MemoryAddress set_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.set_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBindingSet.set_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle priority$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("priority"));
    public static VarHandle priority$VH() {
        return _GtkBindingSet.priority$VH;
    }
    public static int priority$get(MemorySegment seg) {
        return (int)_GtkBindingSet.priority$VH.get(seg);
    }
    public static void priority$set( MemorySegment seg, int x) {
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
    public static MemoryAddress widget_path_pspecs$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.widget_path_pspecs$VH.get(seg);
    }
    public static void widget_path_pspecs$set( MemorySegment seg, MemoryAddress x) {
        _GtkBindingSet.widget_path_pspecs$VH.set(seg, x);
    }
    public static MemoryAddress widget_path_pspecs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.widget_path_pspecs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void widget_path_pspecs$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBindingSet.widget_path_pspecs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle widget_class_pspecs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("widget_class_pspecs"));
    public static VarHandle widget_class_pspecs$VH() {
        return _GtkBindingSet.widget_class_pspecs$VH;
    }
    public static MemoryAddress widget_class_pspecs$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.widget_class_pspecs$VH.get(seg);
    }
    public static void widget_class_pspecs$set( MemorySegment seg, MemoryAddress x) {
        _GtkBindingSet.widget_class_pspecs$VH.set(seg, x);
    }
    public static MemoryAddress widget_class_pspecs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.widget_class_pspecs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void widget_class_pspecs$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBindingSet.widget_class_pspecs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle class_branch_pspecs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("class_branch_pspecs"));
    public static VarHandle class_branch_pspecs$VH() {
        return _GtkBindingSet.class_branch_pspecs$VH;
    }
    public static MemoryAddress class_branch_pspecs$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.class_branch_pspecs$VH.get(seg);
    }
    public static void class_branch_pspecs$set( MemorySegment seg, MemoryAddress x) {
        _GtkBindingSet.class_branch_pspecs$VH.set(seg, x);
    }
    public static MemoryAddress class_branch_pspecs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.class_branch_pspecs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void class_branch_pspecs$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBindingSet.class_branch_pspecs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle entries$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("entries"));
    public static VarHandle entries$VH() {
        return _GtkBindingSet.entries$VH;
    }
    public static MemoryAddress entries$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.entries$VH.get(seg);
    }
    public static void entries$set( MemorySegment seg, MemoryAddress x) {
        _GtkBindingSet.entries$VH.set(seg, x);
    }
    public static MemoryAddress entries$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.entries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void entries$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBindingSet.entries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle current$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("current"));
    public static VarHandle current$VH() {
        return _GtkBindingSet.current$VH;
    }
    public static MemoryAddress current$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.current$VH.get(seg);
    }
    public static void current$set( MemorySegment seg, MemoryAddress x) {
        _GtkBindingSet.current$VH.set(seg, x);
    }
    public static MemoryAddress current$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkBindingSet.current$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void current$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkBindingSet.current$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

