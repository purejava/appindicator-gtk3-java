// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1372 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1372() {}
    static final FunctionDescriptor gtk_tree_model_row_has_child_toggled$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_row_has_child_toggled$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_row_has_child_toggled",
        constants$1372.gtk_tree_model_row_has_child_toggled$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_row_deleted$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_row_deleted$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_row_deleted",
        constants$1372.gtk_tree_model_row_deleted$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_rows_reordered$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_model_rows_reordered$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_rows_reordered",
        constants$1372.gtk_tree_model_rows_reordered$FUNC
    );
    static final FunctionDescriptor gtk_tree_model_rows_reordered_with_length$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_model_rows_reordered_with_length$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_model_rows_reordered_with_length",
        constants$1372.gtk_tree_model_rows_reordered_with_length$FUNC
    );
    static final FunctionDescriptor gtk_cell_editable_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_cell_editable_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_editable_get_type",
        constants$1372.gtk_cell_editable_get_type$FUNC
    );
    static final FunctionDescriptor gtk_cell_editable_start_editing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_editable_start_editing$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_editable_start_editing",
        constants$1372.gtk_cell_editable_start_editing$FUNC
    );
}


