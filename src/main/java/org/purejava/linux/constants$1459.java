// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1459 {

    static final FunctionDescriptor gtk_widget_is_composited$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_is_composited$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_is_composited",
        constants$1459.gtk_widget_is_composited$FUNC
    );
    static final FunctionDescriptor gtk_widget_shape_combine_region$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_shape_combine_region$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_shape_combine_region",
        constants$1459.gtk_widget_shape_combine_region$FUNC
    );
    static final FunctionDescriptor gtk_widget_input_shape_combine_region$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_input_shape_combine_region$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_input_shape_combine_region",
        constants$1459.gtk_widget_input_shape_combine_region$FUNC
    );
    static final FunctionDescriptor gtk_widget_list_mnemonic_labels$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_list_mnemonic_labels$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_list_mnemonic_labels",
        constants$1459.gtk_widget_list_mnemonic_labels$FUNC
    );
    static final FunctionDescriptor gtk_widget_add_mnemonic_label$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_add_mnemonic_label$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_add_mnemonic_label",
        constants$1459.gtk_widget_add_mnemonic_label$FUNC
    );
    static final FunctionDescriptor gtk_widget_remove_mnemonic_label$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_remove_mnemonic_label$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_remove_mnemonic_label",
        constants$1459.gtk_widget_remove_mnemonic_label$FUNC
    );
}

