// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$441 {

    static final FunctionDescriptor g_param_spec_pool_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_param_spec_pool_insert$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_pool_insert",
        constants$441.g_param_spec_pool_insert$FUNC
    );
    static final FunctionDescriptor g_param_spec_pool_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_spec_pool_remove$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_pool_remove",
        constants$441.g_param_spec_pool_remove$FUNC
    );
    static final FunctionDescriptor g_param_spec_pool_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_param_spec_pool_lookup$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_pool_lookup",
        constants$441.g_param_spec_pool_lookup$FUNC
    );
    static final FunctionDescriptor g_param_spec_pool_list_owned$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_param_spec_pool_list_owned$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_pool_list_owned",
        constants$441.g_param_spec_pool_list_owned$FUNC
    );
    static final FunctionDescriptor g_param_spec_pool_list$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_param_spec_pool_list$MH = RuntimeHelper.downcallHandle(
        "g_param_spec_pool_list",
        constants$441.g_param_spec_pool_list$FUNC
    );
    static final FunctionDescriptor GCallback$FUNC = FunctionDescriptor.ofVoid();
}


