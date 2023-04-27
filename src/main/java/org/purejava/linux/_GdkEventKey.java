// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GdkEventKey {
 *     GdkEventType type;
 *     GdkWindow* window;
 *     gint8 send_event;
 *     guint32 time;
 *     guint state;
 *     guint keyval;
 *     gint length;
 *     gchar* string;
 *     guint16 hardware_keycode;
 *     guint8 group;
 *      *     guint is_modifier;
 * };
 * }
 */
public class _GdkEventKey {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("window"),
        Constants$root.C_CHAR$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_INT$LAYOUT.withName("time"),
        Constants$root.C_INT$LAYOUT.withName("state"),
        Constants$root.C_INT$LAYOUT.withName("keyval"),
        Constants$root.C_INT$LAYOUT.withName("length"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("string"),
        Constants$root.C_SHORT$LAYOUT.withName("hardware_keycode"),
        Constants$root.C_CHAR$LAYOUT.withName("group"),
        MemoryLayout.paddingLayout(40)
    ).withName("_GdkEventKey");
    public static MemoryLayout $LAYOUT() {
        return _GdkEventKey.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return _GdkEventKey.type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkEventType type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)_GdkEventKey.type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkEventType type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        _GdkEventKey.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)_GdkEventKey.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        _GdkEventKey.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return _GdkEventKey.window$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GdkWindow* window;
     * }
     */
    public static MemorySegment window$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkEventKey.window$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GdkWindow* window;
     * }
     */
    public static void window$set(MemorySegment seg, MemorySegment x) {
        _GdkEventKey.window$VH.set(seg, x);
    }
    public static MemorySegment window$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkEventKey.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkEventKey.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return _GdkEventKey.send_event$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint8 send_event;
     * }
     */
    public static byte send_event$get(MemorySegment seg) {
        return (byte)_GdkEventKey.send_event$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint8 send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, byte x) {
        _GdkEventKey.send_event$VH.set(seg, x);
    }
    public static byte send_event$get(MemorySegment seg, long index) {
        return (byte)_GdkEventKey.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, byte x) {
        _GdkEventKey.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return _GdkEventKey.time$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint32 time;
     * }
     */
    public static int time$get(MemorySegment seg) {
        return (int)_GdkEventKey.time$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint32 time;
     * }
     */
    public static void time$set(MemorySegment seg, int x) {
        _GdkEventKey.time$VH.set(seg, x);
    }
    public static int time$get(MemorySegment seg, long index) {
        return (int)_GdkEventKey.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, int x) {
        _GdkEventKey.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return _GdkEventKey.state$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint state;
     * }
     */
    public static int state$get(MemorySegment seg) {
        return (int)_GdkEventKey.state$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint state;
     * }
     */
    public static void state$set(MemorySegment seg, int x) {
        _GdkEventKey.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)_GdkEventKey.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        _GdkEventKey.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle keyval$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keyval"));
    public static VarHandle keyval$VH() {
        return _GdkEventKey.keyval$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint keyval;
     * }
     */
    public static int keyval$get(MemorySegment seg) {
        return (int)_GdkEventKey.keyval$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint keyval;
     * }
     */
    public static void keyval$set(MemorySegment seg, int x) {
        _GdkEventKey.keyval$VH.set(seg, x);
    }
    public static int keyval$get(MemorySegment seg, long index) {
        return (int)_GdkEventKey.keyval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keyval$set(MemorySegment seg, long index, int x) {
        _GdkEventKey.keyval$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return _GdkEventKey.length$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)_GdkEventKey.length$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        _GdkEventKey.length$VH.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)_GdkEventKey.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        _GdkEventKey.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle string$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("string"));
    public static VarHandle string$VH() {
        return _GdkEventKey.string$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* string;
     * }
     */
    public static MemorySegment string$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkEventKey.string$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* string;
     * }
     */
    public static void string$set(MemorySegment seg, MemorySegment x) {
        _GdkEventKey.string$VH.set(seg, x);
    }
    public static MemorySegment string$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkEventKey.string$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void string$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkEventKey.string$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hardware_keycode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hardware_keycode"));
    public static VarHandle hardware_keycode$VH() {
        return _GdkEventKey.hardware_keycode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint16 hardware_keycode;
     * }
     */
    public static short hardware_keycode$get(MemorySegment seg) {
        return (short)_GdkEventKey.hardware_keycode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint16 hardware_keycode;
     * }
     */
    public static void hardware_keycode$set(MemorySegment seg, short x) {
        _GdkEventKey.hardware_keycode$VH.set(seg, x);
    }
    public static short hardware_keycode$get(MemorySegment seg, long index) {
        return (short)_GdkEventKey.hardware_keycode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hardware_keycode$set(MemorySegment seg, long index, short x) {
        _GdkEventKey.hardware_keycode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle group$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("group"));
    public static VarHandle group$VH() {
        return _GdkEventKey.group$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint8 group;
     * }
     */
    public static byte group$get(MemorySegment seg) {
        return (byte)_GdkEventKey.group$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint8 group;
     * }
     */
    public static void group$set(MemorySegment seg, byte x) {
        _GdkEventKey.group$VH.set(seg, x);
    }
    public static byte group$get(MemorySegment seg, long index) {
        return (byte)_GdkEventKey.group$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void group$set(MemorySegment seg, long index, byte x) {
        _GdkEventKey.group$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


