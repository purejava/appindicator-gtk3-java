// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1500 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1500() {}
    static final FunctionDescriptor gtk_button_box_set_layout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_button_box_set_layout$MH = RuntimeHelper.downcallHandle(
        "gtk_button_box_set_layout",
        constants$1500.gtk_button_box_set_layout$FUNC
    );
    static final FunctionDescriptor gtk_button_box_get_child_secondary$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_button_box_get_child_secondary$MH = RuntimeHelper.downcallHandle(
        "gtk_button_box_get_child_secondary",
        constants$1500.gtk_button_box_get_child_secondary$FUNC
    );
    static final FunctionDescriptor gtk_button_box_set_child_secondary$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_button_box_set_child_secondary$MH = RuntimeHelper.downcallHandle(
        "gtk_button_box_set_child_secondary",
        constants$1500.gtk_button_box_set_child_secondary$FUNC
    );
    static final FunctionDescriptor gtk_button_box_get_child_non_homogeneous$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_button_box_get_child_non_homogeneous$MH = RuntimeHelper.downcallHandle(
        "gtk_button_box_get_child_non_homogeneous",
        constants$1500.gtk_button_box_get_child_non_homogeneous$FUNC
    );
    static final FunctionDescriptor gtk_button_box_set_child_non_homogeneous$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_button_box_set_child_non_homogeneous$MH = RuntimeHelper.downcallHandle(
        "gtk_button_box_set_child_non_homogeneous",
        constants$1500.gtk_button_box_set_child_non_homogeneous$FUNC
    );
    static final FunctionDescriptor gtk_binding_set_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_binding_set_new$MH = RuntimeHelper.downcallHandle(
        "gtk_binding_set_new",
        constants$1500.gtk_binding_set_new$FUNC
    );
}


