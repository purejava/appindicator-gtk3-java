// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$39 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$39() {}
    static final FunctionDescriptor g_get_host_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_host_name$MH = RuntimeHelper.downcallHandle(
        "g_get_host_name",
        constants$39.g_get_host_name$FUNC
    );
    static final FunctionDescriptor g_get_prgname$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_prgname$MH = RuntimeHelper.downcallHandle(
        "g_get_prgname",
        constants$39.g_get_prgname$FUNC
    );
    static final FunctionDescriptor g_set_prgname$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_set_prgname$MH = RuntimeHelper.downcallHandle(
        "g_set_prgname",
        constants$39.g_set_prgname$FUNC
    );
    static final FunctionDescriptor g_get_application_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_application_name$MH = RuntimeHelper.downcallHandle(
        "g_get_application_name",
        constants$39.g_get_application_name$FUNC
    );
    static final FunctionDescriptor g_set_application_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_set_application_name$MH = RuntimeHelper.downcallHandle(
        "g_set_application_name",
        constants$39.g_set_application_name$FUNC
    );
    static final FunctionDescriptor g_get_os_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_os_info$MH = RuntimeHelper.downcallHandle(
        "g_get_os_info",
        constants$39.g_get_os_info$FUNC
    );
}


