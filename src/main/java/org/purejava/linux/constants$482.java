// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$482 {

    static final FunctionDescriptor g_set_object$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_set_object$MH = RuntimeHelper.downcallHandle(
        "g_set_object",
        constants$482.g_set_object$FUNC
    );
    static final FunctionDescriptor g_assert_finalize_object$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_assert_finalize_object$MH = RuntimeHelper.downcallHandle(
        "g_assert_finalize_object",
        constants$482.g_assert_finalize_object$FUNC
    );
    static final FunctionDescriptor g_clear_weak_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_clear_weak_pointer$MH = RuntimeHelper.downcallHandle(
        "g_clear_weak_pointer",
        constants$482.g_clear_weak_pointer$FUNC
    );
    static final FunctionDescriptor g_set_weak_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_set_weak_pointer$MH = RuntimeHelper.downcallHandle(
        "g_set_weak_pointer",
        constants$482.g_set_weak_pointer$FUNC
    );
    static final FunctionDescriptor g_weak_ref_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_weak_ref_init$MH = RuntimeHelper.downcallHandle(
        "g_weak_ref_init",
        constants$482.g_weak_ref_init$FUNC
    );
    static final FunctionDescriptor g_weak_ref_clear$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_weak_ref_clear$MH = RuntimeHelper.downcallHandle(
        "g_weak_ref_clear",
        constants$482.g_weak_ref_clear$FUNC
    );
}

