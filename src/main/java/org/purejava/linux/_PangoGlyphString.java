// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoGlyphString {
 *     int num_glyphs;
 *     PangoGlyphInfo* glyphs;
 *     int* log_clusters;
 *     int space;
 * };
 * }
 */
public class _PangoGlyphString {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("num_glyphs"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("glyphs"),
        Constants$root.C_POINTER$LAYOUT.withName("log_clusters"),
        Constants$root.C_INT$LAYOUT.withName("space"),
        MemoryLayout.paddingLayout(32)
    ).withName("_PangoGlyphString");
    public static MemoryLayout $LAYOUT() {
        return _PangoGlyphString.$struct$LAYOUT;
    }
    static final VarHandle num_glyphs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_glyphs"));
    public static VarHandle num_glyphs$VH() {
        return _PangoGlyphString.num_glyphs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int num_glyphs;
     * }
     */
    public static int num_glyphs$get(MemorySegment seg) {
        return (int)_PangoGlyphString.num_glyphs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int num_glyphs;
     * }
     */
    public static void num_glyphs$set(MemorySegment seg, int x) {
        _PangoGlyphString.num_glyphs$VH.set(seg, x);
    }
    public static int num_glyphs$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphString.num_glyphs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_glyphs$set(MemorySegment seg, long index, int x) {
        _PangoGlyphString.num_glyphs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle glyphs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("glyphs"));
    public static VarHandle glyphs$VH() {
        return _PangoGlyphString.glyphs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoGlyphInfo* glyphs;
     * }
     */
    public static MemorySegment glyphs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoGlyphString.glyphs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoGlyphInfo* glyphs;
     * }
     */
    public static void glyphs$set(MemorySegment seg, MemorySegment x) {
        _PangoGlyphString.glyphs$VH.set(seg, x);
    }
    public static MemorySegment glyphs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoGlyphString.glyphs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void glyphs$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoGlyphString.glyphs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle log_clusters$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("log_clusters"));
    public static VarHandle log_clusters$VH() {
        return _PangoGlyphString.log_clusters$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int* log_clusters;
     * }
     */
    public static MemorySegment log_clusters$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoGlyphString.log_clusters$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int* log_clusters;
     * }
     */
    public static void log_clusters$set(MemorySegment seg, MemorySegment x) {
        _PangoGlyphString.log_clusters$VH.set(seg, x);
    }
    public static MemorySegment log_clusters$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoGlyphString.log_clusters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void log_clusters$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoGlyphString.log_clusters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle space$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("space"));
    public static VarHandle space$VH() {
        return _PangoGlyphString.space$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int space;
     * }
     */
    public static int space$get(MemorySegment seg) {
        return (int)_PangoGlyphString.space$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int space;
     * }
     */
    public static void space$set(MemorySegment seg, int x) {
        _PangoGlyphString.space$VH.set(seg, x);
    }
    public static int space$get(MemorySegment seg, long index) {
        return (int)_PangoGlyphString.space$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void space$set(MemorySegment seg, long index, int x) {
        _PangoGlyphString.space$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


