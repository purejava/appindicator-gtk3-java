// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1319 {

    static final FunctionDescriptor gdk_cairo_region$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cairo_region$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_region",
        constants$1319.gdk_cairo_region$FUNC
    );
    static final FunctionDescriptor gdk_cairo_region_create_from_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cairo_region_create_from_surface$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_region_create_from_surface",
        constants$1319.gdk_cairo_region_create_from_surface$FUNC
    );
    static final FunctionDescriptor gdk_cairo_set_source_color$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cairo_set_source_color$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_set_source_color",
        constants$1319.gdk_cairo_set_source_color$FUNC
    );
    static final FunctionDescriptor gdk_cairo_surface_create_from_pixbuf$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cairo_surface_create_from_pixbuf$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_surface_create_from_pixbuf",
        constants$1319.gdk_cairo_surface_create_from_pixbuf$FUNC
    );
    static final FunctionDescriptor gdk_cairo_draw_from_gl$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_cairo_draw_from_gl$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_draw_from_gl",
        constants$1319.gdk_cairo_draw_from_gl$FUNC
    );
    static final FunctionDescriptor gdk_cairo_get_drawing_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cairo_get_drawing_context$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_get_drawing_context",
        constants$1319.gdk_cairo_get_drawing_context$FUNC
    );
}

