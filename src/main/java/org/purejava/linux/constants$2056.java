// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2056 {

    static final FunctionDescriptor gtk_tool_palette_unset_icon_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_unset_icon_size$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_unset_icon_size",
        constants$2056.gtk_tool_palette_unset_icon_size$FUNC
    );
    static final FunctionDescriptor gtk_tool_palette_set_style$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_set_style$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_set_style",
        constants$2056.gtk_tool_palette_set_style$FUNC
    );
    static final FunctionDescriptor gtk_tool_palette_unset_style$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_unset_style$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_unset_style",
        constants$2056.gtk_tool_palette_unset_style$FUNC
    );
    static final FunctionDescriptor gtk_tool_palette_get_icon_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_get_icon_size$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_get_icon_size",
        constants$2056.gtk_tool_palette_get_icon_size$FUNC
    );
    static final FunctionDescriptor gtk_tool_palette_get_style$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_get_style$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_get_style",
        constants$2056.gtk_tool_palette_get_style$FUNC
    );
    static final FunctionDescriptor gtk_tool_palette_get_drop_item$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tool_palette_get_drop_item$MH = RuntimeHelper.downcallHandle(
        "gtk_tool_palette_get_drop_item",
        constants$2056.gtk_tool_palette_get_drop_item$FUNC
    );
}


