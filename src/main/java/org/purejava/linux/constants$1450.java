// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1450 {

    static final FunctionDescriptor gtk_widget_set_support_multidevice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_support_multidevice$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_support_multidevice",
        constants$1450.gtk_widget_set_support_multidevice$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_set_accessible_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle gtk_widget_class_set_accessible_type$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_set_accessible_type",
        constants$1450.gtk_widget_class_set_accessible_type$FUNC
    );
    static final FunctionDescriptor gtk_widget_class_set_accessible_role$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_class_set_accessible_role$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_class_set_accessible_role",
        constants$1450.gtk_widget_class_set_accessible_role$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_accessible$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_accessible$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_accessible",
        constants$1450.gtk_widget_get_accessible$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_halign$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_halign$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_halign",
        constants$1450.gtk_widget_get_halign$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_halign$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_halign$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_halign",
        constants$1450.gtk_widget_set_halign$FUNC
    );
}


