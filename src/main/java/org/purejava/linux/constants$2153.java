// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2153 {

    static final FunctionDescriptor gtk_status_icon_set_tooltip_markup$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_set_tooltip_markup$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_set_tooltip_markup",
        constants$2153.gtk_status_icon_set_tooltip_markup$FUNC
    );
    static final FunctionDescriptor gtk_status_icon_set_title$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_set_title$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_set_title",
        constants$2153.gtk_status_icon_set_title$FUNC
    );
    static final FunctionDescriptor gtk_status_icon_get_title$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_get_title$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_get_title",
        constants$2153.gtk_status_icon_get_title$FUNC
    );
    static final FunctionDescriptor gtk_status_icon_set_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_set_name$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_set_name",
        constants$2153.gtk_status_icon_set_name$FUNC
    );
    static final FunctionDescriptor gtk_status_icon_set_visible$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_status_icon_set_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_set_visible",
        constants$2153.gtk_status_icon_set_visible$FUNC
    );
    static final FunctionDescriptor gtk_status_icon_get_visible$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_status_icon_get_visible$MH = RuntimeHelper.downcallHandle(
        "gtk_status_icon_get_visible",
        constants$2153.gtk_status_icon_get_visible$FUNC
    );
}


