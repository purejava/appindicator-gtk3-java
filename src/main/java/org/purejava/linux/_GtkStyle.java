// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkStyle {
 *     GObject parent_instance;
 *     GdkColor fg[5];
 *     GdkColor bg[5];
 *     GdkColor light[5];
 *     GdkColor dark[5];
 *     GdkColor mid[5];
 *     GdkColor text[5];
 *     GdkColor base[5];
 *     GdkColor text_aa[5];
 *     GdkColor black;
 *     GdkColor white;
 *     PangoFontDescription* font_desc;
 *     gint xthickness;
 *     gint ythickness;
 *     cairo_pattern_t* background[5];
 *     gint attach_count;
 *     GdkVisual* visual;
 *     PangoFontDescription* private_font_desc;
 *     GtkRcStyle* rc_style;
 *     GSList* styles;
 *     GArray* property_cache;
 *     GSList* icon_factories;
 * };
 * }
 */
public class _GtkStyle {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("g_class")
            ).withName("g_type_instance"),
            Constants$root.C_INT$LAYOUT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Constants$root.C_POINTER$LAYOUT.withName("qdata")
        ).withName("parent_instance"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("_GdkColor")).withName("fg"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("_GdkColor")).withName("bg"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("_GdkColor")).withName("light"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("_GdkColor")).withName("dark"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("_GdkColor")).withName("mid"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("_GdkColor")).withName("text"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("_GdkColor")).withName("base"),
        MemoryLayout.sequenceLayout(5, MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("_GdkColor")).withName("text_aa"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("black"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("pixel"),
            Constants$root.C_SHORT$LAYOUT.withName("red"),
            Constants$root.C_SHORT$LAYOUT.withName("green"),
            Constants$root.C_SHORT$LAYOUT.withName("blue"),
            MemoryLayout.paddingLayout(16)
        ).withName("white"),
        Constants$root.C_POINTER$LAYOUT.withName("font_desc"),
        Constants$root.C_INT$LAYOUT.withName("xthickness"),
        Constants$root.C_INT$LAYOUT.withName("ythickness"),
        MemoryLayout.sequenceLayout(5, Constants$root.C_POINTER$LAYOUT).withName("background"),
        Constants$root.C_INT$LAYOUT.withName("attach_count"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("visual"),
        Constants$root.C_POINTER$LAYOUT.withName("private_font_desc"),
        Constants$root.C_POINTER$LAYOUT.withName("rc_style"),
        Constants$root.C_POINTER$LAYOUT.withName("styles"),
        Constants$root.C_POINTER$LAYOUT.withName("property_cache"),
        Constants$root.C_POINTER$LAYOUT.withName("icon_factories")
    ).withName("_GtkStyle");
    public static MemoryLayout $LAYOUT() {
        return _GtkStyle.$struct$LAYOUT;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 24);
    }
    public static MemorySegment fg$slice(MemorySegment seg) {
        return seg.asSlice(24, 60);
    }
    public static MemorySegment bg$slice(MemorySegment seg) {
        return seg.asSlice(84, 60);
    }
    public static MemorySegment light$slice(MemorySegment seg) {
        return seg.asSlice(144, 60);
    }
    public static MemorySegment dark$slice(MemorySegment seg) {
        return seg.asSlice(204, 60);
    }
    public static MemorySegment mid$slice(MemorySegment seg) {
        return seg.asSlice(264, 60);
    }
    public static MemorySegment text$slice(MemorySegment seg) {
        return seg.asSlice(324, 60);
    }
    public static MemorySegment base$slice(MemorySegment seg) {
        return seg.asSlice(384, 60);
    }
    public static MemorySegment text_aa$slice(MemorySegment seg) {
        return seg.asSlice(444, 60);
    }
    public static MemorySegment black$slice(MemorySegment seg) {
        return seg.asSlice(504, 12);
    }
    public static MemorySegment white$slice(MemorySegment seg) {
        return seg.asSlice(516, 12);
    }
    static final VarHandle font_desc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("font_desc"));
    public static VarHandle font_desc$VH() {
        return _GtkStyle.font_desc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoFontDescription* font_desc;
     * }
     */
    public static MemorySegment font_desc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.font_desc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoFontDescription* font_desc;
     * }
     */
    public static void font_desc$set(MemorySegment seg, MemorySegment x) {
        _GtkStyle.font_desc$VH.set(seg, x);
    }
    public static MemorySegment font_desc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.font_desc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void font_desc$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyle.font_desc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xthickness$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xthickness"));
    public static VarHandle xthickness$VH() {
        return _GtkStyle.xthickness$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint xthickness;
     * }
     */
    public static int xthickness$get(MemorySegment seg) {
        return (int)_GtkStyle.xthickness$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint xthickness;
     * }
     */
    public static void xthickness$set(MemorySegment seg, int x) {
        _GtkStyle.xthickness$VH.set(seg, x);
    }
    public static int xthickness$get(MemorySegment seg, long index) {
        return (int)_GtkStyle.xthickness$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xthickness$set(MemorySegment seg, long index, int x) {
        _GtkStyle.xthickness$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ythickness$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ythickness"));
    public static VarHandle ythickness$VH() {
        return _GtkStyle.ythickness$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint ythickness;
     * }
     */
    public static int ythickness$get(MemorySegment seg) {
        return (int)_GtkStyle.ythickness$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint ythickness;
     * }
     */
    public static void ythickness$set(MemorySegment seg, int x) {
        _GtkStyle.ythickness$VH.set(seg, x);
    }
    public static int ythickness$get(MemorySegment seg, long index) {
        return (int)_GtkStyle.ythickness$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ythickness$set(MemorySegment seg, long index, int x) {
        _GtkStyle.ythickness$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment background$slice(MemorySegment seg) {
        return seg.asSlice(544, 40);
    }
    static final VarHandle attach_count$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("attach_count"));
    public static VarHandle attach_count$VH() {
        return _GtkStyle.attach_count$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint attach_count;
     * }
     */
    public static int attach_count$get(MemorySegment seg) {
        return (int)_GtkStyle.attach_count$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint attach_count;
     * }
     */
    public static void attach_count$set(MemorySegment seg, int x) {
        _GtkStyle.attach_count$VH.set(seg, x);
    }
    public static int attach_count$get(MemorySegment seg, long index) {
        return (int)_GtkStyle.attach_count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void attach_count$set(MemorySegment seg, long index, int x) {
        _GtkStyle.attach_count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle visual$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("visual"));
    public static VarHandle visual$VH() {
        return _GtkStyle.visual$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkVisual* visual;
     * }
     */
    public static MemorySegment visual$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.visual$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkVisual* visual;
     * }
     */
    public static void visual$set(MemorySegment seg, MemorySegment x) {
        _GtkStyle.visual$VH.set(seg, x);
    }
    public static MemorySegment visual$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.visual$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void visual$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyle.visual$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle private_font_desc$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("private_font_desc"));
    public static VarHandle private_font_desc$VH() {
        return _GtkStyle.private_font_desc$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoFontDescription* private_font_desc;
     * }
     */
    public static MemorySegment private_font_desc$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.private_font_desc$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoFontDescription* private_font_desc;
     * }
     */
    public static void private_font_desc$set(MemorySegment seg, MemorySegment x) {
        _GtkStyle.private_font_desc$VH.set(seg, x);
    }
    public static MemorySegment private_font_desc$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.private_font_desc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void private_font_desc$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyle.private_font_desc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rc_style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rc_style"));
    public static VarHandle rc_style$VH() {
        return _GtkStyle.rc_style$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GtkRcStyle* rc_style;
     * }
     */
    public static MemorySegment rc_style$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.rc_style$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GtkRcStyle* rc_style;
     * }
     */
    public static void rc_style$set(MemorySegment seg, MemorySegment x) {
        _GtkStyle.rc_style$VH.set(seg, x);
    }
    public static MemorySegment rc_style$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.rc_style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rc_style$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyle.rc_style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle styles$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("styles"));
    public static VarHandle styles$VH() {
        return _GtkStyle.styles$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSList* styles;
     * }
     */
    public static MemorySegment styles$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.styles$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSList* styles;
     * }
     */
    public static void styles$set(MemorySegment seg, MemorySegment x) {
        _GtkStyle.styles$VH.set(seg, x);
    }
    public static MemorySegment styles$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.styles$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void styles$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyle.styles$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle property_cache$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("property_cache"));
    public static VarHandle property_cache$VH() {
        return _GtkStyle.property_cache$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GArray* property_cache;
     * }
     */
    public static MemorySegment property_cache$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.property_cache$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GArray* property_cache;
     * }
     */
    public static void property_cache$set(MemorySegment seg, MemorySegment x) {
        _GtkStyle.property_cache$VH.set(seg, x);
    }
    public static MemorySegment property_cache$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.property_cache$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void property_cache$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyle.property_cache$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle icon_factories$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("icon_factories"));
    public static VarHandle icon_factories$VH() {
        return _GtkStyle.icon_factories$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GSList* icon_factories;
     * }
     */
    public static MemorySegment icon_factories$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.icon_factories$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GSList* icon_factories;
     * }
     */
    public static void icon_factories$set(MemorySegment seg, MemorySegment x) {
        _GtkStyle.icon_factories$VH.set(seg, x);
    }
    public static MemorySegment icon_factories$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkStyle.icon_factories$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void icon_factories$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkStyle.icon_factories$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


