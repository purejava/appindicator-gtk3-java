// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$576 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$576() {}
    static final FunctionDescriptor g_dbus_message_set_sender$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_sender$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_sender",
        constants$576.g_dbus_message_set_sender$FUNC
    );
    static final FunctionDescriptor g_dbus_message_get_destination$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_destination$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_destination",
        constants$576.g_dbus_message_get_destination$FUNC
    );
    static final FunctionDescriptor g_dbus_message_set_destination$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_destination$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_destination",
        constants$576.g_dbus_message_set_destination$FUNC
    );
    static final FunctionDescriptor g_dbus_message_get_error_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_error_name$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_error_name",
        constants$576.g_dbus_message_get_error_name$FUNC
    );
    static final FunctionDescriptor g_dbus_message_set_error_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_set_error_name$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_set_error_name",
        constants$576.g_dbus_message_set_error_name$FUNC
    );
    static final FunctionDescriptor g_dbus_message_get_signature$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_message_get_signature$MH = RuntimeHelper.downcallHandle(
        "g_dbus_message_get_signature",
        constants$576.g_dbus_message_get_signature$FUNC
    );
}


