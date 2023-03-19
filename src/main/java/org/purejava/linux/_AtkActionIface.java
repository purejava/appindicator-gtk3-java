// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _AtkActionIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent"),
        Constants$root.C_POINTER$LAYOUT.withName("do_action"),
        Constants$root.C_POINTER$LAYOUT.withName("get_n_actions"),
        Constants$root.C_POINTER$LAYOUT.withName("get_description"),
        Constants$root.C_POINTER$LAYOUT.withName("get_name"),
        Constants$root.C_POINTER$LAYOUT.withName("get_keybinding"),
        Constants$root.C_POINTER$LAYOUT.withName("set_description"),
        Constants$root.C_POINTER$LAYOUT.withName("get_localized_name")
    ).withName("_AtkActionIface");
    public static MemoryLayout $LAYOUT() {
        return _AtkActionIface.$struct$LAYOUT;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor do_action$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle do_action$MH = RuntimeHelper.downcallHandle(
        _AtkActionIface.do_action$FUNC
    );
    public interface do_action {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(do_action fi, MemorySession session) {
            return RuntimeHelper.upcallStub(do_action.class, fi, _AtkActionIface.do_action$FUNC, session);
        }
        static do_action ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)_AtkActionIface.do_action$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle do_action$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("do_action"));
    public static VarHandle do_action$VH() {
        return _AtkActionIface.do_action$VH;
    }
    public static MemoryAddress do_action$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.do_action$VH.get(seg);
    }
    public static void do_action$set( MemorySegment seg, MemoryAddress x) {
        _AtkActionIface.do_action$VH.set(seg, x);
    }
    public static MemoryAddress do_action$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.do_action$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void do_action$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkActionIface.do_action$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static do_action do_action (MemorySegment segment, MemorySession session) {
        return do_action.ofAddress(do_action$get(segment), session);
    }
    static final FunctionDescriptor get_n_actions$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_n_actions$MH = RuntimeHelper.downcallHandle(
        _AtkActionIface.get_n_actions$FUNC
    );
    public interface get_n_actions {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_n_actions fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_n_actions.class, fi, _AtkActionIface.get_n_actions$FUNC, session);
        }
        static get_n_actions ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_AtkActionIface.get_n_actions$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_n_actions$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_n_actions"));
    public static VarHandle get_n_actions$VH() {
        return _AtkActionIface.get_n_actions$VH;
    }
    public static MemoryAddress get_n_actions$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.get_n_actions$VH.get(seg);
    }
    public static void get_n_actions$set( MemorySegment seg, MemoryAddress x) {
        _AtkActionIface.get_n_actions$VH.set(seg, x);
    }
    public static MemoryAddress get_n_actions$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.get_n_actions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_n_actions$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkActionIface.get_n_actions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_n_actions get_n_actions (MemorySegment segment, MemorySession session) {
        return get_n_actions.ofAddress(get_n_actions$get(segment), session);
    }
    static final FunctionDescriptor get_description$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_description$MH = RuntimeHelper.downcallHandle(
        _AtkActionIface.get_description$FUNC
    );
    public interface get_description {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(get_description fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_description.class, fi, _AtkActionIface.get_description$FUNC, session);
        }
        static get_description ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_AtkActionIface.get_description$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_description$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_description"));
    public static VarHandle get_description$VH() {
        return _AtkActionIface.get_description$VH;
    }
    public static MemoryAddress get_description$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.get_description$VH.get(seg);
    }
    public static void get_description$set( MemorySegment seg, MemoryAddress x) {
        _AtkActionIface.get_description$VH.set(seg, x);
    }
    public static MemoryAddress get_description$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.get_description$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_description$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkActionIface.get_description$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_description get_description (MemorySegment segment, MemorySession session) {
        return get_description.ofAddress(get_description$get(segment), session);
    }
    static final FunctionDescriptor get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_name$MH = RuntimeHelper.downcallHandle(
        _AtkActionIface.get_name$FUNC
    );
    public interface get_name {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(get_name fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_name.class, fi, _AtkActionIface.get_name$FUNC, session);
        }
        static get_name ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_AtkActionIface.get_name$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_name"));
    public static VarHandle get_name$VH() {
        return _AtkActionIface.get_name$VH;
    }
    public static MemoryAddress get_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.get_name$VH.get(seg);
    }
    public static void get_name$set( MemorySegment seg, MemoryAddress x) {
        _AtkActionIface.get_name$VH.set(seg, x);
    }
    public static MemoryAddress get_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.get_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkActionIface.get_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_name get_name (MemorySegment segment, MemorySession session) {
        return get_name.ofAddress(get_name$get(segment), session);
    }
    static final FunctionDescriptor get_keybinding$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_keybinding$MH = RuntimeHelper.downcallHandle(
        _AtkActionIface.get_keybinding$FUNC
    );
    public interface get_keybinding {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(get_keybinding fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_keybinding.class, fi, _AtkActionIface.get_keybinding$FUNC, session);
        }
        static get_keybinding ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_AtkActionIface.get_keybinding$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_keybinding$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_keybinding"));
    public static VarHandle get_keybinding$VH() {
        return _AtkActionIface.get_keybinding$VH;
    }
    public static MemoryAddress get_keybinding$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.get_keybinding$VH.get(seg);
    }
    public static void get_keybinding$set( MemorySegment seg, MemoryAddress x) {
        _AtkActionIface.get_keybinding$VH.set(seg, x);
    }
    public static MemoryAddress get_keybinding$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.get_keybinding$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_keybinding$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkActionIface.get_keybinding$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_keybinding get_keybinding (MemorySegment segment, MemorySession session) {
        return get_keybinding.ofAddress(get_keybinding$get(segment), session);
    }
    static final FunctionDescriptor set_description$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_description$MH = RuntimeHelper.downcallHandle(
        _AtkActionIface.set_description$FUNC
    );
    public interface set_description {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, java.lang.foreign.MemoryAddress _x2);
        static MemorySegment allocate(set_description fi, MemorySession session) {
            return RuntimeHelper.upcallStub(set_description.class, fi, _AtkActionIface.set_description$FUNC, session);
        }
        static set_description ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, java.lang.foreign.MemoryAddress __x2) -> {
                try {
                    return (int)_AtkActionIface.set_description$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, (java.lang.foreign.Addressable)__x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_description$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_description"));
    public static VarHandle set_description$VH() {
        return _AtkActionIface.set_description$VH;
    }
    public static MemoryAddress set_description$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.set_description$VH.get(seg);
    }
    public static void set_description$set( MemorySegment seg, MemoryAddress x) {
        _AtkActionIface.set_description$VH.set(seg, x);
    }
    public static MemoryAddress set_description$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.set_description$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_description$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkActionIface.set_description$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_description set_description (MemorySegment segment, MemorySession session) {
        return set_description.ofAddress(set_description$get(segment), session);
    }
    static final FunctionDescriptor get_localized_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle get_localized_name$MH = RuntimeHelper.downcallHandle(
        _AtkActionIface.get_localized_name$FUNC
    );
    public interface get_localized_name {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(get_localized_name fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_localized_name.class, fi, _AtkActionIface.get_localized_name$FUNC, session);
        }
        static get_localized_name ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_AtkActionIface.get_localized_name$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_localized_name$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_localized_name"));
    public static VarHandle get_localized_name$VH() {
        return _AtkActionIface.get_localized_name$VH;
    }
    public static MemoryAddress get_localized_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.get_localized_name$VH.get(seg);
    }
    public static void get_localized_name$set( MemorySegment seg, MemoryAddress x) {
        _AtkActionIface.get_localized_name$VH.set(seg, x);
    }
    public static MemoryAddress get_localized_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_AtkActionIface.get_localized_name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_localized_name$set(MemorySegment seg, long index, MemoryAddress x) {
        _AtkActionIface.get_localized_name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_localized_name get_localized_name (MemorySegment segment, MemorySession session) {
        return get_localized_name.ofAddress(get_localized_name$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


