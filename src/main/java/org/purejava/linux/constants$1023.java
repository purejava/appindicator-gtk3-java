// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1023 {

    static final FunctionDescriptor hb_font_add_glyph_origin_for_direction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_add_glyph_origin_for_direction$MH = RuntimeHelper.downcallHandle(
        "hb_font_add_glyph_origin_for_direction",
        constants$1023.hb_font_add_glyph_origin_for_direction$FUNC
    );
    static final FunctionDescriptor hb_font_subtract_glyph_origin_for_direction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_subtract_glyph_origin_for_direction$MH = RuntimeHelper.downcallHandle(
        "hb_font_subtract_glyph_origin_for_direction",
        constants$1023.hb_font_subtract_glyph_origin_for_direction$FUNC
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
        constants$1023.hb_font_get_glyph_kerning_for_direction$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_extents_for_origin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_extents_for_origin$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_extents_for_origin",
        constants$1023.hb_font_get_glyph_extents_for_origin$FUNC
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
        constants$1023.hb_font_get_glyph_contour_point_for_origin$FUNC
    );
    static final FunctionDescriptor hb_font_glyph_to_string$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_glyph_to_string$MH = RuntimeHelper.downcallHandle(
        "hb_font_glyph_to_string",
        constants$1023.hb_font_glyph_to_string$FUNC
    );
}

