// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$957 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$957() {}
    static final FunctionDescriptor pango_layout_get_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_attributes$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_attributes",
        constants$957.pango_layout_get_attributes$FUNC
    );
    static final FunctionDescriptor pango_layout_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_text$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_text",
        constants$957.pango_layout_set_text$FUNC
    );
    static final FunctionDescriptor pango_layout_get_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_text$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_text",
        constants$957.pango_layout_get_text$FUNC
    );
    static final FunctionDescriptor pango_layout_get_character_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_character_count$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_character_count",
        constants$957.pango_layout_get_character_count$FUNC
    );
    static final FunctionDescriptor pango_layout_set_markup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_markup$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_markup",
        constants$957.pango_layout_set_markup$FUNC
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
        constants$957.pango_layout_set_markup_with_accel$FUNC
    );
}


