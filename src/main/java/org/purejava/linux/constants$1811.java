// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1811 {

    static final FunctionDescriptor gtk_grid_set_row_baseline_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_set_row_baseline_position$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_set_row_baseline_position",
        constants$1811.gtk_grid_set_row_baseline_position$FUNC
    );
    static final FunctionDescriptor gtk_grid_get_row_baseline_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_get_row_baseline_position$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_get_row_baseline_position",
        constants$1811.gtk_grid_get_row_baseline_position$FUNC
    );
    static final FunctionDescriptor gtk_grid_set_baseline_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_set_baseline_row$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_set_baseline_row",
        constants$1811.gtk_grid_set_baseline_row$FUNC
    );
    static final FunctionDescriptor gtk_grid_get_baseline_row$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_grid_get_baseline_row$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_get_baseline_row",
        constants$1811.gtk_grid_get_baseline_row$FUNC
    );
    static final FunctionDescriptor gtk_header_bar_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_header_bar_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_header_bar_get_type",
        constants$1811.gtk_header_bar_get_type$FUNC
    );
    static final FunctionDescriptor gtk_header_bar_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_header_bar_new$MH = RuntimeHelper.downcallHandle(
        "gtk_header_bar_new",
        constants$1811.gtk_header_bar_new$FUNC
    );
}


