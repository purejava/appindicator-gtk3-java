// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct __cancel_jmp_buf_tag {
 *     __jmp_buf __cancel_jmp_buf;
 *     int __mask_was_saved;
 * };
 * }
 */
public class __cancel_jmp_buf_tag {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(8, Constants$root.C_LONG_LONG$LAYOUT).withName("__cancel_jmp_buf"),
        Constants$root.C_INT$LAYOUT.withName("__mask_was_saved"),
        MemoryLayout.paddingLayout(32)
    ).withName("__cancel_jmp_buf_tag");
    public static MemoryLayout $LAYOUT() {
        return __cancel_jmp_buf_tag.$struct$LAYOUT;
    }
    public static MemorySegment __cancel_jmp_buf$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    static final VarHandle __mask_was_saved$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__mask_was_saved"));
    public static VarHandle __mask_was_saved$VH() {
        return __cancel_jmp_buf_tag.__mask_was_saved$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int __mask_was_saved;
     * }
     */
    public static int __mask_was_saved$get(MemorySegment seg) {
        return (int)__cancel_jmp_buf_tag.__mask_was_saved$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int __mask_was_saved;
     * }
     */
    public static void __mask_was_saved$set(MemorySegment seg, int x) {
        __cancel_jmp_buf_tag.__mask_was_saved$VH.set(seg, x);
    }
    public static int __mask_was_saved$get(MemorySegment seg, long index) {
        return (int)__cancel_jmp_buf_tag.__mask_was_saved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __mask_was_saved$set(MemorySegment seg, long index, int x) {
        __cancel_jmp_buf_tag.__mask_was_saved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

