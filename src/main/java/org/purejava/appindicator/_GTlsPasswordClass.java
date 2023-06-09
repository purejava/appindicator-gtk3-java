// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GTlsPasswordClass {
 *     GObjectClass parent_class;
 *     const guchar* (*get_value)(GTlsPassword*,gsize*);
 *     void (*set_value)(GTlsPassword*,guchar*,gssize,GDestroyNotify);
 *     const gchar* (*get_default_warning)(GTlsPassword*);
 *     gpointer padding[4];
 * };
 * }
 */
public class _GTlsPasswordClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_value"),
        Constants$root.C_POINTER$LAYOUT.withName("set_value"),
        Constants$root.C_POINTER$LAYOUT.withName("get_default_warning"),
        MemoryLayout.sequenceLayout(4, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GTlsPasswordClass");
    public static MemoryLayout $LAYOUT() {
        return _GTlsPasswordClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_value_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_value_UP$MH = RuntimeHelper.upcallHandle(get_value.class, "apply", _GTlsPasswordClass.get_value_UP$FUNC);
    static final FunctionDescriptor get_value_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_value_DOWN$MH = RuntimeHelper.downcallHandle(
        _GTlsPasswordClass.get_value_DOWN$FUNC
    );
    /**
     * {@snippet :
 * const guchar* (*get_value)(GTlsPassword*,gsize*);
     * }
     */
    public interface get_value {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
        static MemorySegment allocate(get_value fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GTlsPasswordClass.get_value_UP$MH, fi, _GTlsPasswordClass.get_value$FUNC, scope);
        }
        static get_value ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GTlsPasswordClass.get_value_DOWN$MH.invokeExact(symbol, _path, _func_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_value"));
    public static VarHandle get_value$VH() {
        return _GTlsPasswordClass.get_value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const guchar* (*get_value)(GTlsPassword*,gsize*);
     * }
     */
    public static MemorySegment get_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GTlsPasswordClass.get_value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const guchar* (*get_value)(GTlsPassword*,gsize*);
     * }
     */
    public static void get_value$set(MemorySegment seg, MemorySegment x) {
        _GTlsPasswordClass.get_value$VH.set(seg, x);
    }
    public static MemorySegment get_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GTlsPasswordClass.get_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_value$set(MemorySegment seg, long index, MemorySegment x) {
        _GTlsPasswordClass.get_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_value get_value(MemorySegment segment, SegmentScope scope) {
        return get_value.ofAddress(get_value$get(segment), scope);
    }
    static final FunctionDescriptor set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor set_value_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_value_UP$MH = RuntimeHelper.upcallHandle(set_value.class, "apply", _GTlsPasswordClass.set_value_UP$FUNC);
    static final FunctionDescriptor set_value_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_value_DOWN$MH = RuntimeHelper.downcallHandle(
        _GTlsPasswordClass.set_value_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*set_value)(GTlsPassword*,guchar*,gssize,GDestroyNotify);
     * }
     */
    public interface set_value {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(set_value fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GTlsPasswordClass.set_value_UP$MH, fi, _GTlsPasswordClass.set_value$FUNC, scope);
        }
        static set_value ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    _GTlsPasswordClass.set_value_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_value"));
    public static VarHandle set_value$VH() {
        return _GTlsPasswordClass.set_value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_value)(GTlsPassword*,guchar*,gssize,GDestroyNotify);
     * }
     */
    public static MemorySegment set_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GTlsPasswordClass.set_value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_value)(GTlsPassword*,guchar*,gssize,GDestroyNotify);
     * }
     */
    public static void set_value$set(MemorySegment seg, MemorySegment x) {
        _GTlsPasswordClass.set_value$VH.set(seg, x);
    }
    public static MemorySegment set_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GTlsPasswordClass.set_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_value$set(MemorySegment seg, long index, MemorySegment x) {
        _GTlsPasswordClass.set_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_value set_value(MemorySegment segment, SegmentScope scope) {
        return set_value.ofAddress(set_value$get(segment), scope);
    }
    static final FunctionDescriptor get_default_warning$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_default_warning_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_default_warning_UP$MH = RuntimeHelper.upcallHandle(get_default_warning.class, "apply", _GTlsPasswordClass.get_default_warning_UP$FUNC);
    static final FunctionDescriptor get_default_warning_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_default_warning_DOWN$MH = RuntimeHelper.downcallHandle(
        _GTlsPasswordClass.get_default_warning_DOWN$FUNC
    );
    /**
     * {@snippet :
 * const gchar* (*get_default_warning)(GTlsPassword*);
     * }
     */
    public interface get_default_warning {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_default_warning fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GTlsPasswordClass.get_default_warning_UP$MH, fi, _GTlsPasswordClass.get_default_warning$FUNC, scope);
        }
        static get_default_warning ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GTlsPasswordClass.get_default_warning_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_default_warning$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_default_warning"));
    public static VarHandle get_default_warning$VH() {
        return _GTlsPasswordClass.get_default_warning$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* (*get_default_warning)(GTlsPassword*);
     * }
     */
    public static MemorySegment get_default_warning$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GTlsPasswordClass.get_default_warning$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* (*get_default_warning)(GTlsPassword*);
     * }
     */
    public static void get_default_warning$set(MemorySegment seg, MemorySegment x) {
        _GTlsPasswordClass.get_default_warning$VH.set(seg, x);
    }
    public static MemorySegment get_default_warning$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GTlsPasswordClass.get_default_warning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_default_warning$set(MemorySegment seg, long index, MemorySegment x) {
        _GTlsPasswordClass.get_default_warning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_default_warning get_default_warning(MemorySegment segment, SegmentScope scope) {
        return get_default_warning.ofAddress(get_default_warning$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(160, 32);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


