// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _PangoFontFamilyClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("list_faces"),
        Constants$root.C_POINTER$LAYOUT.withName("get_name"),
        Constants$root.C_POINTER$LAYOUT.withName("is_monospace"),
        Constants$root.C_POINTER$LAYOUT.withName("is_variable"),
        Constants$root.C_POINTER$LAYOUT.withName("get_face"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved2")
    ).withName("_PangoFontFamilyClass");
    public static MemoryLayout $LAYOUT() {
        return _PangoFontFamilyClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor list_faces$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle list_faces$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass.list_faces$FUNC
    );
    public interface list_faces {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(list_faces fi, MemorySession session) {
            return RuntimeHelper.upcallStub(list_faces.class, fi, _PangoFontFamilyClass.list_faces$FUNC, session);
        }
        static list_faces ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    _PangoFontFamilyClass.list_faces$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle list_faces$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("list_faces"));
    public static VarHandle list_faces$VH() {
        return _PangoFontFamilyClass.list_faces$VH;
    }
    public static MemoryAddress list_faces$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.list_faces$VH.get(seg);
    }
    public static void list_faces$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontFamilyClass.list_faces$VH.set(seg, x);
    }
    public static MemoryAddress list_faces$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.list_faces$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void list_faces$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontFamilyClass.list_faces$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static list_faces list_faces (MemorySegment segment, MemorySession session) {
        return list_faces.ofAddress(list_faces$get(segment), session);
    }
    static final FunctionDescriptor get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_name$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass.get_name$FUNC
    );
    public interface get_name {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_name fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_name.class, fi, _PangoFontFamilyClass.get_name$FUNC, session);
        }
        static get_name ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.get_name$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_name"));
    public static VarHandle get_name$VH() {
        return _PangoFontFamilyClass.get_name$VH;
    }
    public static MemoryAddress get_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.get_name$VH.get(seg);
    }
    public static void get_name$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontFamilyClass.get_name$VH.set(seg, x);
    }
    public static MemoryAddress get_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.get_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontFamilyClass.get_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_name get_name (MemorySegment segment, MemorySession session) {
        return get_name.ofAddress(get_name$get(segment), session);
    }
    static final FunctionDescriptor is_monospace$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_monospace$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass.is_monospace$FUNC
    );
    public interface is_monospace {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(is_monospace fi, MemorySession session) {
            return RuntimeHelper.upcallStub(is_monospace.class, fi, _PangoFontFamilyClass.is_monospace$FUNC, session);
        }
        static is_monospace ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_PangoFontFamilyClass.is_monospace$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_monospace$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_monospace"));
    public static VarHandle is_monospace$VH() {
        return _PangoFontFamilyClass.is_monospace$VH;
    }
    public static MemoryAddress is_monospace$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.is_monospace$VH.get(seg);
    }
    public static void is_monospace$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontFamilyClass.is_monospace$VH.set(seg, x);
    }
    public static MemoryAddress is_monospace$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.is_monospace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_monospace$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontFamilyClass.is_monospace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_monospace is_monospace (MemorySegment segment, MemorySession session) {
        return is_monospace.ofAddress(is_monospace$get(segment), session);
    }
    static final FunctionDescriptor is_variable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_variable$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass.is_variable$FUNC
    );
    public interface is_variable {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(is_variable fi, MemorySession session) {
            return RuntimeHelper.upcallStub(is_variable.class, fi, _PangoFontFamilyClass.is_variable$FUNC, session);
        }
        static is_variable ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_PangoFontFamilyClass.is_variable$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_variable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_variable"));
    public static VarHandle is_variable$VH() {
        return _PangoFontFamilyClass.is_variable$VH;
    }
    public static MemoryAddress is_variable$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.is_variable$VH.get(seg);
    }
    public static void is_variable$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontFamilyClass.is_variable$VH.set(seg, x);
    }
    public static MemoryAddress is_variable$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.is_variable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_variable$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontFamilyClass.is_variable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_variable is_variable (MemorySegment segment, MemorySession session) {
        return is_variable.ofAddress(is_variable$get(segment), session);
    }
    static final FunctionDescriptor get_face$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_face$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass.get_face$FUNC
    );
    public interface get_face {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(get_face fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_face.class, fi, _PangoFontFamilyClass.get_face$FUNC, session);
        }
        static get_face ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.get_face$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_face$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_face"));
    public static VarHandle get_face$VH() {
        return _PangoFontFamilyClass.get_face$VH;
    }
    public static MemoryAddress get_face$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.get_face$VH.get(seg);
    }
    public static void get_face$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontFamilyClass.get_face$VH.set(seg, x);
    }
    public static MemoryAddress get_face$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass.get_face$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_face$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontFamilyClass.get_face$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_face get_face (MemorySegment segment, MemorySession session) {
        return get_face.ofAddress(get_face$get(segment), session);
    }
    static final FunctionDescriptor _pango_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved2$MH = RuntimeHelper.downcallHandle(
        _PangoFontFamilyClass._pango_reserved2$FUNC
    );
    public interface _pango_reserved2 {

        void apply();
        static MemorySegment allocate(_pango_reserved2 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_pango_reserved2.class, fi, _PangoFontFamilyClass._pango_reserved2$FUNC, session);
        }
        static _pango_reserved2 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _PangoFontFamilyClass._pango_reserved2$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved2"));
    public static VarHandle _pango_reserved2$VH() {
        return _PangoFontFamilyClass._pango_reserved2$VH;
    }
    public static MemoryAddress _pango_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass._pango_reserved2$VH.get(seg);
    }
    public static void _pango_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _PangoFontFamilyClass._pango_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _pango_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_PangoFontFamilyClass._pango_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _PangoFontFamilyClass._pango_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved2 _pango_reserved2 (MemorySegment segment, MemorySession session) {
        return _pango_reserved2.ofAddress(_pango_reserved2$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

