// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1594 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1594() {}
    static final FunctionDescriptor gtk_font_button_set_use_font$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_font_button_set_use_font$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_set_use_font",
        constants$1594.gtk_font_button_set_use_font$FUNC
    );
    static final FunctionDescriptor gtk_font_button_get_use_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_font_button_get_use_size$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_get_use_size",
        constants$1594.gtk_font_button_get_use_size$FUNC
    );
    static final FunctionDescriptor gtk_font_button_set_use_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_font_button_set_use_size$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_set_use_size",
        constants$1594.gtk_font_button_set_use_size$FUNC
    );
    static final FunctionDescriptor gtk_font_button_get_font_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_font_button_get_font_name$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_get_font_name",
        constants$1594.gtk_font_button_get_font_name$FUNC
    );
    static final FunctionDescriptor gtk_font_button_set_font_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_font_button_set_font_name$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_set_font_name",
        constants$1594.gtk_font_button_set_font_name$FUNC
    );
    static final FunctionDescriptor gtk_font_button_get_show_style$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_font_button_get_show_style$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_get_show_style",
        constants$1594.gtk_font_button_get_show_style$FUNC
    );
}


