// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$487 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$487() {}
    static final FunctionDescriptor g_application_id_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_id_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_application_id_is_valid",
        constants$487.g_application_id_is_valid$FUNC
    );
    static final FunctionDescriptor g_application_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_application_new$MH = RuntimeHelper.downcallHandle(
        "g_application_new",
        constants$487.g_application_new$FUNC
    );
    static final FunctionDescriptor g_application_get_application_id$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_application_id$MH = RuntimeHelper.downcallHandle(
        "g_application_get_application_id",
        constants$487.g_application_get_application_id$FUNC
    );
    static final FunctionDescriptor g_application_set_application_id$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_set_application_id$MH = RuntimeHelper.downcallHandle(
        "g_application_set_application_id",
        constants$487.g_application_set_application_id$FUNC
    );
    static final FunctionDescriptor g_application_get_dbus_connection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_dbus_connection$MH = RuntimeHelper.downcallHandle(
        "g_application_get_dbus_connection",
        constants$487.g_application_get_dbus_connection$FUNC
    );
    static final FunctionDescriptor g_application_get_dbus_object_path$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_get_dbus_object_path$MH = RuntimeHelper.downcallHandle(
        "g_application_get_dbus_object_path",
        constants$487.g_application_get_dbus_object_path$FUNC
    );
}


