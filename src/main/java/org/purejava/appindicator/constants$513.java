// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$513 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$513() {}
    static final FunctionDescriptor g_cancellable_release_fd$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_release_fd$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_release_fd",
        constants$513.g_cancellable_release_fd$FUNC
    );
    static final FunctionDescriptor g_cancellable_source_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_source_new$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_source_new",
        constants$513.g_cancellable_source_new$FUNC
    );
    static final FunctionDescriptor g_cancellable_get_current$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_cancellable_get_current$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_get_current",
        constants$513.g_cancellable_get_current$FUNC
    );
    static final FunctionDescriptor g_cancellable_push_current$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_push_current$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_push_current",
        constants$513.g_cancellable_push_current$FUNC
    );
    static final FunctionDescriptor g_cancellable_pop_current$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_pop_current$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_pop_current",
        constants$513.g_cancellable_pop_current$FUNC
    );
    static final FunctionDescriptor g_cancellable_reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cancellable_reset$MH = RuntimeHelper.downcallHandle(
        "g_cancellable_reset",
        constants$513.g_cancellable_reset$FUNC
    );
}


