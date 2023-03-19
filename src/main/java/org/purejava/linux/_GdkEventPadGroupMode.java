// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GdkEventPadGroupMode {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("window"),
        Constants$root.C_CHAR$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_INT$LAYOUT.withName("time"),
        Constants$root.C_INT$LAYOUT.withName("group"),
        Constants$root.C_INT$LAYOUT.withName("mode")
    ).withName("_GdkEventPadGroupMode");
    public static MemoryLayout $LAYOUT() {
        return _GdkEventPadGroupMode.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GdkEventPadGroupMode.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)_GdkEventPadGroupMode.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        _GdkEventPadGroupMode.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GdkEventPadGroupMode.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GdkEventPadGroupMode.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return _GdkEventPadGroupMode.window$VH;
    }
    public static MemoryAddress window$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GdkEventPadGroupMode.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, MemoryAddress x) {
        _GdkEventPadGroupMode.window$VH.set(seg, x);
    }
    public static MemoryAddress window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GdkEventPadGroupMode.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemoryAddress x) {
        _GdkEventPadGroupMode.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return _GdkEventPadGroupMode.send_event$VH;
    }
    public static byte send_event$get(MemorySegment seg) {
        return (byte)_GdkEventPadGroupMode.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, byte x) {
        _GdkEventPadGroupMode.send_event$VH.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)_GdkEventPadGroupMode.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        _GdkEventPadGroupMode.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return _GdkEventPadGroupMode.time$VH;
    }
    public static int time$get(MemorySegment seg) {
        return (int)_GdkEventPadGroupMode.time$VH.get(seg);
    }
    public static void time$set( MemorySegment seg, int x) {
        _GdkEventPadGroupMode.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)_GdkEventPadGroupMode.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        _GdkEventPadGroupMode.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle group$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("group"));
    public static VarHandle group$VH() {
        return _GdkEventPadGroupMode.group$VH;
    }
    public static int group$get(MemorySegment seg) {
        return (int)_GdkEventPadGroupMode.group$VH.get(seg);
    }
    public static void group$set( MemorySegment seg, int x) {
        _GdkEventPadGroupMode.group$VH.set(seg, x);
    }
    public static int group$get(MemorySegment seg, long index) {
        return (int)_GdkEventPadGroupMode.group$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void group$set(MemorySegment seg, long index, int x) {
        _GdkEventPadGroupMode.group$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mode"));
    public static VarHandle mode$VH() {
        return _GdkEventPadGroupMode.mode$VH;
    }
    public static int mode$get(MemorySegment seg) {
        return (int)_GdkEventPadGroupMode.mode$VH.get(seg);
    }
    public static void mode$set( MemorySegment seg, int x) {
        _GdkEventPadGroupMode.mode$VH.set(seg, x);
    }
    public static int mode$get(MemorySegment seg, long index) {
        return (int)_GdkEventPadGroupMode.mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mode$set(MemorySegment seg, long index, int x) {
        _GdkEventPadGroupMode.mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


