// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1448 {

    static final FunctionDescriptor gtk_widget_get_clipboard$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_clipboard$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_clipboard",
        constants$1448.gtk_widget_get_clipboard$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_hexpand$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_hexpand$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_hexpand",
        constants$1448.gtk_widget_get_hexpand$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_hexpand$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_hexpand$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_hexpand",
        constants$1448.gtk_widget_set_hexpand$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_hexpand_set$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_hexpand_set$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_hexpand_set",
        constants$1448.gtk_widget_get_hexpand_set$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_hexpand_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_hexpand_set$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_hexpand_set",
        constants$1448.gtk_widget_set_hexpand_set$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_vexpand$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_vexpand$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_vexpand",
        constants$1448.gtk_widget_get_vexpand$FUNC
    );
}

