// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$792 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$792() {}
    static final FunctionDescriptor g_task_set_priority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_task_set_priority$MH = RuntimeHelper.downcallHandle(
        "g_task_set_priority",
        constants$792.g_task_set_priority$FUNC
    );
    static final FunctionDescriptor g_task_set_check_cancellable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_task_set_check_cancellable$MH = RuntimeHelper.downcallHandle(
        "g_task_set_check_cancellable",
        constants$792.g_task_set_check_cancellable$FUNC
    );
    static final FunctionDescriptor g_task_set_source_tag$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_set_source_tag$MH = RuntimeHelper.downcallHandle(
        "g_task_set_source_tag",
        constants$792.g_task_set_source_tag$FUNC
    );
    static final FunctionDescriptor g_task_set_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_set_name$MH = RuntimeHelper.downcallHandle(
        "g_task_set_name",
        constants$792.g_task_set_name$FUNC
    );
    static final FunctionDescriptor g_task_set_static_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_set_static_name$MH = RuntimeHelper.downcallHandle(
        "g_task_set_static_name",
        constants$792.g_task_set_static_name$FUNC
    );
    static final FunctionDescriptor g_task_get_source_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_get_source_object$MH = RuntimeHelper.downcallHandle(
        "g_task_get_source_object",
        constants$792.g_task_get_source_object$FUNC
    );
}


