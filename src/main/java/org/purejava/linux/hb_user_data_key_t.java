// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class hb_user_data_key_t {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("unused")
    ).withName("hb_user_data_key_t");
    public static MemoryLayout $LAYOUT() {
        return hb_user_data_key_t.$struct$LAYOUT;
    }
    static final VarHandle unused$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unused"));
    public static VarHandle unused$VH() {
        return hb_user_data_key_t.unused$VH;
    }
    public static byte unused$get(MemorySegment seg) {
        return (byte)hb_user_data_key_t.unused$VH.get(seg);
    }
    public static void unused$set( MemorySegment seg, byte x) {
        hb_user_data_key_t.unused$VH.set(seg, x);
    }
    public static byte unused$get(MemorySegment seg, long index) {
        return (byte)hb_user_data_key_t.unused$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unused$set(MemorySegment seg, long index, byte x) {
        hb_user_data_key_t.unused$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

