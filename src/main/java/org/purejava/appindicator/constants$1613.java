// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1613 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1613() {}
    static final FunctionDescriptor gtk_grid_attach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_attach$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_attach",
        constants$1613.gtk_grid_attach$FUNC
    );
    static final FunctionDescriptor gtk_grid_attach_next_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_attach_next_to$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_attach_next_to",
        constants$1613.gtk_grid_attach_next_to$FUNC
    );
    static final FunctionDescriptor gtk_grid_get_child_at$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_get_child_at$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_get_child_at",
        constants$1613.gtk_grid_get_child_at$FUNC
    );
    static final FunctionDescriptor gtk_grid_insert_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_insert_row$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_insert_row",
        constants$1613.gtk_grid_insert_row$FUNC
    );
    static final FunctionDescriptor gtk_grid_insert_column$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_insert_column$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_insert_column",
        constants$1613.gtk_grid_insert_column$FUNC
    );
    static final FunctionDescriptor gtk_grid_remove_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_grid_remove_row$MH = RuntimeHelper.downcallHandle(
        "gtk_grid_remove_row",
        constants$1613.gtk_grid_remove_row$FUNC
    );
}


