// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1363 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1363() {}
    static final FunctionDescriptor gtk_tree_path_new_first$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_tree_path_new_first$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_new_first",
        constants$1363.gtk_tree_path_new_first$FUNC
    );
    static final FunctionDescriptor gtk_tree_path_append_index$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_path_append_index$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_append_index",
        constants$1363.gtk_tree_path_append_index$FUNC
    );
    static final FunctionDescriptor gtk_tree_path_prepend_index$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_path_prepend_index$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_prepend_index",
        constants$1363.gtk_tree_path_prepend_index$FUNC
    );
    static final FunctionDescriptor gtk_tree_path_get_depth$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_path_get_depth$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_get_depth",
        constants$1363.gtk_tree_path_get_depth$FUNC
    );
    static final FunctionDescriptor gtk_tree_path_get_indices$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_path_get_indices$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_get_indices",
        constants$1363.gtk_tree_path_get_indices$FUNC
    );
    static final FunctionDescriptor gtk_tree_path_get_indices_with_depth$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_path_get_indices_with_depth$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_path_get_indices_with_depth",
        constants$1363.gtk_tree_path_get_indices_with_depth$FUNC
    );
}


