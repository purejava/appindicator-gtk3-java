// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$307 {

    static final FunctionDescriptor g_strv_builder_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_strv_builder_new$MH = RuntimeHelper.downcallHandle(
        "g_strv_builder_new",
        constants$307.g_strv_builder_new$FUNC
    );
    static final FunctionDescriptor g_strv_builder_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strv_builder_unref$MH = RuntimeHelper.downcallHandle(
        "g_strv_builder_unref",
        constants$307.g_strv_builder_unref$FUNC
    );
    static final FunctionDescriptor g_strv_builder_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strv_builder_ref$MH = RuntimeHelper.downcallHandle(
        "g_strv_builder_ref",
        constants$307.g_strv_builder_ref$FUNC
    );
    static final FunctionDescriptor g_strv_builder_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strv_builder_add$MH = RuntimeHelper.downcallHandle(
        "g_strv_builder_add",
        constants$307.g_strv_builder_add$FUNC
    );
    static final FunctionDescriptor g_strv_builder_addv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strv_builder_addv$MH = RuntimeHelper.downcallHandle(
        "g_strv_builder_addv",
        constants$307.g_strv_builder_addv$FUNC
    );
    static final FunctionDescriptor g_strv_builder_add_many$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_strv_builder_add_many$MH = RuntimeHelper.downcallHandleVariadic(
        "g_strv_builder_add_many",
        constants$307.g_strv_builder_add_many$FUNC
    );
}


