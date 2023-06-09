// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GAsyncInitableIface {
 *     GTypeInterface g_iface;
 *     void (*init_async)(GAsyncInitable*,int,GCancellable*,GAsyncReadyCallback,gpointer);
 *     gboolean (*init_finish)(GAsyncInitable*,GAsyncResult*,GError**);
 * };
 * }
 */
public class _GAsyncInitableIface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("init_async"),
        Constants$root.C_POINTER$LAYOUT.withName("init_finish")
    ).withName("_GAsyncInitableIface");
    public static MemoryLayout $LAYOUT() {
        return _GAsyncInitableIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor init_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor init_async_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle init_async_UP$MH = RuntimeHelper.upcallHandle(init_async.class, "apply", _GAsyncInitableIface.init_async_UP$FUNC);
    static final FunctionDescriptor init_async_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle init_async_DOWN$MH = RuntimeHelper.downcallHandle(
        _GAsyncInitableIface.init_async_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*init_async)(GAsyncInitable*,int,GCancellable*,GAsyncReadyCallback,gpointer);
     * }
     */
    public interface init_async {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(init_async fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GAsyncInitableIface.init_async_UP$MH, fi, _GAsyncInitableIface.init_async$FUNC, scope);
        }
        static init_async ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    _GAsyncInitableIface.init_async_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle init_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("init_async"));
    public static VarHandle init_async$VH() {
        return _GAsyncInitableIface.init_async$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*init_async)(GAsyncInitable*,int,GCancellable*,GAsyncReadyCallback,gpointer);
     * }
     */
    public static MemorySegment init_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GAsyncInitableIface.init_async$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*init_async)(GAsyncInitable*,int,GCancellable*,GAsyncReadyCallback,gpointer);
     * }
     */
    public static void init_async$set(MemorySegment seg, MemorySegment x) {
        _GAsyncInitableIface.init_async$VH.set(seg, x);
    }
    public static MemorySegment init_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GAsyncInitableIface.init_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void init_async$set(MemorySegment seg, long index, MemorySegment x) {
        _GAsyncInitableIface.init_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static init_async init_async(MemorySegment segment, SegmentScope scope) {
        return init_async.ofAddress(init_async$get(segment), scope);
    }
    static final FunctionDescriptor init_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor init_finish_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle init_finish_UP$MH = RuntimeHelper.upcallHandle(init_finish.class, "apply", _GAsyncInitableIface.init_finish_UP$FUNC);
    static final FunctionDescriptor init_finish_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle init_finish_DOWN$MH = RuntimeHelper.downcallHandle(
        _GAsyncInitableIface.init_finish_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*init_finish)(GAsyncInitable*,GAsyncResult*,GError**);
     * }
     */
    public interface init_finish {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(init_finish fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GAsyncInitableIface.init_finish_UP$MH, fi, _GAsyncInitableIface.init_finish$FUNC, scope);
        }
        static init_finish ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)_GAsyncInitableIface.init_finish_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle init_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("init_finish"));
    public static VarHandle init_finish$VH() {
        return _GAsyncInitableIface.init_finish$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*init_finish)(GAsyncInitable*,GAsyncResult*,GError**);
     * }
     */
    public static MemorySegment init_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GAsyncInitableIface.init_finish$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*init_finish)(GAsyncInitable*,GAsyncResult*,GError**);
     * }
     */
    public static void init_finish$set(MemorySegment seg, MemorySegment x) {
        _GAsyncInitableIface.init_finish$VH.set(seg, x);
    }
    public static MemorySegment init_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GAsyncInitableIface.init_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void init_finish$set(MemorySegment seg, long index, MemorySegment x) {
        _GAsyncInitableIface.init_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static init_finish init_finish(MemorySegment segment, SegmentScope scope) {
        return init_finish.ofAddress(init_finish$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


