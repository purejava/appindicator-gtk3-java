// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkCellRendererToggleClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            Constants$root.C_POINTER$LAYOUT.withName("get_request_mode"),
            Constants$root.C_POINTER$LAYOUT.withName("get_preferred_width"),
            Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height_for_width"),
            Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height"),
            Constants$root.C_POINTER$LAYOUT.withName("get_preferred_width_for_height"),
            Constants$root.C_POINTER$LAYOUT.withName("get_aligned_area"),
            Constants$root.C_POINTER$LAYOUT.withName("get_size"),
            Constants$root.C_POINTER$LAYOUT.withName("render"),
            Constants$root.C_POINTER$LAYOUT.withName("activate"),
            Constants$root.C_POINTER$LAYOUT.withName("start_editing"),
            Constants$root.C_POINTER$LAYOUT.withName("editing_canceled"),
            Constants$root.C_POINTER$LAYOUT.withName("editing_started"),
            Constants$root.C_POINTER$LAYOUT.withName("priv"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("toggled"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
    ).withName("_GtkCellRendererToggleClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkCellRendererToggleClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 264);
    }
    static final FunctionDescriptor toggled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle toggled$MH = RuntimeHelper.downcallHandle(
        _GtkCellRendererToggleClass.toggled$FUNC
    );
    public interface toggled {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(toggled fi, MemorySession session) {
            return RuntimeHelper.upcallStub(toggled.class, fi, _GtkCellRendererToggleClass.toggled$FUNC, session);
        }
        static toggled ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GtkCellRendererToggleClass.toggled$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle toggled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("toggled"));
    public static VarHandle toggled$VH() {
        return _GtkCellRendererToggleClass.toggled$VH;
    }
    public static MemoryAddress toggled$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCellRendererToggleClass.toggled$VH.get(seg);
    }
    public static void toggled$set( MemorySegment seg, MemoryAddress x) {
        _GtkCellRendererToggleClass.toggled$VH.set(seg, x);
    }
    public static MemoryAddress toggled$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCellRendererToggleClass.toggled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void toggled$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCellRendererToggleClass.toggled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static toggled toggled (MemorySegment segment, MemorySession session) {
        return toggled.ofAddress(toggled$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1$MH = RuntimeHelper.downcallHandle(
        _GtkCellRendererToggleClass._gtk_reserved1$FUNC
    );
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved1.class, fi, _GtkCellRendererToggleClass._gtk_reserved1$FUNC, session);
        }
        static _gtk_reserved1 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkCellRendererToggleClass._gtk_reserved1$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkCellRendererToggleClass._gtk_reserved1$VH;
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCellRendererToggleClass._gtk_reserved1$VH.get(seg);
    }
    public static void _gtk_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GtkCellRendererToggleClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCellRendererToggleClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCellRendererToggleClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2$MH = RuntimeHelper.downcallHandle(
        _GtkCellRendererToggleClass._gtk_reserved2$FUNC
    );
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved2.class, fi, _GtkCellRendererToggleClass._gtk_reserved2$FUNC, session);
        }
        static _gtk_reserved2 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkCellRendererToggleClass._gtk_reserved2$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkCellRendererToggleClass._gtk_reserved2$VH;
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCellRendererToggleClass._gtk_reserved2$VH.get(seg);
    }
    public static void _gtk_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GtkCellRendererToggleClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCellRendererToggleClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCellRendererToggleClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3$MH = RuntimeHelper.downcallHandle(
        _GtkCellRendererToggleClass._gtk_reserved3$FUNC
    );
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved3.class, fi, _GtkCellRendererToggleClass._gtk_reserved3$FUNC, session);
        }
        static _gtk_reserved3 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkCellRendererToggleClass._gtk_reserved3$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkCellRendererToggleClass._gtk_reserved3$VH;
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCellRendererToggleClass._gtk_reserved3$VH.get(seg);
    }
    public static void _gtk_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GtkCellRendererToggleClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCellRendererToggleClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCellRendererToggleClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4$MH = RuntimeHelper.downcallHandle(
        _GtkCellRendererToggleClass._gtk_reserved4$FUNC
    );
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved4.class, fi, _GtkCellRendererToggleClass._gtk_reserved4$FUNC, session);
        }
        static _gtk_reserved4 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkCellRendererToggleClass._gtk_reserved4$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkCellRendererToggleClass._gtk_reserved4$VH;
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCellRendererToggleClass._gtk_reserved4$VH.get(seg);
    }
    public static void _gtk_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GtkCellRendererToggleClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCellRendererToggleClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCellRendererToggleClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


