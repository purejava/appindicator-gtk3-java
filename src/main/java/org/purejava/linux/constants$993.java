// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$993 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$993() {}
    static final FunctionDescriptor pango_parse_style$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_parse_style$MH = RuntimeHelper.downcallHandle(
        "pango_parse_style",
        constants$993.pango_parse_style$FUNC
    );
    static final FunctionDescriptor pango_parse_variant$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_parse_variant$MH = RuntimeHelper.downcallHandle(
        "pango_parse_variant",
        constants$993.pango_parse_variant$FUNC
    );
    static final FunctionDescriptor pango_parse_weight$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_parse_weight$MH = RuntimeHelper.downcallHandle(
        "pango_parse_weight",
        constants$993.pango_parse_weight$FUNC
    );
    static final FunctionDescriptor pango_parse_stretch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_parse_stretch$MH = RuntimeHelper.downcallHandle(
        "pango_parse_stretch",
        constants$993.pango_parse_stretch$FUNC
    );
    static final FunctionDescriptor pango_quantize_line_geometry$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_quantize_line_geometry$MH = RuntimeHelper.downcallHandle(
        "pango_quantize_line_geometry",
        constants$993.pango_quantize_line_geometry$FUNC
    );
    static final FunctionDescriptor pango_log2vis_get_embedding_levels$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_log2vis_get_embedding_levels$MH = RuntimeHelper.downcallHandle(
        "pango_log2vis_get_embedding_levels",
        constants$993.pango_log2vis_get_embedding_levels$FUNC
    );
}


