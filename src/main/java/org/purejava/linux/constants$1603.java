// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1603 {

    static final FunctionDescriptor gtk_text_iter_set_line$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_iter_set_line$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_set_line",
        constants$1603.gtk_text_iter_set_line$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_set_line_offset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_iter_set_line_offset$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_set_line_offset",
        constants$1603.gtk_text_iter_set_line_offset$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_set_line_index$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_iter_set_line_index$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_set_line_index",
        constants$1603.gtk_text_iter_set_line_index$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_forward_to_end$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_forward_to_end$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_forward_to_end",
        constants$1603.gtk_text_iter_forward_to_end$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_forward_to_line_end$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_iter_forward_to_line_end$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_forward_to_line_end",
        constants$1603.gtk_text_iter_forward_to_line_end$FUNC
    );
    static final FunctionDescriptor gtk_text_iter_set_visible_line_offset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_iter_set_visible_line_offset$MH = RuntimeHelper.downcallHandle(
        "gtk_text_iter_set_visible_line_offset",
        constants$1603.gtk_text_iter_set_visible_line_offset$FUNC
    );
}

