// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1117 {

    static final FunctionDescriptor pango_layout_set_indent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_indent$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_indent",
        constants$1117.pango_layout_set_indent$FUNC
    );
    static final FunctionDescriptor pango_layout_get_indent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_indent$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_indent",
        constants$1117.pango_layout_get_indent$FUNC
    );
    static final FunctionDescriptor pango_layout_set_spacing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_spacing$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_spacing",
        constants$1117.pango_layout_set_spacing$FUNC
    );
    static final FunctionDescriptor pango_layout_get_spacing$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_spacing$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_spacing",
        constants$1117.pango_layout_get_spacing$FUNC
    );
    static final FunctionDescriptor pango_layout_set_line_spacing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle pango_layout_set_line_spacing$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_line_spacing",
        constants$1117.pango_layout_set_line_spacing$FUNC
    );
    static final FunctionDescriptor pango_layout_get_line_spacing$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_line_spacing$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_line_spacing",
        constants$1117.pango_layout_get_line_spacing$FUNC
    );
}


