// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkWindowClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
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
                    Constants$root.C_INT$LAYOUT.withName("activate_signal"),
                    MemoryLayout.paddingLayout(32),
                    Constants$root.C_POINTER$LAYOUT.withName("dispatch_child_properties_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("destroy"),
                    Constants$root.C_POINTER$LAYOUT.withName("show"),
                    Constants$root.C_POINTER$LAYOUT.withName("show_all"),
                    Constants$root.C_POINTER$LAYOUT.withName("hide"),
                    Constants$root.C_POINTER$LAYOUT.withName("map"),
                    Constants$root.C_POINTER$LAYOUT.withName("unmap"),
                    Constants$root.C_POINTER$LAYOUT.withName("realize"),
                    Constants$root.C_POINTER$LAYOUT.withName("unrealize"),
                    Constants$root.C_POINTER$LAYOUT.withName("size_allocate"),
                    Constants$root.C_POINTER$LAYOUT.withName("state_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("state_flags_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("parent_set"),
                    Constants$root.C_POINTER$LAYOUT.withName("hierarchy_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("style_set"),
                    Constants$root.C_POINTER$LAYOUT.withName("direction_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("grab_notify"),
                    Constants$root.C_POINTER$LAYOUT.withName("child_notify"),
                    Constants$root.C_POINTER$LAYOUT.withName("draw"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_request_mode"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_preferred_width_for_height"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_preferred_width"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height_for_width"),
                    Constants$root.C_POINTER$LAYOUT.withName("mnemonic_activate"),
                    Constants$root.C_POINTER$LAYOUT.withName("grab_focus"),
                    Constants$root.C_POINTER$LAYOUT.withName("focus"),
                    Constants$root.C_POINTER$LAYOUT.withName("move_focus"),
                    Constants$root.C_POINTER$LAYOUT.withName("keynav_failed"),
                    Constants$root.C_POINTER$LAYOUT.withName("event"),
                    Constants$root.C_POINTER$LAYOUT.withName("button_press_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("button_release_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("scroll_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("motion_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("delete_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("destroy_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("key_press_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("key_release_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("enter_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("leave_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("configure_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("focus_in_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("focus_out_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("map_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("unmap_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("property_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("selection_clear_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("selection_request_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("selection_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("proximity_in_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("proximity_out_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("visibility_notify_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("window_state_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("damage_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("grab_broken_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("selection_get"),
                    Constants$root.C_POINTER$LAYOUT.withName("selection_received"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_begin"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_end"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_data_get"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_data_delete"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_leave"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_motion"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_drop"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_data_received"),
                    Constants$root.C_POINTER$LAYOUT.withName("drag_failed"),
                    Constants$root.C_POINTER$LAYOUT.withName("popup_menu"),
                    Constants$root.C_POINTER$LAYOUT.withName("show_help"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_accessible"),
                    Constants$root.C_POINTER$LAYOUT.withName("screen_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("can_activate_accel"),
                    Constants$root.C_POINTER$LAYOUT.withName("composited_changed"),
                    Constants$root.C_POINTER$LAYOUT.withName("query_tooltip"),
                    Constants$root.C_POINTER$LAYOUT.withName("compute_expand"),
                    Constants$root.C_POINTER$LAYOUT.withName("adjust_size_request"),
                    Constants$root.C_POINTER$LAYOUT.withName("adjust_size_allocation"),
                    Constants$root.C_POINTER$LAYOUT.withName("style_updated"),
                    Constants$root.C_POINTER$LAYOUT.withName("touch_event"),
                    Constants$root.C_POINTER$LAYOUT.withName("get_preferred_height_and_baseline_for_width"),
                    Constants$root.C_POINTER$LAYOUT.withName("adjust_baseline_request"),
                    Constants$root.C_POINTER$LAYOUT.withName("adjust_baseline_allocation"),
                    Constants$root.C_POINTER$LAYOUT.withName("queue_draw_region"),
                    Constants$root.C_POINTER$LAYOUT.withName("priv"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
                    Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7")
                ).withName("parent_class"),
                Constants$root.C_POINTER$LAYOUT.withName("add"),
                Constants$root.C_POINTER$LAYOUT.withName("remove"),
                Constants$root.C_POINTER$LAYOUT.withName("check_resize"),
                Constants$root.C_POINTER$LAYOUT.withName("forall"),
                Constants$root.C_POINTER$LAYOUT.withName("set_focus_child"),
                Constants$root.C_POINTER$LAYOUT.withName("child_type"),
                Constants$root.C_POINTER$LAYOUT.withName("composite_name"),
                Constants$root.C_POINTER$LAYOUT.withName("set_child_property"),
                Constants$root.C_POINTER$LAYOUT.withName("get_child_property"),
                Constants$root.C_POINTER$LAYOUT.withName("get_path_for_child"),
                MemoryLayout.structLayout(
                    MemoryLayout.paddingLayout(1).withName("_handle_border_width"),
                    MemoryLayout.paddingLayout(63)
                ),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved5"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved6"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved7"),
                Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved8")
            ).withName("parent_class"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("set_focus"),
        Constants$root.C_POINTER$LAYOUT.withName("activate_focus"),
        Constants$root.C_POINTER$LAYOUT.withName("activate_default"),
        Constants$root.C_POINTER$LAYOUT.withName("keys_changed"),
        Constants$root.C_POINTER$LAYOUT.withName("enable_debugging"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3")
    ).withName("_GtkWindowClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkWindowClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1008);
    }
    static final FunctionDescriptor set_focus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_focus$MH = RuntimeHelper.downcallHandle(
        _GtkWindowClass.set_focus$FUNC
    );
    public interface set_focus {

        void apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(set_focus fi, MemorySession session) {
            return RuntimeHelper.upcallStub(set_focus.class, fi, _GtkWindowClass.set_focus$FUNC, session);
        }
        static set_focus ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    _GtkWindowClass.set_focus$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_focus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_focus"));
    public static VarHandle set_focus$VH() {
        return _GtkWindowClass.set_focus$VH;
    }
    public static MemoryAddress set_focus$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass.set_focus$VH.get(seg);
    }
    public static void set_focus$set( MemorySegment seg, MemoryAddress x) {
        _GtkWindowClass.set_focus$VH.set(seg, x);
    }
    public static MemoryAddress set_focus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass.set_focus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_focus$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkWindowClass.set_focus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_focus set_focus (MemorySegment segment, MemorySession session) {
        return set_focus.ofAddress(set_focus$get(segment), session);
    }
    static final FunctionDescriptor activate_focus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate_focus$MH = RuntimeHelper.downcallHandle(
        _GtkWindowClass.activate_focus$FUNC
    );
    public interface activate_focus {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(activate_focus fi, MemorySession session) {
            return RuntimeHelper.upcallStub(activate_focus.class, fi, _GtkWindowClass.activate_focus$FUNC, session);
        }
        static activate_focus ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkWindowClass.activate_focus$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle activate_focus$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("activate_focus"));
    public static VarHandle activate_focus$VH() {
        return _GtkWindowClass.activate_focus$VH;
    }
    public static MemoryAddress activate_focus$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass.activate_focus$VH.get(seg);
    }
    public static void activate_focus$set( MemorySegment seg, MemoryAddress x) {
        _GtkWindowClass.activate_focus$VH.set(seg, x);
    }
    public static MemoryAddress activate_focus$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass.activate_focus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void activate_focus$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkWindowClass.activate_focus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate_focus activate_focus (MemorySegment segment, MemorySession session) {
        return activate_focus.ofAddress(activate_focus$get(segment), session);
    }
    static final FunctionDescriptor activate_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate_default$MH = RuntimeHelper.downcallHandle(
        _GtkWindowClass.activate_default$FUNC
    );
    public interface activate_default {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(activate_default fi, MemorySession session) {
            return RuntimeHelper.upcallStub(activate_default.class, fi, _GtkWindowClass.activate_default$FUNC, session);
        }
        static activate_default ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkWindowClass.activate_default$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle activate_default$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("activate_default"));
    public static VarHandle activate_default$VH() {
        return _GtkWindowClass.activate_default$VH;
    }
    public static MemoryAddress activate_default$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass.activate_default$VH.get(seg);
    }
    public static void activate_default$set( MemorySegment seg, MemoryAddress x) {
        _GtkWindowClass.activate_default$VH.set(seg, x);
    }
    public static MemoryAddress activate_default$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass.activate_default$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void activate_default$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkWindowClass.activate_default$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate_default activate_default (MemorySegment segment, MemorySession session) {
        return activate_default.ofAddress(activate_default$get(segment), session);
    }
    static final FunctionDescriptor keys_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle keys_changed$MH = RuntimeHelper.downcallHandle(
        _GtkWindowClass.keys_changed$FUNC
    );
    public interface keys_changed {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(keys_changed fi, MemorySession session) {
            return RuntimeHelper.upcallStub(keys_changed.class, fi, _GtkWindowClass.keys_changed$FUNC, session);
        }
        static keys_changed ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkWindowClass.keys_changed$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle keys_changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keys_changed"));
    public static VarHandle keys_changed$VH() {
        return _GtkWindowClass.keys_changed$VH;
    }
    public static MemoryAddress keys_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass.keys_changed$VH.get(seg);
    }
    public static void keys_changed$set( MemorySegment seg, MemoryAddress x) {
        _GtkWindowClass.keys_changed$VH.set(seg, x);
    }
    public static MemoryAddress keys_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass.keys_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keys_changed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkWindowClass.keys_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static keys_changed keys_changed (MemorySegment segment, MemorySession session) {
        return keys_changed.ofAddress(keys_changed$get(segment), session);
    }
    static final FunctionDescriptor enable_debugging$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle enable_debugging$MH = RuntimeHelper.downcallHandle(
        _GtkWindowClass.enable_debugging$FUNC
    );
    public interface enable_debugging {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(enable_debugging fi, MemorySession session) {
            return RuntimeHelper.upcallStub(enable_debugging.class, fi, _GtkWindowClass.enable_debugging$FUNC, session);
        }
        static enable_debugging ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)_GtkWindowClass.enable_debugging$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle enable_debugging$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("enable_debugging"));
    public static VarHandle enable_debugging$VH() {
        return _GtkWindowClass.enable_debugging$VH;
    }
    public static MemoryAddress enable_debugging$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass.enable_debugging$VH.get(seg);
    }
    public static void enable_debugging$set( MemorySegment seg, MemoryAddress x) {
        _GtkWindowClass.enable_debugging$VH.set(seg, x);
    }
    public static MemoryAddress enable_debugging$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass.enable_debugging$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void enable_debugging$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkWindowClass.enable_debugging$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static enable_debugging enable_debugging (MemorySegment segment, MemorySession session) {
        return enable_debugging.ofAddress(enable_debugging$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1$MH = RuntimeHelper.downcallHandle(
        _GtkWindowClass._gtk_reserved1$FUNC
    );
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved1.class, fi, _GtkWindowClass._gtk_reserved1$FUNC, session);
        }
        static _gtk_reserved1 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkWindowClass._gtk_reserved1$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkWindowClass._gtk_reserved1$VH;
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass._gtk_reserved1$VH.get(seg);
    }
    public static void _gtk_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GtkWindowClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkWindowClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2$MH = RuntimeHelper.downcallHandle(
        _GtkWindowClass._gtk_reserved2$FUNC
    );
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved2.class, fi, _GtkWindowClass._gtk_reserved2$FUNC, session);
        }
        static _gtk_reserved2 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkWindowClass._gtk_reserved2$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkWindowClass._gtk_reserved2$VH;
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass._gtk_reserved2$VH.get(seg);
    }
    public static void _gtk_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GtkWindowClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkWindowClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3$MH = RuntimeHelper.downcallHandle(
        _GtkWindowClass._gtk_reserved3$FUNC
    );
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved3.class, fi, _GtkWindowClass._gtk_reserved3$FUNC, session);
        }
        static _gtk_reserved3 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkWindowClass._gtk_reserved3$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkWindowClass._gtk_reserved3$VH;
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass._gtk_reserved3$VH.get(seg);
    }
    public static void _gtk_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GtkWindowClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkWindowClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkWindowClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}

