// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$482 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$482() {}
    static final FunctionDescriptor g_app_info_remove_supports_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_remove_supports_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_remove_supports_type",
        constants$482.g_app_info_remove_supports_type$FUNC
    );
    static final FunctionDescriptor g_app_info_get_supported_types$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_supported_types$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_supported_types",
        constants$482.g_app_info_get_supported_types$FUNC
    );
    static final FunctionDescriptor g_app_info_can_delete$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_can_delete$MH = RuntimeHelper.downcallHandle(
        "g_app_info_can_delete",
        constants$482.g_app_info_can_delete$FUNC
    );
    static final FunctionDescriptor g_app_info_delete$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_delete$MH = RuntimeHelper.downcallHandle(
        "g_app_info_delete",
        constants$482.g_app_info_delete$FUNC
    );
    static final FunctionDescriptor g_app_info_set_as_last_used_for_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_set_as_last_used_for_type$MH = RuntimeHelper.downcallHandle(
        "g_app_info_set_as_last_used_for_type",
        constants$482.g_app_info_set_as_last_used_for_type$FUNC
    );
    static final FunctionDescriptor g_app_info_get_all$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_app_info_get_all$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_all",
        constants$482.g_app_info_get_all$FUNC
    );
}


