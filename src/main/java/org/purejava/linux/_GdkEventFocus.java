// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GdkEventFocus {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("window"),
        Constants$root.C_CHAR$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(8),
        Constants$root.C_SHORT$LAYOUT.withName("in"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GdkEventFocus");
    public static MemoryLayout $LAYOUT() {
        return _GdkEventFocus.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GdkEventFocus.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)_GdkEventFocus.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        _GdkEventFocus.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GdkEventFocus.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GdkEventFocus.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return _GdkEventFocus.window$VH;
    }
    public static MemoryAddress window$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GdkEventFocus.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, MemoryAddress x) {
        _GdkEventFocus.window$VH.set(seg, x);
    }
    public static MemoryAddress window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GdkEventFocus.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemoryAddress x) {
        _GdkEventFocus.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return _GdkEventFocus.send_event$VH;
    }
    public static byte send_event$get(MemorySegment seg) {
        return (byte)_GdkEventFocus.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, byte x) {
        _GdkEventFocus.send_event$VH.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)_GdkEventFocus.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        _GdkEventFocus.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle in$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("in"));
    public static VarHandle in$VH() {
        return _GdkEventFocus.in$VH;
    }
    public static short in$get(MemorySegment seg) {
        return (short)_GdkEventFocus.in$VH.get(seg);
    }
    public static void in$set( MemorySegment seg, short x) {
        _GdkEventFocus.in$VH.set(seg, x);
    }
    public static short in$get(MemorySegment seg, long index) {
        return (short)_GdkEventFocus.in$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void in$set(MemorySegment seg, long index, short x) {
        _GdkEventFocus.in$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


