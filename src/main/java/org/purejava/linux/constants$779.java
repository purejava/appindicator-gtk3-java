// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$779 {

    static final FunctionDescriptor glib_queueautoptr_cleanup_GPowerProfileMonitor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_queueautoptr_cleanup_GPowerProfileMonitor$MH = RuntimeHelper.downcallHandle(
        "glib_queueautoptr_cleanup_GPowerProfileMonitor",
        constants$779.glib_queueautoptr_cleanup_GPowerProfileMonitor$FUNC
    );
    static final FunctionDescriptor g_power_profile_monitor$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_power_profile_monitor$MH = RuntimeHelper.downcallHandle(
        "g_power_profile_monitor",
        constants$779.g_power_profile_monitor$FUNC
    );
    static final FunctionDescriptor g_IS_power_profile_monitor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_IS_power_profile_monitor$MH = RuntimeHelper.downcallHandle(
        "g_IS_power_profile_monitor",
        constants$779.g_IS_power_profile_monitor$FUNC
    );
    static final FunctionDescriptor g_power_profile_monitor_GET_IFACE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_power_profile_monitor_GET_IFACE$MH = RuntimeHelper.downcallHandle(
        "g_power_profile_monitor_GET_IFACE",
        constants$779.g_power_profile_monitor_GET_IFACE$FUNC
    );
    static final FunctionDescriptor g_power_profile_monitor_dup_default$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_power_profile_monitor_dup_default$MH = RuntimeHelper.downcallHandle(
        "g_power_profile_monitor_dup_default",
        constants$779.g_power_profile_monitor_dup_default$FUNC
    );
    static final FunctionDescriptor g_power_profile_monitor_get_power_saver_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_power_profile_monitor_get_power_saver_enabled$MH = RuntimeHelper.downcallHandle(
        "g_power_profile_monitor_get_power_saver_enabled",
        constants$779.g_power_profile_monitor_get_power_saver_enabled$FUNC
    );
}

