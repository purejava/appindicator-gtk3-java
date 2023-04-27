// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkSwitchClass {
 *     GtkWidgetClass parent_class;
 *     void (*activate)(GtkSwitch*);
 *     gboolean (*state_set)(GtkSwitch*,gboolean);
 *     void (*_switch_padding_1)();
 *     void (*_switch_padding_2)();
 *     void (*_switch_padding_3)();
 *     void (*_switch_padding_4)();
 *     void (*_switch_padding_5)();
 * };
 * }
 */
public class _GtkSwitchClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("activate"),
        Constants$root.C_POINTER$LAYOUT.withName("state_set"),
        Constants$root.C_POINTER$LAYOUT.withName("_switch_padding_1"),
        Constants$root.C_POINTER$LAYOUT.withName("_switch_padding_2"),
        Constants$root.C_POINTER$LAYOUT.withName("_switch_padding_3"),
        Constants$root.C_POINTER$LAYOUT.withName("_switch_padding_4"),
        Constants$root.C_POINTER$LAYOUT.withName("_switch_padding_5")
    ).withName("_GtkSwitchClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkSwitchClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 824);
    }
    static final FunctionDescriptor activate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor activate_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate_UP$MH = RuntimeHelper.upcallHandle(activate.class, "apply", _GtkSwitchClass.activate_UP$FUNC);
    static final FunctionDescriptor activate_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSwitchClass.activate_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*activate)(GtkSwitch*);
     * }
     */
    public interface activate {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(activate fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSwitchClass.activate_UP$MH, fi, _GtkSwitchClass.activate$FUNC, scope);
        }
        static activate ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GtkSwitchClass.activate_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle activate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("activate"));
    public static VarHandle activate$VH() {
        return _GtkSwitchClass.activate$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*activate)(GtkSwitch*);
     * }
     */
    public static MemorySegment activate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass.activate$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*activate)(GtkSwitch*);
     * }
     */
    public static void activate$set(MemorySegment seg, MemorySegment x) {
        _GtkSwitchClass.activate$VH.set(seg, x);
    }
    public static MemorySegment activate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass.activate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void activate$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSwitchClass.activate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate activate(MemorySegment segment, SegmentScope scope) {
        return activate.ofAddress(activate$get(segment), scope);
    }
    static final FunctionDescriptor state_set$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor state_set_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle state_set_UP$MH = RuntimeHelper.upcallHandle(state_set.class, "apply", _GtkSwitchClass.state_set_UP$FUNC);
    static final FunctionDescriptor state_set_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle state_set_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSwitchClass.state_set_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*state_set)(GtkSwitch*,gboolean);
     * }
     */
    public interface state_set {

        int apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(state_set fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSwitchClass.state_set_UP$MH, fi, _GtkSwitchClass.state_set$FUNC, scope);
        }
        static state_set ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    return (int)_GtkSwitchClass.state_set_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle state_set$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state_set"));
    public static VarHandle state_set$VH() {
        return _GtkSwitchClass.state_set$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*state_set)(GtkSwitch*,gboolean);
     * }
     */
    public static MemorySegment state_set$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass.state_set$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*state_set)(GtkSwitch*,gboolean);
     * }
     */
    public static void state_set$set(MemorySegment seg, MemorySegment x) {
        _GtkSwitchClass.state_set$VH.set(seg, x);
    }
    public static MemorySegment state_set$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass.state_set$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state_set$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSwitchClass.state_set$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static state_set state_set(MemorySegment segment, SegmentScope scope) {
        return state_set.ofAddress(state_set$get(segment), scope);
    }
    static final FunctionDescriptor _switch_padding_1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _switch_padding_1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _switch_padding_1_UP$MH = RuntimeHelper.upcallHandle(_switch_padding_1.class, "apply", _GtkSwitchClass._switch_padding_1_UP$FUNC);
    static final FunctionDescriptor _switch_padding_1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _switch_padding_1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSwitchClass._switch_padding_1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_switch_padding_1)();
     * }
     */
    public interface _switch_padding_1 {

        void apply();
        static MemorySegment allocate(_switch_padding_1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSwitchClass._switch_padding_1_UP$MH, fi, _GtkSwitchClass._switch_padding_1$FUNC, scope);
        }
        static _switch_padding_1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSwitchClass._switch_padding_1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _switch_padding_1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_switch_padding_1"));
    public static VarHandle _switch_padding_1$VH() {
        return _GtkSwitchClass._switch_padding_1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_switch_padding_1)();
     * }
     */
    public static MemorySegment _switch_padding_1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass._switch_padding_1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_switch_padding_1)();
     * }
     */
    public static void _switch_padding_1$set(MemorySegment seg, MemorySegment x) {
        _GtkSwitchClass._switch_padding_1$VH.set(seg, x);
    }
    public static MemorySegment _switch_padding_1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass._switch_padding_1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _switch_padding_1$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSwitchClass._switch_padding_1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _switch_padding_1 _switch_padding_1(MemorySegment segment, SegmentScope scope) {
        return _switch_padding_1.ofAddress(_switch_padding_1$get(segment), scope);
    }
    static final FunctionDescriptor _switch_padding_2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _switch_padding_2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _switch_padding_2_UP$MH = RuntimeHelper.upcallHandle(_switch_padding_2.class, "apply", _GtkSwitchClass._switch_padding_2_UP$FUNC);
    static final FunctionDescriptor _switch_padding_2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _switch_padding_2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSwitchClass._switch_padding_2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_switch_padding_2)();
     * }
     */
    public interface _switch_padding_2 {

        void apply();
        static MemorySegment allocate(_switch_padding_2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSwitchClass._switch_padding_2_UP$MH, fi, _GtkSwitchClass._switch_padding_2$FUNC, scope);
        }
        static _switch_padding_2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSwitchClass._switch_padding_2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _switch_padding_2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_switch_padding_2"));
    public static VarHandle _switch_padding_2$VH() {
        return _GtkSwitchClass._switch_padding_2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_switch_padding_2)();
     * }
     */
    public static MemorySegment _switch_padding_2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass._switch_padding_2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_switch_padding_2)();
     * }
     */
    public static void _switch_padding_2$set(MemorySegment seg, MemorySegment x) {
        _GtkSwitchClass._switch_padding_2$VH.set(seg, x);
    }
    public static MemorySegment _switch_padding_2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass._switch_padding_2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _switch_padding_2$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSwitchClass._switch_padding_2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _switch_padding_2 _switch_padding_2(MemorySegment segment, SegmentScope scope) {
        return _switch_padding_2.ofAddress(_switch_padding_2$get(segment), scope);
    }
    static final FunctionDescriptor _switch_padding_3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _switch_padding_3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _switch_padding_3_UP$MH = RuntimeHelper.upcallHandle(_switch_padding_3.class, "apply", _GtkSwitchClass._switch_padding_3_UP$FUNC);
    static final FunctionDescriptor _switch_padding_3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _switch_padding_3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSwitchClass._switch_padding_3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_switch_padding_3)();
     * }
     */
    public interface _switch_padding_3 {

        void apply();
        static MemorySegment allocate(_switch_padding_3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSwitchClass._switch_padding_3_UP$MH, fi, _GtkSwitchClass._switch_padding_3$FUNC, scope);
        }
        static _switch_padding_3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSwitchClass._switch_padding_3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _switch_padding_3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_switch_padding_3"));
    public static VarHandle _switch_padding_3$VH() {
        return _GtkSwitchClass._switch_padding_3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_switch_padding_3)();
     * }
     */
    public static MemorySegment _switch_padding_3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass._switch_padding_3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_switch_padding_3)();
     * }
     */
    public static void _switch_padding_3$set(MemorySegment seg, MemorySegment x) {
        _GtkSwitchClass._switch_padding_3$VH.set(seg, x);
    }
    public static MemorySegment _switch_padding_3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass._switch_padding_3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _switch_padding_3$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSwitchClass._switch_padding_3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _switch_padding_3 _switch_padding_3(MemorySegment segment, SegmentScope scope) {
        return _switch_padding_3.ofAddress(_switch_padding_3$get(segment), scope);
    }
    static final FunctionDescriptor _switch_padding_4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _switch_padding_4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _switch_padding_4_UP$MH = RuntimeHelper.upcallHandle(_switch_padding_4.class, "apply", _GtkSwitchClass._switch_padding_4_UP$FUNC);
    static final FunctionDescriptor _switch_padding_4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _switch_padding_4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSwitchClass._switch_padding_4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_switch_padding_4)();
     * }
     */
    public interface _switch_padding_4 {

        void apply();
        static MemorySegment allocate(_switch_padding_4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSwitchClass._switch_padding_4_UP$MH, fi, _GtkSwitchClass._switch_padding_4$FUNC, scope);
        }
        static _switch_padding_4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSwitchClass._switch_padding_4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _switch_padding_4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_switch_padding_4"));
    public static VarHandle _switch_padding_4$VH() {
        return _GtkSwitchClass._switch_padding_4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_switch_padding_4)();
     * }
     */
    public static MemorySegment _switch_padding_4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass._switch_padding_4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_switch_padding_4)();
     * }
     */
    public static void _switch_padding_4$set(MemorySegment seg, MemorySegment x) {
        _GtkSwitchClass._switch_padding_4$VH.set(seg, x);
    }
    public static MemorySegment _switch_padding_4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass._switch_padding_4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _switch_padding_4$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSwitchClass._switch_padding_4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _switch_padding_4 _switch_padding_4(MemorySegment segment, SegmentScope scope) {
        return _switch_padding_4.ofAddress(_switch_padding_4$get(segment), scope);
    }
    static final FunctionDescriptor _switch_padding_5$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _switch_padding_5_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _switch_padding_5_UP$MH = RuntimeHelper.upcallHandle(_switch_padding_5.class, "apply", _GtkSwitchClass._switch_padding_5_UP$FUNC);
    static final FunctionDescriptor _switch_padding_5_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _switch_padding_5_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkSwitchClass._switch_padding_5_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_switch_padding_5)();
     * }
     */
    public interface _switch_padding_5 {

        void apply();
        static MemorySegment allocate(_switch_padding_5 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkSwitchClass._switch_padding_5_UP$MH, fi, _GtkSwitchClass._switch_padding_5$FUNC, scope);
        }
        static _switch_padding_5 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkSwitchClass._switch_padding_5_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _switch_padding_5$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_switch_padding_5"));
    public static VarHandle _switch_padding_5$VH() {
        return _GtkSwitchClass._switch_padding_5$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_switch_padding_5)();
     * }
     */
    public static MemorySegment _switch_padding_5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass._switch_padding_5$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_switch_padding_5)();
     * }
     */
    public static void _switch_padding_5$set(MemorySegment seg, MemorySegment x) {
        _GtkSwitchClass._switch_padding_5$VH.set(seg, x);
    }
    public static MemorySegment _switch_padding_5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkSwitchClass._switch_padding_5$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _switch_padding_5$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkSwitchClass._switch_padding_5$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _switch_padding_5 _switch_padding_5(MemorySegment segment, SegmentScope scope) {
        return _switch_padding_5.ofAddress(_switch_padding_5$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


