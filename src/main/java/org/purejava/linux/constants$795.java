// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$795 {

    static final FunctionDescriptor g_settings_schema_has_key$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_schema_has_key$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_has_key",
        constants$795.g_settings_schema_has_key$FUNC
    );
    static final FunctionDescriptor g_settings_schema_list_keys$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_schema_list_keys$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_list_keys",
        constants$795.g_settings_schema_list_keys$FUNC
    );
    static final FunctionDescriptor g_settings_schema_list_children$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_schema_list_children$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_list_children",
        constants$795.g_settings_schema_list_children$FUNC
    );
    static final FunctionDescriptor g_settings_schema_key_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_settings_schema_key_get_type$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_key_get_type",
        constants$795.g_settings_schema_key_get_type$FUNC
    );
    static final FunctionDescriptor g_settings_schema_key_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_schema_key_ref$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_key_ref",
        constants$795.g_settings_schema_key_ref$FUNC
    );
    static final FunctionDescriptor g_settings_schema_key_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_schema_key_unref$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_key_unref",
        constants$795.g_settings_schema_key_unref$FUNC
    );
}


