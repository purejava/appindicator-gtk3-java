// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1114 {

    static final FunctionDescriptor pango_layout_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_copy$MH = RuntimeHelper.downcallHandle(
        "pango_layout_copy",
        constants$1114.pango_layout_copy$FUNC
    );
    static final FunctionDescriptor pango_layout_get_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_context$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_context",
        constants$1114.pango_layout_get_context$FUNC
    );
    static final FunctionDescriptor pango_layout_set_attributes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_set_attributes$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_attributes",
        constants$1114.pango_layout_set_attributes$FUNC
    );
    static final FunctionDescriptor pango_layout_get_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_attributes$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_attributes",
        constants$1114.pango_layout_get_attributes$FUNC
    );
    static final FunctionDescriptor pango_layout_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_layout_set_text$MH = RuntimeHelper.downcallHandle(
        "pango_layout_set_text",
        constants$1114.pango_layout_set_text$FUNC
    );
    static final FunctionDescriptor pango_layout_get_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_layout_get_text$MH = RuntimeHelper.downcallHandle(
        "pango_layout_get_text",
        constants$1114.pango_layout_get_text$FUNC
    );
}


