// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1965 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1965() {}
    static final FunctionDescriptor gtk_widget_modify_style$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_modify_style$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_modify_style",
        constants$1965.gtk_widget_modify_style$FUNC
    );
    static final FunctionDescriptor gtk_widget_get_modifier_style$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_modifier_style$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_modifier_style",
        constants$1965.gtk_widget_get_modifier_style$FUNC
    );
    static final FunctionDescriptor gtk_widget_modify_fg$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_modify_fg$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_modify_fg",
        constants$1965.gtk_widget_modify_fg$FUNC
    );
    static final FunctionDescriptor gtk_widget_modify_bg$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_modify_bg$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_modify_bg",
        constants$1965.gtk_widget_modify_bg$FUNC
    );
    static final FunctionDescriptor gtk_widget_modify_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_modify_text$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_modify_text",
        constants$1965.gtk_widget_modify_text$FUNC
    );
    static final FunctionDescriptor gtk_widget_modify_base$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_modify_base$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_modify_base",
        constants$1965.gtk_widget_modify_base$FUNC
    );
}


