// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1309 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1309() {}
    static final FunctionDescriptor gtk_window_set_default_icon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_default_icon$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_default_icon",
        constants$1309.gtk_window_set_default_icon$FUNC
    );
    static final FunctionDescriptor gtk_window_set_default_icon_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_default_icon_name$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_default_icon_name",
        constants$1309.gtk_window_set_default_icon_name$FUNC
    );
    static final FunctionDescriptor gtk_window_get_default_icon_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_window_get_default_icon_name$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_default_icon_name",
        constants$1309.gtk_window_get_default_icon_name$FUNC
    );
    static final FunctionDescriptor gtk_window_set_default_icon_from_file$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_default_icon_from_file$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_default_icon_from_file",
        constants$1309.gtk_window_set_default_icon_from_file$FUNC
    );
    static final FunctionDescriptor gtk_window_set_auto_startup_notification$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_auto_startup_notification$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_auto_startup_notification",
        constants$1309.gtk_window_set_auto_startup_notification$FUNC
    );
    static final FunctionDescriptor gtk_window_set_modal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_modal$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_modal",
        constants$1309.gtk_window_set_modal$FUNC
    );
}


