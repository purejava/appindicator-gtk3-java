// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$241 {

    static final FunctionDescriptor g_variant_builder_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_builder_add",
        constants$241.g_variant_builder_add$FUNC
    );
    static final FunctionDescriptor g_variant_builder_add_parsed$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_builder_add_parsed$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_builder_add_parsed",
        constants$241.g_variant_builder_add_parsed$FUNC
    );
    static final FunctionDescriptor g_variant_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_new",
        constants$241.g_variant_new$FUNC
    );
    static final FunctionDescriptor g_variant_get$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get$MH = RuntimeHelper.downcallHandleVariadic(
        "g_variant_get",
        constants$241.g_variant_get$FUNC
    );
    static final FunctionDescriptor g_variant_new_va$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_va$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_va",
        constants$241.g_variant_new_va$FUNC
    );
    static final FunctionDescriptor g_variant_get_va$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_get_va$MH = RuntimeHelper.downcallHandle(
        "g_variant_get_va",
        constants$241.g_variant_get_va$FUNC
    );
}


