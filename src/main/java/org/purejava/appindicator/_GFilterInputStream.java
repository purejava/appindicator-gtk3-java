// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GFilterInputStream {
 *     struct _GInputStream parent_instance;
 *     struct _GInputStream* base_stream;
 * };
 * }
 */
public class _GFilterInputStream {

    public static MemoryLayout $LAYOUT() {
        return constants$770.const$0;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 32);
    }
    public static VarHandle base_stream$VH() {
        return constants$770.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GInputStream* base_stream;
     * }
     */
    public static MemorySegment base_stream$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$770.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GInputStream* base_stream;
     * }
     */
    public static void base_stream$set(MemorySegment seg, MemorySegment x) {
        constants$770.const$1.set(seg, x);
    }
    public static MemorySegment base_stream$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$770.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void base_stream$set(MemorySegment seg, long index, MemorySegment x) {
        constants$770.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

