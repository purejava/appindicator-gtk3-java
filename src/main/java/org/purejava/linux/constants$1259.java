// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1259 {

    static final FunctionDescriptor gdk_window_set_keep_below$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_keep_below$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_keep_below",
        constants$1259.gdk_window_set_keep_below$FUNC
    );
    static final FunctionDescriptor gdk_window_set_opacity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gdk_window_set_opacity$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_opacity",
        constants$1259.gdk_window_set_opacity$FUNC
    );
    static final FunctionDescriptor gdk_window_register_dnd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_register_dnd$MH = RuntimeHelper.downcallHandle(
        "gdk_window_register_dnd",
        constants$1259.gdk_window_register_dnd$FUNC
    );
    static final FunctionDescriptor gdk_window_get_drag_protocol$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_drag_protocol$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_drag_protocol",
        constants$1259.gdk_window_get_drag_protocol$FUNC
    );
    static final FunctionDescriptor gdk_window_begin_resize_drag$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_begin_resize_drag$MH = RuntimeHelper.downcallHandle(
        "gdk_window_begin_resize_drag",
        constants$1259.gdk_window_begin_resize_drag$FUNC
    );
    static final FunctionDescriptor gdk_window_begin_resize_drag_for_device$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_begin_resize_drag_for_device$MH = RuntimeHelper.downcallHandle(
        "gdk_window_begin_resize_drag_for_device",
        constants$1259.gdk_window_begin_resize_drag_for_device$FUNC
    );
}

