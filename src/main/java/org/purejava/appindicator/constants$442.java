// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$442 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$442() {}
    static final FunctionDescriptor g_value_take_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_take_object$MH = RuntimeHelper.downcallHandle(
        "g_value_take_object",
        constants$442.g_value_take_object$FUNC
    );
    static final FunctionDescriptor g_value_set_object_take_ownership$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_value_set_object_take_ownership$MH = RuntimeHelper.downcallHandle(
        "g_value_set_object_take_ownership",
        constants$442.g_value_set_object_take_ownership$FUNC
    );
    static final FunctionDescriptor g_object_compat_control$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_compat_control$MH = RuntimeHelper.downcallHandle(
        "g_object_compat_control",
        constants$442.g_object_compat_control$FUNC
    );
    static final FunctionDescriptor g_clear_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_clear_object$MH = RuntimeHelper.downcallHandle(
        "g_clear_object",
        constants$442.g_clear_object$FUNC
    );
    static final FunctionDescriptor g_weak_ref_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_weak_ref_init$MH = RuntimeHelper.downcallHandle(
        "g_weak_ref_init",
        constants$442.g_weak_ref_init$FUNC
    );
    static final FunctionDescriptor g_weak_ref_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_weak_ref_clear$MH = RuntimeHelper.downcallHandle(
        "g_weak_ref_clear",
        constants$442.g_weak_ref_clear$FUNC
    );
}

