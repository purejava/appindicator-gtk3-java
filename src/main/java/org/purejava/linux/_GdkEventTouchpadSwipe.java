// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GdkEventTouchpadSwipe {
 *     GdkEventType type;
 *     GdkWindow* window;
 *     gint8 send_event;
 *     gint8 phase;
 *     gint8 n_fingers;
 *     guint32 time;
 *     gdouble x;
 *     gdouble y;
 *     gdouble dx;
 *     gdouble dy;
 *     gdouble x_root;
 *     gdouble y_root;
 *     guint state;
 * };
 * }
 */
public class _GdkEventTouchpadSwipe {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("window"),
        Constants$root.C_CHAR$LAYOUT.withName("send_event"),
        Constants$root.C_CHAR$LAYOUT.withName("phase"),
        Constants$root.C_CHAR$LAYOUT.withName("n_fingers"),
        MemoryLayout.paddingLayout(8),
        Constants$root.C_INT$LAYOUT.withName("time"),
        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
        Constants$root.C_DOUBLE$LAYOUT.withName("dx"),
        Constants$root.C_DOUBLE$LAYOUT.withName("dy"),
        Constants$root.C_DOUBLE$LAYOUT.withName("x_root"),
        Constants$root.C_DOUBLE$LAYOUT.withName("y_root"),
        Constants$root.C_INT$LAYOUT.withName("state"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GdkEventTouchpadSwipe");
    public static MemoryLayout $LAYOUT() {
        return _GdkEventTouchpadSwipe.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GdkEventTouchpadSwipe.type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkEventType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)_GdkEventTouchpadSwipe.type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkEventType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        _GdkEventTouchpadSwipe.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GdkEventTouchpadSwipe.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GdkEventTouchpadSwipe.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return _GdkEventTouchpadSwipe.window$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkWindow* window;
     * }
     */
    public static MemorySegment window$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkEventTouchpadSwipe.window$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkWindow* window;
     * }
     */
    public static void window$set(MemorySegment seg, MemorySegment x) {
        _GdkEventTouchpadSwipe.window$VH.set(seg, x);
    }
    public static MemorySegment window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkEventTouchpadSwipe.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkEventTouchpadSwipe.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return _GdkEventTouchpadSwipe.send_event$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint8 send_event;
     * }
     */
    public static byte send_event$get(MemorySegment seg) {
        return (byte)_GdkEventTouchpadSwipe.send_event$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint8 send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, byte x) {
        _GdkEventTouchpadSwipe.send_event$VH.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)_GdkEventTouchpadSwipe.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        _GdkEventTouchpadSwipe.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle phase$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("phase"));
    public static VarHandle phase$VH() {
        return _GdkEventTouchpadSwipe.phase$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint8 phase;
     * }
     */
    public static byte phase$get(MemorySegment seg) {
        return (byte)_GdkEventTouchpadSwipe.phase$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint8 phase;
     * }
     */
    public static void phase$set(MemorySegment seg, byte x) {
        _GdkEventTouchpadSwipe.phase$VH.set(seg, x);
    }
    public static byte phase$get(MemorySegment seg, long index) {
        return (byte)_GdkEventTouchpadSwipe.phase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void phase$set(MemorySegment seg, long index, byte x) {
        _GdkEventTouchpadSwipe.phase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle n_fingers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("n_fingers"));
    public static VarHandle n_fingers$VH() {
        return _GdkEventTouchpadSwipe.n_fingers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint8 n_fingers;
     * }
     */
    public static byte n_fingers$get(MemorySegment seg) {
        return (byte)_GdkEventTouchpadSwipe.n_fingers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint8 n_fingers;
     * }
     */
    public static void n_fingers$set(MemorySegment seg, byte x) {
        _GdkEventTouchpadSwipe.n_fingers$VH.set(seg, x);
    }
    public static byte n_fingers$get(MemorySegment seg, long index) {
        return (byte)_GdkEventTouchpadSwipe.n_fingers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void n_fingers$set(MemorySegment seg, long index, byte x) {
        _GdkEventTouchpadSwipe.n_fingers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return _GdkEventTouchpadSwipe.time$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint32 time;
     * }
     */
    public static int time$get(MemorySegment seg) {
        return (int)_GdkEventTouchpadSwipe.time$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint32 time;
     * }
     */
    public static void time$set(MemorySegment seg, int x) {
        _GdkEventTouchpadSwipe.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)_GdkEventTouchpadSwipe.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        _GdkEventTouchpadSwipe.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return _GdkEventTouchpadSwipe.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble x;
     * }
     */
    public static double x$get(MemorySegment seg) {
        return (double)_GdkEventTouchpadSwipe.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble x;
     * }
     */
    public static void x$set(MemorySegment seg, double x) {
        _GdkEventTouchpadSwipe.x$VH.set(seg, x);
    }
    public static double x$get(MemorySegment seg, long index) {
        return (double)_GdkEventTouchpadSwipe.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, double x) {
        _GdkEventTouchpadSwipe.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return _GdkEventTouchpadSwipe.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble y;
     * }
     */
    public static double y$get(MemorySegment seg) {
        return (double)_GdkEventTouchpadSwipe.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble y;
     * }
     */
    public static void y$set(MemorySegment seg, double x) {
        _GdkEventTouchpadSwipe.y$VH.set(seg, x);
    }
    public static double y$get(MemorySegment seg, long index) {
        return (double)_GdkEventTouchpadSwipe.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, double x) {
        _GdkEventTouchpadSwipe.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dx"));
    public static VarHandle dx$VH() {
        return _GdkEventTouchpadSwipe.dx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble dx;
     * }
     */
    public static double dx$get(MemorySegment seg) {
        return (double)_GdkEventTouchpadSwipe.dx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble dx;
     * }
     */
    public static void dx$set(MemorySegment seg, double x) {
        _GdkEventTouchpadSwipe.dx$VH.set(seg, x);
    }
    public static double dx$get(MemorySegment seg, long index) {
        return (double)_GdkEventTouchpadSwipe.dx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dx$set(MemorySegment seg, long index, double x) {
        _GdkEventTouchpadSwipe.dx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dy$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dy"));
    public static VarHandle dy$VH() {
        return _GdkEventTouchpadSwipe.dy$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble dy;
     * }
     */
    public static double dy$get(MemorySegment seg) {
        return (double)_GdkEventTouchpadSwipe.dy$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble dy;
     * }
     */
    public static void dy$set(MemorySegment seg, double x) {
        _GdkEventTouchpadSwipe.dy$VH.set(seg, x);
    }
    public static double dy$get(MemorySegment seg, long index) {
        return (double)_GdkEventTouchpadSwipe.dy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dy$set(MemorySegment seg, long index, double x) {
        _GdkEventTouchpadSwipe.dy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x_root"));
    public static VarHandle x_root$VH() {
        return _GdkEventTouchpadSwipe.x_root$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble x_root;
     * }
     */
    public static double x_root$get(MemorySegment seg) {
        return (double)_GdkEventTouchpadSwipe.x_root$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble x_root;
     * }
     */
    public static void x_root$set(MemorySegment seg, double x) {
        _GdkEventTouchpadSwipe.x_root$VH.set(seg, x);
    }
    public static double x_root$get(MemorySegment seg, long index) {
        return (double)_GdkEventTouchpadSwipe.x_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, double x) {
        _GdkEventTouchpadSwipe.x_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_root"));
    public static VarHandle y_root$VH() {
        return _GdkEventTouchpadSwipe.y_root$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gdouble y_root;
     * }
     */
    public static double y_root$get(MemorySegment seg) {
        return (double)_GdkEventTouchpadSwipe.y_root$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gdouble y_root;
     * }
     */
    public static void y_root$set(MemorySegment seg, double x) {
        _GdkEventTouchpadSwipe.y_root$VH.set(seg, x);
    }
    public static double y_root$get(MemorySegment seg, long index) {
        return (double)_GdkEventTouchpadSwipe.y_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, double x) {
        _GdkEventTouchpadSwipe.y_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return _GdkEventTouchpadSwipe.state$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint state;
     * }
     */
    public static int state$get(MemorySegment seg) {
        return (int)_GdkEventTouchpadSwipe.state$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint state;
     * }
     */
    public static void state$set(MemorySegment seg, int x) {
        _GdkEventTouchpadSwipe.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)_GdkEventTouchpadSwipe.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        _GdkEventTouchpadSwipe.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


