// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$868 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$868() {}
    static final FunctionDescriptor hb_font_funcs_set_glyph_shape_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_funcs_set_glyph_shape_func$MH = RuntimeHelper.downcallHandle(
        "hb_font_funcs_set_glyph_shape_func",
        constants$868.hb_font_funcs_set_glyph_shape_func$FUNC
    );
    static final FunctionDescriptor hb_font_get_h_extents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_h_extents$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_h_extents",
        constants$868.hb_font_get_h_extents$FUNC
    );
    static final FunctionDescriptor hb_font_get_v_extents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_v_extents$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_v_extents",
        constants$868.hb_font_get_v_extents$FUNC
    );
    static final FunctionDescriptor hb_font_get_nominal_glyph$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_nominal_glyph$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_nominal_glyph",
        constants$868.hb_font_get_nominal_glyph$FUNC
    );
    static final FunctionDescriptor hb_font_get_variation_glyph$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_variation_glyph$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_variation_glyph",
        constants$868.hb_font_get_variation_glyph$FUNC
    );
    static final FunctionDescriptor hb_font_get_nominal_glyphs$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_get_nominal_glyphs$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_nominal_glyphs",
        constants$868.hb_font_get_nominal_glyphs$FUNC
    );
}

