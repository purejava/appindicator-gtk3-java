// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1914 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1914() {}
    static final FunctionDescriptor gtk_action_set_visible_horizontal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_action_set_visible_horizontal$MH = RuntimeHelper.downcallHandle(
        "gtk_action_set_visible_horizontal",
        constants$1914.gtk_action_set_visible_horizontal$FUNC
    );
    static final FunctionDescriptor gtk_action_get_visible_horizontal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_action_get_visible_horizontal$MH = RuntimeHelper.downcallHandle(
        "gtk_action_get_visible_horizontal",
        constants$1914.gtk_action_get_visible_horizontal$FUNC
    );
    static final FunctionDescriptor gtk_action_set_visible_vertical$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_action_set_visible_vertical$MH = RuntimeHelper.downcallHandle(
        "gtk_action_set_visible_vertical",
        constants$1914.gtk_action_set_visible_vertical$FUNC
    );
    static final FunctionDescriptor gtk_action_get_visible_vertical$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_action_get_visible_vertical$MH = RuntimeHelper.downcallHandle(
        "gtk_action_get_visible_vertical",
        constants$1914.gtk_action_get_visible_vertical$FUNC
    );
    static final FunctionDescriptor gtk_action_set_is_important$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_action_set_is_important$MH = RuntimeHelper.downcallHandle(
        "gtk_action_set_is_important",
        constants$1914.gtk_action_set_is_important$FUNC
    );
    static final FunctionDescriptor gtk_action_get_is_important$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_action_get_is_important$MH = RuntimeHelper.downcallHandle(
        "gtk_action_get_is_important",
        constants$1914.gtk_action_get_is_important$FUNC
    );
}


