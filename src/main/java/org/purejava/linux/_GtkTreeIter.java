// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkTreeIter {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("stamp"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("user_data"),
        Constants$root.C_POINTER$LAYOUT.withName("user_data2"),
        Constants$root.C_POINTER$LAYOUT.withName("user_data3")
    ).withName("_GtkTreeIter");
    public static MemoryLayout $LAYOUT() {
        return _GtkTreeIter.$struct$LAYOUT;
    }
    static final VarHandle stamp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("stamp"));
    public static VarHandle stamp$VH() {
        return _GtkTreeIter.stamp$VH;
    }
    public static int stamp$get(MemorySegment seg) {
        return (int)_GtkTreeIter.stamp$VH.get(seg);
    }
    public static void stamp$set( MemorySegment seg, int x) {
        _GtkTreeIter.stamp$VH.set(seg, x);
    }
    public static int stamp$get(MemorySegment seg, long index) {
        return (int)_GtkTreeIter.stamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void stamp$set(MemorySegment seg, long index, int x) {
        _GtkTreeIter.stamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle user_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("user_data"));
    public static VarHandle user_data$VH() {
        return _GtkTreeIter.user_data$VH;
    }
    public static MemoryAddress user_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkTreeIter.user_data$VH.get(seg);
    }
    public static void user_data$set( MemorySegment seg, MemoryAddress x) {
        _GtkTreeIter.user_data$VH.set(seg, x);
    }
    public static MemoryAddress user_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkTreeIter.user_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void user_data$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTreeIter.user_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle user_data2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("user_data2"));
    public static VarHandle user_data2$VH() {
        return _GtkTreeIter.user_data2$VH;
    }
    public static MemoryAddress user_data2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkTreeIter.user_data2$VH.get(seg);
    }
    public static void user_data2$set( MemorySegment seg, MemoryAddress x) {
        _GtkTreeIter.user_data2$VH.set(seg, x);
    }
    public static MemoryAddress user_data2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkTreeIter.user_data2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void user_data2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTreeIter.user_data2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle user_data3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("user_data3"));
    public static VarHandle user_data3$VH() {
        return _GtkTreeIter.user_data3$VH;
    }
    public static MemoryAddress user_data3$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkTreeIter.user_data3$VH.get(seg);
    }
    public static void user_data3$set( MemorySegment seg, MemoryAddress x) {
        _GtkTreeIter.user_data3$VH.set(seg, x);
    }
    public static MemoryAddress user_data3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkTreeIter.user_data3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void user_data3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkTreeIter.user_data3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

