// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1871 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1871() {}
    static final FunctionDescriptor gtk_tree_selection_get_selected_rows$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_get_selected_rows$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_get_selected_rows",
        constants$1871.gtk_tree_selection_get_selected_rows$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_count_selected_rows$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_count_selected_rows$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_count_selected_rows",
        constants$1871.gtk_tree_selection_count_selected_rows$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_selected_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_selected_foreach$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_selected_foreach",
        constants$1871.gtk_tree_selection_selected_foreach$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_select_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_select_path$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_select_path",
        constants$1871.gtk_tree_selection_select_path$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_unselect_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_unselect_path$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_unselect_path",
        constants$1871.gtk_tree_selection_unselect_path$FUNC
    );
    static final FunctionDescriptor gtk_tree_selection_select_iter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_select_iter$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_select_iter",
        constants$1871.gtk_tree_selection_select_iter$FUNC
    );
}

