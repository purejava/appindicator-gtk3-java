// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1336 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1336() {}
    static final FunctionDescriptor gtk_menu_set_reserve_toggle_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_menu_set_reserve_toggle_size$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_set_reserve_toggle_size",
        constants$1336.gtk_menu_set_reserve_toggle_size$FUNC
    );
    static final FunctionDescriptor gtk_menu_get_reserve_toggle_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_get_reserve_toggle_size$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_get_reserve_toggle_size",
        constants$1336.gtk_menu_get_reserve_toggle_size$FUNC
    );
    static final FunctionDescriptor gtk_label_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_label_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_label_get_type",
        constants$1336.gtk_label_get_type$FUNC
    );
    static final FunctionDescriptor gtk_label_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_new$MH = RuntimeHelper.downcallHandle(
        "gtk_label_new",
        constants$1336.gtk_label_new$FUNC
    );
    static final FunctionDescriptor gtk_label_new_with_mnemonic$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_new_with_mnemonic$MH = RuntimeHelper.downcallHandle(
        "gtk_label_new_with_mnemonic",
        constants$1336.gtk_label_new_with_mnemonic$FUNC
    );
    static final FunctionDescriptor gtk_label_set_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_label_set_text$MH = RuntimeHelper.downcallHandle(
        "gtk_label_set_text",
        constants$1336.gtk_label_set_text$FUNC
    );
}


