// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$848 {

    static final FunctionDescriptor g_task_get_check_cancellable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_get_check_cancellable$MH = RuntimeHelper.downcallHandle(
        "g_task_get_check_cancellable",
        constants$848.g_task_get_check_cancellable$FUNC
    );
    static final FunctionDescriptor g_task_get_source_tag$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_get_source_tag$MH = RuntimeHelper.downcallHandle(
        "g_task_get_source_tag",
        constants$848.g_task_get_source_tag$FUNC
    );
    static final FunctionDescriptor g_task_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_get_name$MH = RuntimeHelper.downcallHandle(
        "g_task_get_name",
        constants$848.g_task_get_name$FUNC
    );
    static final FunctionDescriptor g_task_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_task_is_valid",
        constants$848.g_task_is_valid$FUNC
    );
    static final FunctionDescriptor GTaskThreadFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTaskThreadFunc$MH = RuntimeHelper.downcallHandle(
        constants$848.GTaskThreadFunc$FUNC
    );
}

