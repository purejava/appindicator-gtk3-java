// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1209 {

    static final FunctionDescriptor cairo_matrix_multiply$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_matrix_multiply$MH = RuntimeHelper.downcallHandle(
        "cairo_matrix_multiply",
        constants$1209.cairo_matrix_multiply$FUNC
    );
    static final FunctionDescriptor cairo_matrix_transform_distance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_matrix_transform_distance$MH = RuntimeHelper.downcallHandle(
        "cairo_matrix_transform_distance",
        constants$1209.cairo_matrix_transform_distance$FUNC
    );
    static final FunctionDescriptor cairo_matrix_transform_point$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_matrix_transform_point$MH = RuntimeHelper.downcallHandle(
        "cairo_matrix_transform_point",
        constants$1209.cairo_matrix_transform_point$FUNC
    );
    static final FunctionDescriptor cairo_region_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle cairo_region_create$MH = RuntimeHelper.downcallHandle(
        "cairo_region_create",
        constants$1209.cairo_region_create$FUNC
    );
    static final FunctionDescriptor cairo_region_create_rectangle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_create_rectangle$MH = RuntimeHelper.downcallHandle(
        "cairo_region_create_rectangle",
        constants$1209.cairo_region_create_rectangle$FUNC
    );
    static final FunctionDescriptor cairo_region_create_rectangles$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_region_create_rectangles$MH = RuntimeHelper.downcallHandle(
        "cairo_region_create_rectangles",
        constants$1209.cairo_region_create_rectangles$FUNC
    );
}

