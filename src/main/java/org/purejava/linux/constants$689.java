// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$689 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$689() {}
    static final FunctionDescriptor g_list_model_get_object$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_list_model_get_object$MH = RuntimeHelper.downcallHandle(
        "g_list_model_get_object",
        constants$689.g_list_model_get_object$FUNC
    );
    static final FunctionDescriptor g_list_model_items_changed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_list_model_items_changed$MH = RuntimeHelper.downcallHandle(
        "g_list_model_items_changed",
        constants$689.g_list_model_items_changed$FUNC
    );
    static final FunctionDescriptor g_list_store_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_list_store_get_type$MH = RuntimeHelper.downcallHandle(
        "g_list_store_get_type",
        constants$689.g_list_store_get_type$FUNC
    );
    static final FunctionDescriptor g_list_store_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_list_store_new$MH = RuntimeHelper.downcallHandle(
        "g_list_store_new",
        constants$689.g_list_store_new$FUNC
    );
    static final FunctionDescriptor g_list_store_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_insert$MH = RuntimeHelper.downcallHandle(
        "g_list_store_insert",
        constants$689.g_list_store_insert$FUNC
    );
    static final FunctionDescriptor g_list_store_insert_sorted$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_insert_sorted$MH = RuntimeHelper.downcallHandle(
        "g_list_store_insert_sorted",
        constants$689.g_list_store_insert_sorted$FUNC
    );
}


