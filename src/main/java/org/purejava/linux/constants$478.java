// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$478 {

    static final FunctionDescriptor g_object_set_qdata_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_set_qdata_full$MH = RuntimeHelper.downcallHandle(
        "g_object_set_qdata_full",
        constants$478.g_object_set_qdata_full$FUNC
    );
    static final FunctionDescriptor g_object_steal_qdata$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_object_steal_qdata$MH = RuntimeHelper.downcallHandle(
        "g_object_steal_qdata",
        constants$478.g_object_steal_qdata$FUNC
    );
    static final FunctionDescriptor g_object_dup_qdata$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_dup_qdata$MH = RuntimeHelper.downcallHandle(
        "g_object_dup_qdata",
        constants$478.g_object_dup_qdata$FUNC
    );
    static final FunctionDescriptor g_object_replace_qdata$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_replace_qdata$MH = RuntimeHelper.downcallHandle(
        "g_object_replace_qdata",
        constants$478.g_object_replace_qdata$FUNC
    );
    static final FunctionDescriptor g_object_get_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_get_data$MH = RuntimeHelper.downcallHandle(
        "g_object_get_data",
        constants$478.g_object_get_data$FUNC
    );
    static final FunctionDescriptor g_object_set_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_set_data$MH = RuntimeHelper.downcallHandle(
        "g_object_set_data",
        constants$478.g_object_set_data$FUNC
    );
}

