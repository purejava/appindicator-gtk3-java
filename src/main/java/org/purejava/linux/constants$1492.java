// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1492 {

    static final FunctionDescriptor gtk_window_set_default_icon_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_default_icon_from_file$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_default_icon_from_file",
        constants$1492.gtk_window_set_default_icon_from_file$FUNC
    );
    static final FunctionDescriptor gtk_window_set_auto_startup_notification$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_auto_startup_notification$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_auto_startup_notification",
        constants$1492.gtk_window_set_auto_startup_notification$FUNC
    );
    static final FunctionDescriptor gtk_window_set_modal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_modal$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_modal",
        constants$1492.gtk_window_set_modal$FUNC
    );
    static final FunctionDescriptor gtk_window_get_modal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_modal$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_modal",
        constants$1492.gtk_window_get_modal$FUNC
    );
    static final FunctionDescriptor gtk_window_list_toplevels$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_window_list_toplevels$MH = RuntimeHelper.downcallHandle(
        "gtk_window_list_toplevels",
        constants$1492.gtk_window_list_toplevels$FUNC
    );
    static final FunctionDescriptor gtk_window_set_has_user_ref_count$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_has_user_ref_count$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_has_user_ref_count",
        constants$1492.gtk_window_set_has_user_ref_count$FUNC
    );
}

