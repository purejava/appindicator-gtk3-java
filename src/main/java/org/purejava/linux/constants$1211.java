// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1211 {

    static final FunctionDescriptor cairo_region_num_rectangles$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_num_rectangles$MH = RuntimeHelper.downcallHandle(
        "cairo_region_num_rectangles",
        constants$1211.cairo_region_num_rectangles$FUNC
    );
    static final FunctionDescriptor cairo_region_get_rectangle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_get_rectangle$MH = RuntimeHelper.downcallHandle(
        "cairo_region_get_rectangle",
        constants$1211.cairo_region_get_rectangle$FUNC
    );
    static final FunctionDescriptor cairo_region_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_is_empty$MH = RuntimeHelper.downcallHandle(
        "cairo_region_is_empty",
        constants$1211.cairo_region_is_empty$FUNC
    );
    static final FunctionDescriptor cairo_region_contains_rectangle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_contains_rectangle$MH = RuntimeHelper.downcallHandle(
        "cairo_region_contains_rectangle",
        constants$1211.cairo_region_contains_rectangle$FUNC
    );
    static final FunctionDescriptor cairo_region_contains_point$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_region_contains_point$MH = RuntimeHelper.downcallHandle(
        "cairo_region_contains_point",
        constants$1211.cairo_region_contains_point$FUNC
    );
    static final FunctionDescriptor cairo_region_translate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_region_translate$MH = RuntimeHelper.downcallHandle(
        "cairo_region_translate",
        constants$1211.cairo_region_translate$FUNC
    );
}


