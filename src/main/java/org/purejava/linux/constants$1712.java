// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1712 {

    static final FunctionDescriptor gtk_cell_layout_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_layout_clear$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_layout_clear",
        constants$1712.gtk_cell_layout_clear$FUNC
    );
    static final FunctionDescriptor gtk_cell_layout_set_attributes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_layout_set_attributes$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_cell_layout_set_attributes",
        constants$1712.gtk_cell_layout_set_attributes$FUNC
    );
    static final FunctionDescriptor gtk_cell_layout_add_attribute$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_layout_add_attribute$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_layout_add_attribute",
        constants$1712.gtk_cell_layout_add_attribute$FUNC
    );
    static final FunctionDescriptor gtk_cell_layout_set_cell_data_func$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_layout_set_cell_data_func$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_layout_set_cell_data_func",
        constants$1712.gtk_cell_layout_set_cell_data_func$FUNC
    );
    static final FunctionDescriptor gtk_cell_layout_clear_attributes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_cell_layout_clear_attributes$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_layout_clear_attributes",
        constants$1712.gtk_cell_layout_clear_attributes$FUNC
    );
    static final FunctionDescriptor gtk_cell_layout_reorder$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_cell_layout_reorder$MH = RuntimeHelper.downcallHandle(
        "gtk_cell_layout_reorder",
        constants$1712.gtk_cell_layout_reorder$FUNC
    );
}


