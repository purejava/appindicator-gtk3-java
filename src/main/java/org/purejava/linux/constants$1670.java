// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1670 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1670() {}
    static final FunctionDescriptor gtk_level_bar_get_min_value$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_level_bar_get_min_value$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_get_min_value",
        constants$1670.gtk_level_bar_get_min_value$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_set_max_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_level_bar_set_max_value$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_set_max_value",
        constants$1670.gtk_level_bar_set_max_value$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_get_max_value$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_level_bar_get_max_value$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_get_max_value",
        constants$1670.gtk_level_bar_get_max_value$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_set_inverted$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_level_bar_set_inverted$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_set_inverted",
        constants$1670.gtk_level_bar_set_inverted$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_get_inverted$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_level_bar_get_inverted$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_get_inverted",
        constants$1670.gtk_level_bar_get_inverted$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_add_offset_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_level_bar_add_offset_value$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_add_offset_value",
        constants$1670.gtk_level_bar_add_offset_value$FUNC
    );
}


