// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1615 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1615() {}
    static final FunctionDescriptor gtk_grid_set_column_homogeneous$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_set_column_homogeneous$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_set_column_homogeneous",
        constants$1615.gtk_grid_set_column_homogeneous$FUNC
    );
    static final FunctionDescriptor gtk_grid_get_column_homogeneous$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_grid_get_column_homogeneous$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_get_column_homogeneous",
        constants$1615.gtk_grid_get_column_homogeneous$FUNC
    );
    static final FunctionDescriptor gtk_grid_set_column_spacing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_set_column_spacing$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_set_column_spacing",
        constants$1615.gtk_grid_set_column_spacing$FUNC
    );
    static final FunctionDescriptor gtk_grid_get_column_spacing$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_grid_get_column_spacing$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_get_column_spacing",
        constants$1615.gtk_grid_get_column_spacing$FUNC
    );
    static final FunctionDescriptor gtk_grid_set_row_baseline_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_set_row_baseline_position$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_set_row_baseline_position",
        constants$1615.gtk_grid_set_row_baseline_position$FUNC
    );
    static final FunctionDescriptor gtk_grid_get_row_baseline_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_get_row_baseline_position$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_get_row_baseline_position",
        constants$1615.gtk_grid_get_row_baseline_position$FUNC
    );
}


