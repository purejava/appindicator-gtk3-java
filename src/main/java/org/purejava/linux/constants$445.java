// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$445 {

    static final FunctionDescriptor g_closure_add_marshal_guards$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_add_marshal_guards$MH = RuntimeHelper.downcallHandle(
        "g_closure_add_marshal_guards",
        constants$445.g_closure_add_marshal_guards$FUNC
    );
    static final FunctionDescriptor g_closure_set_marshal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_set_marshal$MH = RuntimeHelper.downcallHandle(
        "g_closure_set_marshal",
        constants$445.g_closure_set_marshal$FUNC
    );
    static final FunctionDescriptor g_closure_set_meta_marshal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_set_meta_marshal$MH = RuntimeHelper.downcallHandle(
        "g_closure_set_meta_marshal",
        constants$445.g_closure_set_meta_marshal$FUNC
    );
    static final FunctionDescriptor g_closure_invalidate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_invalidate$MH = RuntimeHelper.downcallHandle(
        "g_closure_invalidate",
        constants$445.g_closure_invalidate$FUNC
    );
    static final FunctionDescriptor g_closure_invoke$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_closure_invoke$MH = RuntimeHelper.downcallHandle(
        "g_closure_invoke",
        constants$445.g_closure_invoke$FUNC
    );
    static final FunctionDescriptor g_cclosure_marshal_generic$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_cclosure_marshal_generic$MH = RuntimeHelper.downcallHandle(
        "g_cclosure_marshal_generic",
        constants$445.g_cclosure_marshal_generic$FUNC
    );
}


