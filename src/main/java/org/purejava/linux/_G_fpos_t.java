// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _G_fpos_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("__pos"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("__count"),
            MemoryLayout.unionLayout(
                Constants$root.C_INT$LAYOUT.withName("__wch"),
                MemoryLayout.sequenceLayout(4, Constants$root.C_CHAR$LAYOUT).withName("__wchb")
            ).withName("__value")
        ).withName("__state")
    ).withName("_G_fpos_t");
    public static MemoryLayout $LAYOUT() {
        return _G_fpos_t.$struct$LAYOUT;
    }
    static final VarHandle __pos$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__pos"));
    public static VarHandle __pos$VH() {
        return _G_fpos_t.__pos$VH;
    }
    public static long __pos$get(MemorySegment seg) {
        return (long)_G_fpos_t.__pos$VH.get(seg);
    }
    public static void __pos$set( MemorySegment seg, long x) {
        _G_fpos_t.__pos$VH.set(seg, x);
    }
    public static long __pos$get(MemorySegment seg, long index) {
        return (long)_G_fpos_t.__pos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __pos$set(MemorySegment seg, long index, long x) {
        _G_fpos_t.__pos$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __state$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


