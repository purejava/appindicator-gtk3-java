// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1417 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1417() {}
    static final FunctionDescriptor gtk_target_list_add_text_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_target_list_add_text_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_target_list_add_text_targets",
        constants$1417.gtk_target_list_add_text_targets$FUNC
    );
    static final FunctionDescriptor gtk_target_list_add_rich_text_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_target_list_add_rich_text_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_target_list_add_rich_text_targets",
        constants$1417.gtk_target_list_add_rich_text_targets$FUNC
    );
    static final FunctionDescriptor gtk_target_list_add_image_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_target_list_add_image_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_target_list_add_image_targets",
        constants$1417.gtk_target_list_add_image_targets$FUNC
    );
    static final FunctionDescriptor gtk_target_list_add_uri_targets$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_target_list_add_uri_targets$MH = RuntimeHelper.downcallHandle(
        "gtk_target_list_add_uri_targets",
        constants$1417.gtk_target_list_add_uri_targets$FUNC
    );
    static final FunctionDescriptor gtk_target_list_add_table$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_target_list_add_table$MH = RuntimeHelper.downcallHandle(
        "gtk_target_list_add_table",
        constants$1417.gtk_target_list_add_table$FUNC
    );
    static final FunctionDescriptor gtk_target_list_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_target_list_remove$MH = RuntimeHelper.downcallHandle(
        "gtk_target_list_remove",
        constants$1417.gtk_target_list_remove$FUNC
    );
}


