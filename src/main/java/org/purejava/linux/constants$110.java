// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$110 {

    static final FunctionDescriptor g_datalist_unset_flags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_datalist_unset_flags$MH = RuntimeHelper.downcallHandle(
        "g_datalist_unset_flags",
        constants$110.g_datalist_unset_flags$FUNC
    );
    static final FunctionDescriptor g_datalist_get_flags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datalist_get_flags$MH = RuntimeHelper.downcallHandle(
        "g_datalist_get_flags",
        constants$110.g_datalist_get_flags$FUNC
    );
    static final FunctionDescriptor g_dataset_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dataset_destroy$MH = RuntimeHelper.downcallHandle(
        "g_dataset_destroy",
        constants$110.g_dataset_destroy$FUNC
    );
    static final FunctionDescriptor g_dataset_id_get_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_dataset_id_get_data$MH = RuntimeHelper.downcallHandle(
        "g_dataset_id_get_data",
        constants$110.g_dataset_id_get_data$FUNC
    );
    static final FunctionDescriptor g_datalist_get_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datalist_get_data$MH = RuntimeHelper.downcallHandle(
        "g_datalist_get_data",
        constants$110.g_datalist_get_data$FUNC
    );
    static final FunctionDescriptor g_dataset_id_set_data_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dataset_id_set_data_full$MH = RuntimeHelper.downcallHandle(
        "g_dataset_id_set_data_full",
        constants$110.g_dataset_id_set_data_full$FUNC
    );
}

