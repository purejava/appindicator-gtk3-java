// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1460 {

    static final FunctionDescriptor gtk_widget_set_tooltip_window$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_set_tooltip_window$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_tooltip_window",
        constants$1460.gtk_widget_set_tooltip_window$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_tooltip_window$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_tooltip_window$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_tooltip_window",
        constants$1460.gtk_widget_get_tooltip_window$FUNC
    );
    static final FunctionDescriptor gtk_widget_trigger_tooltip_query$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_trigger_tooltip_query$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_trigger_tooltip_query",
        constants$1460.gtk_widget_trigger_tooltip_query$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_tooltip_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_set_tooltip_text$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_tooltip_text",
        constants$1460.gtk_widget_set_tooltip_text$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_tooltip_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_tooltip_text$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_tooltip_text",
        constants$1460.gtk_widget_get_tooltip_text$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_tooltip_markup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_set_tooltip_markup$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_tooltip_markup",
        constants$1460.gtk_widget_set_tooltip_markup$FUNC
    );
}

