// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1827 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1827() {}
    static final FunctionDescriptor gtk_text_buffer_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_set_text$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_set_text",
        constants$1827.gtk_text_buffer_set_text$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_insert$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_insert",
        constants$1827.gtk_text_buffer_insert$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_insert_at_cursor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_insert_at_cursor$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_insert_at_cursor",
        constants$1827.gtk_text_buffer_insert_at_cursor$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_insert_interactive$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_insert_interactive$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_insert_interactive",
        constants$1827.gtk_text_buffer_insert_interactive$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_insert_interactive_at_cursor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_insert_interactive_at_cursor$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_insert_interactive_at_cursor",
        constants$1827.gtk_text_buffer_insert_interactive_at_cursor$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_insert_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_insert_range$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_insert_range",
        constants$1827.gtk_text_buffer_insert_range$FUNC
    );
}


