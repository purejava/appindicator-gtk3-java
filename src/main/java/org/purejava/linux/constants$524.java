// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$524 {

    static final FunctionDescriptor g_dbus_connection_unexport_action_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dbus_connection_unexport_action_group$MH = RuntimeHelper.downcallHandle(
        "g_dbus_connection_unexport_action_group",
        constants$524.g_dbus_connection_unexport_action_group$FUNC
    );
    static final FunctionDescriptor g_action_map_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_action_map_get_type$MH = RuntimeHelper.downcallHandle(
        "g_action_map_get_type",
        constants$524.g_action_map_get_type$FUNC
    );
    static final FunctionDescriptor g_action_map_lookup_action$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_map_lookup_action$MH = RuntimeHelper.downcallHandle(
        "g_action_map_lookup_action",
        constants$524.g_action_map_lookup_action$FUNC
    );
    static final FunctionDescriptor g_action_map_add_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_map_add_action$MH = RuntimeHelper.downcallHandle(
        "g_action_map_add_action",
        constants$524.g_action_map_add_action$FUNC
    );
    static final FunctionDescriptor g_action_map_remove_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_map_remove_action$MH = RuntimeHelper.downcallHandle(
        "g_action_map_remove_action",
        constants$524.g_action_map_remove_action$FUNC
    );
    static final FunctionDescriptor g_action_map_add_action_entries$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_map_add_action_entries$MH = RuntimeHelper.downcallHandle(
        "g_action_map_add_action_entries",
        constants$524.g_action_map_add_action_entries$FUNC
    );
}

