// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1251 {

    static final FunctionDescriptor gdk_window_get_width$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_width$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_width",
        constants$1251.gdk_window_get_width$FUNC
    );
    static final FunctionDescriptor gdk_window_get_height$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_height$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_height",
        constants$1251.gdk_window_get_height$FUNC
    );
    static final FunctionDescriptor gdk_window_get_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_position$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_position",
        constants$1251.gdk_window_get_position$FUNC
    );
    static final FunctionDescriptor gdk_window_get_origin$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_origin$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_origin",
        constants$1251.gdk_window_get_origin$FUNC
    );
    static final FunctionDescriptor gdk_window_get_root_coords$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_root_coords$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_root_coords",
        constants$1251.gdk_window_get_root_coords$FUNC
    );
    static final FunctionDescriptor gdk_window_coords_to_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_coords_to_parent$MH = RuntimeHelper.downcallHandle(
        "gdk_window_coords_to_parent",
        constants$1251.gdk_window_coords_to_parent$FUNC
    );
}

