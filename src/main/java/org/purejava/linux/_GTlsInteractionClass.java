// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GTlsInteractionClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
            MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("ask_password"),
        Constants$root.C_POINTER$LAYOUT.withName("ask_password_async"),
        Constants$root.C_POINTER$LAYOUT.withName("ask_password_finish"),
        Constants$root.C_POINTER$LAYOUT.withName("request_certificate"),
        Constants$root.C_POINTER$LAYOUT.withName("request_certificate_async"),
        Constants$root.C_POINTER$LAYOUT.withName("request_certificate_finish"),
        MemoryLayout.sequenceLayout(21, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GTlsInteractionClass");
    public static MemoryLayout $LAYOUT() {
        return _GTlsInteractionClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor ask_password$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ask_password$MH = RuntimeHelper.downcallHandle(
        _GTlsInteractionClass.ask_password$FUNC
    );
    public interface ask_password {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3);
        static MemorySegment allocate(ask_password fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ask_password.class, fi, _GTlsInteractionClass.ask_password$FUNC, session);
        }
        static ask_password ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3) -> {
                try {
                    return (int)_GTlsInteractionClass.ask_password$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ask_password$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ask_password"));
    public static VarHandle ask_password$VH() {
        return _GTlsInteractionClass.ask_password$VH;
    }
    public static MemoryAddress ask_password$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.ask_password$VH.get(seg);
    }
    public static void ask_password$set( MemorySegment seg, MemoryAddress x) {
        _GTlsInteractionClass.ask_password$VH.set(seg, x);
    }
    public static MemoryAddress ask_password$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.ask_password$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ask_password$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsInteractionClass.ask_password$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ask_password ask_password (MemorySegment segment, MemorySession session) {
        return ask_password.ofAddress(ask_password$get(segment), session);
    }
    static final FunctionDescriptor ask_password_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ask_password_async$MH = RuntimeHelper.downcallHandle(
        _GTlsInteractionClass.ask_password_async$FUNC
    );
    public interface ask_password_async {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(ask_password_async fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ask_password_async.class, fi, _GTlsInteractionClass.ask_password_async$FUNC, session);
        }
        static ask_password_async ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    _GTlsInteractionClass.ask_password_async$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ask_password_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ask_password_async"));
    public static VarHandle ask_password_async$VH() {
        return _GTlsInteractionClass.ask_password_async$VH;
    }
    public static MemoryAddress ask_password_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.ask_password_async$VH.get(seg);
    }
    public static void ask_password_async$set( MemorySegment seg, MemoryAddress x) {
        _GTlsInteractionClass.ask_password_async$VH.set(seg, x);
    }
    public static MemoryAddress ask_password_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.ask_password_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ask_password_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsInteractionClass.ask_password_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ask_password_async ask_password_async (MemorySegment segment, MemorySession session) {
        return ask_password_async.ofAddress(ask_password_async$get(segment), session);
    }
    static final FunctionDescriptor ask_password_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ask_password_finish$MH = RuntimeHelper.downcallHandle(
        _GTlsInteractionClass.ask_password_finish$FUNC
    );
    public interface ask_password_finish {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(ask_password_finish fi, MemorySession session) {
            return RuntimeHelper.upcallStub(ask_password_finish.class, fi, _GTlsInteractionClass.ask_password_finish$FUNC, session);
        }
        static ask_password_finish ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)_GTlsInteractionClass.ask_password_finish$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ask_password_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ask_password_finish"));
    public static VarHandle ask_password_finish$VH() {
        return _GTlsInteractionClass.ask_password_finish$VH;
    }
    public static MemoryAddress ask_password_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.ask_password_finish$VH.get(seg);
    }
    public static void ask_password_finish$set( MemorySegment seg, MemoryAddress x) {
        _GTlsInteractionClass.ask_password_finish$VH.set(seg, x);
    }
    public static MemoryAddress ask_password_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.ask_password_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ask_password_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsInteractionClass.ask_password_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ask_password_finish ask_password_finish (MemorySegment segment, MemorySession session) {
        return ask_password_finish.ofAddress(ask_password_finish$get(segment), session);
    }
    static final FunctionDescriptor request_certificate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle request_certificate$MH = RuntimeHelper.downcallHandle(
        _GTlsInteractionClass.request_certificate$FUNC
    );
    public interface request_certificate {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(request_certificate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(request_certificate.class, fi, _GTlsInteractionClass.request_certificate$FUNC, session);
        }
        static request_certificate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)_GTlsInteractionClass.request_certificate$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle request_certificate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("request_certificate"));
    public static VarHandle request_certificate$VH() {
        return _GTlsInteractionClass.request_certificate$VH;
    }
    public static MemoryAddress request_certificate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.request_certificate$VH.get(seg);
    }
    public static void request_certificate$set( MemorySegment seg, MemoryAddress x) {
        _GTlsInteractionClass.request_certificate$VH.set(seg, x);
    }
    public static MemoryAddress request_certificate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.request_certificate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void request_certificate$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsInteractionClass.request_certificate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static request_certificate request_certificate (MemorySegment segment, MemorySession session) {
        return request_certificate.ofAddress(request_certificate$get(segment), session);
    }
    static final FunctionDescriptor request_certificate_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle request_certificate_async$MH = RuntimeHelper.downcallHandle(
        _GTlsInteractionClass.request_certificate_async$FUNC
    );
    public interface request_certificate_async {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, int _x2, java.lang.foreign.MemoryAddress _x3, java.lang.foreign.MemoryAddress _x4, java.lang.foreign.MemoryAddress _x5);
        static MemorySegment allocate(request_certificate_async fi, MemorySession session) {
            return RuntimeHelper.upcallStub(request_certificate_async.class, fi, _GTlsInteractionClass.request_certificate_async$FUNC, session);
        }
        static request_certificate_async ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, int __x2, java.lang.foreign.MemoryAddress __x3, java.lang.foreign.MemoryAddress __x4, java.lang.foreign.MemoryAddress __x5) -> {
                try {
                    _GTlsInteractionClass.request_certificate_async$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, __x2, (java.lang.foreign.Addressable)__x3, (java.lang.foreign.Addressable)__x4, (java.lang.foreign.Addressable)__x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle request_certificate_async$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("request_certificate_async"));
    public static VarHandle request_certificate_async$VH() {
        return _GTlsInteractionClass.request_certificate_async$VH;
    }
    public static MemoryAddress request_certificate_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.request_certificate_async$VH.get(seg);
    }
    public static void request_certificate_async$set( MemorySegment seg, MemoryAddress x) {
        _GTlsInteractionClass.request_certificate_async$VH.set(seg, x);
    }
    public static MemoryAddress request_certificate_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.request_certificate_async$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void request_certificate_async$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsInteractionClass.request_certificate_async$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static request_certificate_async request_certificate_async (MemorySegment segment, MemorySession session) {
        return request_certificate_async.ofAddress(request_certificate_async$get(segment), session);
    }
    static final FunctionDescriptor request_certificate_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle request_certificate_finish$MH = RuntimeHelper.downcallHandle(
        _GTlsInteractionClass.request_certificate_finish$FUNC
    );
    public interface request_certificate_finish {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(request_certificate_finish fi, MemorySession session) {
            return RuntimeHelper.upcallStub(request_certificate_finish.class, fi, _GTlsInteractionClass.request_certificate_finish$FUNC, session);
        }
        static request_certificate_finish ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)_GTlsInteractionClass.request_certificate_finish$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle request_certificate_finish$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("request_certificate_finish"));
    public static VarHandle request_certificate_finish$VH() {
        return _GTlsInteractionClass.request_certificate_finish$VH;
    }
    public static MemoryAddress request_certificate_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.request_certificate_finish$VH.get(seg);
    }
    public static void request_certificate_finish$set( MemorySegment seg, MemoryAddress x) {
        _GTlsInteractionClass.request_certificate_finish$VH.set(seg, x);
    }
    public static MemoryAddress request_certificate_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GTlsInteractionClass.request_certificate_finish$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void request_certificate_finish$set(MemorySegment seg, long index, MemoryAddress x) {
        _GTlsInteractionClass.request_certificate_finish$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static request_certificate_finish request_certificate_finish (MemorySegment segment, MemorySession session) {
        return request_certificate_finish.ofAddress(request_certificate_finish$get(segment), session);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(184, 168);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

