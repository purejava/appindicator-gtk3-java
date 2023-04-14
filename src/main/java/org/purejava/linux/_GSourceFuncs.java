// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GSourceFuncs {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    public static MemoryLayout $LAYOUT() {
        return _GSourceFuncs.$struct$LAYOUT;
    }
    static final FunctionDescriptor prepare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle prepare$MH = RuntimeHelper.downcallHandle(
        _GSourceFuncs.prepare$FUNC
    );
    public interface prepare {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(prepare fi, MemorySession session) {
            return RuntimeHelper.upcallStub(prepare.class, fi, _GSourceFuncs.prepare$FUNC, session);
        }
        static prepare ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)_GSourceFuncs.prepare$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle prepare$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prepare"));
    public static VarHandle prepare$VH() {
        return _GSourceFuncs.prepare$VH;
    }
    public static MemoryAddress prepare$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.prepare$VH.get(seg);
    }
    public static void prepare$set( MemorySegment seg, MemoryAddress x) {
        _GSourceFuncs.prepare$VH.set(seg, x);
    }
    public static MemoryAddress prepare$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.prepare$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prepare$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSourceFuncs.prepare$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static prepare prepare (MemorySegment segment, MemorySession session) {
        return prepare.ofAddress(prepare$get(segment), session);
    }
    static final FunctionDescriptor check$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle check$MH = RuntimeHelper.downcallHandle(
        _GSourceFuncs.check$FUNC
    );
    public interface check {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(check fi, MemorySession session) {
            return RuntimeHelper.upcallStub(check.class, fi, _GSourceFuncs.check$FUNC, session);
        }
        static check ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GSourceFuncs.check$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle check$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("check"));
    public static VarHandle check$VH() {
        return _GSourceFuncs.check$VH;
    }
    public static MemoryAddress check$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.check$VH.get(seg);
    }
    public static void check$set( MemorySegment seg, MemoryAddress x) {
        _GSourceFuncs.check$VH.set(seg, x);
    }
    public static MemoryAddress check$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.check$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void check$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSourceFuncs.check$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static check check (MemorySegment segment, MemorySession session) {
        return check.ofAddress(check$get(segment), session);
    }
    static final FunctionDescriptor dispatch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle dispatch$MH = RuntimeHelper.downcallHandle(
        _GSourceFuncs.dispatch$FUNC
    );
    public interface dispatch {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(dispatch fi, MemorySession session) {
            return RuntimeHelper.upcallStub(dispatch.class, fi, _GSourceFuncs.dispatch$FUNC, session);
        }
        static dispatch ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)_GSourceFuncs.dispatch$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle dispatch$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dispatch"));
    public static VarHandle dispatch$VH() {
        return _GSourceFuncs.dispatch$VH;
    }
    public static MemoryAddress dispatch$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.dispatch$VH.get(seg);
    }
    public static void dispatch$set( MemorySegment seg, MemoryAddress x) {
        _GSourceFuncs.dispatch$VH.set(seg, x);
    }
    public static MemoryAddress dispatch$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.dispatch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dispatch$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSourceFuncs.dispatch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static dispatch dispatch (MemorySegment segment, MemorySession session) {
        return dispatch.ofAddress(dispatch$get(segment), session);
    }
    static final FunctionDescriptor finalize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle finalize$MH = RuntimeHelper.downcallHandle(
        _GSourceFuncs.finalize$FUNC
    );
    public interface finalize {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(finalize fi, MemorySession session) {
            return RuntimeHelper.upcallStub(finalize.class, fi, _GSourceFuncs.finalize$FUNC, session);
        }
        static finalize ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GSourceFuncs.finalize$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle finalize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("finalize"));
    public static VarHandle finalize$VH() {
        return _GSourceFuncs.finalize$VH;
    }
    public static MemoryAddress finalize$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.finalize$VH.get(seg);
    }
    public static void finalize$set( MemorySegment seg, MemoryAddress x) {
        _GSourceFuncs.finalize$VH.set(seg, x);
    }
    public static MemoryAddress finalize$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.finalize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void finalize$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSourceFuncs.finalize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static finalize finalize (MemorySegment segment, MemorySession session) {
        return finalize.ofAddress(finalize$get(segment), session);
    }
    static final VarHandle closure_callback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("closure_callback"));
    public static VarHandle closure_callback$VH() {
        return _GSourceFuncs.closure_callback$VH;
    }
    public static MemoryAddress closure_callback$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.closure_callback$VH.get(seg);
    }
    public static void closure_callback$set( MemorySegment seg, MemoryAddress x) {
        _GSourceFuncs.closure_callback$VH.set(seg, x);
    }
    public static MemoryAddress closure_callback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.closure_callback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void closure_callback$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSourceFuncs.closure_callback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GSourceFunc closure_callback (MemorySegment segment, MemorySession session) {
        return GSourceFunc.ofAddress(closure_callback$get(segment), session);
    }
    static final VarHandle closure_marshal$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("closure_marshal"));
    public static VarHandle closure_marshal$VH() {
        return _GSourceFuncs.closure_marshal$VH;
    }
    public static MemoryAddress closure_marshal$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.closure_marshal$VH.get(seg);
    }
    public static void closure_marshal$set( MemorySegment seg, MemoryAddress x) {
        _GSourceFuncs.closure_marshal$VH.set(seg, x);
    }
    public static MemoryAddress closure_marshal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GSourceFuncs.closure_marshal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void closure_marshal$set(MemorySegment seg, long index, MemoryAddress x) {
        _GSourceFuncs.closure_marshal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GSourceDummyMarshal closure_marshal (MemorySegment segment, MemorySession session) {
        return GSourceDummyMarshal.ofAddress(closure_marshal$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

