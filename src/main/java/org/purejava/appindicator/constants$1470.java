// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1470 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1470() {}
    static final FunctionDescriptor gtk_tree_view_scroll_to_cell$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_scroll_to_cell$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_scroll_to_cell",
        constants$1470.gtk_tree_view_scroll_to_cell$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_row_activated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_row_activated$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_row_activated",
        constants$1470.gtk_tree_view_row_activated$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_expand_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_expand_all$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_expand_all",
        constants$1470.gtk_tree_view_expand_all$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_collapse_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_collapse_all$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_collapse_all",
        constants$1470.gtk_tree_view_collapse_all$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_expand_to_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_expand_to_path$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_expand_to_path",
        constants$1470.gtk_tree_view_expand_to_path$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_expand_row$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_expand_row$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_expand_row",
        constants$1470.gtk_tree_view_expand_row$FUNC
    );
}


