// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1185 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1185() {}
    static final FunctionDescriptor gdk_threads_add_idle$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_threads_add_idle$MH = RuntimeHelper.downcallHandle(
        "gdk_threads_add_idle",
        constants$1185.gdk_threads_add_idle$FUNC
    );
    static final FunctionDescriptor gdk_threads_add_timeout_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_threads_add_timeout_full$MH = RuntimeHelper.downcallHandle(
        "gdk_threads_add_timeout_full",
        constants$1185.gdk_threads_add_timeout_full$FUNC
    );
    static final FunctionDescriptor gdk_threads_add_timeout$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_threads_add_timeout$MH = RuntimeHelper.downcallHandle(
        "gdk_threads_add_timeout",
        constants$1185.gdk_threads_add_timeout$FUNC
    );
    static final FunctionDescriptor gdk_threads_add_timeout_seconds_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_threads_add_timeout_seconds_full$MH = RuntimeHelper.downcallHandle(
        "gdk_threads_add_timeout_seconds_full",
        constants$1185.gdk_threads_add_timeout_seconds_full$FUNC
    );
    static final FunctionDescriptor gdk_threads_add_timeout_seconds$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_threads_add_timeout_seconds$MH = RuntimeHelper.downcallHandle(
        "gdk_threads_add_timeout_seconds",
        constants$1185.gdk_threads_add_timeout_seconds$FUNC
    );
    static final FunctionDescriptor gdk_visual_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_visual_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_visual_get_type",
        constants$1185.gdk_visual_get_type$FUNC
    );
}


