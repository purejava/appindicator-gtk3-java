// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$872 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$872() {}
    static final FunctionDescriptor hb_font_subtract_glyph_origin_for_direction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_subtract_glyph_origin_for_direction$MH = RuntimeHelper.downcallHandle(
        "hb_font_subtract_glyph_origin_for_direction",
        constants$872.hb_font_subtract_glyph_origin_for_direction$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_kerning_for_direction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_kerning_for_direction$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_kerning_for_direction",
        constants$872.hb_font_get_glyph_kerning_for_direction$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_extents_for_origin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_extents_for_origin$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_extents_for_origin",
        constants$872.hb_font_get_glyph_extents_for_origin$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_contour_point_for_origin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_contour_point_for_origin$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_contour_point_for_origin",
        constants$872.hb_font_get_glyph_contour_point_for_origin$FUNC
    );
    static final FunctionDescriptor hb_font_glyph_to_string$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_glyph_to_string$MH = RuntimeHelper.downcallHandle(
        "hb_font_glyph_to_string",
        constants$872.hb_font_glyph_to_string$FUNC
    );
    static final FunctionDescriptor hb_font_glyph_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_glyph_from_string$MH = RuntimeHelper.downcallHandle(
        "hb_font_glyph_from_string",
        constants$872.hb_font_glyph_from_string$FUNC
    );
}


