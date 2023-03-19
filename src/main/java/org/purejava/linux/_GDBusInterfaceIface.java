// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GDBusInterfaceIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("get_info"),
        Constants$root.C_POINTER$LAYOUT.withName("get_object"),
        Constants$root.C_POINTER$LAYOUT.withName("set_object"),
        Constants$root.C_POINTER$LAYOUT.withName("dup_object")
    ).withName("_GDBusInterfaceIface");
    public static MemoryLayout $LAYOUT() {
        return _GDBusInterfaceIface.$struct$LAYOUT;
    }
    public static MemorySegment parent_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_info$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceIface.get_info$FUNC
    );
    public interface get_info {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_info fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_info.class, fi, _GDBusInterfaceIface.get_info$FUNC, session);
        }
        static get_info ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.get_info$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_info$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_info"));
    public static VarHandle get_info$VH() {
        return _GDBusInterfaceIface.get_info$VH;
    }
    public static MemoryAddress get_info$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.get_info$VH.get(seg);
    }
    public static void get_info$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceIface.get_info$VH.set(seg, x);
    }
    public static MemoryAddress get_info$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.get_info$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_info$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceIface.get_info$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_info get_info (MemorySegment segment, MemorySession session) {
        return get_info.ofAddress(get_info$get(segment), session);
    }
    static final FunctionDescriptor get_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_object$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceIface.get_object$FUNC
    );
    public interface get_object {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_object fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_object.class, fi, _GDBusInterfaceIface.get_object$FUNC, session);
        }
        static get_object ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.get_object$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_object$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_object"));
    public static VarHandle get_object$VH() {
        return _GDBusInterfaceIface.get_object$VH;
    }
    public static MemoryAddress get_object$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.get_object$VH.get(seg);
    }
    public static void get_object$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceIface.get_object$VH.set(seg, x);
    }
    public static MemoryAddress get_object$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.get_object$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_object$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceIface.get_object$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_object get_object (MemorySegment segment, MemorySession session) {
        return get_object.ofAddress(get_object$get(segment), session);
    }
    static final FunctionDescriptor set_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_object$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceIface.set_object$FUNC
    );
    public interface set_object {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(set_object fi, MemorySession session) {
            return RuntimeHelper.upcallStub(set_object.class, fi, _GDBusInterfaceIface.set_object$FUNC, session);
        }
        static set_object ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GDBusInterfaceIface.set_object$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_object$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_object"));
    public static VarHandle set_object$VH() {
        return _GDBusInterfaceIface.set_object$VH;
    }
    public static MemoryAddress set_object$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.set_object$VH.get(seg);
    }
    public static void set_object$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceIface.set_object$VH.set(seg, x);
    }
    public static MemoryAddress set_object$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.set_object$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_object$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceIface.set_object$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_object set_object (MemorySegment segment, MemorySession session) {
        return set_object.ofAddress(set_object$get(segment), session);
    }
    static final FunctionDescriptor dup_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle dup_object$MH = RuntimeHelper.downcallHandle(
        _GDBusInterfaceIface.dup_object$FUNC
    );
    public interface dup_object {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(dup_object fi, MemorySession session) {
            return RuntimeHelper.upcallStub(dup_object.class, fi, _GDBusInterfaceIface.dup_object$FUNC, session);
        }
        static dup_object ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.dup_object$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle dup_object$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dup_object"));
    public static VarHandle dup_object$VH() {
        return _GDBusInterfaceIface.dup_object$VH;
    }
    public static MemoryAddress dup_object$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.dup_object$VH.get(seg);
    }
    public static void dup_object$set( MemorySegment seg, MemoryAddress x) {
        _GDBusInterfaceIface.dup_object$VH.set(seg, x);
    }
    public static MemoryAddress dup_object$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GDBusInterfaceIface.dup_object$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dup_object$set(MemorySegment seg, long index, MemoryAddress x) {
        _GDBusInterfaceIface.dup_object$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static dup_object dup_object (MemorySegment segment, MemorySession session) {
        return dup_object.ofAddress(dup_object$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


