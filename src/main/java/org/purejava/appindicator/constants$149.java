// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$149 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$149() {}
    static final FunctionDescriptor g_hash_table_get_keys_as_array$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_get_keys_as_array$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_get_keys_as_array",
        constants$149.g_hash_table_get_keys_as_array$FUNC
    );
    static final FunctionDescriptor g_hash_table_get_keys_as_ptr_array$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_get_keys_as_ptr_array$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_get_keys_as_ptr_array",
        constants$149.g_hash_table_get_keys_as_ptr_array$FUNC
    );
    static final FunctionDescriptor g_hash_table_get_values_as_ptr_array$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_get_values_as_ptr_array$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_get_values_as_ptr_array",
        constants$149.g_hash_table_get_values_as_ptr_array$FUNC
    );
    static final FunctionDescriptor g_hash_table_iter_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_init$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_init",
        constants$149.g_hash_table_iter_init$FUNC
    );
    static final FunctionDescriptor g_hash_table_iter_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_next$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_next",
        constants$149.g_hash_table_iter_next$FUNC
    );
    static final FunctionDescriptor g_hash_table_iter_get_hash_table$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_get_hash_table$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_get_hash_table",
        constants$149.g_hash_table_iter_get_hash_table$FUNC
    );
}


