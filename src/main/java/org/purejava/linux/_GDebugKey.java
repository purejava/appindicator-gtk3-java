// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GDebugKey {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("key"),
        Constants$root.C_INT$LAYOUT.withName("value"),
        MemoryLayout.paddingLayout(32)
    ).withName("_GDebugKey");
    public static MemoryLayout $LAYOUT() {
        return _GDebugKey.$struct$LAYOUT;
    }
    static final VarHandle key$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("key"));
    public static VarHandle key$VH() {
        return _GDebugKey.key$VH;
    }
    public static MemoryAddress key$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDebugKey.key$VH.get(seg);
    }
    public static void key$set( MemorySegment seg, MemoryAddress x) {
        _GDebugKey.key$VH.set(seg, x);
    }
    public static MemoryAddress key$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDebugKey.key$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void key$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDebugKey.key$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _GDebugKey.value$VH;
    }
    public static int value$get(MemorySegment seg) {
        return (int)_GDebugKey.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, int x) {
        _GDebugKey.value$VH.set(seg, x);
    }
    public static int value$get(MemorySegment seg, long index) {
        return (int)_GDebugKey.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, int x) {
        _GDebugKey.value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


