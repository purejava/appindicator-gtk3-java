// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$473 {

    static final FunctionDescriptor g_object_new_valist$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_new_valist$MH = RuntimeHelper.downcallHandle(
        "g_object_new_valist",
        constants$473.g_object_new_valist$FUNC
    );
    static final FunctionDescriptor g_object_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_set$MH = RuntimeHelper.downcallHandleVariadic(
        "g_object_set",
        constants$473.g_object_set$FUNC
    );
    static final FunctionDescriptor g_object_get$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_get$MH = RuntimeHelper.downcallHandleVariadic(
        "g_object_get",
        constants$473.g_object_get$FUNC
    );
    static final FunctionDescriptor g_object_connect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_connect$MH = RuntimeHelper.downcallHandleVariadic(
        "g_object_connect",
        constants$473.g_object_connect$FUNC
    );
    static final FunctionDescriptor g_object_disconnect$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_disconnect$MH = RuntimeHelper.downcallHandleVariadic(
        "g_object_disconnect",
        constants$473.g_object_disconnect$FUNC
    );
    static final FunctionDescriptor g_object_setv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_object_setv$MH = RuntimeHelper.downcallHandle(
        "g_object_setv",
        constants$473.g_object_setv$FUNC
    );
}


