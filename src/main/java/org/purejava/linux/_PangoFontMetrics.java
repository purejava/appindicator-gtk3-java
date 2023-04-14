// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PangoFontMetrics {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("ref_count"),
        Constants$root.C_INT$LAYOUT.withName("ascent"),
        Constants$root.C_INT$LAYOUT.withName("descent"),
        Constants$root.C_INT$LAYOUT.withName("height"),
        Constants$root.C_INT$LAYOUT.withName("approximate_char_width"),
        Constants$root.C_INT$LAYOUT.withName("approximate_digit_width"),
        Constants$root.C_INT$LAYOUT.withName("underline_position"),
        Constants$root.C_INT$LAYOUT.withName("underline_thickness"),
        Constants$root.C_INT$LAYOUT.withName("strikethrough_position"),
        Constants$root.C_INT$LAYOUT.withName("strikethrough_thickness")
    ).withName("_PangoFontMetrics");
    public static MemoryLayout $LAYOUT() {
        return _PangoFontMetrics.$struct$LAYOUT;
    }
    static final VarHandle ref_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_count"));
    public static VarHandle ref_count$VH() {
        return _PangoFontMetrics.ref_count$VH;
    }
    public static int ref_count$get(MemorySegment seg) {
        return (int)_PangoFontMetrics.ref_count$VH.get(seg);
    }
    public static void ref_count$set( MemorySegment seg, int x) {
        _PangoFontMetrics.ref_count$VH.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)_PangoFontMetrics.ref_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        _PangoFontMetrics.ref_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ascent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ascent"));
    public static VarHandle ascent$VH() {
        return _PangoFontMetrics.ascent$VH;
    }
    public static int ascent$get(MemorySegment seg) {
        return (int)_PangoFontMetrics.ascent$VH.get(seg);
    }
    public static void ascent$set( MemorySegment seg, int x) {
        _PangoFontMetrics.ascent$VH.set(seg, x);
    }
    public static int ascent$get(MemorySegment seg, long index) {
        return (int)_PangoFontMetrics.ascent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ascent$set(MemorySegment seg, long index, int x) {
        _PangoFontMetrics.ascent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle descent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("descent"));
    public static VarHandle descent$VH() {
        return _PangoFontMetrics.descent$VH;
    }
    public static int descent$get(MemorySegment seg) {
        return (int)_PangoFontMetrics.descent$VH.get(seg);
    }
    public static void descent$set( MemorySegment seg, int x) {
        _PangoFontMetrics.descent$VH.set(seg, x);
    }
    public static int descent$get(MemorySegment seg, long index) {
        return (int)_PangoFontMetrics.descent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void descent$set(MemorySegment seg, long index, int x) {
        _PangoFontMetrics.descent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return _PangoFontMetrics.height$VH;
    }
    public static int height$get(MemorySegment seg) {
        return (int)_PangoFontMetrics.height$VH.get(seg);
    }
    public static void height$set( MemorySegment seg, int x) {
        _PangoFontMetrics.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)_PangoFontMetrics.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        _PangoFontMetrics.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle approximate_char_width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("approximate_char_width"));
    public static VarHandle approximate_char_width$VH() {
        return _PangoFontMetrics.approximate_char_width$VH;
    }
    public static int approximate_char_width$get(MemorySegment seg) {
        return (int)_PangoFontMetrics.approximate_char_width$VH.get(seg);
    }
    public static void approximate_char_width$set( MemorySegment seg, int x) {
        _PangoFontMetrics.approximate_char_width$VH.set(seg, x);
    }
    public static int approximate_char_width$get(MemorySegment seg, long index) {
        return (int)_PangoFontMetrics.approximate_char_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void approximate_char_width$set(MemorySegment seg, long index, int x) {
        _PangoFontMetrics.approximate_char_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle approximate_digit_width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("approximate_digit_width"));
    public static VarHandle approximate_digit_width$VH() {
        return _PangoFontMetrics.approximate_digit_width$VH;
    }
    public static int approximate_digit_width$get(MemorySegment seg) {
        return (int)_PangoFontMetrics.approximate_digit_width$VH.get(seg);
    }
    public static void approximate_digit_width$set( MemorySegment seg, int x) {
        _PangoFontMetrics.approximate_digit_width$VH.set(seg, x);
    }
    public static int approximate_digit_width$get(MemorySegment seg, long index) {
        return (int)_PangoFontMetrics.approximate_digit_width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void approximate_digit_width$set(MemorySegment seg, long index, int x) {
        _PangoFontMetrics.approximate_digit_width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle underline_position$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("underline_position"));
    public static VarHandle underline_position$VH() {
        return _PangoFontMetrics.underline_position$VH;
    }
    public static int underline_position$get(MemorySegment seg) {
        return (int)_PangoFontMetrics.underline_position$VH.get(seg);
    }
    public static void underline_position$set( MemorySegment seg, int x) {
        _PangoFontMetrics.underline_position$VH.set(seg, x);
    }
    public static int underline_position$get(MemorySegment seg, long index) {
        return (int)_PangoFontMetrics.underline_position$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void underline_position$set(MemorySegment seg, long index, int x) {
        _PangoFontMetrics.underline_position$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle underline_thickness$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("underline_thickness"));
    public static VarHandle underline_thickness$VH() {
        return _PangoFontMetrics.underline_thickness$VH;
    }
    public static int underline_thickness$get(MemorySegment seg) {
        return (int)_PangoFontMetrics.underline_thickness$VH.get(seg);
    }
    public static void underline_thickness$set( MemorySegment seg, int x) {
        _PangoFontMetrics.underline_thickness$VH.set(seg, x);
    }
    public static int underline_thickness$get(MemorySegment seg, long index) {
        return (int)_PangoFontMetrics.underline_thickness$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void underline_thickness$set(MemorySegment seg, long index, int x) {
        _PangoFontMetrics.underline_thickness$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle strikethrough_position$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("strikethrough_position"));
    public static VarHandle strikethrough_position$VH() {
        return _PangoFontMetrics.strikethrough_position$VH;
    }
    public static int strikethrough_position$get(MemorySegment seg) {
        return (int)_PangoFontMetrics.strikethrough_position$VH.get(seg);
    }
    public static void strikethrough_position$set( MemorySegment seg, int x) {
        _PangoFontMetrics.strikethrough_position$VH.set(seg, x);
    }
    public static int strikethrough_position$get(MemorySegment seg, long index) {
        return (int)_PangoFontMetrics.strikethrough_position$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void strikethrough_position$set(MemorySegment seg, long index, int x) {
        _PangoFontMetrics.strikethrough_position$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle strikethrough_thickness$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("strikethrough_thickness"));
    public static VarHandle strikethrough_thickness$VH() {
        return _PangoFontMetrics.strikethrough_thickness$VH;
    }
    public static int strikethrough_thickness$get(MemorySegment seg) {
        return (int)_PangoFontMetrics.strikethrough_thickness$VH.get(seg);
    }
    public static void strikethrough_thickness$set( MemorySegment seg, int x) {
        _PangoFontMetrics.strikethrough_thickness$VH.set(seg, x);
    }
    public static int strikethrough_thickness$get(MemorySegment seg, long index) {
        return (int)_PangoFontMetrics.strikethrough_thickness$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void strikethrough_thickness$set(MemorySegment seg, long index, int x) {
        _PangoFontMetrics.strikethrough_thickness$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

