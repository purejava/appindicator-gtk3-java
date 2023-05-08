// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _AtkStreamableContentIface {
 *     GTypeInterface parent;
 *     gint (*get_n_mime_types)(AtkStreamableContent*);
 *     const gchar* (*get_mime_type)(AtkStreamableContent*,gint);
 *     GIOChannel* (*get_stream)(AtkStreamableContent*,const gchar*);
 *     const gchar* (*get_uri)(AtkStreamableContent*,const gchar*);
 *     AtkFunction pad1;
 *     AtkFunction pad2;
 *     AtkFunction pad3;
 * };
 * }
 */
public class _AtkStreamableContentIface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("get_n_mime_types"),
        Constants$root.C_POINTER$LAYOUT.withName("get_mime_type"),
        Constants$root.C_POINTER$LAYOUT.withName("get_stream"),
        Constants$root.C_POINTER$LAYOUT.withName("get_uri"),
        Constants$root.C_POINTER$LAYOUT.withName("pad1"),
        Constants$root.C_POINTER$LAYOUT.withName("pad2"),
        Constants$root.C_POINTER$LAYOUT.withName("pad3")
    ).withName("_AtkStreamableContentIface");
    public static MemoryLayout $LAYOUT() {
        return _AtkStreamableContentIface.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_n_mime_types$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_n_mime_types_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_n_mime_types_UP$MH = RuntimeHelper.upcallHandle(get_n_mime_types.class, "apply", _AtkStreamableContentIface.get_n_mime_types_UP$FUNC);
    static final FunctionDescriptor get_n_mime_types_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_n_mime_types_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkStreamableContentIface.get_n_mime_types_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gint (*get_n_mime_types)(AtkStreamableContent*);
     * }
     */
    public interface get_n_mime_types {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(get_n_mime_types fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkStreamableContentIface.get_n_mime_types_UP$MH, fi, _AtkStreamableContentIface.get_n_mime_types$FUNC, scope);
        }
        static get_n_mime_types ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_AtkStreamableContentIface.get_n_mime_types_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_n_mime_types$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_n_mime_types"));
    public static VarHandle get_n_mime_types$VH() {
        return _AtkStreamableContentIface.get_n_mime_types$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gint (*get_n_mime_types)(AtkStreamableContent*);
     * }
     */
    public static MemorySegment get_n_mime_types$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_n_mime_types$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gint (*get_n_mime_types)(AtkStreamableContent*);
     * }
     */
    public static void get_n_mime_types$set(MemorySegment seg, MemorySegment x) {
        _AtkStreamableContentIface.get_n_mime_types$VH.set(seg, x);
    }
    public static MemorySegment get_n_mime_types$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_n_mime_types$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_n_mime_types$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkStreamableContentIface.get_n_mime_types$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_n_mime_types get_n_mime_types(MemorySegment segment, SegmentScope scope) {
        return get_n_mime_types.ofAddress(get_n_mime_types$get(segment), scope);
    }
    static final FunctionDescriptor get_mime_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor get_mime_type_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_mime_type_UP$MH = RuntimeHelper.upcallHandle(get_mime_type.class, "apply", _AtkStreamableContentIface.get_mime_type_UP$FUNC);
    static final FunctionDescriptor get_mime_type_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_mime_type_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkStreamableContentIface.get_mime_type_DOWN$FUNC
    );
    /**
     * {@snippet :
 * const gchar* (*get_mime_type)(AtkStreamableContent*,gint);
     * }
     */
    public interface get_mime_type {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(get_mime_type fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkStreamableContentIface.get_mime_type_UP$MH, fi, _AtkStreamableContentIface.get_mime_type$FUNC, scope);
        }
        static get_mime_type ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_mime_type_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_mime_type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_mime_type"));
    public static VarHandle get_mime_type$VH() {
        return _AtkStreamableContentIface.get_mime_type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* (*get_mime_type)(AtkStreamableContent*,gint);
     * }
     */
    public static MemorySegment get_mime_type$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_mime_type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* (*get_mime_type)(AtkStreamableContent*,gint);
     * }
     */
    public static void get_mime_type$set(MemorySegment seg, MemorySegment x) {
        _AtkStreamableContentIface.get_mime_type$VH.set(seg, x);
    }
    public static MemorySegment get_mime_type$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_mime_type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_mime_type$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkStreamableContentIface.get_mime_type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_mime_type get_mime_type(MemorySegment segment, SegmentScope scope) {
        return get_mime_type.ofAddress(get_mime_type$get(segment), scope);
    }
    static final FunctionDescriptor get_stream$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_stream_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_stream_UP$MH = RuntimeHelper.upcallHandle(get_stream.class, "apply", _AtkStreamableContentIface.get_stream_UP$FUNC);
    static final FunctionDescriptor get_stream_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_stream_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkStreamableContentIface.get_stream_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GIOChannel* (*get_stream)(AtkStreamableContent*,const gchar*);
     * }
     */
    public interface get_stream {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
        static MemorySegment allocate(get_stream fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkStreamableContentIface.get_stream_UP$MH, fi, _AtkStreamableContentIface.get_stream$FUNC, scope);
        }
        static get_stream ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_stream_DOWN$MH.invokeExact(symbol, _path, _func_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_stream$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_stream"));
    public static VarHandle get_stream$VH() {
        return _AtkStreamableContentIface.get_stream$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GIOChannel* (*get_stream)(AtkStreamableContent*,const gchar*);
     * }
     */
    public static MemorySegment get_stream$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_stream$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GIOChannel* (*get_stream)(AtkStreamableContent*,const gchar*);
     * }
     */
    public static void get_stream$set(MemorySegment seg, MemorySegment x) {
        _AtkStreamableContentIface.get_stream$VH.set(seg, x);
    }
    public static MemorySegment get_stream$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_stream$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_stream$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkStreamableContentIface.get_stream$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_stream get_stream(MemorySegment segment, SegmentScope scope) {
        return get_stream.ofAddress(get_stream$get(segment), scope);
    }
    static final FunctionDescriptor get_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_uri_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_uri_UP$MH = RuntimeHelper.upcallHandle(get_uri.class, "apply", _AtkStreamableContentIface.get_uri_UP$FUNC);
    static final FunctionDescriptor get_uri_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_uri_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkStreamableContentIface.get_uri_DOWN$FUNC
    );
    /**
     * {@snippet :
 * const gchar* (*get_uri)(AtkStreamableContent*,const gchar*);
     * }
     */
    public interface get_uri {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment func_data);
        static MemorySegment allocate(get_uri fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkStreamableContentIface.get_uri_UP$MH, fi, _AtkStreamableContentIface.get_uri$FUNC, scope);
        }
        static get_uri ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _func_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_uri_DOWN$MH.invokeExact(symbol, _path, _func_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_uri$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_uri"));
    public static VarHandle get_uri$VH() {
        return _AtkStreamableContentIface.get_uri$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * const gchar* (*get_uri)(AtkStreamableContent*,const gchar*);
     * }
     */
    public static MemorySegment get_uri$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_uri$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * const gchar* (*get_uri)(AtkStreamableContent*,const gchar*);
     * }
     */
    public static void get_uri$set(MemorySegment seg, MemorySegment x) {
        _AtkStreamableContentIface.get_uri$VH.set(seg, x);
    }
    public static MemorySegment get_uri$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.get_uri$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_uri$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkStreamableContentIface.get_uri$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_uri get_uri(MemorySegment segment, SegmentScope scope) {
        return get_uri.ofAddress(get_uri$get(segment), scope);
    }
    static final VarHandle pad1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pad1"));
    public static VarHandle pad1$VH() {
        return _AtkStreamableContentIface.pad1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AtkFunction pad1;
     * }
     */
    public static MemorySegment pad1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.pad1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AtkFunction pad1;
     * }
     */
    public static void pad1$set(MemorySegment seg, MemorySegment x) {
        _AtkStreamableContentIface.pad1$VH.set(seg, x);
    }
    public static MemorySegment pad1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.pad1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad1$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkStreamableContentIface.pad1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AtkFunction pad1(MemorySegment segment, SegmentScope scope) {
        return AtkFunction.ofAddress(pad1$get(segment), scope);
    }
    static final VarHandle pad2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pad2"));
    public static VarHandle pad2$VH() {
        return _AtkStreamableContentIface.pad2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AtkFunction pad2;
     * }
     */
    public static MemorySegment pad2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.pad2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AtkFunction pad2;
     * }
     */
    public static void pad2$set(MemorySegment seg, MemorySegment x) {
        _AtkStreamableContentIface.pad2$VH.set(seg, x);
    }
    public static MemorySegment pad2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.pad2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad2$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkStreamableContentIface.pad2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AtkFunction pad2(MemorySegment segment, SegmentScope scope) {
        return AtkFunction.ofAddress(pad2$get(segment), scope);
    }
    static final VarHandle pad3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pad3"));
    public static VarHandle pad3$VH() {
        return _AtkStreamableContentIface.pad3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AtkFunction pad3;
     * }
     */
    public static MemorySegment pad3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.pad3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AtkFunction pad3;
     * }
     */
    public static void pad3$set(MemorySegment seg, MemorySegment x) {
        _AtkStreamableContentIface.pad3$VH.set(seg, x);
    }
    public static MemorySegment pad3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkStreamableContentIface.pad3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pad3$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkStreamableContentIface.pad3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AtkFunction pad3(MemorySegment segment, SegmentScope scope) {
        return AtkFunction.ofAddress(pad3$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

