// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$65 {

    static final FunctionDescriptor g_cond_signal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cond_signal$MH = RuntimeHelper.downcallHandle(
        "g_cond_signal",
        constants$65.g_cond_signal$FUNC
    );
    static final FunctionDescriptor g_cond_broadcast$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cond_broadcast$MH = RuntimeHelper.downcallHandle(
        "g_cond_broadcast",
        constants$65.g_cond_broadcast$FUNC
    );
    static final FunctionDescriptor g_cond_wait_until$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_cond_wait_until$MH = RuntimeHelper.downcallHandle(
        "g_cond_wait_until",
        constants$65.g_cond_wait_until$FUNC
    );
    static final FunctionDescriptor g_private_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_private_get$MH = RuntimeHelper.downcallHandle(
        "g_private_get",
        constants$65.g_private_get$FUNC
    );
    static final FunctionDescriptor g_private_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_private_set$MH = RuntimeHelper.downcallHandle(
        "g_private_set",
        constants$65.g_private_set$FUNC
    );
    static final FunctionDescriptor g_private_replace$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_private_replace$MH = RuntimeHelper.downcallHandle(
        "g_private_replace",
        constants$65.g_private_replace$FUNC
    );
}


