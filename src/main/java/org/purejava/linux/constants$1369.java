// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1369 {

    static final FunctionDescriptor gtk_accel_group_find$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_accel_group_find$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_group_find",
        constants$1369.gtk_accel_group_find$FUNC
    );
    static final FunctionDescriptor gtk_accel_group_from_accel_closure$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_accel_group_from_accel_closure$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_group_from_accel_closure",
        constants$1369.gtk_accel_group_from_accel_closure$FUNC
    );
    static final FunctionDescriptor gtk_accelerator_valid$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accelerator_valid$MH = RuntimeHelper.downcallHandle(
        "gtk_accelerator_valid",
        constants$1369.gtk_accelerator_valid$FUNC
    );
    static final FunctionDescriptor gtk_accelerator_parse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_accelerator_parse$MH = RuntimeHelper.downcallHandle(
        "gtk_accelerator_parse",
        constants$1369.gtk_accelerator_parse$FUNC
    );
    static final FunctionDescriptor gtk_accelerator_parse_with_keycode$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_accelerator_parse_with_keycode$MH = RuntimeHelper.downcallHandle(
        "gtk_accelerator_parse_with_keycode",
        constants$1369.gtk_accelerator_parse_with_keycode$FUNC
    );
    static final FunctionDescriptor gtk_accelerator_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_accelerator_name$MH = RuntimeHelper.downcallHandle(
        "gtk_accelerator_name",
        constants$1369.gtk_accelerator_name$FUNC
    );
}


