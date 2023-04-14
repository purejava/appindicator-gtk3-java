// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GdkEventSetting {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("window"),
        Constants$root.C_CHAR$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_INT$LAYOUT.withName("action"),
        Constants$root.C_POINTER$LAYOUT.withName("name")
    ).withName("_GdkEventSetting");
    public static MemoryLayout $LAYOUT() {
        return _GdkEventSetting.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GdkEventSetting.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)_GdkEventSetting.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        _GdkEventSetting.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GdkEventSetting.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GdkEventSetting.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return _GdkEventSetting.window$VH;
    }
    public static MemoryAddress window$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GdkEventSetting.window$VH.get(seg);
    }
    public static void window$set( MemorySegment seg, MemoryAddress x) {
        _GdkEventSetting.window$VH.set(seg, x);
    }
    public static MemoryAddress window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GdkEventSetting.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemoryAddress x) {
        _GdkEventSetting.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return _GdkEventSetting.send_event$VH;
    }
    public static byte send_event$get(MemorySegment seg) {
        return (byte)_GdkEventSetting.send_event$VH.get(seg);
    }
    public static void send_event$set( MemorySegment seg, byte x) {
        _GdkEventSetting.send_event$VH.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)_GdkEventSetting.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        _GdkEventSetting.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle action$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("action"));
    public static VarHandle action$VH() {
        return _GdkEventSetting.action$VH;
    }
    public static int action$get(MemorySegment seg) {
        return (int)_GdkEventSetting.action$VH.get(seg);
    }
    public static void action$set( MemorySegment seg, int x) {
        _GdkEventSetting.action$VH.set(seg, x);
    }
    public static int action$get(MemorySegment seg, long index) {
        return (int)_GdkEventSetting.action$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void action$set(MemorySegment seg, long index, int x) {
        _GdkEventSetting.action$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("name"));
    public static VarHandle name$VH() {
        return _GdkEventSetting.name$VH;
    }
    public static MemoryAddress name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GdkEventSetting.name$VH.get(seg);
    }
    public static void name$set( MemorySegment seg, MemoryAddress x) {
        _GdkEventSetting.name$VH.set(seg, x);
    }
    public static MemoryAddress name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GdkEventSetting.name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemoryAddress x) {
        _GdkEventSetting.name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

