// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1482 {

    static final FunctionDescriptor gtk_window_add_accel_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_add_accel_group$MH = RuntimeHelper.downcallHandle(
        "gtk_window_add_accel_group",
        constants$1482.gtk_window_add_accel_group$FUNC
    );
    static final FunctionDescriptor gtk_window_remove_accel_group$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_remove_accel_group$MH = RuntimeHelper.downcallHandle(
        "gtk_window_remove_accel_group",
        constants$1482.gtk_window_remove_accel_group$FUNC
    );
    static final FunctionDescriptor gtk_window_set_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_position$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_position",
        constants$1482.gtk_window_set_position$FUNC
    );
    static final FunctionDescriptor gtk_window_activate_focus$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_activate_focus$MH = RuntimeHelper.downcallHandle(
        "gtk_window_activate_focus",
        constants$1482.gtk_window_activate_focus$FUNC
    );
    static final FunctionDescriptor gtk_window_set_focus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_focus$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_focus",
        constants$1482.gtk_window_set_focus$FUNC
    );
    static final FunctionDescriptor gtk_window_get_focus$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_focus$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_focus",
        constants$1482.gtk_window_get_focus$FUNC
    );
}


