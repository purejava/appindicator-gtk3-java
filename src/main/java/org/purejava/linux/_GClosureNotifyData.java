// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GClosureNotifyData {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_POINTER$LAYOUT.withName("notify")
    ).withName("_GClosureNotifyData");
    public static MemoryLayout $LAYOUT() {
        return _GClosureNotifyData.$struct$LAYOUT;
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return _GClosureNotifyData.data$VH;
    }
    public static MemoryAddress data$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GClosureNotifyData.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, MemoryAddress x) {
        _GClosureNotifyData.data$VH.set(seg, x);
    }
    public static MemoryAddress data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GClosureNotifyData.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemoryAddress x) {
        _GClosureNotifyData.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle notify$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("notify"));
    public static VarHandle notify$VH() {
        return _GClosureNotifyData.notify$VH;
    }
    public static MemoryAddress notify$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GClosureNotifyData.notify$VH.get(seg);
    }
    public static void notify$set( MemorySegment seg, MemoryAddress x) {
        _GClosureNotifyData.notify$VH.set(seg, x);
    }
    public static MemoryAddress notify$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GClosureNotifyData.notify$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void notify$set(MemorySegment seg, long index, MemoryAddress x) {
        _GClosureNotifyData.notify$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GClosureNotify notify (MemorySegment segment, MemorySession session) {
        return GClosureNotify.ofAddress(notify$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


