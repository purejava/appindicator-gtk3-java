// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$520 {

    static final FunctionDescriptor g_action_get_state_hint$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_get_state_hint$MH = RuntimeHelper.downcallHandle(
        "g_action_get_state_hint",
        constants$520.g_action_get_state_hint$FUNC
    );
    static final FunctionDescriptor g_action_get_enabled$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_get_enabled$MH = RuntimeHelper.downcallHandle(
        "g_action_get_enabled",
        constants$520.g_action_get_enabled$FUNC
    );
    static final FunctionDescriptor g_action_get_state$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_get_state$MH = RuntimeHelper.downcallHandle(
        "g_action_get_state",
        constants$520.g_action_get_state$FUNC
    );
    static final FunctionDescriptor g_action_change_state$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_change_state$MH = RuntimeHelper.downcallHandle(
        "g_action_change_state",
        constants$520.g_action_change_state$FUNC
    );
    static final FunctionDescriptor g_action_activate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_activate$MH = RuntimeHelper.downcallHandle(
        "g_action_activate",
        constants$520.g_action_activate$FUNC
    );
    static final FunctionDescriptor g_action_name_is_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_action_name_is_valid$MH = RuntimeHelper.downcallHandle(
        "g_action_name_is_valid",
        constants$520.g_action_name_is_valid$FUNC
    );
}


