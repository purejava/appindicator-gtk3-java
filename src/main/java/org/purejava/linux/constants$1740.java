// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1740 {

    static final FunctionDescriptor gtk_color_chooser_widget_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_color_chooser_widget_new$MH = RuntimeHelper.downcallHandle(
        "gtk_color_chooser_widget_new",
        constants$1740.gtk_color_chooser_widget_new$FUNC
    );
    static final FunctionDescriptor gtk_hsv_to_rgb$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_hsv_to_rgb$MH = RuntimeHelper.downcallHandle(
        "gtk_hsv_to_rgb",
        constants$1740.gtk_hsv_to_rgb$FUNC
    );
    static final FunctionDescriptor gtk_rgb_to_hsv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_rgb_to_hsv$MH = RuntimeHelper.downcallHandle(
        "gtk_rgb_to_hsv",
        constants$1740.gtk_rgb_to_hsv$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_text_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_combo_box_text_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_get_type",
        constants$1740.gtk_combo_box_text_get_type$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_text_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_combo_box_text_new$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_new",
        constants$1740.gtk_combo_box_text_new$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_text_new_with_entry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_combo_box_text_new_with_entry$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_new_with_entry",
        constants$1740.gtk_combo_box_text_new_with_entry$FUNC
    );
}


