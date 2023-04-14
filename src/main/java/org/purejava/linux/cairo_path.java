// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class cairo_path {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("status"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("data"),
        Constants$root.C_INT$LAYOUT.withName("num_data"),
        MemoryLayout.paddingLayout(32)
    ).withName("cairo_path");
    public static MemoryLayout $LAYOUT() {
        return cairo_path.$struct$LAYOUT;
    }
    static final VarHandle status$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("status"));
    public static VarHandle status$VH() {
        return cairo_path.status$VH;
    }
    public static int status$get(MemorySegment seg) {
        return (int)cairo_path.status$VH.get(seg);
    }
    public static void status$set( MemorySegment seg, int x) {
        cairo_path.status$VH.set(seg, x);
    }
    public static int status$get(MemorySegment seg, long index) {
        return (int)cairo_path.status$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void status$set(MemorySegment seg, long index, int x) {
        cairo_path.status$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("data"));
    public static VarHandle data$VH() {
        return cairo_path.data$VH;
    }
    public static MemoryAddress data$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)cairo_path.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, MemoryAddress x) {
        cairo_path.data$VH.set(seg, x);
    }
    public static MemoryAddress data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)cairo_path.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemoryAddress x) {
        cairo_path.data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle num_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("num_data"));
    public static VarHandle num_data$VH() {
        return cairo_path.num_data$VH;
    }
    public static int num_data$get(MemorySegment seg) {
        return (int)cairo_path.num_data$VH.get(seg);
    }
    public static void num_data$set( MemorySegment seg, int x) {
        cairo_path.num_data$VH.set(seg, x);
    }
    public static int num_data$get(MemorySegment seg, long index) {
        return (int)cairo_path.num_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void num_data$set(MemorySegment seg, long index, int x) {
        cairo_path.num_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

