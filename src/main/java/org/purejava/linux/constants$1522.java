// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1522 {

    static final FunctionDescriptor gtk_menu_set_monitor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_menu_set_monitor$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_set_monitor",
        constants$1522.gtk_menu_set_monitor$FUNC
    );
    static final FunctionDescriptor gtk_menu_get_monitor$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_get_monitor$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_get_monitor",
        constants$1522.gtk_menu_get_monitor$FUNC
    );
    static final FunctionDescriptor gtk_menu_place_on_monitor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_place_on_monitor$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_place_on_monitor",
        constants$1522.gtk_menu_place_on_monitor$FUNC
    );
    static final FunctionDescriptor gtk_menu_get_for_attach_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_get_for_attach_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_get_for_attach_widget",
        constants$1522.gtk_menu_get_for_attach_widget$FUNC
    );
    static final FunctionDescriptor gtk_menu_set_reserve_toggle_size$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_menu_set_reserve_toggle_size$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_set_reserve_toggle_size",
        constants$1522.gtk_menu_set_reserve_toggle_size$FUNC
    );
    static final FunctionDescriptor gtk_menu_get_reserve_toggle_size$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_get_reserve_toggle_size$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_get_reserve_toggle_size",
        constants$1522.gtk_menu_get_reserve_toggle_size$FUNC
    );
}


