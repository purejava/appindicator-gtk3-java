// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$478 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$478() {}
    static final FunctionDescriptor g_action_map_remove_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_map_remove_action$MH = RuntimeHelper.downcallHandle(
        "g_action_map_remove_action",
        constants$478.g_action_map_remove_action$FUNC
    );
    static final FunctionDescriptor g_action_map_add_action_entries$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_map_add_action_entries$MH = RuntimeHelper.downcallHandle(
        "g_action_map_add_action_entries",
        constants$478.g_action_map_add_action_entries$FUNC
    );
    static final FunctionDescriptor g_app_info_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_app_info_get_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_type",
        constants$478.g_app_info_get_type$FUNC
    );
    static final FunctionDescriptor g_app_info_create_from_commandline$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_create_from_commandline$MH = RuntimeHelper.downcallHandle(
        "g_app_info_create_from_commandline",
        constants$478.g_app_info_create_from_commandline$FUNC
    );
    static final FunctionDescriptor g_app_info_dup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_dup$MH = RuntimeHelper.downcallHandle(
        "g_app_info_dup",
        constants$478.g_app_info_dup$FUNC
    );
    static final FunctionDescriptor g_app_info_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_equal$MH = RuntimeHelper.downcallHandle(
        "g_app_info_equal",
        constants$478.g_app_info_equal$FUNC
    );
}

