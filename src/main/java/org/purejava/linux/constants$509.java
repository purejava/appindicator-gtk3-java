// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$509 {

    static final FunctionDescriptor g_pointer_type_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pointer_type_register_static$MH = RuntimeHelper.downcallHandle(
        "g_pointer_type_register_static",
        constants$509.g_pointer_type_register_static$FUNC
    );
    static final FunctionDescriptor g_strdup_value_contents$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strdup_value_contents$MH = RuntimeHelper.downcallHandle(
        "g_strdup_value_contents",
        constants$509.g_strdup_value_contents$FUNC
    );
    static final FunctionDescriptor g_value_take_string$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_take_string$MH = RuntimeHelper.downcallHandle(
        "g_value_take_string",
        constants$509.g_value_take_string$FUNC
    );
    static final FunctionDescriptor g_value_set_string_take_ownership$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_string_take_ownership$MH = RuntimeHelper.downcallHandle(
        "g_value_set_string_take_ownership",
        constants$509.g_value_set_string_take_ownership$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_GClosure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GClosure$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GClosure",
        constants$509.glib_autoptr_clear_GClosure$FUNC
    );
    static final FunctionDescriptor glib_autoptr_cleanup_GClosure$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_cleanup_GClosure$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_cleanup_GClosure",
        constants$509.glib_autoptr_cleanup_GClosure$FUNC
    );
}


