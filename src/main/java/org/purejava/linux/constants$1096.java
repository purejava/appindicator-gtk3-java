// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1096 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1096() {}
    static final FunctionDescriptor gdk_window_get_source_events$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_get_source_events$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_source_events",
        constants$1096.gdk_window_get_source_events$FUNC
    );
    static final FunctionDescriptor gdk_window_set_icon_list$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_set_icon_list$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_icon_list",
        constants$1096.gdk_window_set_icon_list$FUNC
    );
    static final FunctionDescriptor gdk_window_set_icon_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_set_icon_name$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_icon_name",
        constants$1096.gdk_window_set_icon_name$FUNC
    );
    static final FunctionDescriptor gdk_window_set_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_set_group$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_group",
        constants$1096.gdk_window_set_group$FUNC
    );
    static final FunctionDescriptor gdk_window_get_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_group$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_group",
        constants$1096.gdk_window_get_group$FUNC
    );
    static final FunctionDescriptor gdk_window_set_decorations$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_decorations$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_decorations",
        constants$1096.gdk_window_set_decorations$FUNC
    );
}


