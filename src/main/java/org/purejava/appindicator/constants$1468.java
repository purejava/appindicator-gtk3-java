// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1468 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1468() {}
    static final FunctionDescriptor gtk_tree_view_remove_column$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_remove_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_remove_column",
        constants$1468.gtk_tree_view_remove_column$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_insert_column$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_insert_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_insert_column",
        constants$1468.gtk_tree_view_insert_column$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_insert_column_with_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_insert_column_with_attributes$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_tree_view_insert_column_with_attributes",
        constants$1468.gtk_tree_view_insert_column_with_attributes$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_insert_column_with_data_func$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_insert_column_with_data_func$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_insert_column_with_data_func",
        constants$1468.gtk_tree_view_insert_column_with_data_func$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_n_columns$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_n_columns$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_n_columns",
        constants$1468.gtk_tree_view_get_n_columns$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_column$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_column",
        constants$1468.gtk_tree_view_get_column$FUNC
    );
}


