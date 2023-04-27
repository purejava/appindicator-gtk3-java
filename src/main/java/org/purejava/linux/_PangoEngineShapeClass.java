// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _PangoEngineShapeClass {
 *     PangoEngineClass parent_class;
 *     void (*script_shape)(PangoEngineShape*,PangoFont*,char*,unsigned int,const PangoAnalysis*,PangoGlyphString*,char*,unsigned int);
 *     PangoCoverageLevel (*covers)(PangoEngineShape*,PangoFont*,PangoLanguage*,gunichar);
 * };
 * }
 */
public class _PangoEngineShapeClass {

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
            ).withName("parent_class")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("script_shape"),
        Constants$root.C_POINTER$LAYOUT.withName("covers")
    ).withName("_PangoEngineShapeClass");
    public static MemoryLayout $LAYOUT() {
        return _PangoEngineShapeClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor script_shape$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor script_shape_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle script_shape_UP$MH = RuntimeHelper.upcallHandle(script_shape.class, "apply", _PangoEngineShapeClass.script_shape_UP$FUNC);
    static final FunctionDescriptor script_shape_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle script_shape_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoEngineShapeClass.script_shape_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*script_shape)(PangoEngineShape*,PangoFont*,char*,unsigned int,const PangoAnalysis*,PangoGlyphString*,char*,unsigned int);
     * }
     */
    public interface script_shape {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5, java.lang.foreign.MemorySegment _x6, int _x7);
        static MemorySegment allocate(script_shape fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoEngineShapeClass.script_shape_UP$MH, fi, _PangoEngineShapeClass.script_shape$FUNC, scope);
        }
        static script_shape ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5, java.lang.foreign.MemorySegment __x6, int __x7) -> {
                try {
                    _PangoEngineShapeClass.script_shape_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5, __x6, __x7);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle script_shape$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("script_shape"));
    public static VarHandle script_shape$VH() {
        return _PangoEngineShapeClass.script_shape$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*script_shape)(PangoEngineShape*,PangoFont*,char*,unsigned int,const PangoAnalysis*,PangoGlyphString*,char*,unsigned int);
     * }
     */
    public static MemorySegment script_shape$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoEngineShapeClass.script_shape$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*script_shape)(PangoEngineShape*,PangoFont*,char*,unsigned int,const PangoAnalysis*,PangoGlyphString*,char*,unsigned int);
     * }
     */
    public static void script_shape$set(MemorySegment seg, MemorySegment x) {
        _PangoEngineShapeClass.script_shape$VH.set(seg, x);
    }
    public static MemorySegment script_shape$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoEngineShapeClass.script_shape$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void script_shape$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoEngineShapeClass.script_shape$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static script_shape script_shape(MemorySegment segment, SegmentScope scope) {
        return script_shape.ofAddress(script_shape$get(segment), scope);
    }
    static final FunctionDescriptor covers$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor covers_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle covers_UP$MH = RuntimeHelper.upcallHandle(covers.class, "apply", _PangoEngineShapeClass.covers_UP$FUNC);
    static final FunctionDescriptor covers_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle covers_DOWN$MH = RuntimeHelper.downcallHandle(
        _PangoEngineShapeClass.covers_DOWN$FUNC
    );
    /**
     * {@snippet :
 * PangoCoverageLevel (*covers)(PangoEngineShape*,PangoFont*,PangoLanguage*,gunichar);
     * }
     */
    public interface covers {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);
        static MemorySegment allocate(covers fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_PangoEngineShapeClass.covers_UP$MH, fi, _PangoEngineShapeClass.covers$FUNC, scope);
        }
        static covers ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    return (int)_PangoEngineShapeClass.covers_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle covers$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("covers"));
    public static VarHandle covers$VH() {
        return _PangoEngineShapeClass.covers$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * PangoCoverageLevel (*covers)(PangoEngineShape*,PangoFont*,PangoLanguage*,gunichar);
     * }
     */
    public static MemorySegment covers$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_PangoEngineShapeClass.covers$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * PangoCoverageLevel (*covers)(PangoEngineShape*,PangoFont*,PangoLanguage*,gunichar);
     * }
     */
    public static void covers$set(MemorySegment seg, MemorySegment x) {
        _PangoEngineShapeClass.covers$VH.set(seg, x);
    }
    public static MemorySegment covers$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_PangoEngineShapeClass.covers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void covers$set(MemorySegment seg, long index, MemorySegment x) {
        _PangoEngineShapeClass.covers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static covers covers(MemorySegment segment, SegmentScope scope) {
        return covers.ofAddress(covers$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


