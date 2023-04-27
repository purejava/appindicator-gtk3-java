// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GdkKeymapKey {
 *     guint keycode;
 *     gint group;
 *     gint level;
 * };
 * }
 */
public class _GdkKeymapKey {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("keycode"),
        Constants$root.C_INT$LAYOUT.withName("group"),
        Constants$root.C_INT$LAYOUT.withName("level")
    ).withName("_GdkKeymapKey");
    public static MemoryLayout $LAYOUT() {
        return _GdkKeymapKey.$struct$LAYOUT;
    }
    static final VarHandle keycode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keycode"));
    public static VarHandle keycode$VH() {
        return _GdkKeymapKey.keycode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * guint keycode;
     * }
     */
    public static int keycode$get(MemorySegment seg) {
        return (int)_GdkKeymapKey.keycode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * guint keycode;
     * }
     */
    public static void keycode$set(MemorySegment seg, int x) {
        _GdkKeymapKey.keycode$VH.set(seg, x);
    }
    public static int keycode$get(MemorySegment seg, long index) {
        return (int)_GdkKeymapKey.keycode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keycode$set(MemorySegment seg, long index, int x) {
        _GdkKeymapKey.keycode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle group$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("group"));
    public static VarHandle group$VH() {
        return _GdkKeymapKey.group$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint group;
     * }
     */
    public static int group$get(MemorySegment seg) {
        return (int)_GdkKeymapKey.group$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint group;
     * }
     */
    public static void group$set(MemorySegment seg, int x) {
        _GdkKeymapKey.group$VH.set(seg, x);
    }
    public static int group$get(MemorySegment seg, long index) {
        return (int)_GdkKeymapKey.group$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void group$set(MemorySegment seg, long index, int x) {
        _GdkKeymapKey.group$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle level$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("level"));
    public static VarHandle level$VH() {
        return _GdkKeymapKey.level$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint level;
     * }
     */
    public static int level$get(MemorySegment seg) {
        return (int)_GdkKeymapKey.level$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint level;
     * }
     */
    public static void level$set(MemorySegment seg, int x) {
        _GdkKeymapKey.level$VH.set(seg, x);
    }
    public static int level$get(MemorySegment seg, long index) {
        return (int)_GdkKeymapKey.level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void level$set(MemorySegment seg, long index, int x) {
        _GdkKeymapKey.level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


