// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1116 {

    static final FunctionDescriptor pango_layout_get_width$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_width$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_width",
        constants$1116.pango_layout_get_width$FUNC
    );
    static final FunctionDescriptor pango_layout_set_height$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_height$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_height",
        constants$1116.pango_layout_set_height$FUNC
    );
    static final FunctionDescriptor pango_layout_get_height$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_height$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_height",
        constants$1116.pango_layout_get_height$FUNC
    );
    static final FunctionDescriptor pango_layout_set_wrap$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_wrap$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_wrap",
        constants$1116.pango_layout_set_wrap$FUNC
    );
    static final FunctionDescriptor pango_layout_get_wrap$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_wrap$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_wrap",
        constants$1116.pango_layout_get_wrap$FUNC
    );
    static final FunctionDescriptor pango_layout_is_wrapped$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_is_wrapped$MH = RuntimeHelper.downcallHandle(
        "pango_layout_is_wrapped",
        constants$1116.pango_layout_is_wrapped$FUNC
    );
}

