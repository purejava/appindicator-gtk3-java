// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$174 {

    static final FunctionDescriptor g_source_get_priority$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_priority$MH = RuntimeHelper.downcallHandle(
        "g_source_get_priority",
        constants$174.g_source_get_priority$FUNC
    );
    static final FunctionDescriptor g_source_set_can_recurse$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_source_set_can_recurse$MH = RuntimeHelper.downcallHandle(
        "g_source_set_can_recurse",
        constants$174.g_source_set_can_recurse$FUNC
    );
    static final FunctionDescriptor g_source_get_can_recurse$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_can_recurse$MH = RuntimeHelper.downcallHandle(
        "g_source_get_can_recurse",
        constants$174.g_source_get_can_recurse$FUNC
    );
    static final FunctionDescriptor g_source_get_id$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_id$MH = RuntimeHelper.downcallHandle(
        "g_source_get_id",
        constants$174.g_source_get_id$FUNC
    );
    static final FunctionDescriptor g_source_get_context$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_get_context$MH = RuntimeHelper.downcallHandle(
        "g_source_get_context",
        constants$174.g_source_get_context$FUNC
    );
    static final FunctionDescriptor g_source_set_callback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_source_set_callback$MH = RuntimeHelper.downcallHandle(
        "g_source_set_callback",
        constants$174.g_source_set_callback$FUNC
    );
}

