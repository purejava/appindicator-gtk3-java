// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1386 {

    static final FunctionDescriptor atk_get_version$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle atk_get_version$MH = RuntimeHelper.downcallHandle(
        "atk_get_version",
        constants$1386.atk_get_version$FUNC
    );
    static final FunctionDescriptor AtkFocusHandler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle AtkFocusHandler$MH = RuntimeHelper.downcallHandle(
        constants$1386.AtkFocusHandler$FUNC
    );
    static final FunctionDescriptor atk_rectangle_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_rectangle_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_rectangle_get_type",
        constants$1386.atk_rectangle_get_type$FUNC
    );
    static final FunctionDescriptor atk_component_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_component_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_component_get_type",
        constants$1386.atk_component_get_type$FUNC
    );
    static final FunctionDescriptor atk_component_add_focus_handler$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_component_add_focus_handler$MH = RuntimeHelper.downcallHandle(
        "atk_component_add_focus_handler",
        constants$1386.atk_component_add_focus_handler$FUNC
    );
}


