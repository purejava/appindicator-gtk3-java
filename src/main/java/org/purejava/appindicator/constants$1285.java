// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1285 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1285() {}
    static final FunctionDescriptor gtk_widget_get_modifier_mask$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_get_modifier_mask$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_modifier_mask",
        constants$1285.gtk_widget_get_modifier_mask$FUNC
    );
    static final FunctionDescriptor gtk_widget_insert_action_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_insert_action_group$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_insert_action_group",
        constants$1285.gtk_widget_insert_action_group$FUNC
    );
    static final FunctionDescriptor gtk_widget_add_tick_callback$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_add_tick_callback$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_add_tick_callback",
        constants$1285.gtk_widget_add_tick_callback$FUNC
    );
    static final FunctionDescriptor gtk_widget_remove_tick_callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_widget_remove_tick_callback$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_remove_tick_callback",
        constants$1285.gtk_widget_remove_tick_callback$FUNC
    );
    static final FunctionDescriptor gtk_widget_init_template$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_init_template$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_init_template",
        constants$1285.gtk_widget_init_template$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_template_child$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_template_child$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_template_child",
        constants$1285.gtk_widget_get_template_child$FUNC
    );
}


