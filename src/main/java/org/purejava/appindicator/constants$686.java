// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$686 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$686() {}
    static final FunctionDescriptor g_io_extension_point_get_extensions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_point_get_extensions$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_point_get_extensions",
        constants$686.g_io_extension_point_get_extensions$FUNC
    );
    static final FunctionDescriptor g_io_extension_point_get_extension_by_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_point_get_extension_by_name$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_point_get_extension_by_name",
        constants$686.g_io_extension_point_get_extension_by_name$FUNC
    );
    static final FunctionDescriptor g_io_extension_point_implement$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_io_extension_point_implement$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_point_implement",
        constants$686.g_io_extension_point_implement$FUNC
    );
    static final FunctionDescriptor g_io_extension_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_get_type$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_get_type",
        constants$686.g_io_extension_get_type$FUNC
    );
    static final FunctionDescriptor g_io_extension_get_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_get_name$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_get_name",
        constants$686.g_io_extension_get_name$FUNC
    );
    static final FunctionDescriptor g_io_extension_get_priority$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_io_extension_get_priority$MH = RuntimeHelper.downcallHandle(
        "g_io_extension_get_priority",
        constants$686.g_io_extension_get_priority$FUNC
    );
}


