// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$226 {

    static final FunctionDescriptor g_variant_is_of_type$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_is_of_type$MH = RuntimeHelper.downcallHandle(
        "g_variant_is_of_type",
        constants$226.g_variant_is_of_type$FUNC
    );
    static final FunctionDescriptor g_variant_is_container$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_is_container$MH = RuntimeHelper.downcallHandle(
        "g_variant_is_container",
        constants$226.g_variant_is_container$FUNC
    );
    static final FunctionDescriptor g_variant_classify$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_variant_classify$MH = RuntimeHelper.downcallHandle(
        "g_variant_classify",
        constants$226.g_variant_classify$FUNC
    );
    static final FunctionDescriptor g_variant_new_boolean$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_variant_new_boolean$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_boolean",
        constants$226.g_variant_new_boolean$FUNC
    );
    static final FunctionDescriptor g_variant_new_byte$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_variant_new_byte$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_byte",
        constants$226.g_variant_new_byte$FUNC
    );
    static final FunctionDescriptor g_variant_new_int16$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle g_variant_new_int16$MH = RuntimeHelper.downcallHandle(
        "g_variant_new_int16",
        constants$226.g_variant_new_int16$FUNC
    );
}

