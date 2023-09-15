// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GdkEventTouchpadSwipe {
 *     enum GdkEventType type;
 *     struct _GdkWindow* window;
 *     signed char send_event;
 *     signed char phase;
 *     signed char n_fingers;
 *     unsigned int time;
 *     double x;
 *     double y;
 *     double dx;
 *     double dy;
 *     double x_root;
 *     double y_root;
 *     unsigned int state;
 * };
 * }
 */
public class _GdkEventTouchpadSwipe {

    public static MemoryLayout $LAYOUT() {
        return constants$1794.const$4;
    }
    public static VarHandle type$VH() {
        return constants$1794.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GdkEventType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$1794.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GdkEventType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$1794.const$5.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$1794.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$1794.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle window$VH() {
        return constants$1795.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkWindow* window;
     * }
     */
    public static MemorySegment window$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1795.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkWindow* window;
     * }
     */
    public static void window$set(MemorySegment seg, MemorySegment x) {
        constants$1795.const$0.set(seg, x);
    }
    public static MemorySegment window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1795.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1795.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle send_event$VH() {
        return constants$1795.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * signed char send_event;
     * }
     */
    public static byte send_event$get(MemorySegment seg) {
        return (byte)constants$1795.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * signed char send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, byte x) {
        constants$1795.const$1.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)constants$1795.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        constants$1795.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle phase$VH() {
        return constants$1795.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * signed char phase;
     * }
     */
    public static byte phase$get(MemorySegment seg) {
        return (byte)constants$1795.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * signed char phase;
     * }
     */
    public static void phase$set(MemorySegment seg, byte x) {
        constants$1795.const$2.set(seg, x);
    }
    public static byte phase$get(MemorySegment seg, long index) {
        return (byte)constants$1795.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void phase$set(MemorySegment seg, long index, byte x) {
        constants$1795.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle n_fingers$VH() {
        return constants$1795.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * signed char n_fingers;
     * }
     */
    public static byte n_fingers$get(MemorySegment seg) {
        return (byte)constants$1795.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * signed char n_fingers;
     * }
     */
    public static void n_fingers$set(MemorySegment seg, byte x) {
        constants$1795.const$3.set(seg, x);
    }
    public static byte n_fingers$get(MemorySegment seg, long index) {
        return (byte)constants$1795.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void n_fingers$set(MemorySegment seg, long index, byte x) {
        constants$1795.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle time$VH() {
        return constants$1795.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int time;
     * }
     */
    public static int time$get(MemorySegment seg) {
        return (int)constants$1795.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int time;
     * }
     */
    public static void time$set(MemorySegment seg, int x) {
        constants$1795.const$4.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)constants$1795.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        constants$1795.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x$VH() {
        return constants$1795.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x;
     * }
     */
    public static double x$get(MemorySegment seg) {
        return (double)constants$1795.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x;
     * }
     */
    public static void x$set(MemorySegment seg, double x) {
        constants$1795.const$5.set(seg, x);
    }
    public static double x$get(MemorySegment seg, long index) {
        return (double)constants$1795.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, double x) {
        constants$1795.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y$VH() {
        return constants$1796.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double y;
     * }
     */
    public static double y$get(MemorySegment seg) {
        return (double)constants$1796.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double y;
     * }
     */
    public static void y$set(MemorySegment seg, double x) {
        constants$1796.const$0.set(seg, x);
    }
    public static double y$get(MemorySegment seg, long index) {
        return (double)constants$1796.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, double x) {
        constants$1796.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dx$VH() {
        return constants$1796.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double dx;
     * }
     */
    public static double dx$get(MemorySegment seg) {
        return (double)constants$1796.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double dx;
     * }
     */
    public static void dx$set(MemorySegment seg, double x) {
        constants$1796.const$1.set(seg, x);
    }
    public static double dx$get(MemorySegment seg, long index) {
        return (double)constants$1796.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void dx$set(MemorySegment seg, long index, double x) {
        constants$1796.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle dy$VH() {
        return constants$1796.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double dy;
     * }
     */
    public static double dy$get(MemorySegment seg) {
        return (double)constants$1796.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double dy;
     * }
     */
    public static void dy$set(MemorySegment seg, double x) {
        constants$1796.const$2.set(seg, x);
    }
    public static double dy$get(MemorySegment seg, long index) {
        return (double)constants$1796.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void dy$set(MemorySegment seg, long index, double x) {
        constants$1796.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle x_root$VH() {
        return constants$1796.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double x_root;
     * }
     */
    public static double x_root$get(MemorySegment seg) {
        return (double)constants$1796.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double x_root;
     * }
     */
    public static void x_root$set(MemorySegment seg, double x) {
        constants$1796.const$3.set(seg, x);
    }
    public static double x_root$get(MemorySegment seg, long index) {
        return (double)constants$1796.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, double x) {
        constants$1796.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle y_root$VH() {
        return constants$1796.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * double y_root;
     * }
     */
    public static double y_root$get(MemorySegment seg) {
        return (double)constants$1796.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * double y_root;
     * }
     */
    public static void y_root$set(MemorySegment seg, double x) {
        constants$1796.const$4.set(seg, x);
    }
    public static double y_root$get(MemorySegment seg, long index) {
        return (double)constants$1796.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, double x) {
        constants$1796.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle state$VH() {
        return constants$1796.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int state;
     * }
     */
    public static int state$get(MemorySegment seg) {
        return (int)constants$1796.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int state;
     * }
     */
    public static void state$set(MemorySegment seg, int x) {
        constants$1796.const$5.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)constants$1796.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        constants$1796.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


