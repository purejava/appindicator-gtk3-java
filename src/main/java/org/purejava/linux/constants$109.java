// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$109 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$109() {}
    static final FunctionDescriptor g_datalist_id_get_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_datalist_id_get_data$MH = RuntimeHelper.downcallHandle(
        "g_datalist_id_get_data",
        constants$109.g_datalist_id_get_data$FUNC
    );
    static final FunctionDescriptor g_datalist_id_set_data_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datalist_id_set_data_full$MH = RuntimeHelper.downcallHandle(
        "g_datalist_id_set_data_full",
        constants$109.g_datalist_id_set_data_full$FUNC
    );
    static final FunctionDescriptor g_datalist_id_remove_multiple$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_datalist_id_remove_multiple$MH = RuntimeHelper.downcallHandle(
        "g_datalist_id_remove_multiple",
        constants$109.g_datalist_id_remove_multiple$FUNC
    );
    static final FunctionDescriptor GDuplicateFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GDuplicateFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GDuplicateFunc_UP$MH = RuntimeHelper.upcallHandle(GDuplicateFunc.class, "apply", constants$109.GDuplicateFunc_UP$FUNC);
    static final FunctionDescriptor GDuplicateFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GDuplicateFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$109.GDuplicateFunc_DOWN$FUNC
    );
    static final FunctionDescriptor g_datalist_id_dup_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_datalist_id_dup_data$MH = RuntimeHelper.downcallHandle(
        "g_datalist_id_dup_data",
        constants$109.g_datalist_id_dup_data$FUNC
    );
}


