// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2165 {

    static final FunctionDescriptor gtk_table_set_row_spacing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_table_set_row_spacing$MH = RuntimeHelper.downcallHandle(
        "gtk_table_set_row_spacing",
        constants$2165.gtk_table_set_row_spacing$FUNC
    );
    static final FunctionDescriptor gtk_table_get_row_spacing$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_table_get_row_spacing$MH = RuntimeHelper.downcallHandle(
        "gtk_table_get_row_spacing",
        constants$2165.gtk_table_get_row_spacing$FUNC
    );
    static final FunctionDescriptor gtk_table_set_col_spacing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_table_set_col_spacing$MH = RuntimeHelper.downcallHandle(
        "gtk_table_set_col_spacing",
        constants$2165.gtk_table_set_col_spacing$FUNC
    );
    static final FunctionDescriptor gtk_table_get_col_spacing$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_table_get_col_spacing$MH = RuntimeHelper.downcallHandle(
        "gtk_table_get_col_spacing",
        constants$2165.gtk_table_get_col_spacing$FUNC
    );
    static final FunctionDescriptor gtk_table_set_row_spacings$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_table_set_row_spacings$MH = RuntimeHelper.downcallHandle(
        "gtk_table_set_row_spacings",
        constants$2165.gtk_table_set_row_spacings$FUNC
    );
    static final FunctionDescriptor gtk_table_get_default_row_spacing$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_table_get_default_row_spacing$MH = RuntimeHelper.downcallHandle(
        "gtk_table_get_default_row_spacing",
        constants$2165.gtk_table_get_default_row_spacing$FUNC
    );
}


