// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1657 {

    static final FunctionDescriptor gtk_tree_view_set_headers_clickable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_headers_clickable$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_headers_clickable",
        constants$1657.gtk_tree_view_set_headers_clickable$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_set_rules_hint$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_rules_hint$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_rules_hint",
        constants$1657.gtk_tree_view_set_rules_hint$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_rules_hint$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_rules_hint$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_rules_hint",
        constants$1657.gtk_tree_view_get_rules_hint$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_get_activate_on_single_click$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_get_activate_on_single_click$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_get_activate_on_single_click",
        constants$1657.gtk_tree_view_get_activate_on_single_click$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_set_activate_on_single_click$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_view_set_activate_on_single_click$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_set_activate_on_single_click",
        constants$1657.gtk_tree_view_set_activate_on_single_click$FUNC
    );
    static final FunctionDescriptor gtk_tree_view_append_column$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_view_append_column$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_view_append_column",
        constants$1657.gtk_tree_view_append_column$FUNC
    );
}


