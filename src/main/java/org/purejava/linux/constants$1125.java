// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1125 {

    static final FunctionDescriptor pango_layout_line_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_line_ref$MH = RuntimeHelper.downcallHandle(
        "pango_layout_line_ref",
        constants$1125.pango_layout_line_ref$FUNC
    );
    static final FunctionDescriptor pango_layout_line_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_line_unref$MH = RuntimeHelper.downcallHandle(
        "pango_layout_line_unref",
        constants$1125.pango_layout_line_unref$FUNC
    );
    static final FunctionDescriptor pango_layout_line_get_start_index$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_line_get_start_index$MH = RuntimeHelper.downcallHandle(
        "pango_layout_line_get_start_index",
        constants$1125.pango_layout_line_get_start_index$FUNC
    );
    static final FunctionDescriptor pango_layout_line_get_length$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_line_get_length$MH = RuntimeHelper.downcallHandle(
        "pango_layout_line_get_length",
        constants$1125.pango_layout_line_get_length$FUNC
    );
    static final FunctionDescriptor pango_layout_line_is_paragraph_start$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_line_is_paragraph_start$MH = RuntimeHelper.downcallHandle(
        "pango_layout_line_is_paragraph_start",
        constants$1125.pango_layout_line_is_paragraph_start$FUNC
    );
    static final FunctionDescriptor pango_layout_line_get_resolved_direction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_line_get_resolved_direction$MH = RuntimeHelper.downcallHandle(
        "pango_layout_line_get_resolved_direction",
        constants$1125.pango_layout_line_get_resolved_direction$FUNC
    );
}

