// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1436 {

    static final FunctionDescriptor gtk_widget_set_receives_default$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_receives_default$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_receives_default",
        constants$1436.gtk_widget_set_receives_default$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_receives_default$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_receives_default$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_receives_default",
        constants$1436.gtk_widget_get_receives_default$FUNC
    );
    static final FunctionDescriptor gtk_widget_has_grab$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_has_grab$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_has_grab",
        constants$1436.gtk_widget_has_grab$FUNC
    );
    static final FunctionDescriptor gtk_widget_device_is_shadowed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_device_is_shadowed$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_device_is_shadowed",
        constants$1436.gtk_widget_device_is_shadowed$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_set_name$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_name",
        constants$1436.gtk_widget_set_name$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_name$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_name",
        constants$1436.gtk_widget_get_name$FUNC
    );
}


