// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$710 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$710() {}
    static final FunctionDescriptor g_mount_operation_get_anonymous$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_get_anonymous$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_anonymous",
        constants$710.g_mount_operation_get_anonymous$FUNC
    );
    static final FunctionDescriptor g_mount_operation_set_anonymous$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mount_operation_set_anonymous$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_set_anonymous",
        constants$710.g_mount_operation_set_anonymous$FUNC
    );
    static final FunctionDescriptor g_mount_operation_get_domain$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_get_domain$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_domain",
        constants$710.g_mount_operation_get_domain$FUNC
    );
    static final FunctionDescriptor g_mount_operation_set_domain$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_set_domain$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_set_domain",
        constants$710.g_mount_operation_set_domain$FUNC
    );
    static final FunctionDescriptor g_mount_operation_get_password_save$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_operation_get_password_save$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_get_password_save",
        constants$710.g_mount_operation_get_password_save$FUNC
    );
    static final FunctionDescriptor g_mount_operation_set_password_save$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_mount_operation_set_password_save$MH = RuntimeHelper.downcallHandle(
        "g_mount_operation_set_password_save",
        constants$710.g_mount_operation_set_password_save$FUNC
    );
}


