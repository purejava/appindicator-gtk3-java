// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1020 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1020() {}
    static final FunctionDescriptor cairo_user_scaled_font_text_to_glyphs_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor cairo_user_scaled_font_text_to_glyphs_func_t_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_user_scaled_font_text_to_glyphs_func_t_UP$MH = RuntimeHelper.upcallHandle(cairo_user_scaled_font_text_to_glyphs_func_t.class, "apply", constants$1020.cairo_user_scaled_font_text_to_glyphs_func_t_UP$FUNC);
    static final FunctionDescriptor cairo_user_scaled_font_text_to_glyphs_func_t_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_user_scaled_font_text_to_glyphs_func_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1020.cairo_user_scaled_font_text_to_glyphs_func_t_DOWN$FUNC
    );
    static final FunctionDescriptor cairo_user_scaled_font_unicode_to_glyph_func_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor cairo_user_scaled_font_unicode_to_glyph_func_t_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_user_scaled_font_unicode_to_glyph_func_t_UP$MH = RuntimeHelper.upcallHandle(cairo_user_scaled_font_unicode_to_glyph_func_t.class, "apply", constants$1020.cairo_user_scaled_font_unicode_to_glyph_func_t_UP$FUNC);
    static final FunctionDescriptor cairo_user_scaled_font_unicode_to_glyph_func_t_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_user_scaled_font_unicode_to_glyph_func_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1020.cairo_user_scaled_font_unicode_to_glyph_func_t_DOWN$FUNC
    );
    static final FunctionDescriptor cairo_user_font_face_set_init_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_user_font_face_set_init_func$MH = RuntimeHelper.downcallHandle(
        "cairo_user_font_face_set_init_func",
        constants$1020.cairo_user_font_face_set_init_func$FUNC
    );
    static final FunctionDescriptor cairo_user_font_face_set_render_glyph_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_user_font_face_set_render_glyph_func$MH = RuntimeHelper.downcallHandle(
        "cairo_user_font_face_set_render_glyph_func",
        constants$1020.cairo_user_font_face_set_render_glyph_func$FUNC
    );
}


