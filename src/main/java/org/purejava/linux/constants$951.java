// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$951 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$951() {}
    static final FunctionDescriptor pango_glyph_item_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_glyph_item_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_get_type",
        constants$951.pango_glyph_item_get_type$FUNC
    );
    static final FunctionDescriptor pango_glyph_item_split$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_glyph_item_split$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_split",
        constants$951.pango_glyph_item_split$FUNC
    );
    static final FunctionDescriptor pango_glyph_item_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_item_copy$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_copy",
        constants$951.pango_glyph_item_copy$FUNC
    );
    static final FunctionDescriptor pango_glyph_item_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_item_free$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_free",
        constants$951.pango_glyph_item_free$FUNC
    );
    static final FunctionDescriptor pango_glyph_item_apply_attrs$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_item_apply_attrs$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_apply_attrs",
        constants$951.pango_glyph_item_apply_attrs$FUNC
    );
    static final FunctionDescriptor pango_glyph_item_letter_space$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_glyph_item_letter_space$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_letter_space",
        constants$951.pango_glyph_item_letter_space$FUNC
    );
}


