// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$875 {

    static final FunctionDescriptor g_vfs_unregister_uri_scheme$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_vfs_unregister_uri_scheme$MH = RuntimeHelper.downcallHandle(
        "g_vfs_unregister_uri_scheme",
        constants$875.g_vfs_unregister_uri_scheme$FUNC
    );
    static final FunctionDescriptor g_volume_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_volume_get_type$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_type",
        constants$875.g_volume_get_type$FUNC
    );
    static final FunctionDescriptor g_volume_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_name$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_name",
        constants$875.g_volume_get_name$FUNC
    );
    static final FunctionDescriptor g_volume_get_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_icon$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_icon",
        constants$875.g_volume_get_icon$FUNC
    );
    static final FunctionDescriptor g_volume_get_symbolic_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_symbolic_icon$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_symbolic_icon",
        constants$875.g_volume_get_symbolic_icon$FUNC
    );
    static final FunctionDescriptor g_volume_get_uuid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_uuid$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_uuid",
        constants$875.g_volume_get_uuid$FUNC
    );
}


