// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1368 {

    static final FunctionDescriptor gtk_accel_group_disconnect_key$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accel_group_disconnect_key$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_group_disconnect_key",
        constants$1368.gtk_accel_group_disconnect_key$FUNC
    );
    static final FunctionDescriptor gtk_accel_group_activate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accel_group_activate$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_group_activate",
        constants$1368.gtk_accel_group_activate$FUNC
    );
    static final FunctionDescriptor _gtk_accel_group_attach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gtk_accel_group_attach$MH = RuntimeHelper.downcallHandle(
        "_gtk_accel_group_attach",
        constants$1368._gtk_accel_group_attach$FUNC
    );
    static final FunctionDescriptor _gtk_accel_group_detach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle _gtk_accel_group_detach$MH = RuntimeHelper.downcallHandle(
        "_gtk_accel_group_detach",
        constants$1368._gtk_accel_group_detach$FUNC
    );
    static final FunctionDescriptor gtk_accel_groups_activate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accel_groups_activate$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_groups_activate",
        constants$1368.gtk_accel_groups_activate$FUNC
    );
    static final FunctionDescriptor gtk_accel_groups_from_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_accel_groups_from_object$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_groups_from_object",
        constants$1368.gtk_accel_groups_from_object$FUNC
    );
}

