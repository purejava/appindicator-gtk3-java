// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1969 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1969() {}
    static final FunctionDescriptor gtk_table_set_col_spacings$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_table_set_col_spacings$MH = RuntimeHelper.downcallHandle(
        "gtk_table_set_col_spacings",
        constants$1969.gtk_table_set_col_spacings$FUNC
    );
    static final FunctionDescriptor gtk_table_get_default_col_spacing$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_table_get_default_col_spacing$MH = RuntimeHelper.downcallHandle(
        "gtk_table_get_default_col_spacing",
        constants$1969.gtk_table_get_default_col_spacing$FUNC
    );
    static final FunctionDescriptor gtk_table_set_homogeneous$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_table_set_homogeneous$MH = RuntimeHelper.downcallHandle(
        "gtk_table_set_homogeneous",
        constants$1969.gtk_table_set_homogeneous$FUNC
    );
    static final FunctionDescriptor gtk_table_get_homogeneous$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_table_get_homogeneous$MH = RuntimeHelper.downcallHandle(
        "gtk_table_get_homogeneous",
        constants$1969.gtk_table_get_homogeneous$FUNC
    );
    static final FunctionDescriptor gtk_table_get_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_table_get_size$MH = RuntimeHelper.downcallHandle(
        "gtk_table_get_size",
        constants$1969.gtk_table_get_size$FUNC
    );
    static final FunctionDescriptor gtk_tearoff_menu_item_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tearoff_menu_item_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tearoff_menu_item_get_type",
        constants$1969.gtk_tearoff_menu_item_get_type$FUNC
    );
}


