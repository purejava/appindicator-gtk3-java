// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1741 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1741() {}
    static final FunctionDescriptor gtk_print_settings_set_double$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_double$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_double",
        constants$1741.gtk_print_settings_set_double$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_length$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_length",
        constants$1741.gtk_print_settings_get_length$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_set_length$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_length$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_length",
        constants$1741.gtk_print_settings_set_length$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_int$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_int$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_int",
        constants$1741.gtk_print_settings_get_int$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_int_with_default$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_int_with_default$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_int_with_default",
        constants$1741.gtk_print_settings_get_int_with_default$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_set_int$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_int$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_int",
        constants$1741.gtk_print_settings_set_int$FUNC
    );
}


