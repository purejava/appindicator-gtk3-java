// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$801 {

    static final FunctionDescriptor g_settings_get_uint$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_uint$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_uint",
        constants$801.g_settings_get_uint$FUNC
    );
    static final FunctionDescriptor g_settings_set_uint$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_settings_set_uint$MH = RuntimeHelper.downcallHandle(
        "g_settings_set_uint",
        constants$801.g_settings_set_uint$FUNC
    );
    static final FunctionDescriptor g_settings_get_uint64$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_uint64$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_uint64",
        constants$801.g_settings_get_uint64$FUNC
    );
    static final FunctionDescriptor g_settings_set_uint64$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_settings_set_uint64$MH = RuntimeHelper.downcallHandle(
        "g_settings_set_uint64",
        constants$801.g_settings_set_uint64$FUNC
    );
    static final FunctionDescriptor g_settings_get_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_get_string$MH = RuntimeHelper.downcallHandle(
        "g_settings_get_string",
        constants$801.g_settings_get_string$FUNC
    );
    static final FunctionDescriptor g_settings_set_string$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_set_string$MH = RuntimeHelper.downcallHandle(
        "g_settings_set_string",
        constants$801.g_settings_set_string$FUNC
    );
}


