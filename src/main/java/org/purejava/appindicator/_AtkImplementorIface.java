// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;

/**
 * {@snippet :
 * struct _AtkImplementorIface {
 *     GTypeInterface parent;
 *     AtkObject* (*ref_accessible)(AtkImplementor*);
 * };
 * }
 */
public class _AtkImplementorIface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("ref_accessible")
    ).withName("_AtkImplementorIface");
    public static MemoryLayout $LAYOUT() {
        return _AtkImplementorIface.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor ref_accessible$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor ref_accessible_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ref_accessible_UP$MH = RuntimeHelper.upcallHandle(ref_accessible.class, "apply", _AtkImplementorIface.ref_accessible_UP$FUNC);
    static final FunctionDescriptor ref_accessible_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ref_accessible_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkImplementorIface.ref_accessible_DOWN$FUNC
    );
    /**
     * {@snippet :
 * AtkObject* (*ref_accessible)(AtkImplementor*);
     * }
     */
    public interface ref_accessible {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(ref_accessible fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkImplementorIface.ref_accessible_UP$MH, fi, _AtkImplementorIface.ref_accessible$FUNC, scope);
        }
        static ref_accessible ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_AtkImplementorIface.ref_accessible_DOWN$MH.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ref_accessible$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ref_accessible"));
    public static VarHandle ref_accessible$VH() {
        return _AtkImplementorIface.ref_accessible$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * AtkObject* (*ref_accessible)(AtkImplementor*);
     * }
     */
    public static MemorySegment ref_accessible$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkImplementorIface.ref_accessible$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * AtkObject* (*ref_accessible)(AtkImplementor*);
     * }
     */
    public static void ref_accessible$set(MemorySegment seg, MemorySegment x) {
        _AtkImplementorIface.ref_accessible$VH.set(seg, x);
    }
    public static MemorySegment ref_accessible$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkImplementorIface.ref_accessible$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_accessible$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkImplementorIface.ref_accessible$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ref_accessible ref_accessible(MemorySegment segment, SegmentScope scope) {
        return ref_accessible.ofAddress(ref_accessible$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


