// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$739 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$739() {}
    static final FunctionDescriptor g_settings_schema_source_new_from_directory$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_schema_source_new_from_directory$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_source_new_from_directory",
        constants$739.g_settings_schema_source_new_from_directory$FUNC
    );
    static final FunctionDescriptor g_settings_schema_source_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_settings_schema_source_lookup$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_source_lookup",
        constants$739.g_settings_schema_source_lookup$FUNC
    );
    static final FunctionDescriptor g_settings_schema_source_list_schemas$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_schema_source_list_schemas$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_source_list_schemas",
        constants$739.g_settings_schema_source_list_schemas$FUNC
    );
    static final FunctionDescriptor g_settings_schema_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_settings_schema_get_type$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_get_type",
        constants$739.g_settings_schema_get_type$FUNC
    );
    static final FunctionDescriptor g_settings_schema_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_schema_ref$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_ref",
        constants$739.g_settings_schema_ref$FUNC
    );
    static final FunctionDescriptor g_settings_schema_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_settings_schema_unref$MH = RuntimeHelper.downcallHandle(
        "g_settings_schema_unref",
        constants$739.g_settings_schema_unref$FUNC
    );
}


