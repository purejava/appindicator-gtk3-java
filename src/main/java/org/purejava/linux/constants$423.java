// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$423 {

    static final FunctionDescriptor g_type_interfaces$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_interfaces$MH = RuntimeHelper.downcallHandle(
        "g_type_interfaces",
        constants$423.g_type_interfaces$FUNC
    );
    static final FunctionDescriptor g_type_set_qdata$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_set_qdata$MH = RuntimeHelper.downcallHandle(
        "g_type_set_qdata",
        constants$423.g_type_set_qdata$FUNC
    );
    static final FunctionDescriptor g_type_get_qdata$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_get_qdata$MH = RuntimeHelper.downcallHandle(
        "g_type_get_qdata",
        constants$423.g_type_get_qdata$FUNC
    );
    static final FunctionDescriptor g_type_query$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_query$MH = RuntimeHelper.downcallHandle(
        "g_type_query",
        constants$423.g_type_query$FUNC
    );
    static final FunctionDescriptor g_type_get_instance_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_get_instance_count$MH = RuntimeHelper.downcallHandle(
        "g_type_get_instance_count",
        constants$423.g_type_get_instance_count$FUNC
    );
    static final FunctionDescriptor GBaseInitFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
}


