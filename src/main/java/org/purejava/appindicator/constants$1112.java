// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1112 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1112() {}
    static final FunctionDescriptor gdk_display_device_is_grabbed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_device_is_grabbed$MH = RuntimeHelper.downcallHandle(
        "gdk_display_device_is_grabbed",
        constants$1112.gdk_display_device_is_grabbed$FUNC
    );
    static final FunctionDescriptor gdk_display_beep$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_beep$MH = RuntimeHelper.downcallHandle(
        "gdk_display_beep",
        constants$1112.gdk_display_beep$FUNC
    );
    static final FunctionDescriptor gdk_display_sync$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_sync$MH = RuntimeHelper.downcallHandle(
        "gdk_display_sync",
        constants$1112.gdk_display_sync$FUNC
    );
    static final FunctionDescriptor gdk_display_flush$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_flush$MH = RuntimeHelper.downcallHandle(
        "gdk_display_flush",
        constants$1112.gdk_display_flush$FUNC
    );
    static final FunctionDescriptor gdk_display_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_close$MH = RuntimeHelper.downcallHandle(
        "gdk_display_close",
        constants$1112.gdk_display_close$FUNC
    );
    static final FunctionDescriptor gdk_display_is_closed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_display_is_closed$MH = RuntimeHelper.downcallHandle(
        "gdk_display_is_closed",
        constants$1112.gdk_display_is_closed$FUNC
    );
}


