// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct zt_context {
 *     struct _aarch64_ctx head;
 *     unsigned short nregs;
 *     unsigned short __reserved[3];
 * };
 * }
 */
public class zt_context {

    public static MemoryLayout $LAYOUT() {
        return constants$134.const$2;
    }
    public static MemorySegment head$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static VarHandle nregs$VH() {
        return constants$134.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned short nregs;
     * }
     */
    public static short nregs$get(MemorySegment seg) {
        return (short)constants$134.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned short nregs;
     * }
     */
    public static void nregs$set(MemorySegment seg, short x) {
        constants$134.const$3.set(seg, x);
    }
    public static short nregs$get(MemorySegment seg, long index) {
        return (short)constants$134.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void nregs$set(MemorySegment seg, long index, short x) {
        constants$134.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __reserved$slice(MemorySegment seg) {
        return seg.asSlice(10, 6);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


