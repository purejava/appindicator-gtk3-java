// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkHButtonBoxClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved1"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved2"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved3"),
            Constants$root.C_POINTER$LAYOUT.withName("_gtk_reserved4")
        ).withName("parent_class")
    ).withName("_GtkHButtonBoxClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkHButtonBoxClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 1040);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


