// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1864 {

    static final FunctionDescriptor gtk_level_bar_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_level_bar_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_get_type",
        constants$1864.gtk_level_bar_get_type$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_level_bar_new$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_new",
        constants$1864.gtk_level_bar_new$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_new_for_interval$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_level_bar_new_for_interval$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_new_for_interval",
        constants$1864.gtk_level_bar_new_for_interval$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_set_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_level_bar_set_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_set_mode",
        constants$1864.gtk_level_bar_set_mode$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_get_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_level_bar_get_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_get_mode",
        constants$1864.gtk_level_bar_get_mode$FUNC
    );
    static final FunctionDescriptor gtk_level_bar_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_level_bar_set_value$MH = RuntimeHelper.downcallHandle(
        "gtk_level_bar_set_value",
        constants$1864.gtk_level_bar_set_value$FUNC
    );
}

