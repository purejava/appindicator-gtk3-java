// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$642 {

    static final FunctionDescriptor g_dbus_server_get_guid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_get_guid$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_get_guid",
        constants$642.g_dbus_server_get_guid$FUNC
    );
    static final FunctionDescriptor g_dbus_server_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_get_flags",
        constants$642.g_dbus_server_get_flags$FUNC
    );
    static final FunctionDescriptor g_dbus_server_start$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_start$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_start",
        constants$642.g_dbus_server_start$FUNC
    );
    static final FunctionDescriptor g_dbus_server_stop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_stop$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_stop",
        constants$642.g_dbus_server_stop$FUNC
    );
    static final FunctionDescriptor g_dbus_server_is_active$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_server_is_active$MH = RuntimeHelper.downcallHandle(
        "g_dbus_server_is_active",
        constants$642.g_dbus_server_is_active$FUNC
    );
    static final FunctionDescriptor g_dbus_is_guid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_is_guid$MH = RuntimeHelper.downcallHandle(
        "g_dbus_is_guid",
        constants$642.g_dbus_is_guid$FUNC
    );
}

