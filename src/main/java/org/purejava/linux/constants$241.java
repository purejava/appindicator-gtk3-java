// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$241 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$241() {}
    static final FunctionDescriptor g_variant_new_variant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_variant$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_variant",
        constants$241.g_variant_new_variant$FUNC
    );
    static final FunctionDescriptor g_variant_new_strv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_variant_new_strv$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_strv",
        constants$241.g_variant_new_strv$FUNC
    );
    static final FunctionDescriptor g_variant_new_objv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_variant_new_objv$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_objv",
        constants$241.g_variant_new_objv$FUNC
    );
    static final FunctionDescriptor g_variant_new_bytestring$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_new_bytestring$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_bytestring",
        constants$241.g_variant_new_bytestring$FUNC
    );
    static final FunctionDescriptor g_variant_new_bytestring_array$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_variant_new_bytestring_array$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_bytestring_array",
        constants$241.g_variant_new_bytestring_array$FUNC
    );
    static final FunctionDescriptor g_variant_new_fixed_array$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_variant_new_fixed_array$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_fixed_array",
        constants$241.g_variant_new_fixed_array$FUNC
    );
}


