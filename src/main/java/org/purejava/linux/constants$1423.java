// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1423 {

    static final FunctionDescriptor atk_value_get_maximum_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_value_get_maximum_value$MH = RuntimeHelper.downcallHandle(
        "atk_value_get_maximum_value",
        constants$1423.atk_value_get_maximum_value$FUNC
    );
    static final FunctionDescriptor atk_value_get_minimum_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_value_get_minimum_value$MH = RuntimeHelper.downcallHandle(
        "atk_value_get_minimum_value",
        constants$1423.atk_value_get_minimum_value$FUNC
    );
    static final FunctionDescriptor atk_value_set_current_value$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_value_set_current_value$MH = RuntimeHelper.downcallHandle(
        "atk_value_set_current_value",
        constants$1423.atk_value_set_current_value$FUNC
    );
    static final FunctionDescriptor atk_value_get_minimum_increment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_value_get_minimum_increment$MH = RuntimeHelper.downcallHandle(
        "atk_value_get_minimum_increment",
        constants$1423.atk_value_get_minimum_increment$FUNC
    );
    static final FunctionDescriptor atk_value_get_value_and_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_value_get_value_and_text$MH = RuntimeHelper.downcallHandle(
        "atk_value_get_value_and_text",
        constants$1423.atk_value_get_value_and_text$FUNC
    );
    static final FunctionDescriptor atk_value_get_range$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_value_get_range$MH = RuntimeHelper.downcallHandle(
        "atk_value_get_range",
        constants$1423.atk_value_get_range$FUNC
    );
}

