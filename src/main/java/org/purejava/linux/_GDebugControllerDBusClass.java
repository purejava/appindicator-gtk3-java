// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GDebugControllerDBusClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
            ).withName("g_type_class"),
            Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
            Constants$root.C_POINTER$LAYOUT.withName("constructor"),
            Constants$root.C_POINTER$LAYOUT.withName("set_property"),
            Constants$root.C_POINTER$LAYOUT.withName("get_property"),
            Constants$root.C_POINTER$LAYOUT.withName("dispose"),
            Constants$root.C_POINTER$LAYOUT.withName("finalize"),
            Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("notify"),
            Constants$root.C_POINTER$LAYOUT.withName("constructed"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("authorize"),
        MemoryLayout.sequenceLayout(12, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GDebugControllerDBusClass");
    public static MemoryLayout $LAYOUT() {
        return _GDebugControllerDBusClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor authorize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle authorize$MH = RuntimeHelper.downcallHandle(
        _GDebugControllerDBusClass.authorize$FUNC
    );
    public interface authorize {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(authorize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(authorize.class, fi, _GDebugControllerDBusClass.authorize$FUNC, session);
        }
        static authorize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)_GDebugControllerDBusClass.authorize$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle authorize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("authorize"));
    public static VarHandle authorize$VH() {
        return _GDebugControllerDBusClass.authorize$VH;
    }
    public static MemoryAddress authorize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDebugControllerDBusClass.authorize$VH.get(seg);
    }
    public static void authorize$set( MemorySegment seg, MemoryAddress x) {
        _GDebugControllerDBusClass.authorize$VH.set(seg, x);
    }
    public static MemoryAddress authorize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDebugControllerDBusClass.authorize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void authorize$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDebugControllerDBusClass.authorize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static authorize authorize (MemorySegment segment, MemorySession session) {
        return authorize.ofAddress(authorize$get(segment), session);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(144, 96);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

