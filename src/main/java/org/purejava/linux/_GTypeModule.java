// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GTypeModule {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("g_class")
            ).withName("g_type_instance"),
            Constants$root.C_INT$LAYOUT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("qdata")
        ).withName("parent_instance"),
        Constants$root.C_INT$LAYOUT.withName("use_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("type_infos"),
        Constants$root.C_POINTER$LAYOUT.withName("interface_infos"),
        Constants$root.C_POINTER$LAYOUT.withName("name")
    ).withName("_GTypeModule");
    public static MemoryLayout $LAYOUT() {
        return _GTypeModule.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    static final VarHandle use_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("use_count"));
    public static VarHandle use_count$VH() {
        return _GTypeModule.use_count$VH;
    }
    public static int use_count$get(MemorySegment seg) {
        return (int)_GTypeModule.use_count$VH.get(seg);
    }
    public static void use_count$set( MemorySegment seg, int x) {
        _GTypeModule.use_count$VH.set(seg, x);
    }
    public static int use_count$get(MemorySegment seg, long index) {
        return (int)_GTypeModule.use_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void use_count$set(MemorySegment seg, long index, int x) {
        _GTypeModule.use_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle type_infos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type_infos"));
    public static VarHandle type_infos$VH() {
        return _GTypeModule.type_infos$VH;
    }
    public static MemoryAddress type_infos$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTypeModule.type_infos$VH.get(seg);
    }
    public static void type_infos$set( MemorySegment seg, MemoryAddress x) {
        _GTypeModule.type_infos$VH.set(seg, x);
    }
    public static MemoryAddress type_infos$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTypeModule.type_infos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type_infos$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeModule.type_infos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle interface_infos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("interface_infos"));
    public static VarHandle interface_infos$VH() {
        return _GTypeModule.interface_infos$VH;
    }
    public static MemoryAddress interface_infos$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTypeModule.interface_infos$VH.get(seg);
    }
    public static void interface_infos$set( MemorySegment seg, MemoryAddress x) {
        _GTypeModule.interface_infos$VH.set(seg, x);
    }
    public static MemoryAddress interface_infos$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTypeModule.interface_infos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void interface_infos$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeModule.interface_infos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _GTypeModule.name$VH;
    }
    public static MemoryAddress name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTypeModule.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, MemoryAddress x) {
        _GTypeModule.name$VH.set(seg, x);
    }
    public static MemoryAddress name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTypeModule.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTypeModule.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


