// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$324 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$324() {}
    static final FunctionDescriptor g_test_get_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_test_get_dir$MH = RuntimeHelper.downcallHandle(
        "g_test_get_dir",
        constants$324.g_test_get_dir$FUNC
    );
    static final FunctionDescriptor g_test_get_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_get_filename$MH = RuntimeHelper.downcallHandleVariadic(
        "g_test_get_filename",
        constants$324.g_test_get_filename$FUNC
    );
    static final FunctionDescriptor g_thread_pool_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_pool_new$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_new",
        constants$324.g_thread_pool_new$FUNC
    );
    static final FunctionDescriptor g_thread_pool_new_full$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_pool_new_full$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_new_full",
        constants$324.g_thread_pool_new_full$FUNC
    );
    static final FunctionDescriptor g_thread_pool_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_thread_pool_free$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_free",
        constants$324.g_thread_pool_free$FUNC
    );
    static final FunctionDescriptor g_thread_pool_push$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_pool_push$MH = RuntimeHelper.downcallHandle(
        "g_thread_pool_push",
        constants$324.g_thread_pool_push$FUNC
    );
}


