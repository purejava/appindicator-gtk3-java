// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1679 {

    static final FunctionDescriptor gtk_app_chooser_button_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_app_chooser_button_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_get_type",
        constants$1679.gtk_app_chooser_button_get_type$FUNC
    );
    static final FunctionDescriptor gtk_app_chooser_button_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_app_chooser_button_new$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_new",
        constants$1679.gtk_app_chooser_button_new$FUNC
    );
    static final FunctionDescriptor gtk_app_chooser_button_append_separator$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_app_chooser_button_append_separator$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_append_separator",
        constants$1679.gtk_app_chooser_button_append_separator$FUNC
    );
    static final FunctionDescriptor gtk_app_chooser_button_append_custom_item$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_app_chooser_button_append_custom_item$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_append_custom_item",
        constants$1679.gtk_app_chooser_button_append_custom_item$FUNC
    );
    static final FunctionDescriptor gtk_app_chooser_button_set_active_custom_item$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_app_chooser_button_set_active_custom_item$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_set_active_custom_item",
        constants$1679.gtk_app_chooser_button_set_active_custom_item$FUNC
    );
    static final FunctionDescriptor gtk_app_chooser_button_set_show_dialog_item$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_app_chooser_button_set_show_dialog_item$MH = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_set_show_dialog_item",
        constants$1679.gtk_app_chooser_button_set_show_dialog_item$FUNC
    );
}

