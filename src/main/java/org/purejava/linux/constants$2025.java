// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2025 {

    static final FunctionDescriptor gtk_text_buffer_insert_range_interactive$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_insert_range_interactive$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_insert_range_interactive",
        constants$2025.gtk_text_buffer_insert_range_interactive$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_insert_with_tags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_insert_with_tags$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_text_buffer_insert_with_tags",
        constants$2025.gtk_text_buffer_insert_with_tags$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_insert_with_tags_by_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_insert_with_tags_by_name$MH = RuntimeHelper.downcallHandleVariadic(
        "gtk_text_buffer_insert_with_tags_by_name",
        constants$2025.gtk_text_buffer_insert_with_tags_by_name$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_insert_markup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_insert_markup$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_insert_markup",
        constants$2025.gtk_text_buffer_insert_markup$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_delete$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_delete$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_delete",
        constants$2025.gtk_text_buffer_delete$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_delete_interactive$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_delete_interactive$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_delete_interactive",
        constants$2025.gtk_text_buffer_delete_interactive$FUNC
    );
}


