// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$706 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$706() {}
    static final FunctionDescriptor g_mount_can_eject$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_can_eject$MH = RuntimeHelper.downcallHandle(
        "g_mount_can_eject",
        constants$706.g_mount_can_eject$FUNC
    );
    static final FunctionDescriptor g_mount_unmount$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_unmount$MH = RuntimeHelper.downcallHandle(
        "g_mount_unmount",
        constants$706.g_mount_unmount$FUNC
    );
    static final FunctionDescriptor g_mount_unmount_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_unmount_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_unmount_finish",
        constants$706.g_mount_unmount_finish$FUNC
    );
    static final FunctionDescriptor g_mount_eject$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_eject$MH = RuntimeHelper.downcallHandle(
        "g_mount_eject",
        constants$706.g_mount_eject$FUNC
    );
    static final FunctionDescriptor g_mount_eject_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_eject_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_eject_finish",
        constants$706.g_mount_eject_finish$FUNC
    );
    static final FunctionDescriptor g_mount_remount$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_remount$MH = RuntimeHelper.downcallHandle(
        "g_mount_remount",
        constants$706.g_mount_remount$FUNC
    );
}


