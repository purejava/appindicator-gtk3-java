// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _AtkRectangle {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("x"),
        Constants$root.C_INT$LAYOUT.withName("y"),
        Constants$root.C_INT$LAYOUT.withName("width"),
        Constants$root.C_INT$LAYOUT.withName("height")
    ).withName("_AtkRectangle");
    public static MemoryLayout $LAYOUT() {
        return _AtkRectangle.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _AtkRectangle.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)_AtkRectangle.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        _AtkRectangle.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)_AtkRectangle.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        _AtkRectangle.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _AtkRectangle.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)_AtkRectangle.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        _AtkRectangle.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)_AtkRectangle.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        _AtkRectangle.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return _AtkRectangle.width$VH;
    }
    public static int width$get(MemorySegment seg) {
        return (int)_AtkRectangle.width$VH.get(seg);
    }
    public static void width$set( MemorySegment seg, int x) {
        _AtkRectangle.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)_AtkRectangle.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        _AtkRectangle.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return _AtkRectangle.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)_AtkRectangle.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        _AtkRectangle.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)_AtkRectangle.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        _AtkRectangle.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


