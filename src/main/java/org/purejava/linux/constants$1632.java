// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1632 {

    static final FunctionDescriptor gtk_entry_completion_compute_prefix$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_compute_prefix$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_compute_prefix",
        constants$1632.gtk_entry_completion_compute_prefix$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_complete$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_complete$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_complete",
        constants$1632.gtk_entry_completion_complete$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_insert_prefix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_insert_prefix$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_insert_prefix",
        constants$1632.gtk_entry_completion_insert_prefix$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_insert_action_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_insert_action_text$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_insert_action_text",
        constants$1632.gtk_entry_completion_insert_action_text$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_insert_action_markup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_insert_action_markup$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_insert_action_markup",
        constants$1632.gtk_entry_completion_insert_action_markup$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_delete_action$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_delete_action$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_delete_action",
        constants$1632.gtk_entry_completion_delete_action$FUNC
    );
}


