// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1241 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1241() {}
    static final FunctionDescriptor atk_table_set_row_description$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_set_row_description$MH = RuntimeHelper.downcallHandle(
        "atk_table_set_row_description",
        constants$1241.atk_table_set_row_description$FUNC
    );
    static final FunctionDescriptor atk_table_set_row_header$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_set_row_header$MH = RuntimeHelper.downcallHandle(
        "atk_table_set_row_header",
        constants$1241.atk_table_set_row_header$FUNC
    );
    static final FunctionDescriptor atk_table_set_summary$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_set_summary$MH = RuntimeHelper.downcallHandle(
        "atk_table_set_summary",
        constants$1241.atk_table_set_summary$FUNC
    );
    static final FunctionDescriptor atk_table_get_selected_columns$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_get_selected_columns$MH = RuntimeHelper.downcallHandle(
        "atk_table_get_selected_columns",
        constants$1241.atk_table_get_selected_columns$FUNC
    );
    static final FunctionDescriptor atk_table_get_selected_rows$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_table_get_selected_rows$MH = RuntimeHelper.downcallHandle(
        "atk_table_get_selected_rows",
        constants$1241.atk_table_get_selected_rows$FUNC
    );
    static final FunctionDescriptor atk_table_is_column_selected$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_table_is_column_selected$MH = RuntimeHelper.downcallHandle(
        "atk_table_is_column_selected",
        constants$1241.atk_table_is_column_selected$FUNC
    );
}

