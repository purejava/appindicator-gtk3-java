// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$760 {

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
        constants$760.g_mount_remount$FUNC
    );
    static final FunctionDescriptor g_mount_remount_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_remount_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_remount_finish",
        constants$760.g_mount_remount_finish$FUNC
    );
    static final FunctionDescriptor g_mount_guess_content_type$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_guess_content_type$MH = RuntimeHelper.downcallHandle(
        "g_mount_guess_content_type",
        constants$760.g_mount_guess_content_type$FUNC
    );
    static final FunctionDescriptor g_mount_guess_content_type_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_guess_content_type_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_guess_content_type_finish",
        constants$760.g_mount_guess_content_type_finish$FUNC
    );
    static final FunctionDescriptor g_mount_guess_content_type_sync$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_guess_content_type_sync$MH = RuntimeHelper.downcallHandle(
        "g_mount_guess_content_type_sync",
        constants$760.g_mount_guess_content_type_sync$FUNC
    );
    static final FunctionDescriptor g_mount_is_shadowed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_is_shadowed$MH = RuntimeHelper.downcallHandle(
        "g_mount_is_shadowed",
        constants$760.g_mount_is_shadowed$FUNC
    );
}


