// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1728 {

    static final FunctionDescriptor gtk_check_menu_item_set_draw_as_radio$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_check_menu_item_set_draw_as_radio$MH = RuntimeHelper.downcallHandle(
        "gtk_check_menu_item_set_draw_as_radio",
        constants$1728.gtk_check_menu_item_set_draw_as_radio$FUNC
    );
    static final FunctionDescriptor gtk_check_menu_item_get_draw_as_radio$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_check_menu_item_get_draw_as_radio$MH = RuntimeHelper.downcallHandle(
        "gtk_check_menu_item_get_draw_as_radio",
        constants$1728.gtk_check_menu_item_get_draw_as_radio$FUNC
    );
    static final FunctionDescriptor GtkClipboardReceivedFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkClipboardReceivedFunc$MH = RuntimeHelper.downcallHandle(
        constants$1728.GtkClipboardReceivedFunc$FUNC
    );
    static final FunctionDescriptor GtkClipboardTextReceivedFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkClipboardTextReceivedFunc$MH = RuntimeHelper.downcallHandle(
        constants$1728.GtkClipboardTextReceivedFunc$FUNC
    );
}

