// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2042 {

    static final FunctionDescriptor gtk_text_view_im_context_filter_keypress$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_im_context_filter_keypress$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_im_context_filter_keypress",
        constants$2042.gtk_text_view_im_context_filter_keypress$FUNC
    );
    static final FunctionDescriptor gtk_text_view_reset_im_context$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_reset_im_context$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_reset_im_context",
        constants$2042.gtk_text_view_reset_im_context$FUNC
    );
    static final FunctionDescriptor gtk_text_view_add_child_at_anchor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_add_child_at_anchor$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_add_child_at_anchor",
        constants$2042.gtk_text_view_add_child_at_anchor$FUNC
    );
    static final FunctionDescriptor gtk_text_view_add_child_in_window$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_view_add_child_in_window$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_add_child_in_window",
        constants$2042.gtk_text_view_add_child_in_window$FUNC
    );
    static final FunctionDescriptor gtk_text_view_move_child$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_view_move_child$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_move_child",
        constants$2042.gtk_text_view_move_child$FUNC
    );
    static final FunctionDescriptor gtk_text_view_set_wrap_mode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_view_set_wrap_mode$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_set_wrap_mode",
        constants$2042.gtk_text_view_set_wrap_mode$FUNC
    );
}


