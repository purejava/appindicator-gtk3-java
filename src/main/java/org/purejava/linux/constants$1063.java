// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1063 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1063() {}
    static final FunctionDescriptor gdk_drag_find_window_for_screen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_drag_find_window_for_screen$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_find_window_for_screen",
        constants$1063.gdk_drag_find_window_for_screen$FUNC
    );
    static final FunctionDescriptor gdk_drag_motion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drag_motion$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_motion",
        constants$1063.gdk_drag_motion$FUNC
    );
    static final FunctionDescriptor gdk_drag_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drag_drop$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_drop",
        constants$1063.gdk_drag_drop$FUNC
    );
    static final FunctionDescriptor gdk_drag_abort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drag_abort$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_abort",
        constants$1063.gdk_drag_abort$FUNC
    );
    static final FunctionDescriptor gdk_drag_drop_succeeded$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_drag_drop_succeeded$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_drop_succeeded",
        constants$1063.gdk_drag_drop_succeeded$FUNC
    );
    static final FunctionDescriptor gdk_drag_drop_done$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_drag_drop_done$MH = RuntimeHelper.downcallHandle(
        "gdk_drag_drop_done",
        constants$1063.gdk_drag_drop_done$FUNC
    );
}


