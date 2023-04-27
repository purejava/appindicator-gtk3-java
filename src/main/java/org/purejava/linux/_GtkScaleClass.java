// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkScaleClass {
 *     GtkRangeClass parent_class;
 *     gchar* (*format_value)(GtkScale*,gdouble);
 *     void (*draw_value)(GtkScale*);
 *     void (*get_layout_offsets)(GtkScale*,gint*,gint*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkScaleClass {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
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
            Constants$root.C_POINTER$LAYOUT.withName("slider_detail"),
            Constants$root.C_POINTER$LAYOUT.withName("stepper_detail"),
            Constants$root.C_POINTER$LAYOUT.withName("value_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("adjust_bounds"),
            Constants$root.C_POINTER$LAYOUT.withName("move_slider"),
            Constants$root.C_POINTER$LAYOUT.withName("get_range_border"),
            Constants$root.C_POINTER$LAYOUT.withName("change_value"),
            Constants$root.C_POINTER$LAYOUT.withName("get_range_size_request"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("format_value"),
        Constants$root.C_POINTER$LAYOUT.withName("draw_value"),
        Constants$root.C_POINTER$LAYOUT.withName("get_layout_offsets"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
    ).withName("_GtkScaleClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkScaleClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 912);
    }
    static final FunctionDescriptor format_value$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final FunctionDescriptor format_value_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle format_value_UP$MH = RuntimeHelper.upcallHandle(format_value.class, "apply", _GtkScaleClass.format_value_UP$FUNC);
    static final FunctionDescriptor format_value_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle format_value_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkScaleClass.format_value_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gchar* (*format_value)(GtkScale*,gdouble);
     * }
     */
    public interface format_value {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment _x0, double _x1);
        static MemorySegment allocate(format_value fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkScaleClass.format_value_UP$MH, fi, _GtkScaleClass.format_value$FUNC, scope);
        }
        static format_value ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, double __x1) -> {
                try {
                    return (java.lang.foreign.MemorySegment)_GtkScaleClass.format_value_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle format_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("format_value"));
    public static VarHandle format_value$VH() {
        return _GtkScaleClass.format_value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gchar* (*format_value)(GtkScale*,gdouble);
     * }
     */
    public static MemorySegment format_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass.format_value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gchar* (*format_value)(GtkScale*,gdouble);
     * }
     */
    public static void format_value$set(MemorySegment seg, MemorySegment x) {
        _GtkScaleClass.format_value$VH.set(seg, x);
    }
    public static MemorySegment format_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass.format_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void format_value$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkScaleClass.format_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static format_value format_value(MemorySegment segment, SegmentScope scope) {
        return format_value.ofAddress(format_value$get(segment), scope);
    }
    static final FunctionDescriptor draw_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor draw_value_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle draw_value_UP$MH = RuntimeHelper.upcallHandle(draw_value.class, "apply", _GtkScaleClass.draw_value_UP$FUNC);
    static final FunctionDescriptor draw_value_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle draw_value_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkScaleClass.draw_value_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*draw_value)(GtkScale*);
     * }
     */
    public interface draw_value {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(draw_value fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkScaleClass.draw_value_UP$MH, fi, _GtkScaleClass.draw_value$FUNC, scope);
        }
        static draw_value ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    _GtkScaleClass.draw_value_DOWN$MH.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle draw_value$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("draw_value"));
    public static VarHandle draw_value$VH() {
        return _GtkScaleClass.draw_value$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*draw_value)(GtkScale*);
     * }
     */
    public static MemorySegment draw_value$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass.draw_value$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*draw_value)(GtkScale*);
     * }
     */
    public static void draw_value$set(MemorySegment seg, MemorySegment x) {
        _GtkScaleClass.draw_value$VH.set(seg, x);
    }
    public static MemorySegment draw_value$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass.draw_value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void draw_value$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkScaleClass.draw_value$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static draw_value draw_value(MemorySegment segment, SegmentScope scope) {
        return draw_value.ofAddress(draw_value$get(segment), scope);
    }
    static final FunctionDescriptor get_layout_offsets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_layout_offsets_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_layout_offsets_UP$MH = RuntimeHelper.upcallHandle(get_layout_offsets.class, "apply", _GtkScaleClass.get_layout_offsets_UP$FUNC);
    static final FunctionDescriptor get_layout_offsets_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_layout_offsets_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkScaleClass.get_layout_offsets_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*get_layout_offsets)(GtkScale*,gint*,gint*);
     * }
     */
    public interface get_layout_offsets {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_layout_offsets fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkScaleClass.get_layout_offsets_UP$MH, fi, _GtkScaleClass.get_layout_offsets$FUNC, scope);
        }
        static get_layout_offsets ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    _GtkScaleClass.get_layout_offsets_DOWN$MH.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_layout_offsets$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_layout_offsets"));
    public static VarHandle get_layout_offsets$VH() {
        return _GtkScaleClass.get_layout_offsets$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_layout_offsets)(GtkScale*,gint*,gint*);
     * }
     */
    public static MemorySegment get_layout_offsets$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass.get_layout_offsets$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_layout_offsets)(GtkScale*,gint*,gint*);
     * }
     */
    public static void get_layout_offsets$set(MemorySegment seg, MemorySegment x) {
        _GtkScaleClass.get_layout_offsets$VH.set(seg, x);
    }
    public static MemorySegment get_layout_offsets$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass.get_layout_offsets$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_layout_offsets$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkScaleClass.get_layout_offsets$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_layout_offsets get_layout_offsets(MemorySegment segment, SegmentScope scope) {
        return get_layout_offsets.ofAddress(get_layout_offsets$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved1_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved1.class, "apply", _GtkScaleClass._gtk_reserved1_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved1_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkScaleClass._gtk_reserved1_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkScaleClass._gtk_reserved1_UP$MH, fi, _GtkScaleClass._gtk_reserved1$FUNC, scope);
        }
        static _gtk_reserved1 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkScaleClass._gtk_reserved1_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkScaleClass._gtk_reserved1$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass._gtk_reserved1$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        _GtkScaleClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkScaleClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved2_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved2.class, "apply", _GtkScaleClass._gtk_reserved2_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved2_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkScaleClass._gtk_reserved2_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkScaleClass._gtk_reserved2_UP$MH, fi, _GtkScaleClass._gtk_reserved2$FUNC, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkScaleClass._gtk_reserved2_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkScaleClass._gtk_reserved2$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass._gtk_reserved2$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        _GtkScaleClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkScaleClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved3_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved3.class, "apply", _GtkScaleClass._gtk_reserved3_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved3_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkScaleClass._gtk_reserved3_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkScaleClass._gtk_reserved3_UP$MH, fi, _GtkScaleClass._gtk_reserved3$FUNC, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkScaleClass._gtk_reserved3_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkScaleClass._gtk_reserved3$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass._gtk_reserved3$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        _GtkScaleClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkScaleClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor _gtk_reserved4_UP$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_UP$MH = RuntimeHelper.upcallHandle(_gtk_reserved4.class, "apply", _GtkScaleClass._gtk_reserved4_UP$FUNC);
    static final FunctionDescriptor _gtk_reserved4_DOWN$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkScaleClass._gtk_reserved4_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkScaleClass._gtk_reserved4_UP$MH, fi, _GtkScaleClass._gtk_reserved4$FUNC, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return () -> {
                try {
                    _GtkScaleClass._gtk_reserved4_DOWN$MH.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkScaleClass._gtk_reserved4$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass._gtk_reserved4$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        _GtkScaleClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkScaleClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkScaleClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, SegmentScope scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


