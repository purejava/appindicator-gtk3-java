// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$603 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$603() {}
    static final FunctionDescriptor g_drive_can_start$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_can_start$MH = RuntimeHelper.downcallHandle(
        "g_drive_can_start",
        constants$603.g_drive_can_start$FUNC
    );
    static final FunctionDescriptor g_drive_can_start_degraded$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_can_start_degraded$MH = RuntimeHelper.downcallHandle(
        "g_drive_can_start_degraded",
        constants$603.g_drive_can_start_degraded$FUNC
    );
    static final FunctionDescriptor g_drive_start$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_start$MH = RuntimeHelper.downcallHandle(
        "g_drive_start",
        constants$603.g_drive_start$FUNC
    );
    static final FunctionDescriptor g_drive_start_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_start_finish$MH = RuntimeHelper.downcallHandle(
        "g_drive_start_finish",
        constants$603.g_drive_start_finish$FUNC
    );
    static final FunctionDescriptor g_drive_can_stop$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_can_stop$MH = RuntimeHelper.downcallHandle(
        "g_drive_can_stop",
        constants$603.g_drive_can_stop$FUNC
    );
    static final FunctionDescriptor g_drive_stop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_stop$MH = RuntimeHelper.downcallHandle(
        "g_drive_stop",
        constants$603.g_drive_stop$FUNC
    );
}


