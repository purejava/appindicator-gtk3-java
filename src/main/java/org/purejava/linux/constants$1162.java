// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1162 {

    static final FunctionDescriptor cairo_arc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_arc$MH = RuntimeHelper.downcallHandle(
        "cairo_arc",
        constants$1162.cairo_arc$FUNC
    );
    static final FunctionDescriptor cairo_arc_negative$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_arc_negative$MH = RuntimeHelper.downcallHandle(
        "cairo_arc_negative",
        constants$1162.cairo_arc_negative$FUNC
    );
    static final FunctionDescriptor cairo_rel_move_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_rel_move_to$MH = RuntimeHelper.downcallHandle(
        "cairo_rel_move_to",
        constants$1162.cairo_rel_move_to$FUNC
    );
    static final FunctionDescriptor cairo_rel_line_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_rel_line_to$MH = RuntimeHelper.downcallHandle(
        "cairo_rel_line_to",
        constants$1162.cairo_rel_line_to$FUNC
    );
    static final FunctionDescriptor cairo_rel_curve_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_rel_curve_to$MH = RuntimeHelper.downcallHandle(
        "cairo_rel_curve_to",
        constants$1162.cairo_rel_curve_to$FUNC
    );
    static final FunctionDescriptor cairo_rectangle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_rectangle$MH = RuntimeHelper.downcallHandle(
        "cairo_rectangle",
        constants$1162.cairo_rectangle$FUNC
    );
}

