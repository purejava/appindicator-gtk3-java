// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1513 {

    static final FunctionDescriptor gtk_misc_get_alignment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_misc_get_alignment$MH = RuntimeHelper.downcallHandle(
        "gtk_misc_get_alignment",
        constants$1513.gtk_misc_get_alignment$FUNC
    );
    static final FunctionDescriptor gtk_misc_set_padding$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_misc_set_padding$MH = RuntimeHelper.downcallHandle(
        "gtk_misc_set_padding",
        constants$1513.gtk_misc_set_padding$FUNC
    );
    static final FunctionDescriptor gtk_misc_get_padding$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_misc_get_padding$MH = RuntimeHelper.downcallHandle(
        "gtk_misc_get_padding",
        constants$1513.gtk_misc_get_padding$FUNC
    );
    static final FunctionDescriptor _gtk_misc_get_padding_and_border$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gtk_misc_get_padding_and_border$MH = RuntimeHelper.downcallHandle(
        "_gtk_misc_get_padding_and_border",
        constants$1513._gtk_misc_get_padding_and_border$FUNC
    );
    static final FunctionDescriptor gtk_menu_shell_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_menu_shell_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_shell_get_type",
        constants$1513.gtk_menu_shell_get_type$FUNC
    );
    static final FunctionDescriptor gtk_menu_shell_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_shell_append$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_shell_append",
        constants$1513.gtk_menu_shell_append$FUNC
    );
}

