// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$965 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$965() {}
    static final FunctionDescriptor pango_layout_get_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_extents$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_extents",
        constants$965.pango_layout_get_extents$FUNC
    );
    static final FunctionDescriptor pango_layout_get_pixel_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_pixel_extents$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_pixel_extents",
        constants$965.pango_layout_get_pixel_extents$FUNC
    );
    static final FunctionDescriptor pango_layout_get_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_size$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_size",
        constants$965.pango_layout_get_size$FUNC
    );
    static final FunctionDescriptor pango_layout_get_pixel_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_pixel_size$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_pixel_size",
        constants$965.pango_layout_get_pixel_size$FUNC
    );
    static final FunctionDescriptor pango_layout_get_baseline$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_baseline$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_baseline",
        constants$965.pango_layout_get_baseline$FUNC
    );
    static final FunctionDescriptor pango_layout_get_line_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_line_count$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_line_count",
        constants$965.pango_layout_get_line_count$FUNC
    );
}

