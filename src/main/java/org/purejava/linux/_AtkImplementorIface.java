// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _AtkImplementorIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("ref_accessible")
    ).withName("_AtkImplementorIface");
    public static MemoryLayout $LAYOUT() {
        return _AtkImplementorIface.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor ref_accessible$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ref_accessible$MH = RuntimeHelper.downcallHandle(
        _AtkImplementorIface.ref_accessible$FUNC
    );
    public interface ref_accessible {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(ref_accessible fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ref_accessible.class, fi, _AtkImplementorIface.ref_accessible$FUNC, session);
        }
        static ref_accessible ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_AtkImplementorIface.ref_accessible$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ref_accessible$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_accessible"));
    public static VarHandle ref_accessible$VH() {
        return _AtkImplementorIface.ref_accessible$VH;
    }
    public static MemoryAddress ref_accessible$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkImplementorIface.ref_accessible$VH.get(seg);
    }
    public static void ref_accessible$set( MemorySegment seg, MemoryAddress x) {
        _AtkImplementorIface.ref_accessible$VH.set(seg, x);
    }
    public static MemoryAddress ref_accessible$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkImplementorIface.ref_accessible$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_accessible$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkImplementorIface.ref_accessible$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ref_accessible ref_accessible (MemorySegment segment, MemorySession session) {
        return ref_accessible.ofAddress(ref_accessible$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


