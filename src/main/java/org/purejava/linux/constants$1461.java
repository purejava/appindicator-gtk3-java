// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1461 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1461() {}
    static final FunctionDescriptor gtk_entry_get_icon_area$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_icon_area$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_icon_area",
        constants$1461.gtk_entry_get_icon_area$FUNC
    );
    static final FunctionDescriptor gtk_entry_im_context_filter_keypress$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_im_context_filter_keypress$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_im_context_filter_keypress",
        constants$1461.gtk_entry_im_context_filter_keypress$FUNC
    );
    static final FunctionDescriptor gtk_entry_reset_im_context$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_reset_im_context$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_reset_im_context",
        constants$1461.gtk_entry_reset_im_context$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_input_purpose$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_input_purpose$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_input_purpose",
        constants$1461.gtk_entry_set_input_purpose$FUNC
    );
    static final FunctionDescriptor gtk_entry_get_input_purpose$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_get_input_purpose$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_get_input_purpose",
        constants$1461.gtk_entry_get_input_purpose$FUNC
    );
    static final FunctionDescriptor gtk_entry_set_input_hints$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_set_input_hints$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_set_input_hints",
        constants$1461.gtk_entry_set_input_hints$FUNC
    );
}


