// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$936 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$936() {}
    static final FunctionDescriptor pango_fontset_get_font$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_fontset_get_font$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_get_font",
        constants$936.pango_fontset_get_font$FUNC
    );
    static final FunctionDescriptor pango_fontset_get_metrics$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_fontset_get_metrics$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_get_metrics",
        constants$936.pango_fontset_get_metrics$FUNC
    );
    static final FunctionDescriptor pango_fontset_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_fontset_foreach$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_foreach",
        constants$936.pango_fontset_foreach$FUNC
    );
    static final FunctionDescriptor pango_font_map_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_font_map_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_font_map_get_type",
        constants$936.pango_font_map_get_type$FUNC
    );
    static final FunctionDescriptor pango_font_map_create_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_map_create_context$MH = RuntimeHelper.downcallHandle(
        "pango_font_map_create_context",
        constants$936.pango_font_map_create_context$FUNC
    );
    static final FunctionDescriptor pango_font_map_load_font$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_map_load_font$MH = RuntimeHelper.downcallHandle(
        "pango_font_map_load_font",
        constants$936.pango_font_map_load_font$FUNC
    );
}


