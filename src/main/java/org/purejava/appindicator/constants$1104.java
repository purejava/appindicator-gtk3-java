// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1104 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1104() {}
    static final FunctionDescriptor gdk_offscreen_window_get_surface$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_offscreen_window_get_surface$MH = RuntimeHelper.downcallHandle(
        "gdk_offscreen_window_get_surface",
        constants$1104.gdk_offscreen_window_get_surface$FUNC
    );
    static final FunctionDescriptor gdk_offscreen_window_set_embedder$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_offscreen_window_set_embedder$MH = RuntimeHelper.downcallHandle(
        "gdk_offscreen_window_set_embedder",
        constants$1104.gdk_offscreen_window_set_embedder$FUNC
    );
    static final FunctionDescriptor gdk_offscreen_window_get_embedder$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_offscreen_window_get_embedder$MH = RuntimeHelper.downcallHandle(
        "gdk_offscreen_window_get_embedder",
        constants$1104.gdk_offscreen_window_get_embedder$FUNC
    );
    static final FunctionDescriptor gdk_window_geometry_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_geometry_changed$MH = RuntimeHelper.downcallHandle(
        "gdk_window_geometry_changed",
        constants$1104.gdk_window_geometry_changed$FUNC
    );
    static final FunctionDescriptor gdk_window_set_support_multidevice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_support_multidevice$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_support_multidevice",
        constants$1104.gdk_window_set_support_multidevice$FUNC
    );
    static final FunctionDescriptor gdk_window_get_support_multidevice$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_support_multidevice$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_support_multidevice",
        constants$1104.gdk_window_get_support_multidevice$FUNC
    );
}


