// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1452 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1452() {}
    static final FunctionDescriptor gtk_entry_set_has_frame$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_has_frame$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_has_frame",
        constants$1452.gtk_entry_set_has_frame$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_has_frame$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_has_frame$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_has_frame",
        constants$1452.gtk_entry_get_has_frame$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_inner_border$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_set_inner_border$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_inner_border",
        constants$1452.gtk_entry_set_inner_border$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_inner_border$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_inner_border$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_inner_border",
        constants$1452.gtk_entry_get_inner_border$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_overwrite_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_overwrite_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_overwrite_mode",
        constants$1452.gtk_entry_set_overwrite_mode$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_overwrite_mode$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_overwrite_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_overwrite_mode",
        constants$1452.gtk_entry_get_overwrite_mode$FUNC
    );
}


