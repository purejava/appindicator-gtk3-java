// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$347 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$347() {}
    static final FunctionDescriptor g_cache_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cache_new$MH = RuntimeHelper.downcallHandle(
        "g_cache_new",
        constants$347.g_cache_new$FUNC
    );
    static final FunctionDescriptor g_cache_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cache_destroy$MH = RuntimeHelper.downcallHandle(
        "g_cache_destroy",
        constants$347.g_cache_destroy$FUNC
    );
    static final FunctionDescriptor g_cache_insert$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cache_insert$MH = RuntimeHelper.downcallHandle(
        "g_cache_insert",
        constants$347.g_cache_insert$FUNC
    );
    static final FunctionDescriptor g_cache_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cache_remove$MH = RuntimeHelper.downcallHandle(
        "g_cache_remove",
        constants$347.g_cache_remove$FUNC
    );
    static final FunctionDescriptor g_cache_key_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cache_key_foreach$MH = RuntimeHelper.downcallHandle(
        "g_cache_key_foreach",
        constants$347.g_cache_key_foreach$FUNC
    );
    static final FunctionDescriptor g_cache_value_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cache_value_foreach$MH = RuntimeHelper.downcallHandle(
        "g_cache_value_foreach",
        constants$347.g_cache_value_foreach$FUNC
    );
}


