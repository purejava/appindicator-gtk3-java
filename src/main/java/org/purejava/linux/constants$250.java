// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$250 {

    static final FunctionDescriptor g_warn_message$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_warn_message$MH = RuntimeHelper.downcallHandle(
        "g_warn_message",
        constants$250.g_warn_message$FUNC
    );
    static final FunctionDescriptor g_assert_warning$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_assert_warning$MH = RuntimeHelper.downcallHandle(
        "g_assert_warning",
        constants$250.g_assert_warning$FUNC
    );
    static final FunctionDescriptor g_log_structured_standard$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_log_structured_standard$MH = RuntimeHelper.downcallHandleVariadic(
        "g_log_structured_standard",
        constants$250.g_log_structured_standard$FUNC
    );
    static final FunctionDescriptor GPrintFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GPrintFunc$MH = RuntimeHelper.downcallHandle(
        constants$250.GPrintFunc$FUNC
    );
    static final FunctionDescriptor g_print$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_print$MH = RuntimeHelper.downcallHandleVariadic(
        "g_print",
        constants$250.g_print$FUNC
    );
}

