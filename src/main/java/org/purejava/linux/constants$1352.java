// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1352 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1352() {}
    static final FunctionDescriptor gtk_action_bar_pack_end$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_action_bar_pack_end$MH = RuntimeHelper.downcallHandle(
        "gtk_action_bar_pack_end",
        constants$1352.gtk_action_bar_pack_end$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_adjustment_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_get_type",
        constants$1352.gtk_adjustment_get_type$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_adjustment_new$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_new",
        constants$1352.gtk_adjustment_new$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_adjustment_changed$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_changed",
        constants$1352.gtk_adjustment_changed$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_value_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_adjustment_value_changed$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_value_changed",
        constants$1352.gtk_adjustment_value_changed$FUNC
    );
    static final FunctionDescriptor gtk_adjustment_clamp_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_adjustment_clamp_page$MH = RuntimeHelper.downcallHandle(
        "gtk_adjustment_clamp_page",
        constants$1352.gtk_adjustment_clamp_page$FUNC
    );
}


