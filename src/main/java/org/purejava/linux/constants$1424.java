// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1424 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1424() {}
    static final FunctionDescriptor gtk_selection_data_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_selection_data_free$MH = RuntimeHelper.downcallHandle(
        "gtk_selection_data_free",
        constants$1424.gtk_selection_data_free$FUNC
    );
    static final FunctionDescriptor gtk_target_entry_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_target_entry_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_target_entry_get_type",
        constants$1424.gtk_target_entry_get_type$FUNC
    );
    static final FunctionDescriptor gtk_target_entry_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_target_entry_new$MH = RuntimeHelper.downcallHandle(
        "gtk_target_entry_new",
        constants$1424.gtk_target_entry_new$FUNC
    );
    static final FunctionDescriptor gtk_target_entry_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_target_entry_copy$MH = RuntimeHelper.downcallHandle(
        "gtk_target_entry_copy",
        constants$1424.gtk_target_entry_copy$FUNC
    );
    static final FunctionDescriptor gtk_target_entry_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_target_entry_free$MH = RuntimeHelper.downcallHandle(
        "gtk_target_entry_free",
        constants$1424.gtk_target_entry_free$FUNC
    );
    static final FunctionDescriptor gtk_drag_get_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_drag_get_data$MH = RuntimeHelper.downcallHandle(
        "gtk_drag_get_data",
        constants$1424.gtk_drag_get_data$FUNC
    );
}


