// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1958 {

    static final FunctionDescriptor gtk_radio_button_new_with_mnemonic_from_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_radio_button_new_with_mnemonic_from_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_radio_button_new_with_mnemonic_from_widget",
        constants$1958.gtk_radio_button_new_with_mnemonic_from_widget$FUNC
    );
    static final FunctionDescriptor gtk_radio_button_get_group$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_radio_button_get_group$MH = RuntimeHelper.downcallHandle(
        "gtk_radio_button_get_group",
        constants$1958.gtk_radio_button_get_group$FUNC
    );
    static final FunctionDescriptor gtk_radio_button_set_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_radio_button_set_group$MH = RuntimeHelper.downcallHandle(
        "gtk_radio_button_set_group",
        constants$1958.gtk_radio_button_set_group$FUNC
    );
    static final FunctionDescriptor gtk_radio_button_join_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_radio_button_join_group$MH = RuntimeHelper.downcallHandle(
        "gtk_radio_button_join_group",
        constants$1958.gtk_radio_button_join_group$FUNC
    );
    static final FunctionDescriptor gtk_radio_menu_item_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_radio_menu_item_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_radio_menu_item_get_type",
        constants$1958.gtk_radio_menu_item_get_type$FUNC
    );
    static final FunctionDescriptor gtk_radio_menu_item_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_radio_menu_item_new$MH = RuntimeHelper.downcallHandle(
        "gtk_radio_menu_item_new",
        constants$1958.gtk_radio_menu_item_new$FUNC
    );
}


