// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$594 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$594() {}
    static final FunctionDescriptor g_dbus_proxy_get_cached_property$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_proxy_get_cached_property$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_get_cached_property",
        constants$594.g_dbus_proxy_get_cached_property$FUNC
    );
    static final FunctionDescriptor g_dbus_proxy_set_cached_property$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_proxy_set_cached_property$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_set_cached_property",
        constants$594.g_dbus_proxy_set_cached_property$FUNC
    );
    static final FunctionDescriptor g_dbus_proxy_get_cached_property_names$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_proxy_get_cached_property_names$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_get_cached_property_names",
        constants$594.g_dbus_proxy_get_cached_property_names$FUNC
    );
    static final FunctionDescriptor g_dbus_proxy_call$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_proxy_call$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_call",
        constants$594.g_dbus_proxy_call$FUNC
    );
    static final FunctionDescriptor g_dbus_proxy_call_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_proxy_call_finish$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_call_finish",
        constants$594.g_dbus_proxy_call_finish$FUNC
    );
    static final FunctionDescriptor g_dbus_proxy_call_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_proxy_call_sync$MH = RuntimeHelper.downcallHandle(
        "g_dbus_proxy_call_sync",
        constants$594.g_dbus_proxy_call_sync$FUNC
    );
}


