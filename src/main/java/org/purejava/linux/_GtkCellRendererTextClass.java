// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkCellRendererTextClass {
 *     GtkCellRendererClass parent_class;
 *     void (*edited)(GtkCellRendererText*,const gchar*,const gchar*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkCellRendererTextClass {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
                Constants$root.C_LONG_LONG$LAYOUT.withName("n_construct_properties"),
                Constants$root.C_POINTER$LAYOUT.withName("pspecs"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("n_pspecs"),
                MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
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
        Constants$root.C_POINTER$LAYOUT.withName("edited"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
    ).withName("_GtkCellRendererTextClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkCellRendererTextClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 264);
    }
    static final FunctionDescriptor edited$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor edited_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle edited_UP$MH = RuntimeHelper.upcallHandle(edited.class, "apply", _GtkCellRendererTextClass.edited_UP$FUNC);
    static final FunctionDescriptor edited_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle edited_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellRendererTextClass.edited_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*edited)(GtkCellRendererText*,const gchar*,const gchar*);
     * }
     */
    public interface edited {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(edited fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellRendererTextClass.edited_UP$MH, fi, _GtkCellRendererTextClass.edited$FUNC, scope);
        }
        static edited ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkCellRendererTextClass.edited_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle edited$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("edited"));
    public static VarHandle edited$VH() {
        return _GtkCellRendererTextClass.edited$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*edited)(GtkCellRendererText*,const gchar*,const gchar*);
     * }
     */
    public static MemorySegment edited$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellRendererTextClass.edited$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*edited)(GtkCellRendererText*,const gchar*,const gchar*);
     * }
     */
    public static void edited$set(MemorySegment seg, MemorySegment x) {
        _GtkCellRendererTextClass.edited$VH.set(seg, x);
    }
    public static MemorySegment edited$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellRendererTextClass.edited$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void edited$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellRendererTextClass.edited$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static edited edited(MemorySegment segment, SegmentScope scope) {
        return edited.ofAddress(edited$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved1.class, "apply", _GtkCellRendererTextClass._gtk_reserved1_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellRendererTextClass._gtk_reserved1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellRendererTextClass._gtk_reserved1_UP$MH, fi, _GtkCellRendererTextClass._gtk_reserved1$FUNC, scope);
        }
        static _gtk_reserved1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkCellRendererTextClass._gtk_reserved1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkCellRendererTextClass._gtk_reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellRendererTextClass._gtk_reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        _GtkCellRendererTextClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellRendererTextClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellRendererTextClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved2.class, "apply", _GtkCellRendererTextClass._gtk_reserved2_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellRendererTextClass._gtk_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellRendererTextClass._gtk_reserved2_UP$MH, fi, _GtkCellRendererTextClass._gtk_reserved2$FUNC, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkCellRendererTextClass._gtk_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkCellRendererTextClass._gtk_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellRendererTextClass._gtk_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        _GtkCellRendererTextClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellRendererTextClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellRendererTextClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved3.class, "apply", _GtkCellRendererTextClass._gtk_reserved3_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellRendererTextClass._gtk_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellRendererTextClass._gtk_reserved3_UP$MH, fi, _GtkCellRendererTextClass._gtk_reserved3$FUNC, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkCellRendererTextClass._gtk_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkCellRendererTextClass._gtk_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellRendererTextClass._gtk_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        _GtkCellRendererTextClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellRendererTextClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellRendererTextClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved4.class, "apply", _GtkCellRendererTextClass._gtk_reserved4_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCellRendererTextClass._gtk_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCellRendererTextClass._gtk_reserved4_UP$MH, fi, _GtkCellRendererTextClass._gtk_reserved4$FUNC, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkCellRendererTextClass._gtk_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkCellRendererTextClass._gtk_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCellRendererTextClass._gtk_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        _GtkCellRendererTextClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCellRendererTextClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCellRendererTextClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


