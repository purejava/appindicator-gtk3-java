// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1081 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1081() {}
    static final FunctionDescriptor gdk_window_lower$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_lower$MH = RuntimeHelper.downcallHandle(
        "gdk_window_lower",
        constants$1081.gdk_window_lower$FUNC
    );
    static final FunctionDescriptor gdk_window_restack$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_restack$MH = RuntimeHelper.downcallHandle(
        "gdk_window_restack",
        constants$1081.gdk_window_restack$FUNC
    );
    static final FunctionDescriptor gdk_window_focus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_focus$MH = RuntimeHelper.downcallHandle(
        "gdk_window_focus",
        constants$1081.gdk_window_focus$FUNC
    );
    static final FunctionDescriptor gdk_window_set_user_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_set_user_data$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_user_data",
        constants$1081.gdk_window_set_user_data$FUNC
    );
    static final FunctionDescriptor gdk_window_set_override_redirect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_window_set_override_redirect$MH = RuntimeHelper.downcallHandle(
        "gdk_window_set_override_redirect",
        constants$1081.gdk_window_set_override_redirect$FUNC
    );
    static final FunctionDescriptor gdk_window_get_accept_focus$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_window_get_accept_focus$MH = RuntimeHelper.downcallHandle(
        "gdk_window_get_accept_focus",
        constants$1081.gdk_window_get_accept_focus$FUNC
    );
}


