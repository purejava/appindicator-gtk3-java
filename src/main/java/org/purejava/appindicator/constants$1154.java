// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1154 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1154() {}
    static final FunctionDescriptor pango_cairo_glyph_string_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_cairo_glyph_string_path$MH = RuntimeHelper.downcallHandle(
        "pango_cairo_glyph_string_path",
        constants$1154.pango_cairo_glyph_string_path$FUNC
    );
    static final FunctionDescriptor pango_cairo_layout_line_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_cairo_layout_line_path$MH = RuntimeHelper.downcallHandle(
        "pango_cairo_layout_line_path",
        constants$1154.pango_cairo_layout_line_path$FUNC
    );
    static final FunctionDescriptor pango_cairo_layout_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_cairo_layout_path$MH = RuntimeHelper.downcallHandle(
        "pango_cairo_layout_path",
        constants$1154.pango_cairo_layout_path$FUNC
    );
    static final FunctionDescriptor pango_cairo_error_underline_path$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle pango_cairo_error_underline_path$MH = RuntimeHelper.downcallHandle(
        "pango_cairo_error_underline_path",
        constants$1154.pango_cairo_error_underline_path$FUNC
    );
    static final FunctionDescriptor gdk_cairo_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cairo_create$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_create",
        constants$1154.gdk_cairo_create$FUNC
    );
    static final FunctionDescriptor gdk_cairo_get_clip_rectangle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_cairo_get_clip_rectangle$MH = RuntimeHelper.downcallHandle(
        "gdk_cairo_get_clip_rectangle",
        constants$1154.gdk_cairo_get_clip_rectangle$FUNC
    );
}


