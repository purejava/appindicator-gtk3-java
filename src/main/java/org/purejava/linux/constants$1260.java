// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1260 {

    static final FunctionDescriptor gdk_window_begin_move_drag$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_begin_move_drag$MH = RuntimeHelper.downcallHandle(
        "gdk_window_begin_move_drag",
        constants$1260.gdk_window_begin_move_drag$FUNC
    );
    static final FunctionDescriptor gdk_window_begin_move_drag_for_device$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_begin_move_drag_for_device$MH = RuntimeHelper.downcallHandle(
        "gdk_window_begin_move_drag_for_device",
        constants$1260.gdk_window_begin_move_drag_for_device$FUNC
    );
    static final FunctionDescriptor gdk_window_invalidate_rect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_invalidate_rect$MH = RuntimeHelper.downcallHandle(
        "gdk_window_invalidate_rect",
        constants$1260.gdk_window_invalidate_rect$FUNC
    );
    static final FunctionDescriptor gdk_window_invalidate_region$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_invalidate_region$MH = RuntimeHelper.downcallHandle(
        "gdk_window_invalidate_region",
        constants$1260.gdk_window_invalidate_region$FUNC
    );
    static final FunctionDescriptor GdkWindowChildFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GdkWindowChildFunc$MH = RuntimeHelper.downcallHandle(
        constants$1260.GdkWindowChildFunc$FUNC
    );
}

