// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$148 {

    static final FunctionDescriptor g_hash_table_iter_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_init$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_init",
        constants$148.g_hash_table_iter_init$FUNC
    );
    static final FunctionDescriptor g_hash_table_iter_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_next$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_next",
        constants$148.g_hash_table_iter_next$FUNC
    );
    static final FunctionDescriptor g_hash_table_iter_get_hash_table$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_get_hash_table$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_get_hash_table",
        constants$148.g_hash_table_iter_get_hash_table$FUNC
    );
    static final FunctionDescriptor g_hash_table_iter_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_remove$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_remove",
        constants$148.g_hash_table_iter_remove$FUNC
    );
    static final FunctionDescriptor g_hash_table_iter_replace$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_replace$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_replace",
        constants$148.g_hash_table_iter_replace$FUNC
    );
    static final FunctionDescriptor g_hash_table_iter_steal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_hash_table_iter_steal$MH = RuntimeHelper.downcallHandle(
        "g_hash_table_iter_steal",
        constants$148.g_hash_table_iter_steal$FUNC
    );
}


