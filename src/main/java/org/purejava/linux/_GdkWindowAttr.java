// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GdkWindowAttr {
 *     gchar* title;
 *     gint event_mask;
 *     gint x;
 *     gint y;
 *     gint width;
 *     gint height;
 *     GdkWindowWindowClass wclass;
 *     GdkVisual* visual;
 *     GdkWindowType window_type;
 *     GdkCursor* cursor;
 *     gchar* wmclass_name;
 *     gchar* wmclass_class;
 *     gboolean override_redirect;
 *     GdkWindowTypeHint type_hint;
 * };
 * }
 */
public class _GdkWindowAttr {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("title"),
        Constants$root.C_INT$LAYOUT.withName("event_mask"),
        Constants$root.C_INT$LAYOUT.withName("x"),
        Constants$root.C_INT$LAYOUT.withName("y"),
        Constants$root.C_INT$LAYOUT.withName("width"),
        Constants$root.C_INT$LAYOUT.withName("height"),
        Constants$root.C_INT$LAYOUT.withName("wclass"),
        Constants$root.C_POINTER$LAYOUT.withName("visual"),
        Constants$root.C_INT$LAYOUT.withName("window_type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("cursor"),
        Constants$root.C_POINTER$LAYOUT.withName("wmclass_name"),
        Constants$root.C_POINTER$LAYOUT.withName("wmclass_class"),
        Constants$root.C_INT$LAYOUT.withName("override_redirect"),
        Constants$root.C_INT$LAYOUT.withName("type_hint")
    ).withName("_GdkWindowAttr");
    public static MemoryLayout $LAYOUT() {
        return _GdkWindowAttr.$struct$LAYOUT;
    }
    static final VarHandle title$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("title"));
    public static VarHandle title$VH() {
        return _GdkWindowAttr.title$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* title;
     * }
     */
    public static MemorySegment title$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkWindowAttr.title$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* title;
     * }
     */
    public static void title$set(MemorySegment seg, MemorySegment x) {
        _GdkWindowAttr.title$VH.set(seg, x);
    }
    public static MemorySegment title$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkWindowAttr.title$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void title$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkWindowAttr.title$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle event_mask$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("event_mask"));
    public static VarHandle event_mask$VH() {
        return _GdkWindowAttr.event_mask$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint event_mask;
     * }
     */
    public static int event_mask$get(MemorySegment seg) {
        return (int)_GdkWindowAttr.event_mask$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint event_mask;
     * }
     */
    public static void event_mask$set(MemorySegment seg, int x) {
        _GdkWindowAttr.event_mask$VH.set(seg, x);
    }
    public static int event_mask$get(MemorySegment seg, long index) {
        return (int)_GdkWindowAttr.event_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void event_mask$set(MemorySegment seg, long index, int x) {
        _GdkWindowAttr.event_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _GdkWindowAttr.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)_GdkWindowAttr.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        _GdkWindowAttr.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)_GdkWindowAttr.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        _GdkWindowAttr.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _GdkWindowAttr.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)_GdkWindowAttr.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        _GdkWindowAttr.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)_GdkWindowAttr.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        _GdkWindowAttr.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle width$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("width"));
    public static VarHandle width$VH() {
        return _GdkWindowAttr.width$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint width;
     * }
     */
    public static int width$get(MemorySegment seg) {
        return (int)_GdkWindowAttr.width$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint width;
     * }
     */
    public static void width$set(MemorySegment seg, int x) {
        _GdkWindowAttr.width$VH.set(seg, x);
    }
    public static int width$get(MemorySegment seg, long index) {
        return (int)_GdkWindowAttr.width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void width$set(MemorySegment seg, long index, int x) {
        _GdkWindowAttr.width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle height$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("height"));
    public static VarHandle height$VH() {
        return _GdkWindowAttr.height$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint height;
     * }
     */
    public static int height$get(MemorySegment seg) {
        return (int)_GdkWindowAttr.height$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint height;
     * }
     */
    public static void height$set(MemorySegment seg, int x) {
        _GdkWindowAttr.height$VH.set(seg, x);
    }
    public static int height$get(MemorySegment seg, long index) {
        return (int)_GdkWindowAttr.height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void height$set(MemorySegment seg, long index, int x) {
        _GdkWindowAttr.height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wclass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wclass"));
    public static VarHandle wclass$VH() {
        return _GdkWindowAttr.wclass$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkWindowWindowClass wclass;
     * }
     */
    public static int wclass$get(MemorySegment seg) {
        return (int)_GdkWindowAttr.wclass$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkWindowWindowClass wclass;
     * }
     */
    public static void wclass$set(MemorySegment seg, int x) {
        _GdkWindowAttr.wclass$VH.set(seg, x);
    }
    public static int wclass$get(MemorySegment seg, long index) {
        return (int)_GdkWindowAttr.wclass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wclass$set(MemorySegment seg, long index, int x) {
        _GdkWindowAttr.wclass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle visual$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("visual"));
    public static VarHandle visual$VH() {
        return _GdkWindowAttr.visual$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkVisual* visual;
     * }
     */
    public static MemorySegment visual$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkWindowAttr.visual$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkVisual* visual;
     * }
     */
    public static void visual$set(MemorySegment seg, MemorySegment x) {
        _GdkWindowAttr.visual$VH.set(seg, x);
    }
    public static MemorySegment visual$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkWindowAttr.visual$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void visual$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkWindowAttr.visual$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window_type"));
    public static VarHandle window_type$VH() {
        return _GdkWindowAttr.window_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkWindowType window_type;
     * }
     */
    public static int window_type$get(MemorySegment seg) {
        return (int)_GdkWindowAttr.window_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkWindowType window_type;
     * }
     */
    public static void window_type$set(MemorySegment seg, int x) {
        _GdkWindowAttr.window_type$VH.set(seg, x);
    }
    public static int window_type$get(MemorySegment seg, long index) {
        return (int)_GdkWindowAttr.window_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window_type$set(MemorySegment seg, long index, int x) {
        _GdkWindowAttr.window_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cursor$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cursor"));
    public static VarHandle cursor$VH() {
        return _GdkWindowAttr.cursor$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkCursor* cursor;
     * }
     */
    public static MemorySegment cursor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkWindowAttr.cursor$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkCursor* cursor;
     * }
     */
    public static void cursor$set(MemorySegment seg, MemorySegment x) {
        _GdkWindowAttr.cursor$VH.set(seg, x);
    }
    public static MemorySegment cursor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkWindowAttr.cursor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cursor$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkWindowAttr.cursor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wmclass_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wmclass_name"));
    public static VarHandle wmclass_name$VH() {
        return _GdkWindowAttr.wmclass_name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* wmclass_name;
     * }
     */
    public static MemorySegment wmclass_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkWindowAttr.wmclass_name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* wmclass_name;
     * }
     */
    public static void wmclass_name$set(MemorySegment seg, MemorySegment x) {
        _GdkWindowAttr.wmclass_name$VH.set(seg, x);
    }
    public static MemorySegment wmclass_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkWindowAttr.wmclass_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wmclass_name$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkWindowAttr.wmclass_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wmclass_class$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("wmclass_class"));
    public static VarHandle wmclass_class$VH() {
        return _GdkWindowAttr.wmclass_class$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* wmclass_class;
     * }
     */
    public static MemorySegment wmclass_class$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkWindowAttr.wmclass_class$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* wmclass_class;
     * }
     */
    public static void wmclass_class$set(MemorySegment seg, MemorySegment x) {
        _GdkWindowAttr.wmclass_class$VH.set(seg, x);
    }
    public static MemorySegment wmclass_class$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkWindowAttr.wmclass_class$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wmclass_class$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkWindowAttr.wmclass_class$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle override_redirect$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("override_redirect"));
    public static VarHandle override_redirect$VH() {
        return _GdkWindowAttr.override_redirect$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean override_redirect;
     * }
     */
    public static int override_redirect$get(MemorySegment seg) {
        return (int)_GdkWindowAttr.override_redirect$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean override_redirect;
     * }
     */
    public static void override_redirect$set(MemorySegment seg, int x) {
        _GdkWindowAttr.override_redirect$VH.set(seg, x);
    }
    public static int override_redirect$get(MemorySegment seg, long index) {
        return (int)_GdkWindowAttr.override_redirect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void override_redirect$set(MemorySegment seg, long index, int x) {
        _GdkWindowAttr.override_redirect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle type_hint$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type_hint"));
    public static VarHandle type_hint$VH() {
        return _GdkWindowAttr.type_hint$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkWindowTypeHint type_hint;
     * }
     */
    public static int type_hint$get(MemorySegment seg) {
        return (int)_GdkWindowAttr.type_hint$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkWindowTypeHint type_hint;
     * }
     */
    public static void type_hint$set(MemorySegment seg, int x) {
        _GdkWindowAttr.type_hint$VH.set(seg, x);
    }
    public static int type_hint$get(MemorySegment seg, long index) {
        return (int)_GdkWindowAttr.type_hint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type_hint$set(MemorySegment seg, long index, int x) {
        _GdkWindowAttr.type_hint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


