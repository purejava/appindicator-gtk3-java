// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$558 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$558() {}
    static final FunctionDescriptor g_dbus_connection_unregister_subtree$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_connection_unregister_subtree$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_unregister_subtree",
        constants$558.g_dbus_connection_unregister_subtree$FUNC
    );
    static final FunctionDescriptor GDBusSignalCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GDBusSignalCallback_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GDBusSignalCallback_UP$MH = RuntimeHelper.upcallHandle(GDBusSignalCallback.class, "apply", constants$558.GDBusSignalCallback_UP$FUNC);
    static final FunctionDescriptor GDBusSignalCallback_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GDBusSignalCallback_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$558.GDBusSignalCallback_DOWN$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_signal_subscribe$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dbus_connection_signal_subscribe$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_signal_subscribe",
        constants$558.g_dbus_connection_signal_subscribe$FUNC
    );
    static final FunctionDescriptor g_dbus_connection_signal_unsubscribe$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_connection_signal_unsubscribe$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_signal_unsubscribe",
        constants$558.g_dbus_connection_signal_unsubscribe$FUNC
    );
    static final FunctionDescriptor GDBusMessageFilterFunction$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GDBusMessageFilterFunction_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GDBusMessageFilterFunction_UP$MH = RuntimeHelper.upcallHandle(GDBusMessageFilterFunction.class, "apply", constants$558.GDBusMessageFilterFunction_UP$FUNC);
}


