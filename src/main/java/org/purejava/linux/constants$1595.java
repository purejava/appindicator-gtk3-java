// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1595 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1595() {}
    static final FunctionDescriptor gtk_font_button_set_show_style$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_font_button_set_show_style$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_set_show_style",
        constants$1595.gtk_font_button_set_show_style$FUNC
    );
    static final FunctionDescriptor gtk_font_button_get_show_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_font_button_get_show_size$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_get_show_size",
        constants$1595.gtk_font_button_get_show_size$FUNC
    );
    static final FunctionDescriptor gtk_font_button_set_show_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_font_button_set_show_size$MH = RuntimeHelper.downcallHandle(
        "gtk_font_button_set_show_size",
        constants$1595.gtk_font_button_set_show_size$FUNC
    );
    static final FunctionDescriptor GtkFontFilterFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkFontFilterFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkFontFilterFunc_UP$MH = RuntimeHelper.upcallHandle(GtkFontFilterFunc.class, "apply", constants$1595.GtkFontFilterFunc_UP$FUNC);
    static final FunctionDescriptor GtkFontFilterFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkFontFilterFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1595.GtkFontFilterFunc_DOWN$FUNC
    );
    static final FunctionDescriptor gtk_font_chooser_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_font_chooser_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_font_chooser_get_type",
        constants$1595.gtk_font_chooser_get_type$FUNC
    );
}


