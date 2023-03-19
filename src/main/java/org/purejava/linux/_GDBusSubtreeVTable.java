// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GDBusSubtreeVTable {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("enumerate"),
        Constants$root.C_POINTER$LAYOUT.withName("introspect"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        MemoryLayout.sequenceLayout(8, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GDBusSubtreeVTable");
    public static MemoryLayout $LAYOUT() {
        return _GDBusSubtreeVTable.$struct$LAYOUT;
    }
    static final VarHandle enumerate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("enumerate"));
    public static VarHandle enumerate$VH() {
        return _GDBusSubtreeVTable.enumerate$VH;
    }
    public static MemoryAddress enumerate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusSubtreeVTable.enumerate$VH.get(seg);
    }
    public static void enumerate$set( MemorySegment seg, MemoryAddress x) {
        _GDBusSubtreeVTable.enumerate$VH.set(seg, x);
    }
    public static MemoryAddress enumerate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusSubtreeVTable.enumerate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void enumerate$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusSubtreeVTable.enumerate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GDBusSubtreeEnumerateFunc enumerate (MemorySegment segment, MemorySession session) {
        return GDBusSubtreeEnumerateFunc.ofAddress(enumerate$get(segment), session);
    }
    static final VarHandle introspect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("introspect"));
    public static VarHandle introspect$VH() {
        return _GDBusSubtreeVTable.introspect$VH;
    }
    public static MemoryAddress introspect$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusSubtreeVTable.introspect$VH.get(seg);
    }
    public static void introspect$set( MemorySegment seg, MemoryAddress x) {
        _GDBusSubtreeVTable.introspect$VH.set(seg, x);
    }
    public static MemoryAddress introspect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusSubtreeVTable.introspect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void introspect$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusSubtreeVTable.introspect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GDBusSubtreeIntrospectFunc introspect (MemorySegment segment, MemorySession session) {
        return GDBusSubtreeIntrospectFunc.ofAddress(introspect$get(segment), session);
    }
    static final VarHandle dispatch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dispatch"));
    public static VarHandle dispatch$VH() {
        return _GDBusSubtreeVTable.dispatch$VH;
    }
    public static MemoryAddress dispatch$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusSubtreeVTable.dispatch$VH.get(seg);
    }
    public static void dispatch$set( MemorySegment seg, MemoryAddress x) {
        _GDBusSubtreeVTable.dispatch$VH.set(seg, x);
    }
    public static MemoryAddress dispatch$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusSubtreeVTable.dispatch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dispatch$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusSubtreeVTable.dispatch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GDBusSubtreeDispatchFunc dispatch (MemorySegment segment, MemorySession session) {
        return GDBusSubtreeDispatchFunc.ofAddress(dispatch$get(segment), session);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(24, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


