// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class cairo_glyph_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("index"),
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y")
    );
    public static MemoryLayout $LAYOUT() {
        return cairo_glyph_t.$struct$LAYOUT;
    }
    static final VarHandle index$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("index"));
    public static VarHandle index$VH() {
        return cairo_glyph_t.index$VH;
    }
    public static long index$get(MemorySegment seg) {
        return (long)cairo_glyph_t.index$VH.get(seg);
    }
    public static void index$set( MemorySegment seg, long x) {
        cairo_glyph_t.index$VH.set(seg, x);
    }
    public static long index$get(MemorySegment seg, long index) {
        return (long)cairo_glyph_t.index$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void index$set(MemorySegment seg, long index, long x) {
        cairo_glyph_t.index$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return cairo_glyph_t.x$VH;
    }
    public static double x$get(MemorySegment seg) {
        return (double)cairo_glyph_t.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, double x) {
        cairo_glyph_t.x$VH.set(seg, x);
    }
    public static double x$get(MemorySegment seg, long index) {
        return (double)cairo_glyph_t.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, double x) {
        cairo_glyph_t.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return cairo_glyph_t.y$VH;
    }
    public static double y$get(MemorySegment seg) {
        return (double)cairo_glyph_t.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, double x) {
        cairo_glyph_t.y$VH.set(seg, x);
    }
    public static double y$get(MemorySegment seg, long index) {
        return (double)cairo_glyph_t.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, double x) {
        cairo_glyph_t.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


