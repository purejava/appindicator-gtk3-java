// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$878 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$878() {}
    static final FunctionDescriptor hb_font_set_var_named_instance$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_set_var_named_instance$MH = RuntimeHelper.downcallHandle(
        "hb_font_set_var_named_instance",
        constants$878.hb_font_set_var_named_instance$FUNC
    );
    static final FunctionDescriptor hb_glyph_info_get_glyph_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_glyph_info_get_glyph_flags$MH = RuntimeHelper.downcallHandle(
        "hb_glyph_info_get_glyph_flags",
        constants$878.hb_glyph_info_get_glyph_flags$FUNC
    );
    static final FunctionDescriptor hb_segment_properties_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_segment_properties_equal$MH = RuntimeHelper.downcallHandle(
        "hb_segment_properties_equal",
        constants$878.hb_segment_properties_equal$FUNC
    );
    static final FunctionDescriptor hb_segment_properties_hash$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_segment_properties_hash$MH = RuntimeHelper.downcallHandle(
        "hb_segment_properties_hash",
        constants$878.hb_segment_properties_hash$FUNC
    );
    static final FunctionDescriptor hb_segment_properties_overlay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_segment_properties_overlay$MH = RuntimeHelper.downcallHandle(
        "hb_segment_properties_overlay",
        constants$878.hb_segment_properties_overlay$FUNC
    );
    static final FunctionDescriptor hb_buffer_create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle hb_buffer_create$MH = RuntimeHelper.downcallHandle(
        "hb_buffer_create",
        constants$878.hb_buffer_create$FUNC
    );
}


