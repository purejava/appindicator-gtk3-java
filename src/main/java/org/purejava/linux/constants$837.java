// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$837 {

    static final FunctionDescriptor g_srv_target_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_srv_target_free$MH = RuntimeHelper.downcallHandle(
        "g_srv_target_free",
        constants$837.g_srv_target_free$FUNC
    );
    static final FunctionDescriptor g_srv_target_get_hostname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_srv_target_get_hostname$MH = RuntimeHelper.downcallHandle(
        "g_srv_target_get_hostname",
        constants$837.g_srv_target_get_hostname$FUNC
    );
    static final FunctionDescriptor g_srv_target_get_port$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_srv_target_get_port$MH = RuntimeHelper.downcallHandle(
        "g_srv_target_get_port",
        constants$837.g_srv_target_get_port$FUNC
    );
    static final FunctionDescriptor g_srv_target_get_priority$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_srv_target_get_priority$MH = RuntimeHelper.downcallHandle(
        "g_srv_target_get_priority",
        constants$837.g_srv_target_get_priority$FUNC
    );
    static final FunctionDescriptor g_srv_target_get_weight$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_srv_target_get_weight$MH = RuntimeHelper.downcallHandle(
        "g_srv_target_get_weight",
        constants$837.g_srv_target_get_weight$FUNC
    );
    static final FunctionDescriptor g_srv_target_list_sort$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_srv_target_list_sort$MH = RuntimeHelper.downcallHandle(
        "g_srv_target_list_sort",
        constants$837.g_srv_target_list_sort$FUNC
    );
}

