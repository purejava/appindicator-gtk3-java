// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GtkTextAttributes {
 *     guint refcount;
 *     GtkTextAppearance appearance;
 *     GtkJustification justification;
 *     GtkTextDirection direction;
 *     PangoFontDescription* font;
 *     gdouble font_scale;
 *     gint left_margin;
 *     gint right_margin;
 *     gint indent;
 *     gint pixels_above_lines;
 *     gint pixels_below_lines;
 *     gint pixels_inside_wrap;
 *     PangoTabArray* tabs;
 *     GtkWrapMode wrap_mode;
 *     PangoLanguage* language;
 *     GdkColor* pg_bg_color;
 *      *     guint invisible;
 *     guint bg_full_height;
 *     guint editable;
 *     guint no_fallback;
 *     GdkRGBA* pg_bg_rgba;
 *     gint letter_spacing;
 *     gchar* font_features;
 * };
 * }
 */
public class _GtkTextAttributes {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("refcount"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
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
        ).withName("appearance"),
        Constants$root.C_INT$LAYOUT.withName("justification"),
        Constants$root.C_INT$LAYOUT.withName("direction"),
        Constants$root.C_POINTER$LAYOUT.withName("font"),
        Constants$root.C_DOUBLE$LAYOUT.withName("font_scale"),
        Constants$root.C_INT$LAYOUT.withName("left_margin"),
        Constants$root.C_INT$LAYOUT.withName("right_margin"),
        Constants$root.C_INT$LAYOUT.withName("indent"),
        Constants$root.C_INT$LAYOUT.withName("pixels_above_lines"),
        Constants$root.C_INT$LAYOUT.withName("pixels_below_lines"),
        Constants$root.C_INT$LAYOUT.withName("pixels_inside_wrap"),
        Constants$root.C_POINTER$LAYOUT.withName("tabs"),
        Constants$root.C_INT$LAYOUT.withName("wrap_mode"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("language"),
        Constants$root.C_POINTER$LAYOUT.withName("pg_bg_color"),
        MemoryLayout.paddingLayout(64),
        Constants$root.C_POINTER$LAYOUT.withName("pg_bg_rgba"),
        Constants$root.C_INT$LAYOUT.withName("letter_spacing"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("font_features")
    ).withName("_GtkTextAttributes");
    public static MemoryLayout $LAYOUT() {
        return _GtkTextAttributes.$struct$LAYOUT;
    }
    static final VarHandle refcount$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("refcount"));
    public static VarHandle refcount$VH() {
        return _GtkTextAttributes.refcount$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint refcount;
     * }
     */
    public static int refcount$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.refcount$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint refcount;
     * }
     */
    public static void refcount$set(MemorySegment seg, int x) {
        _GtkTextAttributes.refcount$VH.set(seg, x);
    }
    public static int refcount$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.refcount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void refcount$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.refcount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment appearance$slice(MemorySegment seg) {
        return seg.asSlice(8, 48);
    }
    static final VarHandle justification$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("justification"));
    public static VarHandle justification$VH() {
        return _GtkTextAttributes.justification$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkJustification justification;
     * }
     */
    public static int justification$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.justification$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkJustification justification;
     * }
     */
    public static void justification$set(MemorySegment seg, int x) {
        _GtkTextAttributes.justification$VH.set(seg, x);
    }
    public static int justification$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.justification$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void justification$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.justification$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle direction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("direction"));
    public static VarHandle direction$VH() {
        return _GtkTextAttributes.direction$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkTextDirection direction;
     * }
     */
    public static int direction$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.direction$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkTextDirection direction;
     * }
     */
    public static void direction$set(MemorySegment seg, int x) {
        _GtkTextAttributes.direction$VH.set(seg, x);
    }
    public static int direction$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.direction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void direction$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.direction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle font$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("font"));
    public static VarHandle font$VH() {
        return _GtkTextAttributes.font$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoFontDescription* font;
     * }
     */
    public static MemorySegment font$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.font$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoFontDescription* font;
     * }
     */
    public static void font$set(MemorySegment seg, MemorySegment x) {
        _GtkTextAttributes.font$VH.set(seg, x);
    }
    public static MemorySegment font$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.font$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextAttributes.font$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle font_scale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("font_scale"));
    public static VarHandle font_scale$VH() {
        return _GtkTextAttributes.font_scale$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble font_scale;
     * }
     */
    public static double font_scale$get(MemorySegment seg) {
        return (double)_GtkTextAttributes.font_scale$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble font_scale;
     * }
     */
    public static void font_scale$set(MemorySegment seg, double x) {
        _GtkTextAttributes.font_scale$VH.set(seg, x);
    }
    public static double font_scale$get(MemorySegment seg, long index) {
        return (double)_GtkTextAttributes.font_scale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font_scale$set(MemorySegment seg, long index, double x) {
        _GtkTextAttributes.font_scale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle left_margin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("left_margin"));
    public static VarHandle left_margin$VH() {
        return _GtkTextAttributes.left_margin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint left_margin;
     * }
     */
    public static int left_margin$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.left_margin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint left_margin;
     * }
     */
    public static void left_margin$set(MemorySegment seg, int x) {
        _GtkTextAttributes.left_margin$VH.set(seg, x);
    }
    public static int left_margin$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.left_margin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void left_margin$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.left_margin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle right_margin$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("right_margin"));
    public static VarHandle right_margin$VH() {
        return _GtkTextAttributes.right_margin$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint right_margin;
     * }
     */
    public static int right_margin$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.right_margin$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint right_margin;
     * }
     */
    public static void right_margin$set(MemorySegment seg, int x) {
        _GtkTextAttributes.right_margin$VH.set(seg, x);
    }
    public static int right_margin$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.right_margin$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void right_margin$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.right_margin$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle indent$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("indent"));
    public static VarHandle indent$VH() {
        return _GtkTextAttributes.indent$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint indent;
     * }
     */
    public static int indent$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.indent$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint indent;
     * }
     */
    public static void indent$set(MemorySegment seg, int x) {
        _GtkTextAttributes.indent$VH.set(seg, x);
    }
    public static int indent$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.indent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void indent$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.indent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pixels_above_lines$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pixels_above_lines"));
    public static VarHandle pixels_above_lines$VH() {
        return _GtkTextAttributes.pixels_above_lines$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint pixels_above_lines;
     * }
     */
    public static int pixels_above_lines$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.pixels_above_lines$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint pixels_above_lines;
     * }
     */
    public static void pixels_above_lines$set(MemorySegment seg, int x) {
        _GtkTextAttributes.pixels_above_lines$VH.set(seg, x);
    }
    public static int pixels_above_lines$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.pixels_above_lines$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pixels_above_lines$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.pixels_above_lines$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pixels_below_lines$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pixels_below_lines"));
    public static VarHandle pixels_below_lines$VH() {
        return _GtkTextAttributes.pixels_below_lines$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint pixels_below_lines;
     * }
     */
    public static int pixels_below_lines$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.pixels_below_lines$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint pixels_below_lines;
     * }
     */
    public static void pixels_below_lines$set(MemorySegment seg, int x) {
        _GtkTextAttributes.pixels_below_lines$VH.set(seg, x);
    }
    public static int pixels_below_lines$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.pixels_below_lines$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pixels_below_lines$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.pixels_below_lines$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pixels_inside_wrap$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pixels_inside_wrap"));
    public static VarHandle pixels_inside_wrap$VH() {
        return _GtkTextAttributes.pixels_inside_wrap$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint pixels_inside_wrap;
     * }
     */
    public static int pixels_inside_wrap$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.pixels_inside_wrap$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint pixels_inside_wrap;
     * }
     */
    public static void pixels_inside_wrap$set(MemorySegment seg, int x) {
        _GtkTextAttributes.pixels_inside_wrap$VH.set(seg, x);
    }
    public static int pixels_inside_wrap$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.pixels_inside_wrap$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pixels_inside_wrap$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.pixels_inside_wrap$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tabs$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tabs"));
    public static VarHandle tabs$VH() {
        return _GtkTextAttributes.tabs$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoTabArray* tabs;
     * }
     */
    public static MemorySegment tabs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.tabs$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoTabArray* tabs;
     * }
     */
    public static void tabs$set(MemorySegment seg, MemorySegment x) {
        _GtkTextAttributes.tabs$VH.set(seg, x);
    }
    public static MemorySegment tabs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.tabs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tabs$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextAttributes.tabs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wrap_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wrap_mode"));
    public static VarHandle wrap_mode$VH() {
        return _GtkTextAttributes.wrap_mode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkWrapMode wrap_mode;
     * }
     */
    public static int wrap_mode$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.wrap_mode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkWrapMode wrap_mode;
     * }
     */
    public static void wrap_mode$set(MemorySegment seg, int x) {
        _GtkTextAttributes.wrap_mode$VH.set(seg, x);
    }
    public static int wrap_mode$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.wrap_mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wrap_mode$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.wrap_mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle language$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("language"));
    public static VarHandle language$VH() {
        return _GtkTextAttributes.language$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoLanguage* language;
     * }
     */
    public static MemorySegment language$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.language$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoLanguage* language;
     * }
     */
    public static void language$set(MemorySegment seg, MemorySegment x) {
        _GtkTextAttributes.language$VH.set(seg, x);
    }
    public static MemorySegment language$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.language$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void language$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextAttributes.language$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pg_bg_color$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pg_bg_color"));
    public static VarHandle pg_bg_color$VH() {
        return _GtkTextAttributes.pg_bg_color$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkColor* pg_bg_color;
     * }
     */
    public static MemorySegment pg_bg_color$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.pg_bg_color$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkColor* pg_bg_color;
     * }
     */
    public static void pg_bg_color$set(MemorySegment seg, MemorySegment x) {
        _GtkTextAttributes.pg_bg_color$VH.set(seg, x);
    }
    public static MemorySegment pg_bg_color$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.pg_bg_color$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pg_bg_color$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextAttributes.pg_bg_color$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pg_bg_rgba$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pg_bg_rgba"));
    public static VarHandle pg_bg_rgba$VH() {
        return _GtkTextAttributes.pg_bg_rgba$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkRGBA* pg_bg_rgba;
     * }
     */
    public static MemorySegment pg_bg_rgba$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.pg_bg_rgba$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkRGBA* pg_bg_rgba;
     * }
     */
    public static void pg_bg_rgba$set(MemorySegment seg, MemorySegment x) {
        _GtkTextAttributes.pg_bg_rgba$VH.set(seg, x);
    }
    public static MemorySegment pg_bg_rgba$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.pg_bg_rgba$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pg_bg_rgba$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextAttributes.pg_bg_rgba$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle letter_spacing$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("letter_spacing"));
    public static VarHandle letter_spacing$VH() {
        return _GtkTextAttributes.letter_spacing$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint letter_spacing;
     * }
     */
    public static int letter_spacing$get(MemorySegment seg) {
        return (int)_GtkTextAttributes.letter_spacing$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint letter_spacing;
     * }
     */
    public static void letter_spacing$set(MemorySegment seg, int x) {
        _GtkTextAttributes.letter_spacing$VH.set(seg, x);
    }
    public static int letter_spacing$get(MemorySegment seg, long index) {
        return (int)_GtkTextAttributes.letter_spacing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void letter_spacing$set(MemorySegment seg, long index, int x) {
        _GtkTextAttributes.letter_spacing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle font_features$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("font_features"));
    public static VarHandle font_features$VH() {
        return _GtkTextAttributes.font_features$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* font_features;
     * }
     */
    public static MemorySegment font_features$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.font_features$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* font_features;
     * }
     */
    public static void font_features$set(MemorySegment seg, MemorySegment x) {
        _GtkTextAttributes.font_features$VH.set(seg, x);
    }
    public static MemorySegment font_features$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkTextAttributes.font_features$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font_features$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkTextAttributes.font_features$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


