// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1010 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1010() {}
    static final FunctionDescriptor cairo_font_options_get_antialias$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_get_antialias$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_get_antialias",
        constants$1010.cairo_font_options_get_antialias$FUNC
    );
    static final FunctionDescriptor cairo_font_options_set_subpixel_order$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_font_options_set_subpixel_order$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_set_subpixel_order",
        constants$1010.cairo_font_options_set_subpixel_order$FUNC
    );
    static final FunctionDescriptor cairo_font_options_get_subpixel_order$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_get_subpixel_order$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_get_subpixel_order",
        constants$1010.cairo_font_options_get_subpixel_order$FUNC
    );
    static final FunctionDescriptor cairo_font_options_set_hint_style$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_font_options_set_hint_style$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_set_hint_style",
        constants$1010.cairo_font_options_set_hint_style$FUNC
    );
    static final FunctionDescriptor cairo_font_options_get_hint_style$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle cairo_font_options_get_hint_style$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_get_hint_style",
        constants$1010.cairo_font_options_get_hint_style$FUNC
    );
    static final FunctionDescriptor cairo_font_options_set_hint_metrics$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cairo_font_options_set_hint_metrics$MH = RuntimeHelper.downcallHandle(
        "cairo_font_options_set_hint_metrics",
        constants$1010.cairo_font_options_set_hint_metrics$FUNC
    );
}


