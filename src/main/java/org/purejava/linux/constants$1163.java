// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1163 {

    static final FunctionDescriptor cairo_close_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_close_path$MH = RuntimeHelper.downcallHandle(
        "cairo_close_path",
        constants$1163.cairo_close_path$FUNC
    );
    static final FunctionDescriptor cairo_path_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_path_extents$MH = RuntimeHelper.downcallHandle(
        "cairo_path_extents",
        constants$1163.cairo_path_extents$FUNC
    );
    static final FunctionDescriptor cairo_paint$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_paint$MH = RuntimeHelper.downcallHandle(
        "cairo_paint",
        constants$1163.cairo_paint$FUNC
    );
    static final FunctionDescriptor cairo_paint_with_alpha$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_paint_with_alpha$MH = RuntimeHelper.downcallHandle(
        "cairo_paint_with_alpha",
        constants$1163.cairo_paint_with_alpha$FUNC
    );
    static final FunctionDescriptor cairo_mask$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_mask$MH = RuntimeHelper.downcallHandle(
        "cairo_mask",
        constants$1163.cairo_mask$FUNC
    );
    static final FunctionDescriptor cairo_mask_surface$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle cairo_mask_surface$MH = RuntimeHelper.downcallHandle(
        "cairo_mask_surface",
        constants$1163.cairo_mask_surface$FUNC
    );
}

