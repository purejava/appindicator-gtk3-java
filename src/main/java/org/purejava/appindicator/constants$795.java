// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$795 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$795() {}
    static final FunctionDescriptor g_task_set_return_on_cancel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_task_set_return_on_cancel$MH = RuntimeHelper.downcallHandle(
        "g_task_set_return_on_cancel",
        constants$795.g_task_set_return_on_cancel$FUNC
    );
    static final FunctionDescriptor g_task_get_return_on_cancel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_get_return_on_cancel$MH = RuntimeHelper.downcallHandle(
        "g_task_get_return_on_cancel",
        constants$795.g_task_get_return_on_cancel$FUNC
    );
    static final FunctionDescriptor g_task_attach_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_attach_source$MH = RuntimeHelper.downcallHandle(
        "g_task_attach_source",
        constants$795.g_task_attach_source$FUNC
    );
    static final FunctionDescriptor g_task_return_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_return_pointer$MH = RuntimeHelper.downcallHandle(
        "g_task_return_pointer",
        constants$795.g_task_return_pointer$FUNC
    );
    static final FunctionDescriptor g_task_return_boolean$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_task_return_boolean$MH = RuntimeHelper.downcallHandle(
        "g_task_return_boolean",
        constants$795.g_task_return_boolean$FUNC
    );
    static final FunctionDescriptor g_task_return_int$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_task_return_int$MH = RuntimeHelper.downcallHandle(
        "g_task_return_int",
        constants$795.g_task_return_int$FUNC
    );
}


