// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1634 {

    static final FunctionDescriptor gtk_entry_completion_set_popup_set_width$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_set_popup_set_width$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_set_popup_set_width",
        constants$1634.gtk_entry_completion_set_popup_set_width$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_get_popup_set_width$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_get_popup_set_width$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_get_popup_set_width",
        constants$1634.gtk_entry_completion_get_popup_set_width$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_set_popup_single_match$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_set_popup_single_match$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_set_popup_single_match",
        constants$1634.gtk_entry_completion_set_popup_single_match$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_get_popup_single_match$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_get_popup_single_match$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_get_popup_single_match",
        constants$1634.gtk_entry_completion_get_popup_single_match$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_get_completion_prefix$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_get_completion_prefix$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_get_completion_prefix",
        constants$1634.gtk_entry_completion_get_completion_prefix$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_set_text_column$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_set_text_column$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_set_text_column",
        constants$1634.gtk_entry_completion_set_text_column$FUNC
    );
}

