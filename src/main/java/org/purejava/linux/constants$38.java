// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$38 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$38() {}
    static final FunctionDescriptor g_prefix_error_literal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_prefix_error_literal$MH = RuntimeHelper.downcallHandle(
        "g_prefix_error_literal",
        constants$38.g_prefix_error_literal$FUNC
    );
    static final FunctionDescriptor g_propagate_prefixed_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_propagate_prefixed_error$MH = RuntimeHelper.downcallHandleVariadic(
        "g_propagate_prefixed_error",
        constants$38.g_propagate_prefixed_error$FUNC
    );
    static final FunctionDescriptor g_get_user_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_user_name$MH = RuntimeHelper.downcallHandle(
        "g_get_user_name",
        constants$38.g_get_user_name$FUNC
    );
    static final FunctionDescriptor g_get_real_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_real_name$MH = RuntimeHelper.downcallHandle(
        "g_get_real_name",
        constants$38.g_get_real_name$FUNC
    );
    static final FunctionDescriptor g_get_home_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_home_dir$MH = RuntimeHelper.downcallHandle(
        "g_get_home_dir",
        constants$38.g_get_home_dir$FUNC
    );
    static final FunctionDescriptor g_get_tmp_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_get_tmp_dir$MH = RuntimeHelper.downcallHandle(
        "g_get_tmp_dir",
        constants$38.g_get_tmp_dir$FUNC
    );
}


