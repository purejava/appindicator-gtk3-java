// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GCClosure {
 *     GClosure closure;
 *     gpointer callback;
 * };
 * }
 */
public class _GCClosure {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.paddingLayout(64),
            Constants$root.C_POINTER$LAYOUT.withName("marshal"),
            Constants$root.C_POINTER$LAYOUT.withName("data"),
            Constants$root.C_POINTER$LAYOUT.withName("notifiers")
        ).withName("closure"),
        Constants$root.C_POINTER$LAYOUT.withName("callback")
    ).withName("_GCClosure");
    public static MemoryLayout $LAYOUT() {
        return _GCClosure.$struct$LAYOUT;
    }
    public static MemorySegment closure$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    static final VarHandle callback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("callback"));
    public static VarHandle callback$VH() {
        return _GCClosure.callback$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gpointer callback;
     * }
     */
    public static MemorySegment callback$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GCClosure.callback$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gpointer callback;
     * }
     */
    public static void callback$set(MemorySegment seg, MemorySegment x) {
        _GCClosure.callback$VH.set(seg, x);
    }
    public static MemorySegment callback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GCClosure.callback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void callback$set(MemorySegment seg, long index, MemorySegment x) {
        _GCClosure.callback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


