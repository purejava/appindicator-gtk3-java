// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1589 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1589() {}
    static final FunctionDescriptor gtk_flow_box_get_activate_on_single_click$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_flow_box_get_activate_on_single_click$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_get_activate_on_single_click",
        constants$1589.gtk_flow_box_get_activate_on_single_click$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_flow_box_insert$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_insert",
        constants$1589.gtk_flow_box_insert$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_get_child_at_index$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_flow_box_get_child_at_index$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_get_child_at_index",
        constants$1589.gtk_flow_box_get_child_at_index$FUNC
    );
    static final FunctionDescriptor gtk_flow_box_get_child_at_pos$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_flow_box_get_child_at_pos$MH = RuntimeHelper.downcallHandle(
        "gtk_flow_box_get_child_at_pos",
        constants$1589.gtk_flow_box_get_child_at_pos$FUNC
    );
    static final FunctionDescriptor GtkFlowBoxForeachFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkFlowBoxForeachFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkFlowBoxForeachFunc_UP$MH = RuntimeHelper.upcallHandle(GtkFlowBoxForeachFunc.class, "apply", constants$1589.GtkFlowBoxForeachFunc_UP$FUNC);
    static final FunctionDescriptor GtkFlowBoxForeachFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkFlowBoxForeachFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1589.GtkFlowBoxForeachFunc_DOWN$FUNC
    );
}


