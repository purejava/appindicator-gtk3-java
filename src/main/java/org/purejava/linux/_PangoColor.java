// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PangoColor {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("red"),
        Constants$root.C_SHORT$LAYOUT.withName("green"),
        Constants$root.C_SHORT$LAYOUT.withName("blue")
    ).withName("_PangoColor");
    public static MemoryLayout $LAYOUT() {
        return _PangoColor.$struct$LAYOUT;
    }
    static final VarHandle red$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("red"));
    public static VarHandle red$VH() {
        return _PangoColor.red$VH;
    }
    public static short red$get(MemorySegment seg) {
        return (short)_PangoColor.red$VH.get(seg);
    }
    public static void red$set( MemorySegment seg, short x) {
        _PangoColor.red$VH.set(seg, x);
    }
    public static short red$get(MemorySegment seg, long index) {
        return (short)_PangoColor.red$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void red$set(MemorySegment seg, long index, short x) {
        _PangoColor.red$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle green$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("green"));
    public static VarHandle green$VH() {
        return _PangoColor.green$VH;
    }
    public static short green$get(MemorySegment seg) {
        return (short)_PangoColor.green$VH.get(seg);
    }
    public static void green$set( MemorySegment seg, short x) {
        _PangoColor.green$VH.set(seg, x);
    }
    public static short green$get(MemorySegment seg, long index) {
        return (short)_PangoColor.green$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void green$set(MemorySegment seg, long index, short x) {
        _PangoColor.green$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle blue$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("blue"));
    public static VarHandle blue$VH() {
        return _PangoColor.blue$VH;
    }
    public static short blue$get(MemorySegment seg) {
        return (short)_PangoColor.blue$VH.get(seg);
    }
    public static void blue$set( MemorySegment seg, short x) {
        _PangoColor.blue$VH.set(seg, x);
    }
    public static short blue$get(MemorySegment seg, long index) {
        return (short)_PangoColor.blue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void blue$set(MemorySegment seg, long index, short x) {
        _PangoColor.blue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

