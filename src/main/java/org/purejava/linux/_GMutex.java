// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GMutex {

    static final  GroupLayout $union$LAYOUT = MemoryLayout.unionLayout(
        Constants$root.C_POINTER$LAYOUT.withName("p"),
        MemoryLayout.sequenceLayout(2, Constants$root.C_INT$LAYOUT).withName("i")
    ).withName("_GMutex");
    public static MemoryLayout $LAYOUT() {
        return _GMutex.$union$LAYOUT;
    }
    static final VarHandle p$VH = $union$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("p"));
    public static VarHandle p$VH() {
        return _GMutex.p$VH;
    }
    public static MemoryAddress p$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GMutex.p$VH.get(seg);
    }
    public static void p$set( MemorySegment seg, MemoryAddress x) {
        _GMutex.p$VH.set(seg, x);
    }
    public static MemoryAddress p$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GMutex.p$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void p$set(MemorySegment seg, long index, MemoryAddress x) {
        _GMutex.p$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment i$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


