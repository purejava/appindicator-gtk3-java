// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$162 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$162() {}
    static final FunctionDescriptor g_slist_free_1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_free_1$MH = RuntimeHelper.downcallHandle(
        "g_slist_free_1",
        constants$162.g_slist_free_1$FUNC
    );
    static final FunctionDescriptor g_slist_free_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_free_full$MH = RuntimeHelper.downcallHandle(
        "g_slist_free_full",
        constants$162.g_slist_free_full$FUNC
    );
    static final FunctionDescriptor g_slist_append$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_append$MH = RuntimeHelper.downcallHandle(
        "g_slist_append",
        constants$162.g_slist_append$FUNC
    );
    static final FunctionDescriptor g_slist_prepend$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_prepend$MH = RuntimeHelper.downcallHandle(
        "g_slist_prepend",
        constants$162.g_slist_prepend$FUNC
    );
    static final FunctionDescriptor g_slist_insert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_slist_insert$MH = RuntimeHelper.downcallHandle(
        "g_slist_insert",
        constants$162.g_slist_insert$FUNC
    );
    static final FunctionDescriptor g_slist_insert_sorted$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_slist_insert_sorted$MH = RuntimeHelper.downcallHandle(
        "g_slist_insert_sorted",
        constants$162.g_slist_insert_sorted$FUNC
    );
}

