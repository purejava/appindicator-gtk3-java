// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1809 {

    static final FunctionDescriptor gtk_grid_insert_column$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_insert_column$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_insert_column",
        constants$1809.gtk_grid_insert_column$FUNC
    );
    static final FunctionDescriptor gtk_grid_remove_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_remove_row$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_remove_row",
        constants$1809.gtk_grid_remove_row$FUNC
    );
    static final FunctionDescriptor gtk_grid_remove_column$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_remove_column$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_remove_column",
        constants$1809.gtk_grid_remove_column$FUNC
    );
    static final FunctionDescriptor gtk_grid_insert_next_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_insert_next_to$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_insert_next_to",
        constants$1809.gtk_grid_insert_next_to$FUNC
    );
    static final FunctionDescriptor gtk_grid_set_row_homogeneous$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_set_row_homogeneous$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_set_row_homogeneous",
        constants$1809.gtk_grid_set_row_homogeneous$FUNC
    );
    static final FunctionDescriptor gtk_grid_get_row_homogeneous$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_grid_get_row_homogeneous$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_get_row_homogeneous",
        constants$1809.gtk_grid_get_row_homogeneous$FUNC
    );
}


