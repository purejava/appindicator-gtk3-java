// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1161 {

    static final FunctionDescriptor cairo_device_to_user_distance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_to_user_distance$MH = RuntimeHelper.downcallHandle(
        "cairo_device_to_user_distance",
        constants$1161.cairo_device_to_user_distance$FUNC
    );
    static final FunctionDescriptor cairo_new_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_new_path$MH = RuntimeHelper.downcallHandle(
        "cairo_new_path",
        constants$1161.cairo_new_path$FUNC
    );
    static final FunctionDescriptor cairo_move_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_move_to$MH = RuntimeHelper.downcallHandle(
        "cairo_move_to",
        constants$1161.cairo_move_to$FUNC
    );
    static final FunctionDescriptor cairo_new_sub_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_new_sub_path$MH = RuntimeHelper.downcallHandle(
        "cairo_new_sub_path",
        constants$1161.cairo_new_sub_path$FUNC
    );
    static final FunctionDescriptor cairo_line_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_line_to$MH = RuntimeHelper.downcallHandle(
        "cairo_line_to",
        constants$1161.cairo_line_to$FUNC
    );
    static final FunctionDescriptor cairo_curve_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_curve_to$MH = RuntimeHelper.downcallHandle(
        "cairo_curve_to",
        constants$1161.cairo_curve_to$FUNC
    );
}

