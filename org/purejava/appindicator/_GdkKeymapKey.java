// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GdkKeymapKey {
 *     unsigned int keycode;
 *     int group;
 *     int level;
 * };
 * }
 */
public class _GdkKeymapKey {

    public static MemoryLayout $LAYOUT() {
        return constants$1928.const$2;
    }
    public static VarHandle keycode$VH() {
        return constants$1928.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int keycode;
     * }
     */
    public static int keycode$get(MemorySegment seg) {
        return (int)constants$1928.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int keycode;
     * }
     */
    public static void keycode$set(MemorySegment seg, int x) {
        constants$1928.const$3.set(seg, x);
    }
    public static int keycode$get(MemorySegment seg, long index) {
        return (int)constants$1928.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void keycode$set(MemorySegment seg, long index, int x) {
        constants$1928.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle group$VH() {
        return constants$1928.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int group;
     * }
     */
    public static int group$get(MemorySegment seg) {
        return (int)constants$1928.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int group;
     * }
     */
    public static void group$set(MemorySegment seg, int x) {
        constants$1928.const$4.set(seg, x);
    }
    public static int group$get(MemorySegment seg, long index) {
        return (int)constants$1928.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void group$set(MemorySegment seg, long index, int x) {
        constants$1928.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle level$VH() {
        return constants$1928.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int level;
     * }
     */
    public static int level$get(MemorySegment seg) {
        return (int)constants$1928.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int level;
     * }
     */
    public static void level$set(MemorySegment seg, int x) {
        constants$1928.const$5.set(seg, x);
    }
    public static int level$get(MemorySegment seg, long index) {
        return (int)constants$1928.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void level$set(MemorySegment seg, long index, int x) {
        constants$1928.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

