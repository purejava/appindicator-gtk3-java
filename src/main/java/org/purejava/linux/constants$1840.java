// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1840 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1840() {}
    static final FunctionDescriptor gtk_text_view_get_buffer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_get_buffer$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_get_buffer",
        constants$1840.gtk_text_view_get_buffer$FUNC
    );
    static final FunctionDescriptor gtk_text_view_scroll_to_iter$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_text_view_scroll_to_iter$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_scroll_to_iter",
        constants$1840.gtk_text_view_scroll_to_iter$FUNC
    );
    static final FunctionDescriptor gtk_text_view_scroll_to_mark$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_text_view_scroll_to_mark$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_scroll_to_mark",
        constants$1840.gtk_text_view_scroll_to_mark$FUNC
    );
    static final FunctionDescriptor gtk_text_view_scroll_mark_onscreen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_scroll_mark_onscreen$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_scroll_mark_onscreen",
        constants$1840.gtk_text_view_scroll_mark_onscreen$FUNC
    );
    static final FunctionDescriptor gtk_text_view_move_mark_onscreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_move_mark_onscreen$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_move_mark_onscreen",
        constants$1840.gtk_text_view_move_mark_onscreen$FUNC
    );
    static final FunctionDescriptor gtk_text_view_place_cursor_onscreen$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_view_place_cursor_onscreen$MH = RuntimeHelper.downcallHandle(
        "gtk_text_view_place_cursor_onscreen",
        constants$1840.gtk_text_view_place_cursor_onscreen$FUNC
    );
}


