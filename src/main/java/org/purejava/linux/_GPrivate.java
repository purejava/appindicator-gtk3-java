// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GPrivate {
 *     gpointer p;
 *     GDestroyNotify notify;
 *     gpointer future[2];
 * };
 * }
 */
public class _GPrivate {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("p"),
        Constants$root.C_POINTER$LAYOUT.withName("notify"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("future")
    ).withName("_GPrivate");
    public static MemoryLayout $LAYOUT() {
        return _GPrivate.$struct$LAYOUT;
    }
    static final VarHandle p$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("p"));
    public static VarHandle p$VH() {
        return _GPrivate.p$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer p;
     * }
     */
    public static MemorySegment p$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GPrivate.p$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer p;
     * }
     */
    public static void p$set(MemorySegment seg, MemorySegment x) {
        _GPrivate.p$VH.set(seg, x);
    }
    public static MemorySegment p$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GPrivate.p$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void p$set(MemorySegment seg, long index, MemorySegment x) {
        _GPrivate.p$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle notify$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("notify"));
    public static VarHandle notify$VH() {
        return _GPrivate.notify$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GDestroyNotify notify;
     * }
     */
    public static MemorySegment notify$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GPrivate.notify$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GDestroyNotify notify;
     * }
     */
    public static void notify$set(MemorySegment seg, MemorySegment x) {
        _GPrivate.notify$VH.set(seg, x);
    }
    public static MemorySegment notify$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GPrivate.notify$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void notify$set(MemorySegment seg, long index, MemorySegment x) {
        _GPrivate.notify$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GDestroyNotify notify(MemorySegment segment, SegmentScope scope) {
        return GDestroyNotify.ofAddress(notify$get(segment), scope);
    }
    public static MemorySegment future$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


