// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$826 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$826() {}
    static final FunctionDescriptor g_volume_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_volume_get_type$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_type",
        constants$826.g_volume_get_type$FUNC
    );
    static final FunctionDescriptor g_volume_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_name$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_name",
        constants$826.g_volume_get_name$FUNC
    );
    static final FunctionDescriptor g_volume_get_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_icon$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_icon",
        constants$826.g_volume_get_icon$FUNC
    );
    static final FunctionDescriptor g_volume_get_symbolic_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_symbolic_icon$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_symbolic_icon",
        constants$826.g_volume_get_symbolic_icon$FUNC
    );
    static final FunctionDescriptor g_volume_get_uuid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_uuid$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_uuid",
        constants$826.g_volume_get_uuid$FUNC
    );
    static final FunctionDescriptor g_volume_get_drive$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_volume_get_drive$MH = RuntimeHelper.downcallHandle(
        "g_volume_get_drive",
        constants$826.g_volume_get_drive$FUNC
    );
}


