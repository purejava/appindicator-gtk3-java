// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1386 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1386() {}
    static final FunctionDescriptor gtk_cell_area_set_focus_cell$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_set_focus_cell$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_set_focus_cell",
        constants$1386.gtk_cell_area_set_focus_cell$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_get_focus_cell$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_get_focus_cell$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_get_focus_cell",
        constants$1386.gtk_cell_area_get_focus_cell$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_add_focus_sibling$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_add_focus_sibling$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_add_focus_sibling",
        constants$1386.gtk_cell_area_add_focus_sibling$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_remove_focus_sibling$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_remove_focus_sibling$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_remove_focus_sibling",
        constants$1386.gtk_cell_area_remove_focus_sibling$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_is_focus_sibling$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_is_focus_sibling$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_is_focus_sibling",
        constants$1386.gtk_cell_area_is_focus_sibling$FUNC
    );
    static final FunctionDescriptor gtk_cell_area_get_focus_siblings$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_area_get_focus_siblings$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_area_get_focus_siblings",
        constants$1386.gtk_cell_area_get_focus_siblings$FUNC
    );
}


