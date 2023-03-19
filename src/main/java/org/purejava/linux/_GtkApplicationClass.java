// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkApplicationClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
                MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("startup"),
            Constants$root.C_POINTER$LAYOUT.withName("activate"),
            Constants$root.C_POINTER$LAYOUT.withName("open"),
            Constants$root.C_POINTER$LAYOUT.withName("command_line"),
            Constants$root.C_POINTER$LAYOUT.withName("local_command_line"),
            Constants$root.C_POINTER$LAYOUT.withName("before_emit"),
            Constants$root.C_POINTER$LAYOUT.withName("after_emit"),
            Constants$root.C_POINTER$LAYOUT.withName("add_platform_data"),
            Constants$root.C_POINTER$LAYOUT.withName("quit_mainloop"),
            Constants$root.C_POINTER$LAYOUT.withName("run_mainloop"),
            Constants$root.C_POINTER$LAYOUT.withName("shutdown"),
            Constants$root.C_POINTER$LAYOUT.withName("dbus_register"),
            Constants$root.C_POINTER$LAYOUT.withName("dbus_unregister"),
            Constants$root.C_POINTER$LAYOUT.withName("handle_local_options"),
            Constants$root.C_POINTER$LAYOUT.withName("name_lost"),
            MemoryLayout.sequenceLayout(7, Constants$root.C_POINTER$LAYOUT).withName("padding")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("window_added"),
        Constants$root.C_POINTER$LAYOUT.withName("window_removed"),
        MemoryLayout.sequenceLayout(12, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GtkApplicationClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkApplicationClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 312);
    }
    static final FunctionDescriptor window_added$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle window_added$MH = RuntimeHelper.downcallHandle(
        _GtkApplicationClass.window_added$FUNC
    );
    public interface window_added {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(window_added fi, MemorySession session) {
            return RuntimeHelper.upcallStub(window_added.class, fi, _GtkApplicationClass.window_added$FUNC, session);
        }
        static window_added ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GtkApplicationClass.window_added$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle window_added$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window_added"));
    public static VarHandle window_added$VH() {
        return _GtkApplicationClass.window_added$VH;
    }
    public static MemoryAddress window_added$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkApplicationClass.window_added$VH.get(seg);
    }
    public static void window_added$set( MemorySegment seg, MemoryAddress x) {
        _GtkApplicationClass.window_added$VH.set(seg, x);
    }
    public static MemoryAddress window_added$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkApplicationClass.window_added$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window_added$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkApplicationClass.window_added$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static window_added window_added (MemorySegment segment, MemorySession session) {
        return window_added.ofAddress(window_added$get(segment), session);
    }
    static final FunctionDescriptor window_removed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle window_removed$MH = RuntimeHelper.downcallHandle(
        _GtkApplicationClass.window_removed$FUNC
    );
    public interface window_removed {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(window_removed fi, MemorySession session) {
            return RuntimeHelper.upcallStub(window_removed.class, fi, _GtkApplicationClass.window_removed$FUNC, session);
        }
        static window_removed ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GtkApplicationClass.window_removed$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle window_removed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window_removed"));
    public static VarHandle window_removed$VH() {
        return _GtkApplicationClass.window_removed$VH;
    }
    public static MemoryAddress window_removed$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkApplicationClass.window_removed$VH.get(seg);
    }
    public static void window_removed$set( MemorySegment seg, MemoryAddress x) {
        _GtkApplicationClass.window_removed$VH.set(seg, x);
    }
    public static MemoryAddress window_removed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkApplicationClass.window_removed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window_removed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkApplicationClass.window_removed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static window_removed window_removed (MemorySegment segment, MemorySession session) {
        return window_removed.ofAddress(window_removed$get(segment), session);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(328, 96);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


