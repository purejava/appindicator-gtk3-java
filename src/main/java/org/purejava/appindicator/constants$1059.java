// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1059 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1059() {}
    static final FunctionDescriptor gdk_device_warp$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_warp$MH = RuntimeHelper.downcallHandle(
        "gdk_device_warp",
        constants$1059.gdk_device_warp$FUNC
    );
    static final FunctionDescriptor gdk_device_grab_info_libgtk_only$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_grab_info_libgtk_only$MH = RuntimeHelper.downcallHandle(
        "gdk_device_grab_info_libgtk_only",
        constants$1059.gdk_device_grab_info_libgtk_only$FUNC
    );
    static final FunctionDescriptor gdk_device_get_last_event_window$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_last_event_window$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_last_event_window",
        constants$1059.gdk_device_get_last_event_window$FUNC
    );
    static final FunctionDescriptor gdk_device_get_vendor_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_vendor_id$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_vendor_id",
        constants$1059.gdk_device_get_vendor_id$FUNC
    );
    static final FunctionDescriptor gdk_device_get_product_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_product_id$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_product_id",
        constants$1059.gdk_device_get_product_id$FUNC
    );
    static final FunctionDescriptor gdk_device_get_seat$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_seat$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_seat",
        constants$1059.gdk_device_get_seat$FUNC
    );
}


