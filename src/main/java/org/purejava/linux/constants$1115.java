// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1115 {

    static final FunctionDescriptor pango_layout_get_character_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_character_count$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_character_count",
        constants$1115.pango_layout_get_character_count$FUNC
    );
    static final FunctionDescriptor pango_layout_set_markup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_markup$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_markup",
        constants$1115.pango_layout_set_markup$FUNC
    );
    static final FunctionDescriptor pango_layout_set_markup_with_accel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_set_markup_with_accel$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_markup_with_accel",
        constants$1115.pango_layout_set_markup_with_accel$FUNC
    );
    static final FunctionDescriptor pango_layout_set_font_description$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_set_font_description$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_font_description",
        constants$1115.pango_layout_set_font_description$FUNC
    );
    static final FunctionDescriptor pango_layout_get_font_description$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_font_description$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_font_description",
        constants$1115.pango_layout_get_font_description$FUNC
    );
    static final FunctionDescriptor pango_layout_set_width$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_width$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_width",
        constants$1115.pango_layout_set_width$FUNC
    );
}


