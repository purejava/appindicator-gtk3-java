// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GProxyResolverInterface {
 *     GTypeInterface g_iface;
 *     gboolean (*is_supported)(GProxyResolver*);
 *     gchar** (*lookup)(GProxyResolver*,const gchar*,GCancellable*,GError**);
 *     void (*lookup_async)(GProxyResolver*,const gchar*,GCancellable*,GAsyncReadyCallback,gpointer);
 *     gchar** (*lookup_finish)(GProxyResolver*,GAsyncResult*,GError**);
 * };
 * }
 */
public class _GProxyResolverInterface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("is_supported"),
        Constants$root.C_POINTER$LAYOUT.withName("lookup"),
        Constants$root.C_POINTER$LAYOUT.withName("lookup_async"),
        Constants$root.C_POINTER$LAYOUT.withName("lookup_finish")
    ).withName("_GProxyResolverInterface");
    public static MemoryLayout $LAYOUT() {
        return _GProxyResolverInterface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor is_supported$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor is_supported_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_supported_UP$MH = RuntimeHelper.upcallHandle(is_supported.class, "apply", _GProxyResolverInterface.is_supported_UP$FUNC);
    static final FunctionDescriptor is_supported_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle is_supported_DOWN$MH = RuntimeHelper.downcallHandle(
        _GProxyResolverInterface.is_supported_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*is_supported)(GProxyResolver*);
     * }
     */
    public interface is_supported {

        int apply(java.lang.foreign.MemorySegment _x0);
        static MemorySegment allocate(is_supported fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GProxyResolverInterface.is_supported_UP$MH, fi, _GProxyResolverInterface.is_supported$FUNC, scope);
        }
        static is_supported ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0) -> {
                try {
                    return (int)_GProxyResolverInterface.is_supported_DOWN$MH.invokeExact(symbol, __x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle is_supported$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("is_supported"));
    public static VarHandle is_supported$VH() {
        return _GProxyResolverInterface.is_supported$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*is_supported)(GProxyResolver*);
     * }
     */
    public static MemorySegment is_supported$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GProxyResolverInterface.is_supported$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*is_supported)(GProxyResolver*);
     * }
     */
    public static void is_supported$set(MemorySegment seg, MemorySegment x) {
        _GProxyResolverInterface.is_supported$VH.set(seg, x);
    }
    public static MemorySegment is_supported$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GProxyResolverInterface.is_supported$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void is_supported$set(MemorySegment seg, long index, MemorySegment x) {
        _GProxyResolverInterface.is_supported$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static is_supported is_supported(MemorySegment segment, SegmentScope scope) {
        return is_supported.ofAddress(is_supported$get(segment), scope);
    }
    static final FunctionDescriptor lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor lookup_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lookup_UP$MH = RuntimeHelper.upcallHandle(lookup.class, "apply", _GProxyResolverInterface.lookup_UP$FUNC);
    static final FunctionDescriptor lookup_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lookup_DOWN$MH = RuntimeHelper.downcallHandle(
        _GProxyResolverInterface.lookup_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gchar** (*lookup)(GProxyResolver*,const gchar*,GCancellable*,GError**);
     * }
     */
    public interface lookup {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data, java.lang.foreign.MemorySegment target, java.lang.foreign.MemorySegment extents);
        static MemorySegment allocate(lookup fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GProxyResolverInterface.lookup_UP$MH, fi, _GProxyResolverInterface.lookup$FUNC, scope);
        }
        static lookup ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _pattern, java.lang.foreign.MemorySegment _callback_data, java.lang.foreign.MemorySegment _target, java.lang.foreign.MemorySegment _extents) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GProxyResolverInterface.lookup_DOWN$MH.invokeExact(symbol, _pattern, _callback_data, _target, _extents);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle lookup$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lookup"));
    public static VarHandle lookup$VH() {
        return _GProxyResolverInterface.lookup$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar** (*lookup)(GProxyResolver*,const gchar*,GCancellable*,GError**);
     * }
     */
    public static MemorySegment lookup$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GProxyResolverInterface.lookup$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar** (*lookup)(GProxyResolver*,const gchar*,GCancellable*,GError**);
     * }
     */
    public static void lookup$set(MemorySegment seg, MemorySegment x) {
        _GProxyResolverInterface.lookup$VH.set(seg, x);
    }
    public static MemorySegment lookup$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GProxyResolverInterface.lookup$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lookup$set(MemorySegment seg, long index, MemorySegment x) {
        _GProxyResolverInterface.lookup$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static lookup lookup(MemorySegment segment, SegmentScope scope) {
        return lookup.ofAddress(lookup$get(segment), scope);
    }
    static final FunctionDescriptor lookup_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor lookup_async_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lookup_async_UP$MH = RuntimeHelper.upcallHandle(lookup_async.class, "apply", _GProxyResolverInterface.lookup_async_UP$FUNC);
    static final FunctionDescriptor lookup_async_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lookup_async_DOWN$MH = RuntimeHelper.downcallHandle(
        _GProxyResolverInterface.lookup_async_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*lookup_async)(GProxyResolver*,const gchar*,GCancellable*,GAsyncReadyCallback,gpointer);
     * }
     */
    public interface lookup_async {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(lookup_async fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GProxyResolverInterface.lookup_async_UP$MH, fi, _GProxyResolverInterface.lookup_async$FUNC, scope);
        }
        static lookup_async ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    _GProxyResolverInterface.lookup_async_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle lookup_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lookup_async"));
    public static VarHandle lookup_async$VH() {
        return _GProxyResolverInterface.lookup_async$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*lookup_async)(GProxyResolver*,const gchar*,GCancellable*,GAsyncReadyCallback,gpointer);
     * }
     */
    public static MemorySegment lookup_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GProxyResolverInterface.lookup_async$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*lookup_async)(GProxyResolver*,const gchar*,GCancellable*,GAsyncReadyCallback,gpointer);
     * }
     */
    public static void lookup_async$set(MemorySegment seg, MemorySegment x) {
        _GProxyResolverInterface.lookup_async$VH.set(seg, x);
    }
    public static MemorySegment lookup_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GProxyResolverInterface.lookup_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lookup_async$set(MemorySegment seg, long index, MemorySegment x) {
        _GProxyResolverInterface.lookup_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static lookup_async lookup_async(MemorySegment segment, SegmentScope scope) {
        return lookup_async.ofAddress(lookup_async$get(segment), scope);
    }
    static final FunctionDescriptor lookup_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor lookup_finish_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lookup_finish_UP$MH = RuntimeHelper.upcallHandle(lookup_finish.class, "apply", _GProxyResolverInterface.lookup_finish_UP$FUNC);
    static final FunctionDescriptor lookup_finish_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lookup_finish_DOWN$MH = RuntimeHelper.downcallHandle(
        _GProxyResolverInterface.lookup_finish_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gchar** (*lookup_finish)(GProxyResolver*,GAsyncResult*,GError**);
     * }
     */
    public interface lookup_finish {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment vfs, java.lang.foreign.MemorySegment identifier, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(lookup_finish fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GProxyResolverInterface.lookup_finish_UP$MH, fi, _GProxyResolverInterface.lookup_finish$FUNC, scope);
        }
        static lookup_finish ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _vfs, java.lang.foreign.MemorySegment _identifier, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GProxyResolverInterface.lookup_finish_DOWN$MH.invokeExact(symbol, _vfs, _identifier, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle lookup_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("lookup_finish"));
    public static VarHandle lookup_finish$VH() {
        return _GProxyResolverInterface.lookup_finish$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar** (*lookup_finish)(GProxyResolver*,GAsyncResult*,GError**);
     * }
     */
    public static MemorySegment lookup_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GProxyResolverInterface.lookup_finish$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar** (*lookup_finish)(GProxyResolver*,GAsyncResult*,GError**);
     * }
     */
    public static void lookup_finish$set(MemorySegment seg, MemorySegment x) {
        _GProxyResolverInterface.lookup_finish$VH.set(seg, x);
    }
    public static MemorySegment lookup_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GProxyResolverInterface.lookup_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lookup_finish$set(MemorySegment seg, long index, MemorySegment x) {
        _GProxyResolverInterface.lookup_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static lookup_finish lookup_finish(MemorySegment segment, SegmentScope scope) {
        return lookup_finish.ofAddress(lookup_finish$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


