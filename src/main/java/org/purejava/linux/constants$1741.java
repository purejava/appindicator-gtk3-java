// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1741 {

    static final FunctionDescriptor gtk_combo_box_text_append_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_text_append_text$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_append_text",
        constants$1741.gtk_combo_box_text_append_text$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_text_insert_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_text_insert_text$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_insert_text",
        constants$1741.gtk_combo_box_text_insert_text$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_text_prepend_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_text_prepend_text$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_prepend_text",
        constants$1741.gtk_combo_box_text_prepend_text$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_text_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_combo_box_text_remove$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_remove",
        constants$1741.gtk_combo_box_text_remove$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_text_remove_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_text_remove_all$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_remove_all",
        constants$1741.gtk_combo_box_text_remove_all$FUNC
    );
    static final FunctionDescriptor gtk_combo_box_text_get_active_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_combo_box_text_get_active_text$MH = RuntimeHelper.downcallHandle(
        "gtk_combo_box_text_get_active_text",
        constants$1741.gtk_combo_box_text_get_active_text$FUNC
    );
}


