// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1246 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1246() {}
    static final FunctionDescriptor atk_value_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle atk_value_set_value$MH = RuntimeHelper.downcallHandle(
        "atk_value_set_value",
        constants$1246.atk_value_set_value$FUNC
    );
    static final FunctionDescriptor atk_value_type_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_value_type_get_name$MH = RuntimeHelper.downcallHandle(
        "atk_value_type_get_name",
        constants$1246.atk_value_type_get_name$FUNC
    );
    static final FunctionDescriptor atk_value_type_get_localized_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_value_type_get_localized_name$MH = RuntimeHelper.downcallHandle(
        "atk_value_type_get_localized_name",
        constants$1246.atk_value_type_get_localized_name$FUNC
    );
    static final FunctionDescriptor atk_window_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle atk_window_get_type$MH = RuntimeHelper.downcallHandle(
        "atk_window_get_type",
        constants$1246.atk_window_get_type$FUNC
    );
    static final FunctionDescriptor GtkCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkCallback_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkCallback_UP$MH = RuntimeHelper.upcallHandle(GtkCallback.class, "apply", constants$1246.GtkCallback_UP$FUNC);
    static final FunctionDescriptor GtkCallback_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkCallback_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1246.GtkCallback_DOWN$FUNC
    );
}

