// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$911 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$911() {}
    static final FunctionDescriptor pango_font_description_merge$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_font_description_merge$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_merge",
        constants$911.pango_font_description_merge$FUNC
    );
    static final FunctionDescriptor pango_font_description_merge_static$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_font_description_merge_static$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_merge_static",
        constants$911.pango_font_description_merge_static$FUNC
    );
    static final FunctionDescriptor pango_font_description_better_match$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_better_match$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_better_match",
        constants$911.pango_font_description_better_match$FUNC
    );
    static final FunctionDescriptor pango_font_description_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_from_string$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_from_string",
        constants$911.pango_font_description_from_string$FUNC
    );
    static final FunctionDescriptor pango_font_description_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_to_string$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_to_string",
        constants$911.pango_font_description_to_string$FUNC
    );
    static final FunctionDescriptor pango_font_description_to_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_to_filename$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_to_filename",
        constants$911.pango_font_description_to_filename$FUNC
    );
}


