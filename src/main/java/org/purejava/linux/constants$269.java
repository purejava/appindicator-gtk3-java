// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$269 {

    static final FunctionDescriptor g_random_double$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT);
    static final MethodHandle g_random_double$MH = RuntimeHelper.downcallHandle(
        "g_random_double",
        constants$269.g_random_double$FUNC
    );
    static final FunctionDescriptor g_random_double_range$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle g_random_double_range$MH = RuntimeHelper.downcallHandle(
        "g_random_double_range",
        constants$269.g_random_double_range$FUNC
    );
    static final FunctionDescriptor g_rc_box_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_rc_box_alloc$MH = RuntimeHelper.downcallHandle(
        "g_rc_box_alloc",
        constants$269.g_rc_box_alloc$FUNC
    );
    static final FunctionDescriptor g_rc_box_alloc0$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_rc_box_alloc0$MH = RuntimeHelper.downcallHandle(
        "g_rc_box_alloc0",
        constants$269.g_rc_box_alloc0$FUNC
    );
    static final FunctionDescriptor g_rc_box_dup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rc_box_dup$MH = RuntimeHelper.downcallHandle(
        "g_rc_box_dup",
        constants$269.g_rc_box_dup$FUNC
    );
    static final FunctionDescriptor g_rc_box_acquire$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_rc_box_acquire$MH = RuntimeHelper.downcallHandle(
        "g_rc_box_acquire",
        constants$269.g_rc_box_acquire$FUNC
    );
}


