// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1366 {

    static final FunctionDescriptor GtkAccelGroupActivate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle GtkAccelGroupActivate$MH = RuntimeHelper.downcallHandle(
        constants$1366.GtkAccelGroupActivate$FUNC
    );
    static final FunctionDescriptor GtkAccelGroupFindFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkAccelGroupFindFunc$MH = RuntimeHelper.downcallHandle(
        constants$1366.GtkAccelGroupFindFunc$FUNC
    );
    static final FunctionDescriptor gtk_accel_group_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_accel_group_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_group_get_type",
        constants$1366.gtk_accel_group_get_type$FUNC
    );
    static final FunctionDescriptor gtk_accel_group_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_accel_group_new$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_group_new",
        constants$1366.gtk_accel_group_new$FUNC
    );
    static final FunctionDescriptor gtk_accel_group_get_is_locked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_accel_group_get_is_locked$MH = RuntimeHelper.downcallHandle(
        "gtk_accel_group_get_is_locked",
        constants$1366.gtk_accel_group_get_is_locked$FUNC
    );
}

