// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GParamSpecClass {
 *     GTypeClass g_type_class;
 *     GType value_type;
 *     void (*finalize)(GParamSpec*);
 *     void (*value_set_default)(GParamSpec*,GValue*);
 *     gboolean (*value_validate)(GParamSpec*,GValue*);
 *     gint (*values_cmp)(GParamSpec*,const GValue*,const GValue*);
 *     gboolean (*value_is_valid)(GParamSpec*,const GValue*);
 *     gpointer dummy[3];
 * };
 * }
 */
public class _GParamSpecClass {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
        ).withName("g_type_class"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("value_type"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("value_set_default"),
        Constants$root.C_POINTER$LAYOUT.withName("value_validate"),
        Constants$root.C_POINTER$LAYOUT.withName("values_cmp"),
        Constants$root.C_POINTER$LAYOUT.withName("value_is_valid"),
        MemoryLayout.sequenceLayout(3, Constants$root.C_POINTER$LAYOUT).withName("dummy")
    ).withName("_GParamSpecClass");
    public static MemoryLayout $LAYOUT() {
        return _GParamSpecClass.$struct$LAYOUT;
    }
    public static MemorySegment g_type_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle value_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value_type"));
    public static VarHandle value_type$VH() {
        return _GParamSpecClass.value_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GType value_type;
     * }
     */
    public static long value_type$get(MemorySegment seg) {
        return (long)_GParamSpecClass.value_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GType value_type;
     * }
     */
    public static void value_type$set(MemorySegment seg, long x) {
        _GParamSpecClass.value_type$VH.set(seg, x);
    }
    public static long value_type$get(MemorySegment seg, long index) {
        return (long)_GParamSpecClass.value_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_type$set(MemorySegment seg, long index, long x) {
        _GParamSpecClass.value_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor finalize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor finalize_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle finalize_UP$MH = RuntimeHelper.upcallHandle(finalize.class, "apply", _GParamSpecClass.finalize_UP$FUNC);
    static final FunctionDescriptor finalize_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle finalize_DOWN$MH = RuntimeHelper.downcallHandle(
        _GParamSpecClass.finalize_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*finalize)(GParamSpec*);
     * }
     */
    public interface finalize {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(finalize fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GParamSpecClass.finalize_UP$MH, fi, _GParamSpecClass.finalize$FUNC, scope);
        }
        static finalize ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GParamSpecClass.finalize_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle finalize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("finalize"));
    public static VarHandle finalize$VH() {
        return _GParamSpecClass.finalize$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*finalize)(GParamSpec*);
     * }
     */
    public static MemorySegment finalize$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GParamSpecClass.finalize$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*finalize)(GParamSpec*);
     * }
     */
    public static void finalize$set(MemorySegment seg, MemorySegment x) {
        _GParamSpecClass.finalize$VH.set(seg, x);
    }
    public static MemorySegment finalize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GParamSpecClass.finalize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void finalize$set(MemorySegment seg, long index, MemorySegment x) {
        _GParamSpecClass.finalize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static finalize finalize(MemorySegment segment, SegmentScope scope) {
        return finalize.ofAddress(finalize$get(segment), scope);
    }
    static final FunctionDescriptor value_set_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor value_set_default_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_set_default_UP$MH = RuntimeHelper.upcallHandle(value_set_default.class, "apply", _GParamSpecClass.value_set_default_UP$FUNC);
    static final FunctionDescriptor value_set_default_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_set_default_DOWN$MH = RuntimeHelper.downcallHandle(
        _GParamSpecClass.value_set_default_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*value_set_default)(GParamSpec*,GValue*);
     * }
     */
    public interface value_set_default {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(value_set_default fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GParamSpecClass.value_set_default_UP$MH, fi, _GParamSpecClass.value_set_default$FUNC, scope);
        }
        static value_set_default ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GParamSpecClass.value_set_default_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle value_set_default$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value_set_default"));
    public static VarHandle value_set_default$VH() {
        return _GParamSpecClass.value_set_default$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*value_set_default)(GParamSpec*,GValue*);
     * }
     */
    public static MemorySegment value_set_default$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GParamSpecClass.value_set_default$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*value_set_default)(GParamSpec*,GValue*);
     * }
     */
    public static void value_set_default$set(MemorySegment seg, MemorySegment x) {
        _GParamSpecClass.value_set_default$VH.set(seg, x);
    }
    public static MemorySegment value_set_default$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GParamSpecClass.value_set_default$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_set_default$set(MemorySegment seg, long index, MemorySegment x) {
        _GParamSpecClass.value_set_default$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_set_default value_set_default(MemorySegment segment, SegmentScope scope) {
        return value_set_default.ofAddress(value_set_default$get(segment), scope);
    }
    static final FunctionDescriptor value_validate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor value_validate_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_validate_UP$MH = RuntimeHelper.upcallHandle(value_validate.class, "apply", _GParamSpecClass.value_validate_UP$FUNC);
    static final FunctionDescriptor value_validate_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_validate_DOWN$MH = RuntimeHelper.downcallHandle(
        _GParamSpecClass.value_validate_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*value_validate)(GParamSpec*,GValue*);
     * }
     */
    public interface value_validate {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(value_validate fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GParamSpecClass.value_validate_UP$MH, fi, _GParamSpecClass.value_validate$FUNC, scope);
        }
        static value_validate ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)_GParamSpecClass.value_validate_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle value_validate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value_validate"));
    public static VarHandle value_validate$VH() {
        return _GParamSpecClass.value_validate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*value_validate)(GParamSpec*,GValue*);
     * }
     */
    public static MemorySegment value_validate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GParamSpecClass.value_validate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*value_validate)(GParamSpec*,GValue*);
     * }
     */
    public static void value_validate$set(MemorySegment seg, MemorySegment x) {
        _GParamSpecClass.value_validate$VH.set(seg, x);
    }
    public static MemorySegment value_validate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GParamSpecClass.value_validate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_validate$set(MemorySegment seg, long index, MemorySegment x) {
        _GParamSpecClass.value_validate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_validate value_validate(MemorySegment segment, SegmentScope scope) {
        return value_validate.ofAddress(value_validate$get(segment), scope);
    }
    static final FunctionDescriptor values_cmp$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor values_cmp_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle values_cmp_UP$MH = RuntimeHelper.upcallHandle(values_cmp.class, "apply", _GParamSpecClass.values_cmp_UP$FUNC);
    static final FunctionDescriptor values_cmp_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle values_cmp_DOWN$MH = RuntimeHelper.downcallHandle(
        _GParamSpecClass.values_cmp_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gint (*values_cmp)(GParamSpec*,const GValue*,const GValue*);
     * }
     */
    public interface values_cmp {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(values_cmp fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GParamSpecClass.values_cmp_UP$MH, fi, _GParamSpecClass.values_cmp$FUNC, scope);
        }
        static values_cmp ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)_GParamSpecClass.values_cmp_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle values_cmp$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("values_cmp"));
    public static VarHandle values_cmp$VH() {
        return _GParamSpecClass.values_cmp$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint (*values_cmp)(GParamSpec*,const GValue*,const GValue*);
     * }
     */
    public static MemorySegment values_cmp$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GParamSpecClass.values_cmp$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint (*values_cmp)(GParamSpec*,const GValue*,const GValue*);
     * }
     */
    public static void values_cmp$set(MemorySegment seg, MemorySegment x) {
        _GParamSpecClass.values_cmp$VH.set(seg, x);
    }
    public static MemorySegment values_cmp$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GParamSpecClass.values_cmp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void values_cmp$set(MemorySegment seg, long index, MemorySegment x) {
        _GParamSpecClass.values_cmp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static values_cmp values_cmp(MemorySegment segment, SegmentScope scope) {
        return values_cmp.ofAddress(values_cmp$get(segment), scope);
    }
    static final FunctionDescriptor value_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor value_is_valid_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_is_valid_UP$MH = RuntimeHelper.upcallHandle(value_is_valid.class, "apply", _GParamSpecClass.value_is_valid_UP$FUNC);
    static final FunctionDescriptor value_is_valid_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle value_is_valid_DOWN$MH = RuntimeHelper.downcallHandle(
        _GParamSpecClass.value_is_valid_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*value_is_valid)(GParamSpec*,const GValue*);
     * }
     */
    public interface value_is_valid {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(value_is_valid fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GParamSpecClass.value_is_valid_UP$MH, fi, _GParamSpecClass.value_is_valid$FUNC, scope);
        }
        static value_is_valid ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)_GParamSpecClass.value_is_valid_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle value_is_valid$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("value_is_valid"));
    public static VarHandle value_is_valid$VH() {
        return _GParamSpecClass.value_is_valid$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*value_is_valid)(GParamSpec*,const GValue*);
     * }
     */
    public static MemorySegment value_is_valid$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GParamSpecClass.value_is_valid$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*value_is_valid)(GParamSpec*,const GValue*);
     * }
     */
    public static void value_is_valid$set(MemorySegment seg, MemorySegment x) {
        _GParamSpecClass.value_is_valid$VH.set(seg, x);
    }
    public static MemorySegment value_is_valid$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GParamSpecClass.value_is_valid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value_is_valid$set(MemorySegment seg, long index, MemorySegment x) {
        _GParamSpecClass.value_is_valid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static value_is_valid value_is_valid(MemorySegment segment, SegmentScope scope) {
        return value_is_valid.ofAddress(value_is_valid$get(segment), scope);
    }
    public static MemorySegment dummy$slice(MemorySegment seg) {
        return seg.asSlice(56, 24);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

