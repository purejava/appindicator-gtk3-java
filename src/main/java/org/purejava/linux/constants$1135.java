// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1135 {

    static final FunctionDescriptor pango_renderer_set_color$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_renderer_set_color$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_set_color",
        constants$1135.pango_renderer_set_color$FUNC
    );
    static final FunctionDescriptor pango_renderer_get_color$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_get_color$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_get_color",
        constants$1135.pango_renderer_get_color$FUNC
    );
    static final FunctionDescriptor pango_renderer_set_alpha$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle pango_renderer_set_alpha$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_set_alpha",
        constants$1135.pango_renderer_set_alpha$FUNC
    );
    static final FunctionDescriptor pango_renderer_get_alpha$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_renderer_get_alpha$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_get_alpha",
        constants$1135.pango_renderer_get_alpha$FUNC
    );
    static final FunctionDescriptor pango_renderer_set_matrix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_renderer_set_matrix$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_set_matrix",
        constants$1135.pango_renderer_set_matrix$FUNC
    );
    static final FunctionDescriptor pango_renderer_get_matrix$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_renderer_get_matrix$MH = RuntimeHelper.downcallHandle(
        "pango_renderer_get_matrix",
        constants$1135.pango_renderer_get_matrix$FUNC
    );
}

