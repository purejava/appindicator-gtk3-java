// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1971 {

    static final FunctionDescriptor gtk_recent_info_get_application_info$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_application_info$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_application_info",
        constants$1971.gtk_recent_info_get_application_info$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_create_app_info$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_create_app_info$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_create_app_info",
        constants$1971.gtk_recent_info_create_app_info$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_get_applications$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_applications$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_applications",
        constants$1971.gtk_recent_info_get_applications$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_last_application$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_last_application$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_last_application",
        constants$1971.gtk_recent_info_last_application$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_has_application$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_has_application$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_has_application",
        constants$1971.gtk_recent_info_has_application$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_get_groups$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_groups$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_groups",
        constants$1971.gtk_recent_info_get_groups$FUNC
    );
}


