// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GdkPixbufLoaderClass {
 *     GObjectClass parent_class;
 *     void (*size_prepared)(GdkPixbufLoader*,int,int);
 *     void (*area_prepared)(GdkPixbufLoader*);
 *     void (*area_updated)(GdkPixbufLoader*,int,int,int,int);
 *     void (*closed)(GdkPixbufLoader*);
 * };
 * }
 */
public class _GdkPixbufLoaderClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("size_prepared"),
        Constants$root.C_POINTER$LAYOUT.withName("area_prepared"),
        Constants$root.C_POINTER$LAYOUT.withName("area_updated"),
        Constants$root.C_POINTER$LAYOUT.withName("closed")
    ).withName("_GdkPixbufLoaderClass");
    public static MemoryLayout $LAYOUT() {
        return _GdkPixbufLoaderClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor size_prepared$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor size_prepared_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle size_prepared_UP$MH = RuntimeHelper.upcallHandle(size_prepared.class, "apply", _GdkPixbufLoaderClass.size_prepared_UP$FUNC);
    static final FunctionDescriptor size_prepared_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle size_prepared_DOWN$MH = RuntimeHelper.downcallHandle(
        _GdkPixbufLoaderClass.size_prepared_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*size_prepared)(GdkPixbufLoader*,int,int);
     * }
     */
    public interface size_prepared {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(size_prepared fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GdkPixbufLoaderClass.size_prepared_UP$MH, fi, _GdkPixbufLoaderClass.size_prepared$FUNC, scope);
        }
        static size_prepared ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    _GdkPixbufLoaderClass.size_prepared_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle size_prepared$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("size_prepared"));
    public static VarHandle size_prepared$VH() {
        return _GdkPixbufLoaderClass.size_prepared$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*size_prepared)(GdkPixbufLoader*,int,int);
     * }
     */
    public static MemorySegment size_prepared$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkPixbufLoaderClass.size_prepared$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*size_prepared)(GdkPixbufLoader*,int,int);
     * }
     */
    public static void size_prepared$set(MemorySegment seg, MemorySegment x) {
        _GdkPixbufLoaderClass.size_prepared$VH.set(seg, x);
    }
    public static MemorySegment size_prepared$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkPixbufLoaderClass.size_prepared$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void size_prepared$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkPixbufLoaderClass.size_prepared$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static size_prepared size_prepared(MemorySegment segment, SegmentScope scope) {
        return size_prepared.ofAddress(size_prepared$get(segment), scope);
    }
    static final FunctionDescriptor area_prepared$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor area_prepared_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle area_prepared_UP$MH = RuntimeHelper.upcallHandle(area_prepared.class, "apply", _GdkPixbufLoaderClass.area_prepared_UP$FUNC);
    static final FunctionDescriptor area_prepared_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle area_prepared_DOWN$MH = RuntimeHelper.downcallHandle(
        _GdkPixbufLoaderClass.area_prepared_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*area_prepared)(GdkPixbufLoader*);
     * }
     */
    public interface area_prepared {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(area_prepared fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GdkPixbufLoaderClass.area_prepared_UP$MH, fi, _GdkPixbufLoaderClass.area_prepared$FUNC, scope);
        }
        static area_prepared ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GdkPixbufLoaderClass.area_prepared_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle area_prepared$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("area_prepared"));
    public static VarHandle area_prepared$VH() {
        return _GdkPixbufLoaderClass.area_prepared$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*area_prepared)(GdkPixbufLoader*);
     * }
     */
    public static MemorySegment area_prepared$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkPixbufLoaderClass.area_prepared$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*area_prepared)(GdkPixbufLoader*);
     * }
     */
    public static void area_prepared$set(MemorySegment seg, MemorySegment x) {
        _GdkPixbufLoaderClass.area_prepared$VH.set(seg, x);
    }
    public static MemorySegment area_prepared$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkPixbufLoaderClass.area_prepared$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void area_prepared$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkPixbufLoaderClass.area_prepared$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static area_prepared area_prepared(MemorySegment segment, SegmentScope scope) {
        return area_prepared.ofAddress(area_prepared$get(segment), scope);
    }
    static final FunctionDescriptor area_updated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor area_updated_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle area_updated_UP$MH = RuntimeHelper.upcallHandle(area_updated.class, "apply", _GdkPixbufLoaderClass.area_updated_UP$FUNC);
    static final FunctionDescriptor area_updated_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle area_updated_DOWN$MH = RuntimeHelper.downcallHandle(
        _GdkPixbufLoaderClass.area_updated_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*area_updated)(GdkPixbufLoader*,int,int,int,int);
     * }
     */
    public interface area_updated {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, int _x3, int _x4);
        static MemorySegment allocate(area_updated fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GdkPixbufLoaderClass.area_updated_UP$MH, fi, _GdkPixbufLoaderClass.area_updated$FUNC, scope);
        }
        static area_updated ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, int __x3, int __x4) -> {
                try {
                    _GdkPixbufLoaderClass.area_updated_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle area_updated$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("area_updated"));
    public static VarHandle area_updated$VH() {
        return _GdkPixbufLoaderClass.area_updated$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*area_updated)(GdkPixbufLoader*,int,int,int,int);
     * }
     */
    public static MemorySegment area_updated$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkPixbufLoaderClass.area_updated$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*area_updated)(GdkPixbufLoader*,int,int,int,int);
     * }
     */
    public static void area_updated$set(MemorySegment seg, MemorySegment x) {
        _GdkPixbufLoaderClass.area_updated$VH.set(seg, x);
    }
    public static MemorySegment area_updated$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkPixbufLoaderClass.area_updated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void area_updated$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkPixbufLoaderClass.area_updated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static area_updated area_updated(MemorySegment segment, SegmentScope scope) {
        return area_updated.ofAddress(area_updated$get(segment), scope);
    }
    static final FunctionDescriptor closed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor closed_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle closed_UP$MH = RuntimeHelper.upcallHandle(closed.class, "apply", _GdkPixbufLoaderClass.closed_UP$FUNC);
    static final FunctionDescriptor closed_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle closed_DOWN$MH = RuntimeHelper.downcallHandle(
        _GdkPixbufLoaderClass.closed_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*closed)(GdkPixbufLoader*);
     * }
     */
    public interface closed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(closed fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GdkPixbufLoaderClass.closed_UP$MH, fi, _GdkPixbufLoaderClass.closed$FUNC, scope);
        }
        static closed ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GdkPixbufLoaderClass.closed_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle closed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("closed"));
    public static VarHandle closed$VH() {
        return _GdkPixbufLoaderClass.closed$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*closed)(GdkPixbufLoader*);
     * }
     */
    public static MemorySegment closed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GdkPixbufLoaderClass.closed$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*closed)(GdkPixbufLoader*);
     * }
     */
    public static void closed$set(MemorySegment seg, MemorySegment x) {
        _GdkPixbufLoaderClass.closed$VH.set(seg, x);
    }
    public static MemorySegment closed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GdkPixbufLoaderClass.closed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void closed$set(MemorySegment seg, long index, MemorySegment x) {
        _GdkPixbufLoaderClass.closed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static closed closed(MemorySegment segment, SegmentScope scope) {
        return closed.ofAddress(closed$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


