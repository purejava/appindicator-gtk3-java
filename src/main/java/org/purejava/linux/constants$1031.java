// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1031 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1031() {}
    static final FunctionDescriptor cairo_device_observer_fill_elapsed$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_observer_fill_elapsed$MH = RuntimeHelper.downcallHandle(
        "cairo_device_observer_fill_elapsed",
        constants$1031.cairo_device_observer_fill_elapsed$FUNC
    );
    static final FunctionDescriptor cairo_device_observer_stroke_elapsed$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_observer_stroke_elapsed$MH = RuntimeHelper.downcallHandle(
        "cairo_device_observer_stroke_elapsed",
        constants$1031.cairo_device_observer_stroke_elapsed$FUNC
    );
    static final FunctionDescriptor cairo_device_observer_glyphs_elapsed$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_device_observer_glyphs_elapsed$MH = RuntimeHelper.downcallHandle(
        "cairo_device_observer_glyphs_elapsed",
        constants$1031.cairo_device_observer_glyphs_elapsed$FUNC
    );
    static final FunctionDescriptor cairo_surface_reference$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_surface_reference$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_reference",
        constants$1031.cairo_surface_reference$FUNC
    );
    static final FunctionDescriptor cairo_surface_finish$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_surface_finish$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_finish",
        constants$1031.cairo_surface_finish$FUNC
    );
    static final FunctionDescriptor cairo_surface_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_surface_destroy$MH = RuntimeHelper.downcallHandle(
        "cairo_surface_destroy",
        constants$1031.cairo_surface_destroy$FUNC
    );
}


