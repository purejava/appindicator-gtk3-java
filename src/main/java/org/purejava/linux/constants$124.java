// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$124 {

    static final FunctionDescriptor g_environ_unsetenv$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_environ_unsetenv$MH = RuntimeHelper.downcallHandle(
        "g_environ_unsetenv",
        constants$124.g_environ_unsetenv$FUNC
    );
    static final FunctionDescriptor g_file_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle g_file_error_quark$MH = RuntimeHelper.downcallHandle(
        "g_file_error_quark",
        constants$124.g_file_error_quark$FUNC
    );
    static final FunctionDescriptor g_file_error_from_errno$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_error_from_errno$MH = RuntimeHelper.downcallHandle(
        "g_file_error_from_errno",
        constants$124.g_file_error_from_errno$FUNC
    );
    static final FunctionDescriptor g_file_test$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_test$MH = RuntimeHelper.downcallHandle(
        "g_file_test",
        constants$124.g_file_test$FUNC
    );
    static final FunctionDescriptor g_file_get_contents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_get_contents$MH = RuntimeHelper.downcallHandle(
        "g_file_get_contents",
        constants$124.g_file_get_contents$FUNC
    );
    static final FunctionDescriptor g_file_set_contents$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_set_contents$MH = RuntimeHelper.downcallHandle(
        "g_file_set_contents",
        constants$124.g_file_set_contents$FUNC
    );
}


