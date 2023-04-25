// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkScrollableInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("base_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("get_border")
    ).withName("_GtkScrollableInterface");
    public static MemoryLayout $LAYOUT() {
        return _GtkScrollableInterface.$struct$LAYOUT;
    }
    public static MemorySegment base_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_border$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_border$MH = RuntimeHelper.downcallHandle(
        _GtkScrollableInterface.get_border$FUNC
    );
    public interface get_border {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(get_border fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_border.class, fi, _GtkScrollableInterface.get_border$FUNC, session);
        }
        static get_border ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)_GtkScrollableInterface.get_border$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_border$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_border"));
    public static VarHandle get_border$VH() {
        return _GtkScrollableInterface.get_border$VH;
    }
    public static MemoryAddress get_border$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkScrollableInterface.get_border$VH.get(seg);
    }
    public static void get_border$set( MemorySegment seg, MemoryAddress x) {
        _GtkScrollableInterface.get_border$VH.set(seg, x);
    }
    public static MemoryAddress get_border$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkScrollableInterface.get_border$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_border$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkScrollableInterface.get_border$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_border get_border (MemorySegment segment, MemorySession session) {
        return get_border.ofAddress(get_border$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

