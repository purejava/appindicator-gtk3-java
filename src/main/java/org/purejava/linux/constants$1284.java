// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1284 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1284() {}
    static final FunctionDescriptor gtk_requisition_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_requisition_free$MH = RuntimeHelper.downcallHandle(
        "gtk_requisition_free",
        constants$1284.gtk_requisition_free$FUNC
    );
    static final FunctionDescriptor gtk_widget_in_destruction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_in_destruction$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_in_destruction",
        constants$1284.gtk_widget_in_destruction$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_style_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_style_context$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_style_context",
        constants$1284.gtk_widget_get_style_context$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_path$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_path",
        constants$1284.gtk_widget_get_path$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_set_css_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_set_css_name$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_set_css_name",
        constants$1284.gtk_widget_class_set_css_name$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_get_css_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_class_get_css_name$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_get_css_name",
        constants$1284.gtk_widget_class_get_css_name$FUNC
    );
}


