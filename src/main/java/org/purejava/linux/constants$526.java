// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$526 {

    static final FunctionDescriptor g_app_info_get_display_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_display_name$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_display_name",
        constants$526.g_app_info_get_display_name$FUNC
    );
    static final FunctionDescriptor g_app_info_get_description$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_description$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_description",
        constants$526.g_app_info_get_description$FUNC
    );
    static final FunctionDescriptor g_app_info_get_executable$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_executable$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_executable",
        constants$526.g_app_info_get_executable$FUNC
    );
    static final FunctionDescriptor g_app_info_get_commandline$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_commandline$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_commandline",
        constants$526.g_app_info_get_commandline$FUNC
    );
    static final FunctionDescriptor g_app_info_get_icon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_get_icon$MH = RuntimeHelper.downcallHandle(
        "g_app_info_get_icon",
        constants$526.g_app_info_get_icon$FUNC
    );
    static final FunctionDescriptor g_app_info_launch$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_launch$MH = RuntimeHelper.downcallHandle(
        "g_app_info_launch",
        constants$526.g_app_info_launch$FUNC
    );
}


