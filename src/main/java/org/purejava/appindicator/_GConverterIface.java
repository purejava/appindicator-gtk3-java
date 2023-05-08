// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _GConverterIface {
 *     GTypeInterface g_iface;
 *     GConverterResult (*convert)(GConverter*,void*,gsize,void*,gsize,GConverterFlags,gsize*,gsize*,GError**);
 *     void (*reset)(GConverter*);
 * };
 * }
 */
public class _GConverterIface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("convert"),
        Constants$root.C_POINTER$LAYOUT.withName("reset")
    ).withName("_GConverterIface");
    public static MemoryLayout $LAYOUT() {
        return _GConverterIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor convert$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor convert_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle convert_UP$MH = RuntimeHelper.upcallHandle(convert.class, "apply", _GConverterIface.convert_UP$FUNC);
    static final FunctionDescriptor convert_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle convert_DOWN$MH = RuntimeHelper.downcallHandle(
        _GConverterIface.convert_DOWN$FUNC
    );
    /**
     * {@snippet :
 * GConverterResult (*convert)(GConverter*,void*,gsize,void*,gsize,GConverterFlags,gsize*,gsize*,GError**);
     * }
     */
    public interface convert {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, long _x2, java.lang.foreign.MemorySegment _x3, long _x4, int _x5, java.lang.foreign.MemorySegment _x6, java.lang.foreign.MemorySegment _x7, java.lang.foreign.MemorySegment _x8);
        static MemorySegment allocate(convert fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GConverterIface.convert_UP$MH, fi, _GConverterIface.convert$FUNC, scope);
        }
        static convert ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, long __x2, java.lang.foreign.MemorySegment __x3, long __x4, int __x5, java.lang.foreign.MemorySegment __x6, java.lang.foreign.MemorySegment __x7, java.lang.foreign.MemorySegment __x8) -> {
                try {
                    return (int)_GConverterIface.convert_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7, __x8);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle convert$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("convert"));
    public static VarHandle convert$VH() {
        return _GConverterIface.convert$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * GConverterResult (*convert)(GConverter*,void*,gsize,void*,gsize,GConverterFlags,gsize*,gsize*,GError**);
     * }
     */
    public static MemorySegment convert$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GConverterIface.convert$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * GConverterResult (*convert)(GConverter*,void*,gsize,void*,gsize,GConverterFlags,gsize*,gsize*,GError**);
     * }
     */
    public static void convert$set(MemorySegment seg, MemorySegment x) {
        _GConverterIface.convert$VH.set(seg, x);
    }
    public static MemorySegment convert$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GConverterIface.convert$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void convert$set(MemorySegment seg, long index, MemorySegment x) {
        _GConverterIface.convert$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static convert convert(MemorySegment segment, SegmentScope scope) {
        return convert.ofAddress(convert$get(segment), scope);
    }
    static final FunctionDescriptor reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor reset_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle reset_UP$MH = RuntimeHelper.upcallHandle(reset.class, "apply", _GConverterIface.reset_UP$FUNC);
    static final FunctionDescriptor reset_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle reset_DOWN$MH = RuntimeHelper.downcallHandle(
        _GConverterIface.reset_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*reset)(GConverter*);
     * }
     */
    public interface reset {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(reset fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GConverterIface.reset_UP$MH, fi, _GConverterIface.reset$FUNC, scope);
        }
        static reset ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GConverterIface.reset_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle reset$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("reset"));
    public static VarHandle reset$VH() {
        return _GConverterIface.reset$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*reset)(GConverter*);
     * }
     */
    public static MemorySegment reset$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GConverterIface.reset$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*reset)(GConverter*);
     * }
     */
    public static void reset$set(MemorySegment seg, MemorySegment x) {
        _GConverterIface.reset$VH.set(seg, x);
    }
    public static MemorySegment reset$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GConverterIface.reset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reset$set(MemorySegment seg, long index, MemorySegment x) {
        _GConverterIface.reset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static reset reset(MemorySegment segment, SegmentScope scope) {
        return reset.ofAddress(reset$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

