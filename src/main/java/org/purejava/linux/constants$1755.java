// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1755 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1755() {}
    static final FunctionDescriptor gtk_print_operation_is_finished$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_is_finished$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_is_finished",
        constants$1755.gtk_print_operation_is_finished$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_cancel$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_cancel$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_cancel",
        constants$1755.gtk_print_operation_cancel$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_draw_page_finish$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_draw_page_finish$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_draw_page_finish",
        constants$1755.gtk_print_operation_draw_page_finish$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_set_defer_drawing$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_set_defer_drawing$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_set_defer_drawing",
        constants$1755.gtk_print_operation_set_defer_drawing$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_set_support_selection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_print_operation_set_support_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_set_support_selection",
        constants$1755.gtk_print_operation_set_support_selection$FUNC
    );
    static final FunctionDescriptor gtk_print_operation_get_support_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_operation_get_support_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_print_operation_get_support_selection",
        constants$1755.gtk_print_operation_get_support_selection$FUNC
    );
}


