// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$690 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$690() {}
    static final FunctionDescriptor g_list_store_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_sort$MH = RuntimeHelper.downcallHandle(
        "g_list_store_sort",
        constants$690.g_list_store_sort$FUNC
    );
    static final FunctionDescriptor g_list_store_append$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_append$MH = RuntimeHelper.downcallHandle(
        "g_list_store_append",
        constants$690.g_list_store_append$FUNC
    );
    static final FunctionDescriptor g_list_store_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_list_store_remove$MH = RuntimeHelper.downcallHandle(
        "g_list_store_remove",
        constants$690.g_list_store_remove$FUNC
    );
    static final FunctionDescriptor g_list_store_remove_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_remove_all$MH = RuntimeHelper.downcallHandle(
        "g_list_store_remove_all",
        constants$690.g_list_store_remove_all$FUNC
    );
    static final FunctionDescriptor g_list_store_splice$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_list_store_splice$MH = RuntimeHelper.downcallHandle(
        "g_list_store_splice",
        constants$690.g_list_store_splice$FUNC
    );
    static final FunctionDescriptor g_list_store_find$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_store_find$MH = RuntimeHelper.downcallHandle(
        "g_list_store_find",
        constants$690.g_list_store_find$FUNC
    );
}


