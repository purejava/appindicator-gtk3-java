// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkCalendarClass {

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
        Constants$root.C_POINTER$LAYOUT.withName("month_changed"),
        Constants$root.C_POINTER$LAYOUT.withName("day_selected"),
        Constants$root.C_POINTER$LAYOUT.withName("day_selected_double_click"),
        Constants$root.C_POINTER$LAYOUT.withName("prev_month"),
        Constants$root.C_POINTER$LAYOUT.withName("next_month"),
        Constants$root.C_POINTER$LAYOUT.withName("prev_year"),
        Constants$root.C_POINTER$LAYOUT.withName("next_year"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
    ).withName("_GtkCalendarClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkCalendarClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 824);
    }
    static final FunctionDescriptor month_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle month_changed$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass.month_changed$FUNC
    );
    public interface month_changed {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(month_changed fi, MemorySession session) {
            return RuntimeHelper.upcallStub(month_changed.class, fi, _GtkCalendarClass.month_changed$FUNC, session);
        }
        static month_changed ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCalendarClass.month_changed$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle month_changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("month_changed"));
    public static VarHandle month_changed$VH() {
        return _GtkCalendarClass.month_changed$VH;
    }
    public static MemoryAddress month_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.month_changed$VH.get(seg);
    }
    public static void month_changed$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass.month_changed$VH.set(seg, x);
    }
    public static MemoryAddress month_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.month_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void month_changed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass.month_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static month_changed month_changed (MemorySegment segment, MemorySession session) {
        return month_changed.ofAddress(month_changed$get(segment), session);
    }
    static final FunctionDescriptor day_selected$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle day_selected$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass.day_selected$FUNC
    );
    public interface day_selected {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(day_selected fi, MemorySession session) {
            return RuntimeHelper.upcallStub(day_selected.class, fi, _GtkCalendarClass.day_selected$FUNC, session);
        }
        static day_selected ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCalendarClass.day_selected$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle day_selected$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("day_selected"));
    public static VarHandle day_selected$VH() {
        return _GtkCalendarClass.day_selected$VH;
    }
    public static MemoryAddress day_selected$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.day_selected$VH.get(seg);
    }
    public static void day_selected$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass.day_selected$VH.set(seg, x);
    }
    public static MemoryAddress day_selected$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.day_selected$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void day_selected$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass.day_selected$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static day_selected day_selected (MemorySegment segment, MemorySession session) {
        return day_selected.ofAddress(day_selected$get(segment), session);
    }
    static final FunctionDescriptor day_selected_double_click$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle day_selected_double_click$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass.day_selected_double_click$FUNC
    );
    public interface day_selected_double_click {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(day_selected_double_click fi, MemorySession session) {
            return RuntimeHelper.upcallStub(day_selected_double_click.class, fi, _GtkCalendarClass.day_selected_double_click$FUNC, session);
        }
        static day_selected_double_click ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCalendarClass.day_selected_double_click$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle day_selected_double_click$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("day_selected_double_click"));
    public static VarHandle day_selected_double_click$VH() {
        return _GtkCalendarClass.day_selected_double_click$VH;
    }
    public static MemoryAddress day_selected_double_click$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.day_selected_double_click$VH.get(seg);
    }
    public static void day_selected_double_click$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass.day_selected_double_click$VH.set(seg, x);
    }
    public static MemoryAddress day_selected_double_click$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.day_selected_double_click$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void day_selected_double_click$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass.day_selected_double_click$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static day_selected_double_click day_selected_double_click (MemorySegment segment, MemorySession session) {
        return day_selected_double_click.ofAddress(day_selected_double_click$get(segment), session);
    }
    static final FunctionDescriptor prev_month$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle prev_month$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass.prev_month$FUNC
    );
    public interface prev_month {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(prev_month fi, MemorySession session) {
            return RuntimeHelper.upcallStub(prev_month.class, fi, _GtkCalendarClass.prev_month$FUNC, session);
        }
        static prev_month ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCalendarClass.prev_month$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle prev_month$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prev_month"));
    public static VarHandle prev_month$VH() {
        return _GtkCalendarClass.prev_month$VH;
    }
    public static MemoryAddress prev_month$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.prev_month$VH.get(seg);
    }
    public static void prev_month$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass.prev_month$VH.set(seg, x);
    }
    public static MemoryAddress prev_month$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.prev_month$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prev_month$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass.prev_month$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static prev_month prev_month (MemorySegment segment, MemorySession session) {
        return prev_month.ofAddress(prev_month$get(segment), session);
    }
    static final FunctionDescriptor next_month$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle next_month$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass.next_month$FUNC
    );
    public interface next_month {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(next_month fi, MemorySession session) {
            return RuntimeHelper.upcallStub(next_month.class, fi, _GtkCalendarClass.next_month$FUNC, session);
        }
        static next_month ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCalendarClass.next_month$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle next_month$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next_month"));
    public static VarHandle next_month$VH() {
        return _GtkCalendarClass.next_month$VH;
    }
    public static MemoryAddress next_month$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.next_month$VH.get(seg);
    }
    public static void next_month$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass.next_month$VH.set(seg, x);
    }
    public static MemoryAddress next_month$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.next_month$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next_month$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass.next_month$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static next_month next_month (MemorySegment segment, MemorySession session) {
        return next_month.ofAddress(next_month$get(segment), session);
    }
    static final FunctionDescriptor prev_year$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle prev_year$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass.prev_year$FUNC
    );
    public interface prev_year {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(prev_year fi, MemorySession session) {
            return RuntimeHelper.upcallStub(prev_year.class, fi, _GtkCalendarClass.prev_year$FUNC, session);
        }
        static prev_year ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCalendarClass.prev_year$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle prev_year$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("prev_year"));
    public static VarHandle prev_year$VH() {
        return _GtkCalendarClass.prev_year$VH;
    }
    public static MemoryAddress prev_year$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.prev_year$VH.get(seg);
    }
    public static void prev_year$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass.prev_year$VH.set(seg, x);
    }
    public static MemoryAddress prev_year$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.prev_year$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void prev_year$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass.prev_year$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static prev_year prev_year (MemorySegment segment, MemorySession session) {
        return prev_year.ofAddress(prev_year$get(segment), session);
    }
    static final FunctionDescriptor next_year$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle next_year$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass.next_year$FUNC
    );
    public interface next_year {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(next_year fi, MemorySession session) {
            return RuntimeHelper.upcallStub(next_year.class, fi, _GtkCalendarClass.next_year$FUNC, session);
        }
        static next_year ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkCalendarClass.next_year$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle next_year$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next_year"));
    public static VarHandle next_year$VH() {
        return _GtkCalendarClass.next_year$VH;
    }
    public static MemoryAddress next_year$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.next_year$VH.get(seg);
    }
    public static void next_year$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass.next_year$VH.set(seg, x);
    }
    public static MemoryAddress next_year$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass.next_year$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next_year$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass.next_year$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static next_year next_year (MemorySegment segment, MemorySession session) {
        return next_year.ofAddress(next_year$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved1$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass._gtk_reserved1$FUNC
    );
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved1.class, fi, _GtkCalendarClass._gtk_reserved1$FUNC, session);
        }
        static _gtk_reserved1 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkCalendarClass._gtk_reserved1$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"));
    public static VarHandle _gtk_reserved1$VH() {
        return _GtkCalendarClass._gtk_reserved1$VH;
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass._gtk_reserved1$VH.get(seg);
    }
    public static void _gtk_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass._gtk_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass._gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass._gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved2$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass._gtk_reserved2$FUNC
    );
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved2.class, fi, _GtkCalendarClass._gtk_reserved2$FUNC, session);
        }
        static _gtk_reserved2 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkCalendarClass._gtk_reserved2$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"));
    public static VarHandle _gtk_reserved2$VH() {
        return _GtkCalendarClass._gtk_reserved2$VH;
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass._gtk_reserved2$VH.get(seg);
    }
    public static void _gtk_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass._gtk_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass._gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass._gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved3$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass._gtk_reserved3$FUNC
    );
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved3.class, fi, _GtkCalendarClass._gtk_reserved3$FUNC, session);
        }
        static _gtk_reserved3 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkCalendarClass._gtk_reserved3$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"));
    public static VarHandle _gtk_reserved3$VH() {
        return _GtkCalendarClass._gtk_reserved3$VH;
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass._gtk_reserved3$VH.get(seg);
    }
    public static void _gtk_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass._gtk_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass._gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass._gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), session);
    }
    static final FunctionDescriptor _gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle _gtk_reserved4$MH = RuntimeHelper.downcallHandle(
        _GtkCalendarClass._gtk_reserved4$FUNC
    );
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(_gtk_reserved4.class, fi, _GtkCalendarClass._gtk_reserved4$FUNC, session);
        }
        static _gtk_reserved4 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkCalendarClass._gtk_reserved4$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    public static VarHandle _gtk_reserved4$VH() {
        return _GtkCalendarClass._gtk_reserved4$VH;
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass._gtk_reserved4$VH.get(seg);
    }
    public static void _gtk_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GtkCalendarClass._gtk_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkCalendarClass._gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkCalendarClass._gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4 (MemorySegment segment, MemorySession session) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


