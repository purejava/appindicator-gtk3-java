// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$561 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$561() {}
    static final FunctionDescriptor g_dbus_error_set_dbus_error_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_error_set_dbus_error_valist$MH = RuntimeHelper.downcallHandle(
        "g_dbus_error_set_dbus_error_valist",
        constants$561.g_dbus_error_set_dbus_error_valist$FUNC
    );
    static final FunctionDescriptor g_dbus_error_encode_gerror$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_error_encode_gerror$MH = RuntimeHelper.downcallHandle(
        "g_dbus_error_encode_gerror",
        constants$561.g_dbus_error_encode_gerror$FUNC
    );
    static final FunctionDescriptor g_dbus_interface_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dbus_interface_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dbus_interface_get_type",
        constants$561.g_dbus_interface_get_type$FUNC
    );
    static final FunctionDescriptor g_dbus_interface_get_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_interface_get_info$MH = RuntimeHelper.downcallHandle(
        "g_dbus_interface_get_info",
        constants$561.g_dbus_interface_get_info$FUNC
    );
    static final FunctionDescriptor g_dbus_interface_get_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_interface_get_object$MH = RuntimeHelper.downcallHandle(
        "g_dbus_interface_get_object",
        constants$561.g_dbus_interface_get_object$FUNC
    );
    static final FunctionDescriptor g_dbus_interface_set_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_interface_set_object$MH = RuntimeHelper.downcallHandle(
        "g_dbus_interface_set_object",
        constants$561.g_dbus_interface_set_object$FUNC
    );
}


