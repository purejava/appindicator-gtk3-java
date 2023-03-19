// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GNetworkMonitorInterface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("network_changed"),
        Constants$root.C_POINTER$LAYOUT.withName("can_reach"),
        Constants$root.C_POINTER$LAYOUT.withName("can_reach_async"),
        Constants$root.C_POINTER$LAYOUT.withName("can_reach_finish")
    ).withName("_GNetworkMonitorInterface");
    public static MemoryLayout $LAYOUT() {
        return _GNetworkMonitorInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor network_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle network_changed$MH = RuntimeHelper.downcallHandle(
        _GNetworkMonitorInterface.network_changed$FUNC
    );
    public interface network_changed {

        void apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(network_changed fi, MemorySession session) {
            return RuntimeHelper.upcallStub(network_changed.class, fi, _GNetworkMonitorInterface.network_changed$FUNC, session);
        }
        static network_changed ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    _GNetworkMonitorInterface.network_changed$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle network_changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("network_changed"));
    public static VarHandle network_changed$VH() {
        return _GNetworkMonitorInterface.network_changed$VH;
    }
    public static MemoryAddress network_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GNetworkMonitorInterface.network_changed$VH.get(seg);
    }
    public static void network_changed$set( MemorySegment seg, MemoryAddress x) {
        _GNetworkMonitorInterface.network_changed$VH.set(seg, x);
    }
    public static MemoryAddress network_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GNetworkMonitorInterface.network_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void network_changed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GNetworkMonitorInterface.network_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static network_changed network_changed (MemorySegment segment, MemorySession session) {
        return network_changed.ofAddress(network_changed$get(segment), session);
    }
    static final FunctionDescriptor can_reach$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_reach$MH = RuntimeHelper.downcallHandle(
        _GNetworkMonitorInterface.can_reach$FUNC
    );
    public interface can_reach {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(can_reach fi, MemorySession session) {
            return RuntimeHelper.upcallStub(can_reach.class, fi, _GNetworkMonitorInterface.can_reach$FUNC, session);
        }
        static can_reach ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)_GNetworkMonitorInterface.can_reach$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle can_reach$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("can_reach"));
    public static VarHandle can_reach$VH() {
        return _GNetworkMonitorInterface.can_reach$VH;
    }
    public static MemoryAddress can_reach$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GNetworkMonitorInterface.can_reach$VH.get(seg);
    }
    public static void can_reach$set( MemorySegment seg, MemoryAddress x) {
        _GNetworkMonitorInterface.can_reach$VH.set(seg, x);
    }
    public static MemoryAddress can_reach$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GNetworkMonitorInterface.can_reach$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void can_reach$set(MemorySegment seg, long index, MemoryAddress x) {
        _GNetworkMonitorInterface.can_reach$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_reach can_reach (MemorySegment segment, MemorySession session) {
        return can_reach.ofAddress(can_reach$get(segment), session);
    }
    static final FunctionDescriptor can_reach_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_reach_async$MH = RuntimeHelper.downcallHandle(
        _GNetworkMonitorInterface.can_reach_async$FUNC
    );
    public interface can_reach_async {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(can_reach_async fi, MemorySession session) {
            return RuntimeHelper.upcallStub(can_reach_async.class, fi, _GNetworkMonitorInterface.can_reach_async$FUNC, session);
        }
        static can_reach_async ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    _GNetworkMonitorInterface.can_reach_async$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle can_reach_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("can_reach_async"));
    public static VarHandle can_reach_async$VH() {
        return _GNetworkMonitorInterface.can_reach_async$VH;
    }
    public static MemoryAddress can_reach_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GNetworkMonitorInterface.can_reach_async$VH.get(seg);
    }
    public static void can_reach_async$set( MemorySegment seg, MemoryAddress x) {
        _GNetworkMonitorInterface.can_reach_async$VH.set(seg, x);
    }
    public static MemoryAddress can_reach_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GNetworkMonitorInterface.can_reach_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void can_reach_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GNetworkMonitorInterface.can_reach_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_reach_async can_reach_async (MemorySegment segment, MemorySession session) {
        return can_reach_async.ofAddress(can_reach_async$get(segment), session);
    }
    static final FunctionDescriptor can_reach_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle can_reach_finish$MH = RuntimeHelper.downcallHandle(
        _GNetworkMonitorInterface.can_reach_finish$FUNC
    );
    public interface can_reach_finish {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(can_reach_finish fi, MemorySession session) {
            return RuntimeHelper.upcallStub(can_reach_finish.class, fi, _GNetworkMonitorInterface.can_reach_finish$FUNC, session);
        }
        static can_reach_finish ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)_GNetworkMonitorInterface.can_reach_finish$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle can_reach_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("can_reach_finish"));
    public static VarHandle can_reach_finish$VH() {
        return _GNetworkMonitorInterface.can_reach_finish$VH;
    }
    public static MemoryAddress can_reach_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GNetworkMonitorInterface.can_reach_finish$VH.get(seg);
    }
    public static void can_reach_finish$set( MemorySegment seg, MemoryAddress x) {
        _GNetworkMonitorInterface.can_reach_finish$VH.set(seg, x);
    }
    public static MemoryAddress can_reach_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GNetworkMonitorInterface.can_reach_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void can_reach_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GNetworkMonitorInterface.can_reach_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static can_reach_finish can_reach_finish (MemorySegment segment, MemorySession session) {
        return can_reach_finish.ofAddress(can_reach_finish$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


