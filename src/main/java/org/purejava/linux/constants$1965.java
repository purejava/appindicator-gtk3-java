// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1965 {

    static final FunctionDescriptor gtk_range_get_upper_stepper_sensitivity$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_range_get_upper_stepper_sensitivity$MH = RuntimeHelper.downcallHandle(
        "gtk_range_get_upper_stepper_sensitivity",
        constants$1965.gtk_range_get_upper_stepper_sensitivity$FUNC
    );
    static final FunctionDescriptor gtk_range_set_increments$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_range_set_increments$MH = RuntimeHelper.downcallHandle(
        "gtk_range_set_increments",
        constants$1965.gtk_range_set_increments$FUNC
    );
    static final FunctionDescriptor gtk_range_set_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_range_set_range$MH = RuntimeHelper.downcallHandle(
        "gtk_range_set_range",
        constants$1965.gtk_range_set_range$FUNC
    );
    static final FunctionDescriptor gtk_range_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_range_set_value$MH = RuntimeHelper.downcallHandle(
        "gtk_range_set_value",
        constants$1965.gtk_range_set_value$FUNC
    );
    static final FunctionDescriptor gtk_range_get_value$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_range_get_value$MH = RuntimeHelper.downcallHandle(
        "gtk_range_get_value",
        constants$1965.gtk_range_get_value$FUNC
    );
    static final FunctionDescriptor gtk_range_set_show_fill_level$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_range_set_show_fill_level$MH = RuntimeHelper.downcallHandle(
        "gtk_range_set_show_fill_level",
        constants$1965.gtk_range_set_show_fill_level$FUNC
    );
}


