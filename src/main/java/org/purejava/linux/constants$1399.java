// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1399 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1399() {}
    static final FunctionDescriptor gtk_text_child_anchor_get_widgets$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_child_anchor_get_widgets$MH = RuntimeHelper.downcallHandle(
        "gtk_text_child_anchor_get_widgets",
        constants$1399.gtk_text_child_anchor_get_widgets$FUNC
    );
    static final FunctionDescriptor gtk_text_child_anchor_get_deleted$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_child_anchor_get_deleted$MH = RuntimeHelper.downcallHandle(
        "gtk_text_child_anchor_get_deleted",
        constants$1399.gtk_text_child_anchor_get_deleted$FUNC
    );
    static final FunctionDescriptor gtk_text_tag_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_text_tag_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_text_tag_get_type",
        constants$1399.gtk_text_tag_get_type$FUNC
    );
    static final FunctionDescriptor gtk_text_tag_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_tag_new$MH = RuntimeHelper.downcallHandle(
        "gtk_text_tag_new",
        constants$1399.gtk_text_tag_new$FUNC
    );
    static final FunctionDescriptor gtk_text_tag_get_priority$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_tag_get_priority$MH = RuntimeHelper.downcallHandle(
        "gtk_text_tag_get_priority",
        constants$1399.gtk_text_tag_get_priority$FUNC
    );
    static final FunctionDescriptor gtk_text_tag_set_priority$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_tag_set_priority$MH = RuntimeHelper.downcallHandle(
        "gtk_text_tag_set_priority",
        constants$1399.gtk_text_tag_set_priority$FUNC
    );
}


