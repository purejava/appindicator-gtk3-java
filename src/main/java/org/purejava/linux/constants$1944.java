// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1944 {

    static final FunctionDescriptor gtk_print_settings_set_resolution_xy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_resolution_xy$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_resolution_xy",
        constants$1944.gtk_print_settings_set_resolution_xy$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_printer_lpi$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_printer_lpi$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_printer_lpi",
        constants$1944.gtk_print_settings_get_printer_lpi$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_set_printer_lpi$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_printer_lpi$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_printer_lpi",
        constants$1944.gtk_print_settings_set_printer_lpi$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_scale$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_scale$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_scale",
        constants$1944.gtk_print_settings_get_scale$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_set_scale$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_print_settings_set_scale$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_set_scale",
        constants$1944.gtk_print_settings_set_scale$FUNC
    );
    static final FunctionDescriptor gtk_print_settings_get_print_pages$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_settings_get_print_pages$MH = RuntimeHelper.downcallHandle(
        "gtk_print_settings_get_print_pages",
        constants$1944.gtk_print_settings_get_print_pages$FUNC
    );
}


