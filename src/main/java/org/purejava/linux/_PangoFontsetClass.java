// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PangoFontsetClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_font"),
        Constants$root.C_POINTER$LAYOUT.withName("get_metrics"),
        Constants$root.C_POINTER$LAYOUT.withName("get_language"),
        Constants$root.C_POINTER$LAYOUT.withName("foreach"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved4")
    ).withName("_PangoFontsetClass");
    public static MemoryLayout $LAYOUT() {
        return _PangoFontsetClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_font$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_font$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass.get_font$FUNC
    );
    public interface get_font {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(get_font fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_font.class, fi, _PangoFontsetClass.get_font$FUNC, session);
        }
        static get_font ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_PangoFontsetClass.get_font$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_font$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_font"));
    public static VarHandle get_font$VH() {
        return _PangoFontsetClass.get_font$VH;
    }
    public static MemoryAddress get_font$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass.get_font$VH.get(seg);
    }
    public static void get_font$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontsetClass.get_font$VH.set(seg, x);
    }
    public static MemoryAddress get_font$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass.get_font$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_font$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontsetClass.get_font$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_font get_font (MemorySegment segment, MemorySession session) {
        return get_font.ofAddress(get_font$get(segment), session);
    }
    static final FunctionDescriptor get_metrics$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_metrics$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass.get_metrics$FUNC
    );
    public interface get_metrics {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_metrics fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_metrics.class, fi, _PangoFontsetClass.get_metrics$FUNC, session);
        }
        static get_metrics ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_PangoFontsetClass.get_metrics$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_metrics$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_metrics"));
    public static VarHandle get_metrics$VH() {
        return _PangoFontsetClass.get_metrics$VH;
    }
    public static MemoryAddress get_metrics$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass.get_metrics$VH.get(seg);
    }
    public static void get_metrics$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontsetClass.get_metrics$VH.set(seg, x);
    }
    public static MemoryAddress get_metrics$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass.get_metrics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_metrics$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontsetClass.get_metrics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_metrics get_metrics (MemorySegment segment, MemorySession session) {
        return get_metrics.ofAddress(get_metrics$get(segment), session);
    }
    static final FunctionDescriptor get_language$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_language$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass.get_language$FUNC
    );
    public interface get_language {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_language fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_language.class, fi, _PangoFontsetClass.get_language$FUNC, session);
        }
        static get_language ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_PangoFontsetClass.get_language$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_language$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_language"));
    public static VarHandle get_language$VH() {
        return _PangoFontsetClass.get_language$VH;
    }
    public static MemoryAddress get_language$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass.get_language$VH.get(seg);
    }
    public static void get_language$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontsetClass.get_language$VH.set(seg, x);
    }
    public static MemoryAddress get_language$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass.get_language$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_language$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontsetClass.get_language$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_language get_language (MemorySegment segment, MemorySession session) {
        return get_language.ofAddress(get_language$get(segment), session);
    }
    static final FunctionDescriptor foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle foreach$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass.foreach$FUNC
    );
    public interface foreach {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(foreach fi, MemorySession session) {
            return RuntimeHelper.upcallStub(foreach.class, fi, _PangoFontsetClass.foreach$FUNC, session);
        }
        static foreach ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    _PangoFontsetClass.foreach$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle foreach$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("foreach"));
    public static VarHandle foreach$VH() {
        return _PangoFontsetClass.foreach$VH;
    }
    public static MemoryAddress foreach$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass.foreach$VH.get(seg);
    }
    public static void foreach$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontsetClass.foreach$VH.set(seg, x);
    }
    public static MemoryAddress foreach$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass.foreach$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void foreach$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontsetClass.foreach$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static foreach foreach (MemorySegment segment, MemorySession session) {
        return foreach.ofAddress(foreach$get(segment), session);
    }
    static final FunctionDescriptor _pango_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved1$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass._pango_reserved1$FUNC
    );
    public interface _pango_reserved1 {

        void apply();
        static MemorySegment allocate(_pango_reserved1 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_pango_reserved1.class, fi, _PangoFontsetClass._pango_reserved1$FUNC, session);
        }
        static _pango_reserved1 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _PangoFontsetClass._pango_reserved1$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved1"));
    public static VarHandle _pango_reserved1$VH() {
        return _PangoFontsetClass._pango_reserved1$VH;
    }
    public static MemoryAddress _pango_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass._pango_reserved1$VH.get(seg);
    }
    public static void _pango_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontsetClass._pango_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _pango_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass._pango_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontsetClass._pango_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved1 _pango_reserved1 (MemorySegment segment, MemorySession session) {
        return _pango_reserved1.ofAddress(_pango_reserved1$get(segment), session);
    }
    static final FunctionDescriptor _pango_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved2$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass._pango_reserved2$FUNC
    );
    public interface _pango_reserved2 {

        void apply();
        static MemorySegment allocate(_pango_reserved2 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_pango_reserved2.class, fi, _PangoFontsetClass._pango_reserved2$FUNC, session);
        }
        static _pango_reserved2 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _PangoFontsetClass._pango_reserved2$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"));
    public static VarHandle _pango_reserved2$VH() {
        return _PangoFontsetClass._pango_reserved2$VH;
    }
    public static MemoryAddress _pango_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass._pango_reserved2$VH.get(seg);
    }
    public static void _pango_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontsetClass._pango_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _pango_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass._pango_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontsetClass._pango_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved2 _pango_reserved2 (MemorySegment segment, MemorySession session) {
        return _pango_reserved2.ofAddress(_pango_reserved2$get(segment), session);
    }
    static final FunctionDescriptor _pango_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved3$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass._pango_reserved3$FUNC
    );
    public interface _pango_reserved3 {

        void apply();
        static MemorySegment allocate(_pango_reserved3 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_pango_reserved3.class, fi, _PangoFontsetClass._pango_reserved3$FUNC, session);
        }
        static _pango_reserved3 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _PangoFontsetClass._pango_reserved3$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved3"));
    public static VarHandle _pango_reserved3$VH() {
        return _PangoFontsetClass._pango_reserved3$VH;
    }
    public static MemoryAddress _pango_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass._pango_reserved3$VH.get(seg);
    }
    public static void _pango_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontsetClass._pango_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _pango_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass._pango_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontsetClass._pango_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved3 _pango_reserved3 (MemorySegment segment, MemorySession session) {
        return _pango_reserved3.ofAddress(_pango_reserved3$get(segment), session);
    }
    static final FunctionDescriptor _pango_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved4$MH = RuntimeHelper.downcallHandle(
        _PangoFontsetClass._pango_reserved4$FUNC
    );
    public interface _pango_reserved4 {

        void apply();
        static MemorySegment allocate(_pango_reserved4 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_pango_reserved4.class, fi, _PangoFontsetClass._pango_reserved4$FUNC, session);
        }
        static _pango_reserved4 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _PangoFontsetClass._pango_reserved4$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"));
    public static VarHandle _pango_reserved4$VH() {
        return _PangoFontsetClass._pango_reserved4$VH;
    }
    public static MemoryAddress _pango_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass._pango_reserved4$VH.get(seg);
    }
    public static void _pango_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontsetClass._pango_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _pango_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontsetClass._pango_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontsetClass._pango_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved4 _pango_reserved4 (MemorySegment segment, MemorySession session) {
        return _pango_reserved4.ofAddress(_pango_reserved4$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


