// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GtkCssProviderClass {
 *     GObjectClass parent_class;
 *     void (*parsing_error)(GtkCssProvider*,GtkCssSection*,const GError*);
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkCssProviderClass {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
        Constants$root.C_POINTER$LAYOUT.withName("parsing_error"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
    ).withName("_GtkCssProviderClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkCssProviderClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor parsing_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor parsing_error_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle parsing_error_UP$MH = RuntimeHelper.upcallHandle(parsing_error.class, "apply", _GtkCssProviderClass.parsing_error_UP$FUNC);
    static final FunctionDescriptor parsing_error_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle parsing_error_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCssProviderClass.parsing_error_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*parsing_error)(GtkCssProvider*,GtkCssSection*,const GError*);
     * }
     */
    public interface parsing_error {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(parsing_error fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCssProviderClass.parsing_error_UP$MH, fi, _GtkCssProviderClass.parsing_error$FUNC, scope);
        }
        static parsing_error ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkCssProviderClass.parsing_error_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle parsing_error$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("parsing_error"));
    public static VarHandle parsing_error$VH() {
        return _GtkCssProviderClass.parsing_error$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*parsing_error)(GtkCssProvider*,GtkCssSection*,const GError*);
     * }
     */
    public static MemorySegment parsing_error$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCssProviderClass.parsing_error$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*parsing_error)(GtkCssProvider*,GtkCssSection*,const GError*);
     * }
     */
    public static void parsing_error$set(MemorySegment seg, MemorySegment x) {
        _GtkCssProviderClass.parsing_error$VH.set(seg, x);
    }
    public static MemorySegment parsing_error$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCssProviderClass.parsing_error$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void parsing_error$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCssProviderClass.parsing_error$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static parsing_error parsing_error(MemorySegment segment, SegmentScope scope) {
        return parsing_error.ofAddress(parsing_error$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved2.class, "apply", _GtkCssProviderClass._gtk_reserved2_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCssProviderClass._gtk_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCssProviderClass._gtk_reserved2_UP$MH, fi, _GtkCssProviderClass._gtk_reserved2$FUNC, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkCssProviderClass._gtk_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkCssProviderClass._gtk_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCssProviderClass._gtk_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        _GtkCssProviderClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCssProviderClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCssProviderClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved3.class, "apply", _GtkCssProviderClass._gtk_reserved3_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCssProviderClass._gtk_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCssProviderClass._gtk_reserved3_UP$MH, fi, _GtkCssProviderClass._gtk_reserved3$FUNC, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkCssProviderClass._gtk_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkCssProviderClass._gtk_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCssProviderClass._gtk_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        _GtkCssProviderClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCssProviderClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCssProviderClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved4.class, "apply", _GtkCssProviderClass._gtk_reserved4_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkCssProviderClass._gtk_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkCssProviderClass._gtk_reserved4_UP$MH, fi, _GtkCssProviderClass._gtk_reserved4$FUNC, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkCssProviderClass._gtk_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkCssProviderClass._gtk_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkCssProviderClass._gtk_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        _GtkCssProviderClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkCssProviderClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkCssProviderClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
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


