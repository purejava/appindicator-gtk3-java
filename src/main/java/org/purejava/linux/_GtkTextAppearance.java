// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkTextAppearance {
 *     GdkColor bg_color;
 *     GdkColor fg_color;
 *     gint rise;
 *      *     guint underline;
 *     guint strikethrough;
 *     guint draw_bg;
 *     guint inside_selection;
 *     guint is_text;
 *     GdkRGBA* rgba[2];
 * };
 * }
 */
public class _GtkTextAppearance {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("bg_color"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("fg_color"),
        Constants$root.C_INT$LAYOUT.withName("rise"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("rgba")
    ).withName("_GtkTextAppearance");
    public static MemoryLayout $LAYOUT() {
        return _GtkTextAppearance.$struct$LAYOUT;
    }
    public static MemorySegment bg_color$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    public static MemorySegment fg_color$slice(MemorySegment seg) {
        return seg.asSlice(12, 12);
    }
    static final VarHandle rise$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rise"));
    public static VarHandle rise$VH() {
        return _GtkTextAppearance.rise$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint rise;
     * }
     */
    public static int rise$get(MemorySegment seg) {
        return (int)_GtkTextAppearance.rise$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint rise;
     * }
     */
    public static void rise$set(MemorySegment seg, int x) {
        _GtkTextAppearance.rise$VH.set(seg, x);
    }
    public static int rise$get(MemorySegment seg, long index) {
        return (int)_GtkTextAppearance.rise$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rise$set(MemorySegment seg, long index, int x) {
        _GtkTextAppearance.rise$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgba$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


