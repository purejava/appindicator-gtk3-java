// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1473 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1473() {}
    static final FunctionDescriptor gtk_tree_view_get_visible_rect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_visible_rect$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_visible_rect",
        constants$1473.gtk_tree_view_get_visible_rect$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_visible_range$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_visible_range$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_visible_range",
        constants$1473.gtk_tree_view_get_visible_range$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_is_blank_at_pos$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_is_blank_at_pos$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_is_blank_at_pos",
        constants$1473.gtk_tree_view_is_blank_at_pos$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_enable_model_drag_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_enable_model_drag_source$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_enable_model_drag_source",
        constants$1473.gtk_tree_view_enable_model_drag_source$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_enable_model_drag_dest$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_enable_model_drag_dest$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_enable_model_drag_dest",
        constants$1473.gtk_tree_view_enable_model_drag_dest$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_unset_rows_drag_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_unset_rows_drag_source$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_unset_rows_drag_source",
        constants$1473.gtk_tree_view_unset_rows_drag_source$FUNC
    );
}


