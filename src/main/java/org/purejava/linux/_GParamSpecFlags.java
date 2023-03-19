// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GParamSpecFlags {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("g_class")
            ).withName("g_type_instance"),
            Constants$root.C_POINTER$LAYOUT.withName("name"),
            Constants$root.C_INT$LAYOUT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_LONG_LONG$LAYOUT.withName("value_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("owner_type"),
            Constants$root.C_POINTER$LAYOUT.withName("_nick"),
            Constants$root.C_POINTER$LAYOUT.withName("_blurb"),
            Constants$root.C_POINTER$LAYOUT.withName("qdata"),
            Constants$root.C_INT$LAYOUT.withName("ref_count"),
            Constants$root.C_INT$LAYOUT.withName("param_id")
        ).withName("parent_instance"),
        Constants$root.C_POINTER$LAYOUT.withName("flags_class"),
        Constants$root.C_INT$LAYOUT.withName("default_value"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GParamSpecFlags");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecFlags.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    static final VarHandle flags_class$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags_class"));
    public static VarHandle flags_class$VH() {
        return _GParamSpecFlags.flags_class$VH;
    }
    public static MemoryAddress flags_class$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GParamSpecFlags.flags_class$VH.get(seg);
    }
    public static void flags_class$set( MemorySegment seg, MemoryAddress x) {
        _GParamSpecFlags.flags_class$VH.set(seg, x);
    }
    public static MemoryAddress flags_class$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GParamSpecFlags.flags_class$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags_class$set(MemorySegment seg, long index, MemoryAddress x) {
        _GParamSpecFlags.flags_class$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle default_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("default_value"));
    public static VarHandle default_value$VH() {
        return _GParamSpecFlags.default_value$VH;
    }
    public static int default_value$get(MemorySegment seg) {
        return (int)_GParamSpecFlags.default_value$VH.get(seg);
    }
    public static void default_value$set( MemorySegment seg, int x) {
        _GParamSpecFlags.default_value$VH.set(seg, x);
    }
    public static int default_value$get(MemorySegment seg, long index) {
        return (int)_GParamSpecFlags.default_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void default_value$set(MemorySegment seg, long index, int x) {
        _GParamSpecFlags.default_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


