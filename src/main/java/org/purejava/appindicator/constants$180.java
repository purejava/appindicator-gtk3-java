// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$180 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$180() {}
    static final FunctionDescriptor g_timeout_source_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_timeout_source_new$MH = RuntimeHelper.downcallHandle(
        "g_timeout_source_new",
        constants$180.g_timeout_source_new$FUNC
    );
    static final FunctionDescriptor g_timeout_source_new_seconds$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_timeout_source_new_seconds$MH = RuntimeHelper.downcallHandle(
        "g_timeout_source_new_seconds",
        constants$180.g_timeout_source_new_seconds$FUNC
    );
    static final FunctionDescriptor g_get_current_time$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_current_time$MH = RuntimeHelper.downcallHandle(
        "g_get_current_time",
        constants$180.g_get_current_time$FUNC
    );
    static final FunctionDescriptor g_get_monotonic_time$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_get_monotonic_time$MH = RuntimeHelper.downcallHandle(
        "g_get_monotonic_time",
        constants$180.g_get_monotonic_time$FUNC
    );
    static final FunctionDescriptor g_get_real_time$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_get_real_time$MH = RuntimeHelper.downcallHandle(
        "g_get_real_time",
        constants$180.g_get_real_time$FUNC
    );
    static final FunctionDescriptor g_source_remove$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_source_remove$MH = RuntimeHelper.downcallHandle(
        "g_source_remove",
        constants$180.g_source_remove$FUNC
    );
}

