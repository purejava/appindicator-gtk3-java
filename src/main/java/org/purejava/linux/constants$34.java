// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$34 {

    static final FunctionDescriptor g_error_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_error_free$MH = RuntimeHelper.downcallHandle(
        "g_error_free",
        constants$34.g_error_free$FUNC
    );
    static final FunctionDescriptor g_error_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_error_copy$MH = RuntimeHelper.downcallHandle(
        "g_error_copy",
        constants$34.g_error_copy$FUNC
    );
    static final FunctionDescriptor g_error_matches$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_error_matches$MH = RuntimeHelper.downcallHandle(
        "g_error_matches",
        constants$34.g_error_matches$FUNC
    );
    static final FunctionDescriptor g_set_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_set_error$MH = RuntimeHelper.downcallHandleVariadic(
        "g_set_error",
        constants$34.g_set_error$FUNC
    );
    static final FunctionDescriptor g_set_error_literal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_set_error_literal$MH = RuntimeHelper.downcallHandle(
        "g_set_error_literal",
        constants$34.g_set_error_literal$FUNC
    );
    static final FunctionDescriptor g_propagate_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_propagate_error$MH = RuntimeHelper.downcallHandle(
        "g_propagate_error",
        constants$34.g_propagate_error$FUNC
    );
}

