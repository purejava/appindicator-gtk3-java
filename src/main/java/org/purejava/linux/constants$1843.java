// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1843 {

    static final FunctionDescriptor gtk_icon_info_load_symbolic_for_context_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_info_load_symbolic_for_context_async$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_info_load_symbolic_for_context_async",
        constants$1843.gtk_icon_info_load_symbolic_for_context_async$FUNC
    );
    static final FunctionDescriptor gtk_icon_info_load_symbolic_for_context_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_info_load_symbolic_for_context_finish$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_info_load_symbolic_for_context_finish",
        constants$1843.gtk_icon_info_load_symbolic_for_context_finish$FUNC
    );
    static final FunctionDescriptor gtk_icon_info_load_symbolic_for_style$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_info_load_symbolic_for_style$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_info_load_symbolic_for_style",
        constants$1843.gtk_icon_info_load_symbolic_for_style$FUNC
    );
    static final FunctionDescriptor gtk_icon_info_set_raw_coordinates$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_icon_info_set_raw_coordinates$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_info_set_raw_coordinates",
        constants$1843.gtk_icon_info_set_raw_coordinates$FUNC
    );
    static final FunctionDescriptor gtk_icon_info_get_embedded_rect$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_info_get_embedded_rect$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_info_get_embedded_rect",
        constants$1843.gtk_icon_info_get_embedded_rect$FUNC
    );
    static final FunctionDescriptor gtk_icon_info_get_attach_points$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_icon_info_get_attach_points$MH = RuntimeHelper.downcallHandle(
        "gtk_icon_info_get_attach_points",
        constants$1843.gtk_icon_info_get_attach_points$FUNC
    );
}

