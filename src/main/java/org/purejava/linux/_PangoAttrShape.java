// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PangoAttrShape {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_POINTER$LAYOUT.withName("klass"),
            Constants$root.C_INT$LAYOUT.withName("start_index"),
            Constants$root.C_INT$LAYOUT.withName("end_index")
        ).withName("attr"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("x"),
            Constants$root.C_INT$LAYOUT.withName("y"),
            Constants$root.C_INT$LAYOUT.withName("width"),
            Constants$root.C_INT$LAYOUT.withName("height")
        ).withName("ink_rect"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("x"),
            Constants$root.C_INT$LAYOUT.withName("y"),
            Constants$root.C_INT$LAYOUT.withName("width"),
            Constants$root.C_INT$LAYOUT.withName("height")
        ).withName("logical_rect"),
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_POINTER$LAYOUT.withName("copy_func"),
        Constants$root.C_POINTER$LAYOUT.withName("destroy_func")
    ).withName("_PangoAttrShape");
    public static MemoryLayout $LAYOUT() {
        return _PangoAttrShape.$struct$LAYOUT;
    }
    public static MemorySegment attr$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment ink_rect$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static MemorySegment logical_rect$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return _PangoAttrShape.data$VH;
    }
    public static MemoryAddress data$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoAttrShape.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, MemoryAddress x) {
        _PangoAttrShape.data$VH.set(seg, x);
    }
    public static MemoryAddress data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoAttrShape.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoAttrShape.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle copy_func$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("copy_func"));
    public static VarHandle copy_func$VH() {
        return _PangoAttrShape.copy_func$VH;
    }
    public static MemoryAddress copy_func$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoAttrShape.copy_func$VH.get(seg);
    }
    public static void copy_func$set( MemorySegment seg, MemoryAddress x) {
        _PangoAttrShape.copy_func$VH.set(seg, x);
    }
    public static MemoryAddress copy_func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoAttrShape.copy_func$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void copy_func$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoAttrShape.copy_func$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PangoAttrDataCopyFunc copy_func (MemorySegment segment, MemorySession session) {
        return PangoAttrDataCopyFunc.ofAddress(copy_func$get(segment), session);
    }
    static final VarHandle destroy_func$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("destroy_func"));
    public static VarHandle destroy_func$VH() {
        return _PangoAttrShape.destroy_func$VH;
    }
    public static MemoryAddress destroy_func$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoAttrShape.destroy_func$VH.get(seg);
    }
    public static void destroy_func$set( MemorySegment seg, MemoryAddress x) {
        _PangoAttrShape.destroy_func$VH.set(seg, x);
    }
    public static MemoryAddress destroy_func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoAttrShape.destroy_func$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void destroy_func$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoAttrShape.destroy_func$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GDestroyNotify destroy_func (MemorySegment segment, MemorySession session) {
        return GDestroyNotify.ofAddress(destroy_func$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

