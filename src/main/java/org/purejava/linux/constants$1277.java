// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1277 {

    static final FunctionDescriptor gdk_display_get_n_monitors$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_n_monitors$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_n_monitors",
        constants$1277.gdk_display_get_n_monitors$FUNC
    );
    static final FunctionDescriptor gdk_display_get_monitor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_display_get_monitor$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_monitor",
        constants$1277.gdk_display_get_monitor$FUNC
    );
    static final FunctionDescriptor gdk_display_get_primary_monitor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_primary_monitor$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_primary_monitor",
        constants$1277.gdk_display_get_primary_monitor$FUNC
    );
    static final FunctionDescriptor gdk_display_get_monitor_at_point$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_display_get_monitor_at_point$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_monitor_at_point",
        constants$1277.gdk_display_get_monitor_at_point$FUNC
    );
    static final FunctionDescriptor gdk_display_get_monitor_at_window$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_get_monitor_at_window$MH = RuntimeHelper.downcallHandle(
        "gdk_display_get_monitor_at_window",
        constants$1277.gdk_display_get_monitor_at_window$FUNC
    );
    static final FunctionDescriptor gdk_screen_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_screen_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_screen_get_type",
        constants$1277.gdk_screen_get_type$FUNC
    );
}


