// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1937 {

    static final FunctionDescriptor gtk_print_settings_unset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_unset$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_unset",
        constants$1937.gtk_print_settings_unset$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_foreach$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_foreach",
        constants$1937.gtk_print_settings_foreach$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_bool$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_bool$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_bool",
        constants$1937.gtk_print_settings_get_bool$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_set_bool$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_bool$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_bool",
        constants$1937.gtk_print_settings_set_bool$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_double$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_double$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_double",
        constants$1937.gtk_print_settings_get_double$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_double_with_default$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_double_with_default$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_double_with_default",
        constants$1937.gtk_print_settings_get_double_with_default$FUNC
    );
}

