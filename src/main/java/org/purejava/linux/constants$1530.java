// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1530 {

    static final FunctionDescriptor gtk_label_get_angle$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_angle$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_angle",
        constants$1530.gtk_label_get_angle$FUNC
    );
    static final FunctionDescriptor gtk_label_select_region$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_label_select_region$MH = RuntimeHelper.downcallHandle(
        "gtk_label_select_region",
        constants$1530.gtk_label_select_region$FUNC
    );
    static final FunctionDescriptor gtk_label_get_selection_bounds$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_selection_bounds$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_selection_bounds",
        constants$1530.gtk_label_get_selection_bounds$FUNC
    );
    static final FunctionDescriptor gtk_label_get_layout$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_layout$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_layout",
        constants$1530.gtk_label_get_layout$FUNC
    );
    static final FunctionDescriptor gtk_label_get_layout_offsets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_get_layout_offsets$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_layout_offsets",
        constants$1530.gtk_label_get_layout_offsets$FUNC
    );
    static final FunctionDescriptor gtk_label_set_single_line_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_label_set_single_line_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_label_set_single_line_mode",
        constants$1530.gtk_label_set_single_line_mode$FUNC
    );
}

