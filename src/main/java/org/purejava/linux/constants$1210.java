// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1210 {

    static final FunctionDescriptor cairo_region_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_copy$MH = RuntimeHelper.downcallHandle(
        "cairo_region_copy",
        constants$1210.cairo_region_copy$FUNC
    );
    static final FunctionDescriptor cairo_region_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_reference$MH = RuntimeHelper.downcallHandle(
        "cairo_region_reference",
        constants$1210.cairo_region_reference$FUNC
    );
    static final FunctionDescriptor cairo_region_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_region_destroy",
        constants$1210.cairo_region_destroy$FUNC
    );
    static final FunctionDescriptor cairo_region_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_equal$MH = RuntimeHelper.downcallHandle(
        "cairo_region_equal",
        constants$1210.cairo_region_equal$FUNC
    );
    static final FunctionDescriptor cairo_region_status$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_status$MH = RuntimeHelper.downcallHandle(
        "cairo_region_status",
        constants$1210.cairo_region_status$FUNC
    );
    static final FunctionDescriptor cairo_region_get_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_region_get_extents$MH = RuntimeHelper.downcallHandle(
        "cairo_region_get_extents",
        constants$1210.cairo_region_get_extents$FUNC
    );
}

