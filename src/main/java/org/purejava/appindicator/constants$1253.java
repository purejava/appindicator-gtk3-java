// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1253 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1253() {}
    static final FunctionDescriptor gtk_widget_add_accelerator$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_add_accelerator$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_add_accelerator",
        constants$1253.gtk_widget_add_accelerator$FUNC
    );
    static final FunctionDescriptor gtk_widget_remove_accelerator$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_remove_accelerator$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_remove_accelerator",
        constants$1253.gtk_widget_remove_accelerator$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_accel_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_set_accel_path$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_accel_path",
        constants$1253.gtk_widget_set_accel_path$FUNC
    );
    static final FunctionDescriptor gtk_widget_list_accel_closures$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_list_accel_closures$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_list_accel_closures",
        constants$1253.gtk_widget_list_accel_closures$FUNC
    );
    static final FunctionDescriptor gtk_widget_can_activate_accel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_can_activate_accel$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_can_activate_accel",
        constants$1253.gtk_widget_can_activate_accel$FUNC
    );
    static final FunctionDescriptor gtk_widget_mnemonic_activate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_mnemonic_activate$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_mnemonic_activate",
        constants$1253.gtk_widget_mnemonic_activate$FUNC
    );
}


