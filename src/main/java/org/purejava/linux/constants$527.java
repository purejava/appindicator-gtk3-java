// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$527 {

    static final FunctionDescriptor g_app_info_supports_uris$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_supports_uris$MH = RuntimeHelper.downcallHandle(
        "g_app_info_supports_uris",
        constants$527.g_app_info_supports_uris$FUNC
    );
    static final FunctionDescriptor g_app_info_supports_files$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_supports_files$MH = RuntimeHelper.downcallHandle(
        "g_app_info_supports_files",
        constants$527.g_app_info_supports_files$FUNC
    );
    static final FunctionDescriptor g_app_info_launch_uris$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_launch_uris$MH = RuntimeHelper.downcallHandle(
        "g_app_info_launch_uris",
        constants$527.g_app_info_launch_uris$FUNC
    );
    static final FunctionDescriptor g_app_info_launch_uris_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_launch_uris_async$MH = RuntimeHelper.downcallHandle(
        "g_app_info_launch_uris_async",
        constants$527.g_app_info_launch_uris_async$FUNC
    );
    static final FunctionDescriptor g_app_info_launch_uris_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_launch_uris_finish$MH = RuntimeHelper.downcallHandle(
        "g_app_info_launch_uris_finish",
        constants$527.g_app_info_launch_uris_finish$FUNC
    );
    static final FunctionDescriptor g_app_info_should_show$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_app_info_should_show$MH = RuntimeHelper.downcallHandle(
        "g_app_info_should_show",
        constants$527.g_app_info_should_show$FUNC
    );
}

