// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1058 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1058() {}
    static final FunctionDescriptor gdk_device_get_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_display$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_display",
        constants$1058.gdk_device_get_display$FUNC
    );
    static final FunctionDescriptor gdk_device_get_associated_device$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_associated_device$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_associated_device",
        constants$1058.gdk_device_get_associated_device$FUNC
    );
    static final FunctionDescriptor gdk_device_list_slave_devices$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_list_slave_devices$MH = RuntimeHelper.downcallHandle(
        "gdk_device_list_slave_devices",
        constants$1058.gdk_device_list_slave_devices$FUNC
    );
    static final FunctionDescriptor gdk_device_get_device_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_device_get_device_type$MH = RuntimeHelper.downcallHandle(
        "gdk_device_get_device_type",
        constants$1058.gdk_device_get_device_type$FUNC
    );
    static final FunctionDescriptor gdk_device_grab$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_grab$MH = RuntimeHelper.downcallHandle(
        "gdk_device_grab",
        constants$1058.gdk_device_grab$FUNC
    );
    static final FunctionDescriptor gdk_device_ungrab$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_device_ungrab$MH = RuntimeHelper.downcallHandle(
        "gdk_device_ungrab",
        constants$1058.gdk_device_ungrab$FUNC
    );
}


