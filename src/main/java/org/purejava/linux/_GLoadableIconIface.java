// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GLoadableIconIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("load"),
        Constants$root.C_POINTER$LAYOUT.withName("load_async"),
        Constants$root.C_POINTER$LAYOUT.withName("load_finish")
    ).withName("_GLoadableIconIface");
    public static MemoryLayout $LAYOUT() {
        return _GLoadableIconIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor load$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle load$MH = RuntimeHelper.downcallHandle(
        _GLoadableIconIface.load$FUNC
    );
    public interface load {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(load fi, MemorySession session) {
            return RuntimeHelper.upcallStub(load.class, fi, _GLoadableIconIface.load$FUNC, session);
        }
        static load ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GLoadableIconIface.load$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle load$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("load"));
    public static VarHandle load$VH() {
        return _GLoadableIconIface.load$VH;
    }
    public static MemoryAddress load$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GLoadableIconIface.load$VH.get(seg);
    }
    public static void load$set( MemorySegment seg, MemoryAddress x) {
        _GLoadableIconIface.load$VH.set(seg, x);
    }
    public static MemoryAddress load$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GLoadableIconIface.load$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void load$set(MemorySegment seg, long index, MemoryAddress x) {
        _GLoadableIconIface.load$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static load load (MemorySegment segment, MemorySession session) {
        return load.ofAddress(load$get(segment), session);
    }
    static final FunctionDescriptor load_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle load_async$MH = RuntimeHelper.downcallHandle(
        _GLoadableIconIface.load_async$FUNC
    );
    public interface load_async {

        void apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(load_async fi, MemorySession session) {
            return RuntimeHelper.upcallStub(load_async.class, fi, _GLoadableIconIface.load_async$FUNC, session);
        }
        static load_async ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    _GLoadableIconIface.load_async$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle load_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("load_async"));
    public static VarHandle load_async$VH() {
        return _GLoadableIconIface.load_async$VH;
    }
    public static MemoryAddress load_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GLoadableIconIface.load_async$VH.get(seg);
    }
    public static void load_async$set( MemorySegment seg, MemoryAddress x) {
        _GLoadableIconIface.load_async$VH.set(seg, x);
    }
    public static MemoryAddress load_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GLoadableIconIface.load_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void load_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GLoadableIconIface.load_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static load_async load_async (MemorySegment segment, MemorySession session) {
        return load_async.ofAddress(load_async$get(segment), session);
    }
    static final FunctionDescriptor load_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle load_finish$MH = RuntimeHelper.downcallHandle(
        _GLoadableIconIface.load_finish$FUNC
    );
    public interface load_finish {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(load_finish fi, MemorySession session) {
            return RuntimeHelper.upcallStub(load_finish.class, fi, _GLoadableIconIface.load_finish$FUNC, session);
        }
        static load_finish ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GLoadableIconIface.load_finish$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle load_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("load_finish"));
    public static VarHandle load_finish$VH() {
        return _GLoadableIconIface.load_finish$VH;
    }
    public static MemoryAddress load_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GLoadableIconIface.load_finish$VH.get(seg);
    }
    public static void load_finish$set( MemorySegment seg, MemoryAddress x) {
        _GLoadableIconIface.load_finish$VH.set(seg, x);
    }
    public static MemoryAddress load_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GLoadableIconIface.load_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void load_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GLoadableIconIface.load_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static load_finish load_finish (MemorySegment segment, MemorySession session) {
        return load_finish.ofAddress(load_finish$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

