// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GdkEventOwnerChange {
 *     enum GdkEventType type;
 *     struct _GdkWindow* window;
 *     signed char send_event;
 *     struct _GdkWindow* owner;
 *     enum GdkOwnerChange reason;
 *     struct _GdkAtom* selection;
 *     unsigned int time;
 *     unsigned int selection_time;
 * };
 * }
 */
public class _GdkEventOwnerChange {

    public static MemoryLayout $LAYOUT() {
        return constants$1787.const$4;
    }
    public static VarHandle type$VH() {
        return constants$1787.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GdkEventType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)constants$1787.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GdkEventType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        constants$1787.const$5.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)constants$1787.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        constants$1787.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle window$VH() {
        return constants$1788.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkWindow* window;
     * }
     */
    public static MemorySegment window$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1788.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkWindow* window;
     * }
     */
    public static void window$set(MemorySegment seg, MemorySegment x) {
        constants$1788.const$0.set(seg, x);
    }
    public static MemorySegment window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1788.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1788.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle send_event$VH() {
        return constants$1788.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * signed char send_event;
     * }
     */
    public static byte send_event$get(MemorySegment seg) {
        return (byte)constants$1788.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * signed char send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, byte x) {
        constants$1788.const$1.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)constants$1788.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        constants$1788.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle owner$VH() {
        return constants$1788.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkWindow* owner;
     * }
     */
    public static MemorySegment owner$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1788.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkWindow* owner;
     * }
     */
    public static void owner$set(MemorySegment seg, MemorySegment x) {
        constants$1788.const$2.set(seg, x);
    }
    public static MemorySegment owner$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1788.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void owner$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1788.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle reason$VH() {
        return constants$1788.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GdkOwnerChange reason;
     * }
     */
    public static int reason$get(MemorySegment seg) {
        return (int)constants$1788.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GdkOwnerChange reason;
     * }
     */
    public static void reason$set(MemorySegment seg, int x) {
        constants$1788.const$3.set(seg, x);
    }
    public static int reason$get(MemorySegment seg, long index) {
        return (int)constants$1788.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void reason$set(MemorySegment seg, long index, int x) {
        constants$1788.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle selection$VH() {
        return constants$1788.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GdkAtom* selection;
     * }
     */
    public static MemorySegment selection$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1788.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GdkAtom* selection;
     * }
     */
    public static void selection$set(MemorySegment seg, MemorySegment x) {
        constants$1788.const$4.set(seg, x);
    }
    public static MemorySegment selection$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1788.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void selection$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1788.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle time$VH() {
        return constants$1788.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int time;
     * }
     */
    public static int time$get(MemorySegment seg) {
        return (int)constants$1788.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int time;
     * }
     */
    public static void time$set(MemorySegment seg, int x) {
        constants$1788.const$5.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)constants$1788.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        constants$1788.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle selection_time$VH() {
        return constants$1789.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int selection_time;
     * }
     */
    public static int selection_time$get(MemorySegment seg) {
        return (int)constants$1789.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int selection_time;
     * }
     */
    public static void selection_time$set(MemorySegment seg, int x) {
        constants$1789.const$0.set(seg, x);
    }
    public static int selection_time$get(MemorySegment seg, long index) {
        return (int)constants$1789.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void selection_time$set(MemorySegment seg, long index, int x) {
        constants$1789.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

