// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$178 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$178() {}
    static final FunctionDescriptor g_source_modify_unix_fd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_source_modify_unix_fd$MH = RuntimeHelper.downcallHandle(
        "g_source_modify_unix_fd",
        constants$178.g_source_modify_unix_fd$FUNC
    );
    static final FunctionDescriptor g_source_remove_unix_fd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_remove_unix_fd$MH = RuntimeHelper.downcallHandle(
        "g_source_remove_unix_fd",
        constants$178.g_source_remove_unix_fd$FUNC
    );
    static final FunctionDescriptor g_source_query_unix_fd$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_query_unix_fd$MH = RuntimeHelper.downcallHandle(
        "g_source_query_unix_fd",
        constants$178.g_source_query_unix_fd$FUNC
    );
    static final FunctionDescriptor g_source_set_callback_indirect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_set_callback_indirect$MH = RuntimeHelper.downcallHandle(
        "g_source_set_callback_indirect",
        constants$178.g_source_set_callback_indirect$FUNC
    );
    static final FunctionDescriptor g_source_add_poll$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_add_poll$MH = RuntimeHelper.downcallHandle(
        "g_source_add_poll",
        constants$178.g_source_add_poll$FUNC
    );
    static final FunctionDescriptor g_source_remove_poll$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_remove_poll$MH = RuntimeHelper.downcallHandle(
        "g_source_remove_poll",
        constants$178.g_source_remove_poll$FUNC
    );
}


