// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1771 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1771() {}
    static final FunctionDescriptor gtk_recent_manager_add_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_add_full$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_add_full",
        constants$1771.gtk_recent_manager_add_full$FUNC
    );
    static final FunctionDescriptor gtk_recent_manager_remove_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_remove_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_remove_item",
        constants$1771.gtk_recent_manager_remove_item$FUNC
    );
    static final FunctionDescriptor gtk_recent_manager_lookup_item$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_lookup_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_lookup_item",
        constants$1771.gtk_recent_manager_lookup_item$FUNC
    );
    static final FunctionDescriptor gtk_recent_manager_has_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_has_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_has_item",
        constants$1771.gtk_recent_manager_has_item$FUNC
    );
    static final FunctionDescriptor gtk_recent_manager_move_item$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_move_item$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_move_item",
        constants$1771.gtk_recent_manager_move_item$FUNC
    );
    static final FunctionDescriptor gtk_recent_manager_get_items$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_manager_get_items$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_manager_get_items",
        constants$1771.gtk_recent_manager_get_items$FUNC
    );
}


