// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1957 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1957() {}
    static final FunctionDescriptor gtk_status_icon_is_embedded$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_is_embedded$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_is_embedded",
        constants$1957.gtk_status_icon_is_embedded$FUNC
    );
    static final FunctionDescriptor gtk_status_icon_position_menu$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_position_menu$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_position_menu",
        constants$1957.gtk_status_icon_position_menu$FUNC
    );
    static final FunctionDescriptor gtk_status_icon_get_geometry$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_get_geometry$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_get_geometry",
        constants$1957.gtk_status_icon_get_geometry$FUNC
    );
    static final FunctionDescriptor gtk_status_icon_get_has_tooltip$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_get_has_tooltip$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_get_has_tooltip",
        constants$1957.gtk_status_icon_get_has_tooltip$FUNC
    );
    static final FunctionDescriptor gtk_status_icon_get_tooltip_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_get_tooltip_text$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_get_tooltip_text",
        constants$1957.gtk_status_icon_get_tooltip_text$FUNC
    );
    static final FunctionDescriptor gtk_status_icon_get_tooltip_markup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_get_tooltip_markup$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_get_tooltip_markup",
        constants$1957.gtk_status_icon_get_tooltip_markup$FUNC
    );
}


