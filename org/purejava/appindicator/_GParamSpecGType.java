// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GParamSpecGType {
 *     struct _GParamSpec parent_instance;
 *     unsigned long is_a_type;
 * };
 * }
 */
public class _GParamSpecGType {

    public static MemoryLayout $LAYOUT() {
        return constants$665.const$2;
    }
    public static MemorySegment parent_instance$slice(MemorySegment seg) {
        return seg.asSlice(0, 72);
    }
    public static VarHandle is_a_type$VH() {
        return constants$665.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long is_a_type;
     * }
     */
    public static long is_a_type$get(MemorySegment seg) {
        return (long)constants$665.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long is_a_type;
     * }
     */
    public static void is_a_type$set(MemorySegment seg, long x) {
        constants$665.const$3.set(seg, x);
    }
    public static long is_a_type$get(MemorySegment seg, long index) {
        return (long)constants$665.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void is_a_type$set(MemorySegment seg, long index, long x) {
        constants$665.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


