// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1747 {

    static final FunctionDescriptor gtk_drag_dest_set_target_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_set_target_list$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_set_target_list",
        constants$1747.gtk_drag_dest_set_target_list$FUNC
    );
    static final FunctionDescriptor gtk_drag_dest_add_text_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_add_text_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_add_text_targets",
        constants$1747.gtk_drag_dest_add_text_targets$FUNC
    );
    static final FunctionDescriptor gtk_drag_dest_add_image_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_add_image_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_add_image_targets",
        constants$1747.gtk_drag_dest_add_image_targets$FUNC
    );
    static final FunctionDescriptor gtk_drag_dest_add_uri_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_add_uri_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_add_uri_targets",
        constants$1747.gtk_drag_dest_add_uri_targets$FUNC
    );
    static final FunctionDescriptor gtk_drag_dest_set_track_motion$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_set_track_motion$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_set_track_motion",
        constants$1747.gtk_drag_dest_set_track_motion$FUNC
    );
    static final FunctionDescriptor gtk_drag_dest_get_track_motion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_drag_dest_get_track_motion$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_dest_get_track_motion",
        constants$1747.gtk_drag_dest_get_track_motion$FUNC
    );
}

