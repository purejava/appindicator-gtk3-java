// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkToolShellIface {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("g_iface"),
        Constants$root.C_POINTER$LAYOUT.withName("get_icon_size"),
        Constants$root.C_POINTER$LAYOUT.withName("get_orientation"),
        Constants$root.C_POINTER$LAYOUT.withName("get_style"),
        Constants$root.C_POINTER$LAYOUT.withName("get_relief_style"),
        Constants$root.C_POINTER$LAYOUT.withName("rebuild_menu"),
        Constants$root.C_POINTER$LAYOUT.withName("get_text_orientation"),
        Constants$root.C_POINTER$LAYOUT.withName("get_text_alignment"),
        Constants$root.C_POINTER$LAYOUT.withName("get_ellipsize_mode"),
        Constants$root.C_POINTER$LAYOUT.withName("get_text_size_group")
    ).withName("_GtkToolShellIface");
    public static MemoryLayout $LAYOUT() {
        return _GtkToolShellIface.$struct$LAYOUT;
    }
    public static MemorySegment g_iface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_icon_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_icon_size$MH = RuntimeHelper.downcallHandle(
        _GtkToolShellIface.get_icon_size$FUNC
    );
    public interface get_icon_size {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_icon_size fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_icon_size.class, fi, _GtkToolShellIface.get_icon_size$FUNC, session);
        }
        static get_icon_size ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GtkToolShellIface.get_icon_size$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_icon_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_icon_size"));
    public static VarHandle get_icon_size$VH() {
        return _GtkToolShellIface.get_icon_size$VH;
    }
    public static MemoryAddress get_icon_size$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_icon_size$VH.get(seg);
    }
    public static void get_icon_size$set( MemorySegment seg, MemoryAddress x) {
        _GtkToolShellIface.get_icon_size$VH.set(seg, x);
    }
    public static MemoryAddress get_icon_size$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_icon_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_icon_size$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkToolShellIface.get_icon_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_icon_size get_icon_size (MemorySegment segment, MemorySession session) {
        return get_icon_size.ofAddress(get_icon_size$get(segment), session);
    }
    static final FunctionDescriptor get_orientation$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_orientation$MH = RuntimeHelper.downcallHandle(
        _GtkToolShellIface.get_orientation$FUNC
    );
    public interface get_orientation {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_orientation fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_orientation.class, fi, _GtkToolShellIface.get_orientation$FUNC, session);
        }
        static get_orientation ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GtkToolShellIface.get_orientation$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_orientation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_orientation"));
    public static VarHandle get_orientation$VH() {
        return _GtkToolShellIface.get_orientation$VH;
    }
    public static MemoryAddress get_orientation$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_orientation$VH.get(seg);
    }
    public static void get_orientation$set( MemorySegment seg, MemoryAddress x) {
        _GtkToolShellIface.get_orientation$VH.set(seg, x);
    }
    public static MemoryAddress get_orientation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_orientation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_orientation$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkToolShellIface.get_orientation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_orientation get_orientation (MemorySegment segment, MemorySession session) {
        return get_orientation.ofAddress(get_orientation$get(segment), session);
    }
    static final FunctionDescriptor get_style$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_style$MH = RuntimeHelper.downcallHandle(
        _GtkToolShellIface.get_style$FUNC
    );
    public interface get_style {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_style fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_style.class, fi, _GtkToolShellIface.get_style$FUNC, session);
        }
        static get_style ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GtkToolShellIface.get_style$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_style"));
    public static VarHandle get_style$VH() {
        return _GtkToolShellIface.get_style$VH;
    }
    public static MemoryAddress get_style$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_style$VH.get(seg);
    }
    public static void get_style$set( MemorySegment seg, MemoryAddress x) {
        _GtkToolShellIface.get_style$VH.set(seg, x);
    }
    public static MemoryAddress get_style$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_style$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkToolShellIface.get_style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_style get_style (MemorySegment segment, MemorySession session) {
        return get_style.ofAddress(get_style$get(segment), session);
    }
    static final FunctionDescriptor get_relief_style$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_relief_style$MH = RuntimeHelper.downcallHandle(
        _GtkToolShellIface.get_relief_style$FUNC
    );
    public interface get_relief_style {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_relief_style fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_relief_style.class, fi, _GtkToolShellIface.get_relief_style$FUNC, session);
        }
        static get_relief_style ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GtkToolShellIface.get_relief_style$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_relief_style$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_relief_style"));
    public static VarHandle get_relief_style$VH() {
        return _GtkToolShellIface.get_relief_style$VH;
    }
    public static MemoryAddress get_relief_style$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_relief_style$VH.get(seg);
    }
    public static void get_relief_style$set( MemorySegment seg, MemoryAddress x) {
        _GtkToolShellIface.get_relief_style$VH.set(seg, x);
    }
    public static MemoryAddress get_relief_style$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_relief_style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_relief_style$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkToolShellIface.get_relief_style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_relief_style get_relief_style (MemorySegment segment, MemorySession session) {
        return get_relief_style.ofAddress(get_relief_style$get(segment), session);
    }
    static final FunctionDescriptor rebuild_menu$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle rebuild_menu$MH = RuntimeHelper.downcallHandle(
        _GtkToolShellIface.rebuild_menu$FUNC
    );
    public interface rebuild_menu {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(rebuild_menu fi, MemorySession session) {
            return RuntimeHelper.upcallStub(rebuild_menu.class, fi, _GtkToolShellIface.rebuild_menu$FUNC, session);
        }
        static rebuild_menu ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkToolShellIface.rebuild_menu$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle rebuild_menu$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rebuild_menu"));
    public static VarHandle rebuild_menu$VH() {
        return _GtkToolShellIface.rebuild_menu$VH;
    }
    public static MemoryAddress rebuild_menu$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.rebuild_menu$VH.get(seg);
    }
    public static void rebuild_menu$set( MemorySegment seg, MemoryAddress x) {
        _GtkToolShellIface.rebuild_menu$VH.set(seg, x);
    }
    public static MemoryAddress rebuild_menu$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.rebuild_menu$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rebuild_menu$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkToolShellIface.rebuild_menu$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static rebuild_menu rebuild_menu (MemorySegment segment, MemorySession session) {
        return rebuild_menu.ofAddress(rebuild_menu$get(segment), session);
    }
    static final FunctionDescriptor get_text_orientation$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_text_orientation$MH = RuntimeHelper.downcallHandle(
        _GtkToolShellIface.get_text_orientation$FUNC
    );
    public interface get_text_orientation {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_text_orientation fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_text_orientation.class, fi, _GtkToolShellIface.get_text_orientation$FUNC, session);
        }
        static get_text_orientation ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GtkToolShellIface.get_text_orientation$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_text_orientation$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_text_orientation"));
    public static VarHandle get_text_orientation$VH() {
        return _GtkToolShellIface.get_text_orientation$VH;
    }
    public static MemoryAddress get_text_orientation$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_text_orientation$VH.get(seg);
    }
    public static void get_text_orientation$set( MemorySegment seg, MemoryAddress x) {
        _GtkToolShellIface.get_text_orientation$VH.set(seg, x);
    }
    public static MemoryAddress get_text_orientation$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_text_orientation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_text_orientation$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkToolShellIface.get_text_orientation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_text_orientation get_text_orientation (MemorySegment segment, MemorySession session) {
        return get_text_orientation.ofAddress(get_text_orientation$get(segment), session);
    }
    static final FunctionDescriptor get_text_alignment$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_text_alignment$MH = RuntimeHelper.downcallHandle(
        _GtkToolShellIface.get_text_alignment$FUNC
    );
    public interface get_text_alignment {

        float apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_text_alignment fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_text_alignment.class, fi, _GtkToolShellIface.get_text_alignment$FUNC, session);
        }
        static get_text_alignment ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (float)_GtkToolShellIface.get_text_alignment$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_text_alignment$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_text_alignment"));
    public static VarHandle get_text_alignment$VH() {
        return _GtkToolShellIface.get_text_alignment$VH;
    }
    public static MemoryAddress get_text_alignment$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_text_alignment$VH.get(seg);
    }
    public static void get_text_alignment$set( MemorySegment seg, MemoryAddress x) {
        _GtkToolShellIface.get_text_alignment$VH.set(seg, x);
    }
    public static MemoryAddress get_text_alignment$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_text_alignment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_text_alignment$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkToolShellIface.get_text_alignment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_text_alignment get_text_alignment (MemorySegment segment, MemorySession session) {
        return get_text_alignment.ofAddress(get_text_alignment$get(segment), session);
    }
    static final FunctionDescriptor get_ellipsize_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_ellipsize_mode$MH = RuntimeHelper.downcallHandle(
        _GtkToolShellIface.get_ellipsize_mode$FUNC
    );
    public interface get_ellipsize_mode {

        int apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_ellipsize_mode fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_ellipsize_mode.class, fi, _GtkToolShellIface.get_ellipsize_mode$FUNC, session);
        }
        static get_ellipsize_mode ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (int)_GtkToolShellIface.get_ellipsize_mode$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_ellipsize_mode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_ellipsize_mode"));
    public static VarHandle get_ellipsize_mode$VH() {
        return _GtkToolShellIface.get_ellipsize_mode$VH;
    }
    public static MemoryAddress get_ellipsize_mode$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_ellipsize_mode$VH.get(seg);
    }
    public static void get_ellipsize_mode$set( MemorySegment seg, MemoryAddress x) {
        _GtkToolShellIface.get_ellipsize_mode$VH.set(seg, x);
    }
    public static MemoryAddress get_ellipsize_mode$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_ellipsize_mode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_ellipsize_mode$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkToolShellIface.get_ellipsize_mode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_ellipsize_mode get_ellipsize_mode (MemorySegment segment, MemorySession session) {
        return get_ellipsize_mode.ofAddress(get_ellipsize_mode$get(segment), session);
    }
    static final FunctionDescriptor get_text_size_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_text_size_group$MH = RuntimeHelper.downcallHandle(
        _GtkToolShellIface.get_text_size_group$FUNC
    );
    public interface get_text_size_group {

        java.lang.foreign.Addressable apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(get_text_size_group fi, MemorySession session) {
            return RuntimeHelper.upcallStub(get_text_size_group.class, fi, _GtkToolShellIface.get_text_size_group$FUNC, session);
        }
        static get_text_size_group ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    return (java.lang.foreign.Addressable)(java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_text_size_group$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_text_size_group$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_text_size_group"));
    public static VarHandle get_text_size_group$VH() {
        return _GtkToolShellIface.get_text_size_group$VH;
    }
    public static MemoryAddress get_text_size_group$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_text_size_group$VH.get(seg);
    }
    public static void get_text_size_group$set( MemorySegment seg, MemoryAddress x) {
        _GtkToolShellIface.get_text_size_group$VH.set(seg, x);
    }
    public static MemoryAddress get_text_size_group$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkToolShellIface.get_text_size_group$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_text_size_group$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkToolShellIface.get_text_size_group$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_text_size_group get_text_size_group (MemorySegment segment, MemorySession session) {
        return get_text_size_group.ofAddress(get_text_size_group$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

