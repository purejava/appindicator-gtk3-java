// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1133 {

    static final FunctionDescriptor pango_renderer_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_renderer_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_get_type",
        constants$1133.pango_renderer_get_type$FUNC
    );
    static final FunctionDescriptor pango_renderer_draw_layout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_draw_layout$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_layout",
        constants$1133.pango_renderer_draw_layout$FUNC
    );
    static final FunctionDescriptor pango_renderer_draw_layout_line$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_draw_layout_line$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_layout_line",
        constants$1133.pango_renderer_draw_layout_line$FUNC
    );
    static final FunctionDescriptor pango_renderer_draw_glyphs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_draw_glyphs$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_glyphs",
        constants$1133.pango_renderer_draw_glyphs$FUNC
    );
    static final FunctionDescriptor pango_renderer_draw_glyph_item$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_draw_glyph_item$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_glyph_item",
        constants$1133.pango_renderer_draw_glyph_item$FUNC
    );
    static final FunctionDescriptor pango_renderer_draw_rectangle$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_draw_rectangle$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_draw_rectangle",
        constants$1133.pango_renderer_draw_rectangle$FUNC
    );
}

