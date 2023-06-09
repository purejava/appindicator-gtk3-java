// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GdkEventGrabBroken {
 *     GdkEventType type;
 *     GdkWindow* window;
 *     gint8 send_event;
 *     gboolean keyboard;
 *     gboolean implicit;
 *     GdkWindow* grab_window;
 * };
 * }
 */
public class _GdkEventGrabBroken {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("window"),
        Constants$root.C_CHAR$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_INT$LAYOUT.withName("keyboard"),
        Constants$root.C_INT$LAYOUT.withName("implicit"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("grab_window")
    ).withName("_GdkEventGrabBroken");
    public static MemoryLayout $LAYOUT() {
        return _GdkEventGrabBroken.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GdkEventGrabBroken.type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkEventType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)_GdkEventGrabBroken.type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkEventType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        _GdkEventGrabBroken.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GdkEventGrabBroken.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GdkEventGrabBroken.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return _GdkEventGrabBroken.window$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkWindow* window;
     * }
     */
    public static MemorySegment window$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkEventGrabBroken.window$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkWindow* window;
     * }
     */
    public static void window$set(MemorySegment seg, MemorySegment x) {
        _GdkEventGrabBroken.window$VH.set(seg, x);
    }
    public static MemorySegment window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkEventGrabBroken.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkEventGrabBroken.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return _GdkEventGrabBroken.send_event$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint8 send_event;
     * }
     */
    public static byte send_event$get(MemorySegment seg) {
        return (byte)_GdkEventGrabBroken.send_event$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint8 send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, byte x) {
        _GdkEventGrabBroken.send_event$VH.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)_GdkEventGrabBroken.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        _GdkEventGrabBroken.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle keyboard$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keyboard"));
    public static VarHandle keyboard$VH() {
        return _GdkEventGrabBroken.keyboard$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean keyboard;
     * }
     */
    public static int keyboard$get(MemorySegment seg) {
        return (int)_GdkEventGrabBroken.keyboard$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean keyboard;
     * }
     */
    public static void keyboard$set(MemorySegment seg, int x) {
        _GdkEventGrabBroken.keyboard$VH.set(seg, x);
    }
    public static int keyboard$get(MemorySegment seg, long index) {
        return (int)_GdkEventGrabBroken.keyboard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keyboard$set(MemorySegment seg, long index, int x) {
        _GdkEventGrabBroken.keyboard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle implicit$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("implicit"));
    public static VarHandle implicit$VH() {
        return _GdkEventGrabBroken.implicit$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean implicit;
     * }
     */
    public static int implicit$get(MemorySegment seg) {
        return (int)_GdkEventGrabBroken.implicit$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean implicit;
     * }
     */
    public static void implicit$set(MemorySegment seg, int x) {
        _GdkEventGrabBroken.implicit$VH.set(seg, x);
    }
    public static int implicit$get(MemorySegment seg, long index) {
        return (int)_GdkEventGrabBroken.implicit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void implicit$set(MemorySegment seg, long index, int x) {
        _GdkEventGrabBroken.implicit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grab_window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("grab_window"));
    public static VarHandle grab_window$VH() {
        return _GdkEventGrabBroken.grab_window$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkWindow* grab_window;
     * }
     */
    public static MemorySegment grab_window$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkEventGrabBroken.grab_window$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkWindow* grab_window;
     * }
     */
    public static void grab_window$set(MemorySegment seg, MemorySegment x) {
        _GdkEventGrabBroken.grab_window$VH.set(seg, x);
    }
    public static MemorySegment grab_window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkEventGrabBroken.grab_window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grab_window$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkEventGrabBroken.grab_window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


