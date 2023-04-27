// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _fpx_sw_bytes {
 *     __uint32_t magic1;
 *     __uint32_t extended_size;
 *     __uint64_t xstate_bv;
 *     __uint32_t xstate_size;
 *     __uint32_t __glibc_reserved1[7];
 * };
 * }
 */
public class _fpx_sw_bytes {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("magic1"),
        Constants$root.C_INT$LAYOUT.withName("extended_size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("xstate_bv"),
        Constants$root.C_INT$LAYOUT.withName("xstate_size"),
        MemoryLayout.sequenceLayout(7, Constants$root.C_INT$LAYOUT).withName("__glibc_reserved1")
    ).withName("_fpx_sw_bytes");
    public static MemoryLayout $LAYOUT() {
        return _fpx_sw_bytes.$struct$LAYOUT;
    }
    static final VarHandle magic1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("magic1"));
    public static VarHandle magic1$VH() {
        return _fpx_sw_bytes.magic1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint32_t magic1;
     * }
     */
    public static int magic1$get(MemorySegment seg) {
        return (int)_fpx_sw_bytes.magic1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint32_t magic1;
     * }
     */
    public static void magic1$set(MemorySegment seg, int x) {
        _fpx_sw_bytes.magic1$VH.set(seg, x);
    }
    public static int magic1$get(MemorySegment seg, long index) {
        return (int)_fpx_sw_bytes.magic1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void magic1$set(MemorySegment seg, long index, int x) {
        _fpx_sw_bytes.magic1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle extended_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("extended_size"));
    public static VarHandle extended_size$VH() {
        return _fpx_sw_bytes.extended_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint32_t extended_size;
     * }
     */
    public static int extended_size$get(MemorySegment seg) {
        return (int)_fpx_sw_bytes.extended_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint32_t extended_size;
     * }
     */
    public static void extended_size$set(MemorySegment seg, int x) {
        _fpx_sw_bytes.extended_size$VH.set(seg, x);
    }
    public static int extended_size$get(MemorySegment seg, long index) {
        return (int)_fpx_sw_bytes.extended_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void extended_size$set(MemorySegment seg, long index, int x) {
        _fpx_sw_bytes.extended_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xstate_bv$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xstate_bv"));
    public static VarHandle xstate_bv$VH() {
        return _fpx_sw_bytes.xstate_bv$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint64_t xstate_bv;
     * }
     */
    public static long xstate_bv$get(MemorySegment seg) {
        return (long)_fpx_sw_bytes.xstate_bv$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint64_t xstate_bv;
     * }
     */
    public static void xstate_bv$set(MemorySegment seg, long x) {
        _fpx_sw_bytes.xstate_bv$VH.set(seg, x);
    }
    public static long xstate_bv$get(MemorySegment seg, long index) {
        return (long)_fpx_sw_bytes.xstate_bv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xstate_bv$set(MemorySegment seg, long index, long x) {
        _fpx_sw_bytes.xstate_bv$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xstate_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("xstate_size"));
    public static VarHandle xstate_size$VH() {
        return _fpx_sw_bytes.xstate_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * __uint32_t xstate_size;
     * }
     */
    public static int xstate_size$get(MemorySegment seg) {
        return (int)_fpx_sw_bytes.xstate_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * __uint32_t xstate_size;
     * }
     */
    public static void xstate_size$set(MemorySegment seg, int x) {
        _fpx_sw_bytes.xstate_size$VH.set(seg, x);
    }
    public static int xstate_size$get(MemorySegment seg, long index) {
        return (int)_fpx_sw_bytes.xstate_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xstate_size$set(MemorySegment seg, long index, int x) {
        _fpx_sw_bytes.xstate_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __glibc_reserved1$slice(MemorySegment seg) {
        return seg.asSlice(20, 28);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


