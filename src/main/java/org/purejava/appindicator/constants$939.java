// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$939 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$939() {}
    static final FunctionDescriptor pango_context_load_font$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_context_load_font$MH = RuntimeHelper.downcallHandle(
        "pango_context_load_font",
        constants$939.pango_context_load_font$FUNC
    );
    static final FunctionDescriptor pango_context_load_fontset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_context_load_fontset$MH = RuntimeHelper.downcallHandle(
        "pango_context_load_fontset",
        constants$939.pango_context_load_fontset$FUNC
    );
    static final FunctionDescriptor pango_context_get_metrics$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_context_get_metrics$MH = RuntimeHelper.downcallHandle(
        "pango_context_get_metrics",
        constants$939.pango_context_get_metrics$FUNC
    );
    static final FunctionDescriptor pango_context_set_font_description$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_context_set_font_description$MH = RuntimeHelper.downcallHandle(
        "pango_context_set_font_description",
        constants$939.pango_context_set_font_description$FUNC
    );
    static final FunctionDescriptor pango_context_get_font_description$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_context_get_font_description$MH = RuntimeHelper.downcallHandle(
        "pango_context_get_font_description",
        constants$939.pango_context_get_font_description$FUNC
    );
    static final FunctionDescriptor pango_context_get_language$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_context_get_language$MH = RuntimeHelper.downcallHandle(
        "pango_context_get_language",
        constants$939.pango_context_get_language$FUNC
    );
}


