// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1885 {

    static final FunctionDescriptor gtk_menu_bar_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_menu_bar_new$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_bar_new",
        constants$1885.gtk_menu_bar_new$FUNC
    );
    static final FunctionDescriptor gtk_menu_bar_new_from_model$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_bar_new_from_model$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_bar_new_from_model",
        constants$1885.gtk_menu_bar_new_from_model$FUNC
    );
    static final FunctionDescriptor gtk_menu_bar_get_pack_direction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_bar_get_pack_direction$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_bar_get_pack_direction",
        constants$1885.gtk_menu_bar_get_pack_direction$FUNC
    );
    static final FunctionDescriptor gtk_menu_bar_set_pack_direction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_menu_bar_set_pack_direction$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_bar_set_pack_direction",
        constants$1885.gtk_menu_bar_set_pack_direction$FUNC
    );
    static final FunctionDescriptor gtk_menu_bar_get_child_pack_direction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_menu_bar_get_child_pack_direction$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_bar_get_child_pack_direction",
        constants$1885.gtk_menu_bar_get_child_pack_direction$FUNC
    );
    static final FunctionDescriptor gtk_menu_bar_set_child_pack_direction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_menu_bar_set_child_pack_direction$MH = RuntimeHelper.downcallHandle(
        "gtk_menu_bar_set_child_pack_direction",
        constants$1885.gtk_menu_bar_set_child_pack_direction$FUNC
    );
}

