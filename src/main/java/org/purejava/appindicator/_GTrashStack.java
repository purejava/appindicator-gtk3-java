// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GTrashStack {
 *     GTrashStack* next;
 * };
 * }
 */
public class _GTrashStack {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("next")
    ).withName("_GTrashStack");
    public static MemoryLayout $LAYOUT() {
        return _GTrashStack.$struct$LAYOUT;
    }
    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return _GTrashStack.next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GTrashStack* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GTrashStack.next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GTrashStack* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        _GTrashStack.next$VH.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GTrashStack.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        _GTrashStack.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

