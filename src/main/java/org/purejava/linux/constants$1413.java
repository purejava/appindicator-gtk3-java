// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1413 {

    static final FunctionDescriptor atk_state_set_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_state_set_is_empty$MH = RuntimeHelper.downcallHandle(
        "atk_state_set_is_empty",
        constants$1413.atk_state_set_is_empty$FUNC
    );
    static final FunctionDescriptor atk_state_set_add_state$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_state_set_add_state$MH = RuntimeHelper.downcallHandle(
        "atk_state_set_add_state",
        constants$1413.atk_state_set_add_state$FUNC
    );
    static final FunctionDescriptor atk_state_set_add_states$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_state_set_add_states$MH = RuntimeHelper.downcallHandle(
        "atk_state_set_add_states",
        constants$1413.atk_state_set_add_states$FUNC
    );
    static final FunctionDescriptor atk_state_set_clear_states$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_state_set_clear_states$MH = RuntimeHelper.downcallHandle(
        "atk_state_set_clear_states",
        constants$1413.atk_state_set_clear_states$FUNC
    );
    static final FunctionDescriptor atk_state_set_contains_state$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_state_set_contains_state$MH = RuntimeHelper.downcallHandle(
        "atk_state_set_contains_state",
        constants$1413.atk_state_set_contains_state$FUNC
    );
    static final FunctionDescriptor atk_state_set_contains_states$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_state_set_contains_states$MH = RuntimeHelper.downcallHandle(
        "atk_state_set_contains_states",
        constants$1413.atk_state_set_contains_states$FUNC
    );
}

