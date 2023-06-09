// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GdkEventCrossing {
 *     GdkEventType type;
 *     GdkWindow* window;
 *     gint8 send_event;
 *     GdkWindow* subwindow;
 *     guint32 time;
 *     gdouble x;
 *     gdouble y;
 *     gdouble x_root;
 *     gdouble y_root;
 *     GdkCrossingMode mode;
 *     GdkNotifyType detail;
 *     gboolean focus;
 *     guint state;
 * };
 * }
 */
public class _GdkEventCrossing {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("window"),
        Constants$root.C_CHAR$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(56),
        Constants$root.C_POINTER$LAYOUT.withName("subwindow"),
        Constants$root.C_INT$LAYOUT.withName("time"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("x_root"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y_root"),
        Constants$root.C_INT$LAYOUT.withName("mode"),
        Constants$root.C_INT$LAYOUT.withName("detail"),
        Constants$root.C_INT$LAYOUT.withName("focus"),
        Constants$root.C_INT$LAYOUT.withName("state")
    ).withName("_GdkEventCrossing");
    public static MemoryLayout $LAYOUT() {
        return _GdkEventCrossing.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GdkEventCrossing.type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkEventType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)_GdkEventCrossing.type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkEventType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        _GdkEventCrossing.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GdkEventCrossing.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GdkEventCrossing.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return _GdkEventCrossing.window$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkWindow* window;
     * }
     */
    public static MemorySegment window$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkEventCrossing.window$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkWindow* window;
     * }
     */
    public static void window$set(MemorySegment seg, MemorySegment x) {
        _GdkEventCrossing.window$VH.set(seg, x);
    }
    public static MemorySegment window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkEventCrossing.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkEventCrossing.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return _GdkEventCrossing.send_event$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint8 send_event;
     * }
     */
    public static byte send_event$get(MemorySegment seg) {
        return (byte)_GdkEventCrossing.send_event$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint8 send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, byte x) {
        _GdkEventCrossing.send_event$VH.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)_GdkEventCrossing.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        _GdkEventCrossing.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle subwindow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("subwindow"));
    public static VarHandle subwindow$VH() {
        return _GdkEventCrossing.subwindow$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkWindow* subwindow;
     * }
     */
    public static MemorySegment subwindow$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkEventCrossing.subwindow$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkWindow* subwindow;
     * }
     */
    public static void subwindow$set(MemorySegment seg, MemorySegment x) {
        _GdkEventCrossing.subwindow$VH.set(seg, x);
    }
    public static MemorySegment subwindow$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkEventCrossing.subwindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void subwindow$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkEventCrossing.subwindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return _GdkEventCrossing.time$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint32 time;
     * }
     */
    public static int time$get(MemorySegment seg) {
        return (int)_GdkEventCrossing.time$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint32 time;
     * }
     */
    public static void time$set(MemorySegment seg, int x) {
        _GdkEventCrossing.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)_GdkEventCrossing.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        _GdkEventCrossing.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _GdkEventCrossing.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble x;
     * }
     */
    public static double x$get(MemorySegment seg) {
        return (double)_GdkEventCrossing.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble x;
     * }
     */
    public static void x$set(MemorySegment seg, double x) {
        _GdkEventCrossing.x$VH.set(seg, x);
    }
    public static double x$get(MemorySegment seg, long index) {
        return (double)_GdkEventCrossing.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, double x) {
        _GdkEventCrossing.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _GdkEventCrossing.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble y;
     * }
     */
    public static double y$get(MemorySegment seg) {
        return (double)_GdkEventCrossing.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble y;
     * }
     */
    public static void y$set(MemorySegment seg, double x) {
        _GdkEventCrossing.y$VH.set(seg, x);
    }
    public static double y$get(MemorySegment seg, long index) {
        return (double)_GdkEventCrossing.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, double x) {
        _GdkEventCrossing.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x_root"));
    public static VarHandle x_root$VH() {
        return _GdkEventCrossing.x_root$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble x_root;
     * }
     */
    public static double x_root$get(MemorySegment seg) {
        return (double)_GdkEventCrossing.x_root$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble x_root;
     * }
     */
    public static void x_root$set(MemorySegment seg, double x) {
        _GdkEventCrossing.x_root$VH.set(seg, x);
    }
    public static double x_root$get(MemorySegment seg, long index) {
        return (double)_GdkEventCrossing.x_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, double x) {
        _GdkEventCrossing.x_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_root"));
    public static VarHandle y_root$VH() {
        return _GdkEventCrossing.y_root$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble y_root;
     * }
     */
    public static double y_root$get(MemorySegment seg) {
        return (double)_GdkEventCrossing.y_root$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble y_root;
     * }
     */
    public static void y_root$set(MemorySegment seg, double x) {
        _GdkEventCrossing.y_root$VH.set(seg, x);
    }
    public static double y_root$get(MemorySegment seg, long index) {
        return (double)_GdkEventCrossing.y_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, double x) {
        _GdkEventCrossing.y_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("mode"));
    public static VarHandle mode$VH() {
        return _GdkEventCrossing.mode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkCrossingMode mode;
     * }
     */
    public static int mode$get(MemorySegment seg) {
        return (int)_GdkEventCrossing.mode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkCrossingMode mode;
     * }
     */
    public static void mode$set(MemorySegment seg, int x) {
        _GdkEventCrossing.mode$VH.set(seg, x);
    }
    public static int mode$get(MemorySegment seg, long index) {
        return (int)_GdkEventCrossing.mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mode$set(MemorySegment seg, long index, int x) {
        _GdkEventCrossing.mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle detail$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("detail"));
    public static VarHandle detail$VH() {
        return _GdkEventCrossing.detail$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkNotifyType detail;
     * }
     */
    public static int detail$get(MemorySegment seg) {
        return (int)_GdkEventCrossing.detail$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkNotifyType detail;
     * }
     */
    public static void detail$set(MemorySegment seg, int x) {
        _GdkEventCrossing.detail$VH.set(seg, x);
    }
    public static int detail$get(MemorySegment seg, long index) {
        return (int)_GdkEventCrossing.detail$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void detail$set(MemorySegment seg, long index, int x) {
        _GdkEventCrossing.detail$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle focus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("focus"));
    public static VarHandle focus$VH() {
        return _GdkEventCrossing.focus$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean focus;
     * }
     */
    public static int focus$get(MemorySegment seg) {
        return (int)_GdkEventCrossing.focus$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean focus;
     * }
     */
    public static void focus$set(MemorySegment seg, int x) {
        _GdkEventCrossing.focus$VH.set(seg, x);
    }
    public static int focus$get(MemorySegment seg, long index) {
        return (int)_GdkEventCrossing.focus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void focus$set(MemorySegment seg, long index, int x) {
        _GdkEventCrossing.focus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return _GdkEventCrossing.state$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint state;
     * }
     */
    public static int state$get(MemorySegment seg) {
        return (int)_GdkEventCrossing.state$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint state;
     * }
     */
    public static void state$set(MemorySegment seg, int x) {
        _GdkEventCrossing.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)_GdkEventCrossing.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        _GdkEventCrossing.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


