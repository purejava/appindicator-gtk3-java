// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1183 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1183() {}
    static final FunctionDescriptor gdk_selection_convert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_selection_convert$MH = RuntimeHelper.downcallHandle(
        "gdk_selection_convert",
        constants$1183.gdk_selection_convert$FUNC
    );
    static final FunctionDescriptor gdk_selection_property_get$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_selection_property_get$MH = RuntimeHelper.downcallHandle(
        "gdk_selection_property_get",
        constants$1183.gdk_selection_property_get$FUNC
    );
    static final FunctionDescriptor gdk_selection_send_notify$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_selection_send_notify$MH = RuntimeHelper.downcallHandle(
        "gdk_selection_send_notify",
        constants$1183.gdk_selection_send_notify$FUNC
    );
    static final FunctionDescriptor gdk_selection_send_notify_for_display$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_selection_send_notify_for_display$MH = RuntimeHelper.downcallHandle(
        "gdk_selection_send_notify_for_display",
        constants$1183.gdk_selection_send_notify_for_display$FUNC
    );
    static final FunctionDescriptor gdk_test_render_sync$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_test_render_sync$MH = RuntimeHelper.downcallHandle(
        "gdk_test_render_sync",
        constants$1183.gdk_test_render_sync$FUNC
    );
    static final FunctionDescriptor gdk_test_simulate_key$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_test_simulate_key$MH = RuntimeHelper.downcallHandle(
        "gdk_test_simulate_key",
        constants$1183.gdk_test_simulate_key$FUNC
    );
}


