// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1737 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1737() {}
    static final FunctionDescriptor gtk_print_context_get_pango_fontmap$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_context_get_pango_fontmap$MH = RuntimeHelper.downcallHandle(
        "gtk_print_context_get_pango_fontmap",
        constants$1737.gtk_print_context_get_pango_fontmap$FUNC
    );
    static final FunctionDescriptor gtk_print_context_create_pango_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_context_create_pango_context$MH = RuntimeHelper.downcallHandle(
        "gtk_print_context_create_pango_context",
        constants$1737.gtk_print_context_create_pango_context$FUNC
    );
    static final FunctionDescriptor gtk_print_context_create_pango_layout$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_print_context_create_pango_layout$MH = RuntimeHelper.downcallHandle(
        "gtk_print_context_create_pango_layout",
        constants$1737.gtk_print_context_create_pango_layout$FUNC
    );
    static final FunctionDescriptor gtk_print_context_set_cairo_context$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_print_context_set_cairo_context$MH = RuntimeHelper.downcallHandle(
        "gtk_print_context_set_cairo_context",
        constants$1737.gtk_print_context_set_cairo_context$FUNC
    );
    static final FunctionDescriptor GtkPrintSettingsFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GtkPrintSettingsFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkPrintSettingsFunc_UP$MH = RuntimeHelper.upcallHandle(GtkPrintSettingsFunc.class, "apply", constants$1737.GtkPrintSettingsFunc_UP$FUNC);
    static final FunctionDescriptor GtkPrintSettingsFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkPrintSettingsFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$1737.GtkPrintSettingsFunc_DOWN$FUNC
    );
}


