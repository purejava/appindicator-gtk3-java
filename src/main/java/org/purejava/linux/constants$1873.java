// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1873 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1873() {}
    static final FunctionDescriptor gtk_tree_selection_unselect_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_selection_unselect_range$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_selection_unselect_range",
        constants$1873.gtk_tree_selection_unselect_range$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_tree_store_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_get_type",
        constants$1873.gtk_tree_store_get_type$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_store_new$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_tree_store_new",
        constants$1873.gtk_tree_store_new$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_newv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_newv$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_newv",
        constants$1873.gtk_tree_store_newv$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_set_column_types$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_set_column_types$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_set_column_types",
        constants$1873.gtk_tree_store_set_column_types$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_set_value$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_set_value$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_set_value",
        constants$1873.gtk_tree_store_set_value$FUNC
    );
}


