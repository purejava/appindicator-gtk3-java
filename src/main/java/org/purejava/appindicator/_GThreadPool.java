// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GThreadPool {
 *     GFunc func;
 *     gpointer user_data;
 *     gboolean exclusive;
 * };
 * }
 */
public class _GThreadPool {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("func"),
        Constants$root.C_POINTER$LAYOUT.withName("user_data"),
        Constants$root.C_INT$LAYOUT.withName("exclusive"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GThreadPool");
    public static MemoryLayout $LAYOUT() {
        return _GThreadPool.$struct$LAYOUT;
    }
    static final VarHandle func$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("func"));
    public static VarHandle func$VH() {
        return _GThreadPool.func$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GFunc func;
     * }
     */
    public static MemorySegment func$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GThreadPool.func$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GFunc func;
     * }
     */
    public static void func$set(MemorySegment seg, MemorySegment x) {
        _GThreadPool.func$VH.set(seg, x);
    }
    public static MemorySegment func$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GThreadPool.func$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void func$set(MemorySegment seg, long index, MemorySegment x) {
        _GThreadPool.func$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GFunc func(MemorySegment segment, SegmentScope scope) {
        return GFunc.ofAddress(func$get(segment), scope);
    }
    static final VarHandle user_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("user_data"));
    public static VarHandle user_data$VH() {
        return _GThreadPool.user_data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer user_data;
     * }
     */
    public static MemorySegment user_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GThreadPool.user_data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer user_data;
     * }
     */
    public static void user_data$set(MemorySegment seg, MemorySegment x) {
        _GThreadPool.user_data$VH.set(seg, x);
    }
    public static MemorySegment user_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GThreadPool.user_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void user_data$set(MemorySegment seg, long index, MemorySegment x) {
        _GThreadPool.user_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle exclusive$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("exclusive"));
    public static VarHandle exclusive$VH() {
        return _GThreadPool.exclusive$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean exclusive;
     * }
     */
    public static int exclusive$get(MemorySegment seg) {
        return (int)_GThreadPool.exclusive$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean exclusive;
     * }
     */
    public static void exclusive$set(MemorySegment seg, int x) {
        _GThreadPool.exclusive$VH.set(seg, x);
    }
    public static int exclusive$get(MemorySegment seg, long index) {
        return (int)_GThreadPool.exclusive$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void exclusive$set(MemorySegment seg, long index, int x) {
        _GThreadPool.exclusive$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


