// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$855 {

    static final FunctionDescriptor g_themed_icon_new_from_names$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_themed_icon_new_from_names$MH = RuntimeHelper.downcallHandle(
        "g_themed_icon_new_from_names",
        constants$855.g_themed_icon_new_from_names$FUNC
    );
    static final FunctionDescriptor g_themed_icon_prepend_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_themed_icon_prepend_name$MH = RuntimeHelper.downcallHandle(
        "g_themed_icon_prepend_name",
        constants$855.g_themed_icon_prepend_name$FUNC
    );
    static final FunctionDescriptor g_themed_icon_append_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_themed_icon_append_name$MH = RuntimeHelper.downcallHandle(
        "g_themed_icon_append_name",
        constants$855.g_themed_icon_append_name$FUNC
    );
    static final FunctionDescriptor g_themed_icon_get_names$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_themed_icon_get_names$MH = RuntimeHelper.downcallHandle(
        "g_themed_icon_get_names",
        constants$855.g_themed_icon_get_names$FUNC
    );
    static final FunctionDescriptor g_threaded_socket_service_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_threaded_socket_service_get_type$MH = RuntimeHelper.downcallHandle(
        "g_threaded_socket_service_get_type",
        constants$855.g_threaded_socket_service_get_type$FUNC
    );
    static final FunctionDescriptor g_threaded_socket_service_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_threaded_socket_service_new$MH = RuntimeHelper.downcallHandle(
        "g_threaded_socket_service_new",
        constants$855.g_threaded_socket_service_new$FUNC
    );
}

