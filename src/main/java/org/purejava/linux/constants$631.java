// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$631 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$631() {}
    static final FunctionDescriptor g_file_unmount_mountable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_unmount_mountable$MH = RuntimeHelper.downcallHandle(
        "g_file_unmount_mountable",
        constants$631.g_file_unmount_mountable$FUNC
    );
    static final FunctionDescriptor g_file_unmount_mountable_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_unmount_mountable_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_unmount_mountable_finish",
        constants$631.g_file_unmount_mountable_finish$FUNC
    );
    static final FunctionDescriptor g_file_unmount_mountable_with_operation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_unmount_mountable_with_operation$MH = RuntimeHelper.downcallHandle(
        "g_file_unmount_mountable_with_operation",
        constants$631.g_file_unmount_mountable_with_operation$FUNC
    );
    static final FunctionDescriptor g_file_unmount_mountable_with_operation_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_unmount_mountable_with_operation_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_unmount_mountable_with_operation_finish",
        constants$631.g_file_unmount_mountable_with_operation_finish$FUNC
    );
    static final FunctionDescriptor g_file_eject_mountable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_eject_mountable$MH = RuntimeHelper.downcallHandle(
        "g_file_eject_mountable",
        constants$631.g_file_eject_mountable$FUNC
    );
    static final FunctionDescriptor g_file_eject_mountable_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_eject_mountable_finish$MH = RuntimeHelper.downcallHandle(
        "g_file_eject_mountable_finish",
        constants$631.g_file_eject_mountable_finish$FUNC
    );
}


