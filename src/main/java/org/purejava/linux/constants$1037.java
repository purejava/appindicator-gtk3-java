// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1037 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1037() {}
    static final FunctionDescriptor cairo_image_surface_get_width$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_image_surface_get_width$MH = RuntimeHelper.downcallHandle(
        "cairo_image_surface_get_width",
        constants$1037.cairo_image_surface_get_width$FUNC
    );
    static final FunctionDescriptor cairo_image_surface_get_height$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_image_surface_get_height$MH = RuntimeHelper.downcallHandle(
        "cairo_image_surface_get_height",
        constants$1037.cairo_image_surface_get_height$FUNC
    );
    static final FunctionDescriptor cairo_image_surface_get_stride$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_image_surface_get_stride$MH = RuntimeHelper.downcallHandle(
        "cairo_image_surface_get_stride",
        constants$1037.cairo_image_surface_get_stride$FUNC
    );
    static final FunctionDescriptor cairo_image_surface_create_from_png$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_image_surface_create_from_png$MH = RuntimeHelper.downcallHandle(
        "cairo_image_surface_create_from_png",
        constants$1037.cairo_image_surface_create_from_png$FUNC
    );
    static final FunctionDescriptor cairo_image_surface_create_from_png_stream$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_image_surface_create_from_png_stream$MH = RuntimeHelper.downcallHandle(
        "cairo_image_surface_create_from_png_stream",
        constants$1037.cairo_image_surface_create_from_png_stream$FUNC
    );
    static final FunctionDescriptor cairo_recording_surface_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_recording_surface_create$MH = RuntimeHelper.downcallHandle(
        "cairo_recording_surface_create",
        constants$1037.cairo_recording_surface_create$FUNC
    );
}


