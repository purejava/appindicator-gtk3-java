// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$130 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$130() {}
    static final FunctionDescriptor g_dpgettext2$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dpgettext2$MH = RuntimeHelper.downcallHandle(
        "g_dpgettext2",
        constants$130.g_dpgettext2$FUNC
    );
    static final FunctionDescriptor g_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_free$MH = RuntimeHelper.downcallHandle(
        "g_free",
        constants$130.g_free$FUNC
    );
    static final FunctionDescriptor g_free_sized$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_free_sized$MH = RuntimeHelper.downcallHandle(
        "g_free_sized",
        constants$130.g_free_sized$FUNC
    );
    static final FunctionDescriptor g_clear_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_clear_pointer$MH = RuntimeHelper.downcallHandle(
        "g_clear_pointer",
        constants$130.g_clear_pointer$FUNC
    );
    static final FunctionDescriptor g_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_malloc$MH = RuntimeHelper.downcallHandle(
        "g_malloc",
        constants$130.g_malloc$FUNC
    );
    static final FunctionDescriptor g_malloc0$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_malloc0$MH = RuntimeHelper.downcallHandle(
        "g_malloc0",
        constants$130.g_malloc0$FUNC
    );
}


