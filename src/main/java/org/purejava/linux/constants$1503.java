// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1503 {

    static final FunctionDescriptor gtk_dialog_add_button$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_dialog_add_button$MH = RuntimeHelper.downcallHandle(
        "gtk_dialog_add_button",
        constants$1503.gtk_dialog_add_button$FUNC
    );
    static final FunctionDescriptor gtk_dialog_add_buttons$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_dialog_add_buttons$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_dialog_add_buttons",
        constants$1503.gtk_dialog_add_buttons$FUNC
    );
    static final FunctionDescriptor gtk_dialog_set_response_sensitive$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_dialog_set_response_sensitive$MH = RuntimeHelper.downcallHandle(
        "gtk_dialog_set_response_sensitive",
        constants$1503.gtk_dialog_set_response_sensitive$FUNC
    );
    static final FunctionDescriptor gtk_dialog_set_default_response$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_dialog_set_default_response$MH = RuntimeHelper.downcallHandle(
        "gtk_dialog_set_default_response",
        constants$1503.gtk_dialog_set_default_response$FUNC
    );
    static final FunctionDescriptor gtk_dialog_get_widget_for_response$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_dialog_get_widget_for_response$MH = RuntimeHelper.downcallHandle(
        "gtk_dialog_get_widget_for_response",
        constants$1503.gtk_dialog_get_widget_for_response$FUNC
    );
    static final FunctionDescriptor gtk_dialog_get_response_for_widget$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_dialog_get_response_for_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_dialog_get_response_for_widget",
        constants$1503.gtk_dialog_get_response_for_widget$FUNC
    );
}


