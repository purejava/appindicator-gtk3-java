// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1210 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1210() {}
    static final FunctionDescriptor AtkFocusHandler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor AtkFocusHandler_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle AtkFocusHandler_UP$MH = RuntimeHelper.upcallHandle(AtkFocusHandler.class, "apply", constants$1210.AtkFocusHandler_UP$FUNC);
    static final FunctionDescriptor AtkFocusHandler_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle AtkFocusHandler_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1210.AtkFocusHandler_DOWN$FUNC
    );
    static final FunctionDescriptor atk_rectangle_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_rectangle_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_rectangle_get_type",
        constants$1210.atk_rectangle_get_type$FUNC
    );
    static final FunctionDescriptor atk_component_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_component_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_component_get_type",
        constants$1210.atk_component_get_type$FUNC
    );
    static final FunctionDescriptor atk_component_add_focus_handler$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_component_add_focus_handler$MH = RuntimeHelper.downcallHandle(
        "atk_component_add_focus_handler",
        constants$1210.atk_component_add_focus_handler$FUNC
    );
    static final FunctionDescriptor atk_component_contains$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_component_contains$MH = RuntimeHelper.downcallHandle(
        "atk_component_contains",
        constants$1210.atk_component_contains$FUNC
    );
}


