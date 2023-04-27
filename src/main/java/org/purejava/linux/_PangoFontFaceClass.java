// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoFontFaceClass {
 *     GObjectClass parent_class;
 *     char* (*get_face_name)(PangoFontFace*);
 *     PangoFontDescription* (*describe)(PangoFontFace*);
 *     void (*list_sizes)(PangoFontFace*,int**,int*);
 *     gboolean (*is_synthesized)(PangoFontFace*);
 *     PangoFontFamily* (*get_family)(PangoFontFace*);
 *     void (*_pango_reserved3)();
 *     void (*_pango_reserved4)();
 * };
 * }
 */
public class _PangoFontFaceClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("get_face_name"),
        Constants$root.C_POINTER$LAYOUT.withName("describe"),
        Constants$root.C_POINTER$LAYOUT.withName("list_sizes"),
        Constants$root.C_POINTER$LAYOUT.withName("is_synthesized"),
        Constants$root.C_POINTER$LAYOUT.withName("get_family"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_pango_reserved4")
    ).withName("_PangoFontFaceClass");
    public static MemoryLayout $LAYOUT() {
        return _PangoFontFaceClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor get_face_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_face_name_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_face_name_UP$MH = RuntimeHelper.upcallHandle(get_face_name.class, "apply", _PangoFontFaceClass.get_face_name_UP$FUNC);
    static final FunctionDescriptor get_face_name_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_face_name_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFaceClass.get_face_name_DOWN$FUNC
    );
    /**
     * {@snippet :
 * char* (*get_face_name)(PangoFontFace*);
     * }
     */
    public interface get_face_name {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_face_name fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFaceClass.get_face_name_UP$MH, fi, _PangoFontFaceClass.get_face_name$FUNC, scope);
        }
        static get_face_name ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.get_face_name_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_face_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_face_name"));
    public static VarHandle get_face_name$VH() {
        return _PangoFontFaceClass.get_face_name$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_face_name)(PangoFontFace*);
     * }
     */
    public static MemorySegment get_face_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.get_face_name$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_face_name)(PangoFontFace*);
     * }
     */
    public static void get_face_name$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFaceClass.get_face_name$VH.set(seg, x);
    }
    public static MemorySegment get_face_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.get_face_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_face_name$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFaceClass.get_face_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_face_name get_face_name(MemorySegment segment, SegmentScope scope) {
        return get_face_name.ofAddress(get_face_name$get(segment), scope);
    }
    static final FunctionDescriptor describe$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor describe_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle describe_UP$MH = RuntimeHelper.upcallHandle(describe.class, "apply", _PangoFontFaceClass.describe_UP$FUNC);
    static final FunctionDescriptor describe_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle describe_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFaceClass.describe_DOWN$FUNC
    );
    /**
     * {@snippet :
 * PangoFontDescription* (*describe)(PangoFontFace*);
     * }
     */
    public interface describe {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(describe fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFaceClass.describe_UP$MH, fi, _PangoFontFaceClass.describe$FUNC, scope);
        }
        static describe ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.describe_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle describe$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("describe"));
    public static VarHandle describe$VH() {
        return _PangoFontFaceClass.describe$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoFontDescription* (*describe)(PangoFontFace*);
     * }
     */
    public static MemorySegment describe$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.describe$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoFontDescription* (*describe)(PangoFontFace*);
     * }
     */
    public static void describe$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFaceClass.describe$VH.set(seg, x);
    }
    public static MemorySegment describe$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.describe$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void describe$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFaceClass.describe$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static describe describe(MemorySegment segment, SegmentScope scope) {
        return describe.ofAddress(describe$get(segment), scope);
    }
    static final FunctionDescriptor list_sizes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor list_sizes_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle list_sizes_UP$MH = RuntimeHelper.upcallHandle(list_sizes.class, "apply", _PangoFontFaceClass.list_sizes_UP$FUNC);
    static final FunctionDescriptor list_sizes_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle list_sizes_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFaceClass.list_sizes_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*list_sizes)(PangoFontFace*,int**,int*);
     * }
     */
    public interface list_sizes {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(list_sizes fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFaceClass.list_sizes_UP$MH, fi, _PangoFontFaceClass.list_sizes$FUNC, scope);
        }
        static list_sizes ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _PangoFontFaceClass.list_sizes_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle list_sizes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("list_sizes"));
    public static VarHandle list_sizes$VH() {
        return _PangoFontFaceClass.list_sizes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*list_sizes)(PangoFontFace*,int**,int*);
     * }
     */
    public static MemorySegment list_sizes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.list_sizes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*list_sizes)(PangoFontFace*,int**,int*);
     * }
     */
    public static void list_sizes$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFaceClass.list_sizes$VH.set(seg, x);
    }
    public static MemorySegment list_sizes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.list_sizes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void list_sizes$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFaceClass.list_sizes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static list_sizes list_sizes(MemorySegment segment, SegmentScope scope) {
        return list_sizes.ofAddress(list_sizes$get(segment), scope);
    }
    static final FunctionDescriptor is_synthesized$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor is_synthesized_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_synthesized_UP$MH = RuntimeHelper.upcallHandle(is_synthesized.class, "apply", _PangoFontFaceClass.is_synthesized_UP$FUNC);
    static final FunctionDescriptor is_synthesized_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_synthesized_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFaceClass.is_synthesized_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*is_synthesized)(PangoFontFace*);
     * }
     */
    public interface is_synthesized {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(is_synthesized fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFaceClass.is_synthesized_UP$MH, fi, _PangoFontFaceClass.is_synthesized$FUNC, scope);
        }
        static is_synthesized ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_PangoFontFaceClass.is_synthesized_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_synthesized$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_synthesized"));
    public static VarHandle is_synthesized$VH() {
        return _PangoFontFaceClass.is_synthesized$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*is_synthesized)(PangoFontFace*);
     * }
     */
    public static MemorySegment is_synthesized$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.is_synthesized$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*is_synthesized)(PangoFontFace*);
     * }
     */
    public static void is_synthesized$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFaceClass.is_synthesized$VH.set(seg, x);
    }
    public static MemorySegment is_synthesized$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.is_synthesized$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_synthesized$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFaceClass.is_synthesized$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_synthesized is_synthesized(MemorySegment segment, SegmentScope scope) {
        return is_synthesized.ofAddress(is_synthesized$get(segment), scope);
    }
    static final FunctionDescriptor get_family$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_family_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_family_UP$MH = RuntimeHelper.upcallHandle(get_family.class, "apply", _PangoFontFaceClass.get_family_UP$FUNC);
    static final FunctionDescriptor get_family_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_family_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFaceClass.get_family_DOWN$FUNC
    );
    /**
     * {@snippet :
 * PangoFontFamily* (*get_family)(PangoFontFace*);
     * }
     */
    public interface get_family {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_family fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFaceClass.get_family_UP$MH, fi, _PangoFontFaceClass.get_family$FUNC, scope);
        }
        static get_family ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.get_family_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_family$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_family"));
    public static VarHandle get_family$VH() {
        return _PangoFontFaceClass.get_family$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoFontFamily* (*get_family)(PangoFontFace*);
     * }
     */
    public static MemorySegment get_family$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.get_family$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoFontFamily* (*get_family)(PangoFontFace*);
     * }
     */
    public static void get_family$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFaceClass.get_family$VH.set(seg, x);
    }
    public static MemorySegment get_family$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass.get_family$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_family$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFaceClass.get_family$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_family get_family(MemorySegment segment, SegmentScope scope) {
        return get_family.ofAddress(get_family$get(segment), scope);
    }
    static final FunctionDescriptor _pango_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _pango_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved3_UP$MH = RuntimeHelper.upcallHandle(_pango_reserved3.class, "apply", _PangoFontFaceClass._pango_reserved3_UP$FUNC);
    static final FunctionDescriptor _pango_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFaceClass._pango_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_pango_reserved3)();
     * }
     */
    public interface _pango_reserved3 {

        void apply();
        static MemorySegment allocate(_pango_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFaceClass._pango_reserved3_UP$MH, fi, _PangoFontFaceClass._pango_reserved3$FUNC, scope);
        }
        static _pango_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _PangoFontFaceClass._pango_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved3"));
    public static VarHandle _pango_reserved3$VH() {
        return _PangoFontFaceClass._pango_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved3)();
     * }
     */
    public static MemorySegment _pango_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass._pango_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved3)();
     * }
     */
    public static void _pango_reserved3$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFaceClass._pango_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _pango_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass._pango_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFaceClass._pango_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved3 _pango_reserved3(MemorySegment segment, SegmentScope scope) {
        return _pango_reserved3.ofAddress(_pango_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _pango_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _pango_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved4_UP$MH = RuntimeHelper.upcallHandle(_pango_reserved4.class, "apply", _PangoFontFaceClass._pango_reserved4_UP$FUNC);
    static final FunctionDescriptor _pango_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _pango_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoFontFaceClass._pango_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_pango_reserved4)();
     * }
     */
    public interface _pango_reserved4 {

        void apply();
        static MemorySegment allocate(_pango_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoFontFaceClass._pango_reserved4_UP$MH, fi, _PangoFontFaceClass._pango_reserved4$FUNC, scope);
        }
        static _pango_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _PangoFontFaceClass._pango_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _pango_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_pango_reserved4"));
    public static VarHandle _pango_reserved4$VH() {
        return _PangoFontFaceClass._pango_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_pango_reserved4)();
     * }
     */
    public static MemorySegment _pango_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass._pango_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_pango_reserved4)();
     * }
     */
    public static void _pango_reserved4$set(MemorySegment seg, MemorySegment x) {
        _PangoFontFaceClass._pango_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _pango_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoFontFaceClass._pango_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _pango_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoFontFaceClass._pango_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _pango_reserved4 _pango_reserved4(MemorySegment segment, SegmentScope scope) {
        return _pango_reserved4.ofAddress(_pango_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


