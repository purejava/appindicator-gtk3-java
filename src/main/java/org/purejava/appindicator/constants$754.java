// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$754 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$754() {}
    static final FunctionDescriptor g_simple_action_group_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_action_group_remove$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_group_remove",
        constants$754.g_simple_action_group_remove$FUNC
    );
    static final FunctionDescriptor g_simple_action_group_add_entries$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_action_group_add_entries$MH = RuntimeHelper.downcallHandle(
        "g_simple_action_group_add_entries",
        constants$754.g_simple_action_group_add_entries$FUNC
    );
    static final FunctionDescriptor g_simple_async_result_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_simple_async_result_get_type$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_result_get_type",
        constants$754.g_simple_async_result_get_type$FUNC
    );
    static final FunctionDescriptor g_simple_async_result_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_async_result_new$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_result_new",
        constants$754.g_simple_async_result_new$FUNC
    );
    static final FunctionDescriptor g_simple_async_result_new_error$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_async_result_new_error$MH = RuntimeHelper.downcallHandleVariadic(
        "g_simple_async_result_new_error",
        constants$754.g_simple_async_result_new_error$FUNC
    );
    static final FunctionDescriptor g_simple_async_result_new_from_error$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_simple_async_result_new_from_error$MH = RuntimeHelper.downcallHandle(
        "g_simple_async_result_new_from_error",
        constants$754.g_simple_async_result_new_from_error$FUNC
    );
}


