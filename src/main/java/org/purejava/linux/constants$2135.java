// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2135 {

    static final FunctionDescriptor gtk_hsv_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_hsv_new$MH = RuntimeHelper.downcallHandle(
        "gtk_hsv_new",
        constants$2135.gtk_hsv_new$FUNC
    );
    static final FunctionDescriptor gtk_hsv_set_color$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_hsv_set_color$MH = RuntimeHelper.downcallHandle(
        "gtk_hsv_set_color",
        constants$2135.gtk_hsv_set_color$FUNC
    );
    static final FunctionDescriptor gtk_hsv_get_color$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_hsv_get_color$MH = RuntimeHelper.downcallHandle(
        "gtk_hsv_get_color",
        constants$2135.gtk_hsv_get_color$FUNC
    );
    static final FunctionDescriptor gtk_hsv_set_metrics$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_hsv_set_metrics$MH = RuntimeHelper.downcallHandle(
        "gtk_hsv_set_metrics",
        constants$2135.gtk_hsv_set_metrics$FUNC
    );
    static final FunctionDescriptor gtk_hsv_get_metrics$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_hsv_get_metrics$MH = RuntimeHelper.downcallHandle(
        "gtk_hsv_get_metrics",
        constants$2135.gtk_hsv_get_metrics$FUNC
    );
    static final FunctionDescriptor gtk_hsv_is_adjusting$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_hsv_is_adjusting$MH = RuntimeHelper.downcallHandle(
        "gtk_hsv_is_adjusting",
        constants$2135.gtk_hsv_is_adjusting$FUNC
    );
}


