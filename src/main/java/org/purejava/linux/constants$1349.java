// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1349 {

    static final FunctionDescriptor gdk_threads_add_timeout_seconds$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_threads_add_timeout_seconds$MH = RuntimeHelper.downcallHandle(
        "gdk_threads_add_timeout_seconds",
        constants$1349.gdk_threads_add_timeout_seconds$FUNC
    );
    static final FunctionDescriptor gdk_visual_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gdk_visual_get_type$MH = RuntimeHelper.downcallHandle(
        "gdk_visual_get_type",
        constants$1349.gdk_visual_get_type$FUNC
    );
    static final FunctionDescriptor gdk_visual_get_best_depth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gdk_visual_get_best_depth$MH = RuntimeHelper.downcallHandle(
        "gdk_visual_get_best_depth",
        constants$1349.gdk_visual_get_best_depth$FUNC
    );
    static final FunctionDescriptor gdk_visual_get_best_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gdk_visual_get_best_type$MH = RuntimeHelper.downcallHandle(
        "gdk_visual_get_best_type",
        constants$1349.gdk_visual_get_best_type$FUNC
    );
    static final FunctionDescriptor gdk_visual_get_system$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_visual_get_system$MH = RuntimeHelper.downcallHandle(
        "gdk_visual_get_system",
        constants$1349.gdk_visual_get_system$FUNC
    );
    static final FunctionDescriptor gdk_visual_get_best$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gdk_visual_get_best$MH = RuntimeHelper.downcallHandle(
        "gdk_visual_get_best",
        constants$1349.gdk_visual_get_best$FUNC
    );
}

