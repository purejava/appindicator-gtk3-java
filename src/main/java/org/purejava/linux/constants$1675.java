// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1675 {

    static final FunctionDescriptor gtk_combo_box_set_focus_on_click$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_combo_box_set_focus_on_click$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_set_focus_on_click",
        constants$1675.gtk_combo_box_set_focus_on_click$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_get_active$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_get_active$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_get_active",
        constants$1675.gtk_combo_box_get_active$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_set_active$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_combo_box_set_active$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_set_active",
        constants$1675.gtk_combo_box_set_active$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_get_active_iter$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_get_active_iter$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_get_active_iter",
        constants$1675.gtk_combo_box_get_active_iter$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_set_active_iter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_set_active_iter$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_set_active_iter",
        constants$1675.gtk_combo_box_set_active_iter$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_set_model$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_set_model$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_set_model",
        constants$1675.gtk_combo_box_set_model$FUNC
    );
}

