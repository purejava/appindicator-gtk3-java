// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$604 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$604() {}
    static final FunctionDescriptor g_drive_stop_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_stop_finish$MH = RuntimeHelper.downcallHandle(
        "g_drive_stop_finish",
        constants$604.g_drive_stop_finish$FUNC
    );
    static final FunctionDescriptor g_drive_eject_with_operation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_eject_with_operation$MH = RuntimeHelper.downcallHandle(
        "g_drive_eject_with_operation",
        constants$604.g_drive_eject_with_operation$FUNC
    );
    static final FunctionDescriptor g_drive_eject_with_operation_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_eject_with_operation_finish$MH = RuntimeHelper.downcallHandle(
        "g_drive_eject_with_operation_finish",
        constants$604.g_drive_eject_with_operation_finish$FUNC
    );
    static final FunctionDescriptor g_drive_get_sort_key$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_drive_get_sort_key$MH = RuntimeHelper.downcallHandle(
        "g_drive_get_sort_key",
        constants$604.g_drive_get_sort_key$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_dtls_connection_get_type$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_get_type",
        constants$604.g_dtls_connection_get_type$FUNC
    );
    static final FunctionDescriptor g_dtls_connection_set_database$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dtls_connection_set_database$MH = RuntimeHelper.downcallHandle(
        "g_dtls_connection_set_database",
        constants$604.g_dtls_connection_set_database$FUNC
    );
}


