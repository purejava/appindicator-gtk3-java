// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$651 {

    static final FunctionDescriptor g_drive_has_media$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_has_media$MH = RuntimeHelper.downcallHandle(
        "g_drive_has_media",
        constants$651.g_drive_has_media$FUNC
    );
    static final FunctionDescriptor g_drive_is_media_check_automatic$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_is_media_check_automatic$MH = RuntimeHelper.downcallHandle(
        "g_drive_is_media_check_automatic",
        constants$651.g_drive_is_media_check_automatic$FUNC
    );
    static final FunctionDescriptor g_drive_can_poll_for_media$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_can_poll_for_media$MH = RuntimeHelper.downcallHandle(
        "g_drive_can_poll_for_media",
        constants$651.g_drive_can_poll_for_media$FUNC
    );
    static final FunctionDescriptor g_drive_can_eject$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_can_eject$MH = RuntimeHelper.downcallHandle(
        "g_drive_can_eject",
        constants$651.g_drive_can_eject$FUNC
    );
    static final FunctionDescriptor g_drive_eject$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_eject$MH = RuntimeHelper.downcallHandle(
        "g_drive_eject",
        constants$651.g_drive_eject$FUNC
    );
    static final FunctionDescriptor g_drive_eject_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_eject_finish$MH = RuntimeHelper.downcallHandle(
        "g_drive_eject_finish",
        constants$651.g_drive_eject_finish$FUNC
    );
}

