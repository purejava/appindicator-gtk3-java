// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _AtkImageIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("get_image_position"),
        Constants$root.C_POINTER$LAYOUT.withName("get_image_description"),
        Constants$root.C_POINTER$LAYOUT.withName("get_image_size"),
        Constants$root.C_POINTER$LAYOUT.withName("set_image_description"),
        Constants$root.C_POINTER$LAYOUT.withName("get_image_locale")
    ).withName("_AtkImageIface");
    public static MemoryLayout $LAYOUT() {
        return _AtkImageIface.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_image_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_image_position$MH = RuntimeHelper.downcallHandle(
        _AtkImageIface.get_image_position$FUNC
    );
    public interface get_image_position {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, int _x3);
        static MemorySegment allocate(get_image_position fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_image_position.class, fi, _AtkImageIface.get_image_position$FUNC, session);
        }
        static get_image_position ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, int __x3) -> {
                try {
                    _AtkImageIface.get_image_position$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_image_position$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_image_position"));
    public static VarHandle get_image_position$VH() {
        return _AtkImageIface.get_image_position$VH;
    }
    public static MemoryAddress get_image_position$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkImageIface.get_image_position$VH.get(seg);
    }
    public static void get_image_position$set( MemorySegment seg, MemoryAddress x) {
        _AtkImageIface.get_image_position$VH.set(seg, x);
    }
    public static MemoryAddress get_image_position$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkImageIface.get_image_position$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_image_position$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkImageIface.get_image_position$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_image_position get_image_position (MemorySegment segment, MemorySession session) {
        return get_image_position.ofAddress(get_image_position$get(segment), session);
    }
    static final FunctionDescriptor get_image_description$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_image_description$MH = RuntimeHelper.downcallHandle(
        _AtkImageIface.get_image_description$FUNC
    );
    public interface get_image_description {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_image_description fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_image_description.class, fi, _AtkImageIface.get_image_description$FUNC, session);
        }
        static get_image_description ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_AtkImageIface.get_image_description$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_image_description$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_image_description"));
    public static VarHandle get_image_description$VH() {
        return _AtkImageIface.get_image_description$VH;
    }
    public static MemoryAddress get_image_description$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkImageIface.get_image_description$VH.get(seg);
    }
    public static void get_image_description$set( MemorySegment seg, MemoryAddress x) {
        _AtkImageIface.get_image_description$VH.set(seg, x);
    }
    public static MemoryAddress get_image_description$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkImageIface.get_image_description$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_image_description$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkImageIface.get_image_description$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_image_description get_image_description (MemorySegment segment, MemorySession session) {
        return get_image_description.ofAddress(get_image_description$get(segment), session);
    }
    static final FunctionDescriptor get_image_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_image_size$MH = RuntimeHelper.downcallHandle(
        _AtkImageIface.get_image_size$FUNC
    );
    public interface get_image_size {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(get_image_size fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_image_size.class, fi, _AtkImageIface.get_image_size$FUNC, session);
        }
        static get_image_size ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    _AtkImageIface.get_image_size$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_image_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_image_size"));
    public static VarHandle get_image_size$VH() {
        return _AtkImageIface.get_image_size$VH;
    }
    public static MemoryAddress get_image_size$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkImageIface.get_image_size$VH.get(seg);
    }
    public static void get_image_size$set( MemorySegment seg, MemoryAddress x) {
        _AtkImageIface.get_image_size$VH.set(seg, x);
    }
    public static MemoryAddress get_image_size$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkImageIface.get_image_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_image_size$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkImageIface.get_image_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_image_size get_image_size (MemorySegment segment, MemorySession session) {
        return get_image_size.ofAddress(get_image_size$get(segment), session);
    }
    static final FunctionDescriptor set_image_description$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_image_description$MH = RuntimeHelper.downcallHandle(
        _AtkImageIface.set_image_description$FUNC
    );
    public interface set_image_description {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(set_image_description fi, MemorySession session) {
            return RuntimeHelper.upcallStub(set_image_description.class, fi, _AtkImageIface.set_image_description$FUNC, session);
        }
        static set_image_description ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)_AtkImageIface.set_image_description$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_image_description$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_image_description"));
    public static VarHandle set_image_description$VH() {
        return _AtkImageIface.set_image_description$VH;
    }
    public static MemoryAddress set_image_description$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkImageIface.set_image_description$VH.get(seg);
    }
    public static void set_image_description$set( MemorySegment seg, MemoryAddress x) {
        _AtkImageIface.set_image_description$VH.set(seg, x);
    }
    public static MemoryAddress set_image_description$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkImageIface.set_image_description$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_image_description$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkImageIface.set_image_description$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_image_description set_image_description (MemorySegment segment, MemorySession session) {
        return set_image_description.ofAddress(set_image_description$get(segment), session);
    }
    static final FunctionDescriptor get_image_locale$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_image_locale$MH = RuntimeHelper.downcallHandle(
        _AtkImageIface.get_image_locale$FUNC
    );
    public interface get_image_locale {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_image_locale fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_image_locale.class, fi, _AtkImageIface.get_image_locale$FUNC, session);
        }
        static get_image_locale ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_AtkImageIface.get_image_locale$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_image_locale$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_image_locale"));
    public static VarHandle get_image_locale$VH() {
        return _AtkImageIface.get_image_locale$VH;
    }
    public static MemoryAddress get_image_locale$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkImageIface.get_image_locale$VH.get(seg);
    }
    public static void get_image_locale$set( MemorySegment seg, MemoryAddress x) {
        _AtkImageIface.get_image_locale$VH.set(seg, x);
    }
    public static MemoryAddress get_image_locale$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkImageIface.get_image_locale$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_image_locale$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkImageIface.get_image_locale$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_image_locale get_image_locale (MemorySegment segment, MemorySession session) {
        return get_image_locale.ofAddress(get_image_locale$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


