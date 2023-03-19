// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tm {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("tm_sec"),
        Constants$root.C_INT$LAYOUT.withName("tm_min"),
        Constants$root.C_INT$LAYOUT.withName("tm_hour"),
        Constants$root.C_INT$LAYOUT.withName("tm_mday"),
        Constants$root.C_INT$LAYOUT.withName("tm_mon"),
        Constants$root.C_INT$LAYOUT.withName("tm_year"),
        Constants$root.C_INT$LAYOUT.withName("tm_wday"),
        Constants$root.C_INT$LAYOUT.withName("tm_yday"),
        Constants$root.C_INT$LAYOUT.withName("tm_isdst"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("tm_gmtoff"),
        Constants$root.C_POINTER$LAYOUT.withName("tm_zone")
    ).withName("tm");
    public static MemoryLayout $LAYOUT() {
        return tm.$struct$LAYOUT;
    }
    static final VarHandle tm_sec$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_sec"));
    public static VarHandle tm_sec$VH() {
        return tm.tm_sec$VH;
    }
    public static int tm_sec$get(MemorySegment seg) {
        return (int)tm.tm_sec$VH.get(seg);
    }
    public static void tm_sec$set( MemorySegment seg, int x) {
        tm.tm_sec$VH.set(seg, x);
    }
    public static int tm_sec$get(MemorySegment seg, long index) {
        return (int)tm.tm_sec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_sec$set(MemorySegment seg, long index, int x) {
        tm.tm_sec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tm_min$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_min"));
    public static VarHandle tm_min$VH() {
        return tm.tm_min$VH;
    }
    public static int tm_min$get(MemorySegment seg) {
        return (int)tm.tm_min$VH.get(seg);
    }
    public static void tm_min$set( MemorySegment seg, int x) {
        tm.tm_min$VH.set(seg, x);
    }
    public static int tm_min$get(MemorySegment seg, long index) {
        return (int)tm.tm_min$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_min$set(MemorySegment seg, long index, int x) {
        tm.tm_min$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tm_hour$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_hour"));
    public static VarHandle tm_hour$VH() {
        return tm.tm_hour$VH;
    }
    public static int tm_hour$get(MemorySegment seg) {
        return (int)tm.tm_hour$VH.get(seg);
    }
    public static void tm_hour$set( MemorySegment seg, int x) {
        tm.tm_hour$VH.set(seg, x);
    }
    public static int tm_hour$get(MemorySegment seg, long index) {
        return (int)tm.tm_hour$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_hour$set(MemorySegment seg, long index, int x) {
        tm.tm_hour$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tm_mday$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_mday"));
    public static VarHandle tm_mday$VH() {
        return tm.tm_mday$VH;
    }
    public static int tm_mday$get(MemorySegment seg) {
        return (int)tm.tm_mday$VH.get(seg);
    }
    public static void tm_mday$set( MemorySegment seg, int x) {
        tm.tm_mday$VH.set(seg, x);
    }
    public static int tm_mday$get(MemorySegment seg, long index) {
        return (int)tm.tm_mday$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_mday$set(MemorySegment seg, long index, int x) {
        tm.tm_mday$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tm_mon$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_mon"));
    public static VarHandle tm_mon$VH() {
        return tm.tm_mon$VH;
    }
    public static int tm_mon$get(MemorySegment seg) {
        return (int)tm.tm_mon$VH.get(seg);
    }
    public static void tm_mon$set( MemorySegment seg, int x) {
        tm.tm_mon$VH.set(seg, x);
    }
    public static int tm_mon$get(MemorySegment seg, long index) {
        return (int)tm.tm_mon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_mon$set(MemorySegment seg, long index, int x) {
        tm.tm_mon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tm_year$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_year"));
    public static VarHandle tm_year$VH() {
        return tm.tm_year$VH;
    }
    public static int tm_year$get(MemorySegment seg) {
        return (int)tm.tm_year$VH.get(seg);
    }
    public static void tm_year$set( MemorySegment seg, int x) {
        tm.tm_year$VH.set(seg, x);
    }
    public static int tm_year$get(MemorySegment seg, long index) {
        return (int)tm.tm_year$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_year$set(MemorySegment seg, long index, int x) {
        tm.tm_year$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tm_wday$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_wday"));
    public static VarHandle tm_wday$VH() {
        return tm.tm_wday$VH;
    }
    public static int tm_wday$get(MemorySegment seg) {
        return (int)tm.tm_wday$VH.get(seg);
    }
    public static void tm_wday$set( MemorySegment seg, int x) {
        tm.tm_wday$VH.set(seg, x);
    }
    public static int tm_wday$get(MemorySegment seg, long index) {
        return (int)tm.tm_wday$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_wday$set(MemorySegment seg, long index, int x) {
        tm.tm_wday$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tm_yday$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_yday"));
    public static VarHandle tm_yday$VH() {
        return tm.tm_yday$VH;
    }
    public static int tm_yday$get(MemorySegment seg) {
        return (int)tm.tm_yday$VH.get(seg);
    }
    public static void tm_yday$set( MemorySegment seg, int x) {
        tm.tm_yday$VH.set(seg, x);
    }
    public static int tm_yday$get(MemorySegment seg, long index) {
        return (int)tm.tm_yday$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_yday$set(MemorySegment seg, long index, int x) {
        tm.tm_yday$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tm_isdst$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_isdst"));
    public static VarHandle tm_isdst$VH() {
        return tm.tm_isdst$VH;
    }
    public static int tm_isdst$get(MemorySegment seg) {
        return (int)tm.tm_isdst$VH.get(seg);
    }
    public static void tm_isdst$set( MemorySegment seg, int x) {
        tm.tm_isdst$VH.set(seg, x);
    }
    public static int tm_isdst$get(MemorySegment seg, long index) {
        return (int)tm.tm_isdst$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_isdst$set(MemorySegment seg, long index, int x) {
        tm.tm_isdst$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tm_gmtoff$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_gmtoff"));
    public static VarHandle tm_gmtoff$VH() {
        return tm.tm_gmtoff$VH;
    }
    public static long tm_gmtoff$get(MemorySegment seg) {
        return (long)tm.tm_gmtoff$VH.get(seg);
    }
    public static void tm_gmtoff$set( MemorySegment seg, long x) {
        tm.tm_gmtoff$VH.set(seg, x);
    }
    public static long tm_gmtoff$get(MemorySegment seg, long index) {
        return (long)tm.tm_gmtoff$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_gmtoff$set(MemorySegment seg, long index, long x) {
        tm.tm_gmtoff$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle tm_zone$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tm_zone"));
    public static VarHandle tm_zone$VH() {
        return tm.tm_zone$VH;
    }
    public static MemoryAddress tm_zone$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tm.tm_zone$VH.get(seg);
    }
    public static void tm_zone$set( MemorySegment seg, MemoryAddress x) {
        tm.tm_zone$VH.set(seg, x);
    }
    public static MemoryAddress tm_zone$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tm.tm_zone$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tm_zone$set(MemorySegment seg, long index, MemoryAddress x) {
        tm.tm_zone$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


