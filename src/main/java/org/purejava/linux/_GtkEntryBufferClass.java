// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkEntryBufferClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("inserted_text"),
        Constants$root.C_POINTER$LAYOUT.withName("deleted_text"),
        Constants$root.C_POINTER$LAYOUT.withName("get_text"),
        Constants$root.C_POINTER$LAYOUT.withName("get_length"),
        Constants$root.C_POINTER$LAYOUT.withName("insert_text"),
        Constants$root.C_POINTER$LAYOUT.withName("delete_text"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved5"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved8")
    ).withName("_GtkEntryBufferClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkEntryBufferClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor inserted_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle inserted_text$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass.inserted_text$FUNC
    );
    public interface inserted_text {

        void apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
        static MemorySegment allocate(inserted_text fi, MemorySession session) {
            return RuntimeHelper.upcallStub(inserted_text.class, fi, _GtkEntryBufferClass.inserted_text$FUNC, session);
        }
        static inserted_text ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
                try {
                    _GtkEntryBufferClass.inserted_text$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle inserted_text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("inserted_text"));
    public static VarHandle inserted_text$VH() {
        return _GtkEntryBufferClass.inserted_text$VH;
    }
    public static MemoryAddress inserted_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.inserted_text$VH.get(seg);
    }
    public static void inserted_text$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass.inserted_text$VH.set(seg, x);
    }
    public static MemoryAddress inserted_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.inserted_text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void inserted_text$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass.inserted_text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static inserted_text inserted_text (MemorySegment segment, MemorySession session) {
        return inserted_text.ofAddress(inserted_text$get(segment), session);
    }
    static final FunctionDescriptor deleted_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle deleted_text$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass.deleted_text$FUNC
    );
    public interface deleted_text {

        void apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2);
        static MemorySegment allocate(deleted_text fi, MemorySession session) {
            return RuntimeHelper.upcallStub(deleted_text.class, fi, _GtkEntryBufferClass.deleted_text$FUNC, session);
        }
        static deleted_text ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2) -> {
                try {
                    _GtkEntryBufferClass.deleted_text$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle deleted_text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("deleted_text"));
    public static VarHandle deleted_text$VH() {
        return _GtkEntryBufferClass.deleted_text$VH;
    }
    public static MemoryAddress deleted_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.deleted_text$VH.get(seg);
    }
    public static void deleted_text$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass.deleted_text$VH.set(seg, x);
    }
    public static MemoryAddress deleted_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.deleted_text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void deleted_text$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass.deleted_text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static deleted_text deleted_text (MemorySegment segment, MemorySession session) {
        return deleted_text.ofAddress(deleted_text$get(segment), session);
    }
    static final FunctionDescriptor get_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_text$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass.get_text$FUNC
    );
    public interface get_text {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(get_text fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_text.class, fi, _GtkEntryBufferClass.get_text$FUNC, session);
        }
        static get_text ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.get_text$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_text"));
    public static VarHandle get_text$VH() {
        return _GtkEntryBufferClass.get_text$VH;
    }
    public static MemoryAddress get_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.get_text$VH.get(seg);
    }
    public static void get_text$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass.get_text$VH.set(seg, x);
    }
    public static MemoryAddress get_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.get_text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_text$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass.get_text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_text get_text (MemorySegment segment, MemorySession session) {
        return get_text.ofAddress(get_text$get(segment), session);
    }
    static final FunctionDescriptor get_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_length$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass.get_length$FUNC
    );
    public interface get_length {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_length fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_length.class, fi, _GtkEntryBufferClass.get_length$FUNC, session);
        }
        static get_length ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GtkEntryBufferClass.get_length$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_length"));
    public static VarHandle get_length$VH() {
        return _GtkEntryBufferClass.get_length$VH;
    }
    public static MemoryAddress get_length$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.get_length$VH.get(seg);
    }
    public static void get_length$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass.get_length$VH.set(seg, x);
    }
    public static MemoryAddress get_length$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.get_length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_length$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass.get_length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_length get_length (MemorySegment segment, MemorySession session) {
        return get_length.ofAddress(get_length$get(segment), session);
    }
    static final FunctionDescriptor insert_text$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle insert_text$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass.insert_text$FUNC
    );
    public interface insert_text {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
        static MemorySegment allocate(insert_text fi, MemorySession session) {
            return RuntimeHelper.upcallStub(insert_text.class, fi, _GtkEntryBufferClass.insert_text$FUNC, session);
        }
        static insert_text ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
                try {
                    return (int)_GtkEntryBufferClass.insert_text$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle insert_text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("insert_text"));
    public static VarHandle insert_text$VH() {
        return _GtkEntryBufferClass.insert_text$VH;
    }
    public static MemoryAddress insert_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.insert_text$VH.get(seg);
    }
    public static void insert_text$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass.insert_text$VH.set(seg, x);
    }
    public static MemoryAddress insert_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.insert_text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void insert_text$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass.insert_text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static insert_text insert_text (MemorySegment segment, MemorySession session) {
        return insert_text.ofAddress(insert_text$get(segment), session);
    }
    static final FunctionDescriptor delete_text$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle delete_text$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass.delete_text$FUNC
    );
    public interface delete_text {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2);
        static MemorySegment allocate(delete_text fi, MemorySession session) {
            return RuntimeHelper.upcallStub(delete_text.class, fi, _GtkEntryBufferClass.delete_text$FUNC, session);
        }
        static delete_text ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2) -> {
                try {
                    return (int)_GtkEntryBufferClass.delete_text$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle delete_text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("delete_text"));
    public static VarHandle delete_text$VH() {
        return _GtkEntryBufferClass.delete_text$VH;
    }
    public static MemoryAddress delete_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.delete_text$VH.get(seg);
    }
    public static void delete_text$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass.delete_text$VH.set(seg, x);
    }
    public static MemoryAddress delete_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass.delete_text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void delete_text$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass.delete_text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static delete_text delete_text (MemorySegment segment, MemorySession session) {
        return delete_text.ofAddress(delete_text$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass._gtk_reserved1$FUNC
    );
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved1.class, fi, _GtkEntryBufferClass._gtk_reserved1$FUNC, session);
        }
        static _gtk_reserved1 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkEntryBufferClass._gtk_reserved1$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkEntryBufferClass._gtk_reserved1$VH;
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved1$VH.get(seg);
    }
    public static void _gtk_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass._gtk_reserved2$FUNC
    );
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved2.class, fi, _GtkEntryBufferClass._gtk_reserved2$FUNC, session);
        }
        static _gtk_reserved2 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkEntryBufferClass._gtk_reserved2$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkEntryBufferClass._gtk_reserved2$VH;
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved2$VH.get(seg);
    }
    public static void _gtk_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass._gtk_reserved3$FUNC
    );
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved3.class, fi, _GtkEntryBufferClass._gtk_reserved3$FUNC, session);
        }
        static _gtk_reserved3 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkEntryBufferClass._gtk_reserved3$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkEntryBufferClass._gtk_reserved3$VH;
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved3$VH.get(seg);
    }
    public static void _gtk_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass._gtk_reserved4$FUNC
    );
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved4.class, fi, _GtkEntryBufferClass._gtk_reserved4$FUNC, session);
        }
        static _gtk_reserved4 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkEntryBufferClass._gtk_reserved4$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkEntryBufferClass._gtk_reserved4$VH;
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved4$VH.get(seg);
    }
    public static void _gtk_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved5$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved5$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass._gtk_reserved5$FUNC
    );
    public interface _gtk_reserved5 {

        void apply();
        static MemorySegment allocate(_gtk_reserved5 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved5.class, fi, _GtkEntryBufferClass._gtk_reserved5$FUNC, session);
        }
        static _gtk_reserved5 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkEntryBufferClass._gtk_reserved5$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"));
    public static VarHandle _gtk_reserved5$VH() {
        return _GtkEntryBufferClass._gtk_reserved5$VH;
    }
    public static MemoryAddress _gtk_reserved5$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved5$VH.get(seg);
    }
    public static void _gtk_reserved5$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved5$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved5$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved5 _gtk_reserved5 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved5.ofAddress(_gtk_reserved5$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved6$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved6$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass._gtk_reserved6$FUNC
    );
    public interface _gtk_reserved6 {

        void apply();
        static MemorySegment allocate(_gtk_reserved6 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved6.class, fi, _GtkEntryBufferClass._gtk_reserved6$FUNC, session);
        }
        static _gtk_reserved6 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkEntryBufferClass._gtk_reserved6$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved6$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"));
    public static VarHandle _gtk_reserved6$VH() {
        return _GtkEntryBufferClass._gtk_reserved6$VH;
    }
    public static MemoryAddress _gtk_reserved6$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved6$VH.get(seg);
    }
    public static void _gtk_reserved6$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved6$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved6$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved6$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved6$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved6 _gtk_reserved6 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved6.ofAddress(_gtk_reserved6$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved7$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved7$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass._gtk_reserved7$FUNC
    );
    public interface _gtk_reserved7 {

        void apply();
        static MemorySegment allocate(_gtk_reserved7 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved7.class, fi, _GtkEntryBufferClass._gtk_reserved7$FUNC, session);
        }
        static _gtk_reserved7 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkEntryBufferClass._gtk_reserved7$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved7$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"));
    public static VarHandle _gtk_reserved7$VH() {
        return _GtkEntryBufferClass._gtk_reserved7$VH;
    }
    public static MemoryAddress _gtk_reserved7$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved7$VH.get(seg);
    }
    public static void _gtk_reserved7$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved7$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved7$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved7$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved7$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved7$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved7 _gtk_reserved7 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved7.ofAddress(_gtk_reserved7$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved8$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved8$MH = RuntimeHelper.downcallHandle(
        _GtkEntryBufferClass._gtk_reserved8$FUNC
    );
    public interface _gtk_reserved8 {

        void apply();
        static MemorySegment allocate(_gtk_reserved8 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved8.class, fi, _GtkEntryBufferClass._gtk_reserved8$FUNC, session);
        }
        static _gtk_reserved8 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkEntryBufferClass._gtk_reserved8$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved8$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"));
    public static VarHandle _gtk_reserved8$VH() {
        return _GtkEntryBufferClass._gtk_reserved8$VH;
    }
    public static MemoryAddress _gtk_reserved8$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved8$VH.get(seg);
    }
    public static void _gtk_reserved8$set( MemorySegment seg, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved8$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved8$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkEntryBufferClass._gtk_reserved8$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved8$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkEntryBufferClass._gtk_reserved8$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved8 _gtk_reserved8 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved8.ofAddress(_gtk_reserved8$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


