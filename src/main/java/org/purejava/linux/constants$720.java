// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$720 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$720() {}
    static final FunctionDescriptor g_notification_set_default_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_default_action$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_default_action",
        constants$720.g_notification_set_default_action$FUNC
    );
    static final FunctionDescriptor g_notification_set_default_action_and_target$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_default_action_and_target$MH = RuntimeHelper.downcallHandleVariadic(
        "g_notification_set_default_action_and_target",
        constants$720.g_notification_set_default_action_and_target$FUNC
    );
    static final FunctionDescriptor g_notification_set_default_action_and_target_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_notification_set_default_action_and_target_value$MH = RuntimeHelper.downcallHandle(
        "g_notification_set_default_action_and_target_value",
        constants$720.g_notification_set_default_action_and_target_value$FUNC
    );
    static final FunctionDescriptor g_permission_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_permission_get_type$MH = RuntimeHelper.downcallHandle(
        "g_permission_get_type",
        constants$720.g_permission_get_type$FUNC
    );
    static final FunctionDescriptor g_permission_acquire$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_acquire$MH = RuntimeHelper.downcallHandle(
        "g_permission_acquire",
        constants$720.g_permission_acquire$FUNC
    );
    static final FunctionDescriptor g_permission_acquire_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_permission_acquire_async$MH = RuntimeHelper.downcallHandle(
        "g_permission_acquire_async",
        constants$720.g_permission_acquire_async$FUNC
    );
}


