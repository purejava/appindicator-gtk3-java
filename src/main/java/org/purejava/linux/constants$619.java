// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$619 {

    static final FunctionDescriptor g_dbus_message_get_serial$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_serial$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_serial",
        constants$619.g_dbus_message_get_serial$FUNC
    );
    static final FunctionDescriptor g_dbus_message_set_serial$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_serial$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_serial",
        constants$619.g_dbus_message_set_serial$FUNC
    );
    static final FunctionDescriptor g_dbus_message_get_header$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_header$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_header",
        constants$619.g_dbus_message_get_header$FUNC
    );
    static final FunctionDescriptor g_dbus_message_set_header$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_header$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_header",
        constants$619.g_dbus_message_set_header$FUNC
    );
    static final FunctionDescriptor g_dbus_message_get_header_fields$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_header_fields$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_header_fields",
        constants$619.g_dbus_message_get_header_fields$FUNC
    );
    static final FunctionDescriptor g_dbus_message_get_body$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_body$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_body",
        constants$619.g_dbus_message_get_body$FUNC
    );
}


