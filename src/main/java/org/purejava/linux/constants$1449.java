// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1449 {

    static final FunctionDescriptor gtk_widget_set_vexpand$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_vexpand$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_vexpand",
        constants$1449.gtk_widget_set_vexpand$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_vexpand_set$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_vexpand_set$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_vexpand_set",
        constants$1449.gtk_widget_get_vexpand_set$FUNC
    );
    static final FunctionDescriptor gtk_widget_set_vexpand_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_set_vexpand_set$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_set_vexpand_set",
        constants$1449.gtk_widget_set_vexpand_set$FUNC
    );
    static final FunctionDescriptor gtk_widget_queue_compute_expand$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_queue_compute_expand$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_queue_compute_expand",
        constants$1449.gtk_widget_queue_compute_expand$FUNC
    );
    static final FunctionDescriptor gtk_widget_compute_expand$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_compute_expand$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_compute_expand",
        constants$1449.gtk_widget_compute_expand$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_support_multidevice$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_support_multidevice$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_support_multidevice",
        constants$1449.gtk_widget_get_support_multidevice$FUNC
    );
}

