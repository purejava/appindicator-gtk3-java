// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GFileAttributeInfo {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("name"),
        Constants$root.C_INT$LAYOUT.withName("type"),
        Constants$root.C_INT$LAYOUT.withName("flags")
    ).withName("_GFileAttributeInfo");
    public static MemoryLayout $LAYOUT() {
        return _GFileAttributeInfo.$struct$LAYOUT;
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _GFileAttributeInfo.name$VH;
    }
    public static MemoryAddress name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GFileAttributeInfo.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, MemoryAddress x) {
        _GFileAttributeInfo.name$VH.set(seg, x);
    }
    public static MemoryAddress name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GFileAttributeInfo.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GFileAttributeInfo.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GFileAttributeInfo.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)_GFileAttributeInfo.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        _GFileAttributeInfo.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GFileAttributeInfo.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GFileAttributeInfo.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return _GFileAttributeInfo.flags$VH;
    }
    public static int flags$get(MemorySegment seg) {
        return (int)_GFileAttributeInfo.flags$VH.get(seg);
    }
    public static void flags$set( MemorySegment seg, int x) {
        _GFileAttributeInfo.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)_GFileAttributeInfo.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        _GFileAttributeInfo.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

