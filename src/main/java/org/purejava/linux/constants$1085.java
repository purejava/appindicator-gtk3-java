// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1085 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1085() {}
    static final FunctionDescriptor gdk_window_is_visible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_is_visible$MH = RuntimeHelper.downcallHandle(
        "gdk_window_is_visible",
        constants$1085.gdk_window_is_visible$FUNC
    );
    static final FunctionDescriptor gdk_window_is_viewable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_is_viewable$MH = RuntimeHelper.downcallHandle(
        "gdk_window_is_viewable",
        constants$1085.gdk_window_is_viewable$FUNC
    );
    static final FunctionDescriptor gdk_window_is_input_only$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_is_input_only$MH = RuntimeHelper.downcallHandle(
        "gdk_window_is_input_only",
        constants$1085.gdk_window_is_input_only$FUNC
    );
    static final FunctionDescriptor gdk_window_is_shaped$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_is_shaped$MH = RuntimeHelper.downcallHandle(
        "gdk_window_is_shaped",
        constants$1085.gdk_window_is_shaped$FUNC
    );
    static final FunctionDescriptor gdk_window_get_state$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_state$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_state",
        constants$1085.gdk_window_get_state$FUNC
    );
    static final FunctionDescriptor gdk_window_set_static_gravities$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_static_gravities$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_static_gravities",
        constants$1085.gdk_window_set_static_gravities$FUNC
    );
}


