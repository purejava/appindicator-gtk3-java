// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$422 {

    static final FunctionDescriptor g_type_interface_peek$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_interface_peek$MH = RuntimeHelper.downcallHandle(
        "g_type_interface_peek",
        constants$422.g_type_interface_peek$FUNC
    );
    static final FunctionDescriptor g_type_interface_peek_parent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_interface_peek_parent$MH = RuntimeHelper.downcallHandle(
        "g_type_interface_peek_parent",
        constants$422.g_type_interface_peek_parent$FUNC
    );
    static final FunctionDescriptor g_type_default_interface_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_default_interface_ref$MH = RuntimeHelper.downcallHandle(
        "g_type_default_interface_ref",
        constants$422.g_type_default_interface_ref$FUNC
    );
    static final FunctionDescriptor g_type_default_interface_peek$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_type_default_interface_peek$MH = RuntimeHelper.downcallHandle(
        "g_type_default_interface_peek",
        constants$422.g_type_default_interface_peek$FUNC
    );
    static final FunctionDescriptor g_type_default_interface_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_default_interface_unref$MH = RuntimeHelper.downcallHandle(
        "g_type_default_interface_unref",
        constants$422.g_type_default_interface_unref$FUNC
    );
    static final FunctionDescriptor g_type_children$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_type_children$MH = RuntimeHelper.downcallHandle(
        "g_type_children",
        constants$422.g_type_children$FUNC
    );
}

