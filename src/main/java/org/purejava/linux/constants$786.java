// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$786 {

    static final FunctionDescriptor g_resolver_lookup_by_name_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_lookup_by_name_finish$MH = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_name_finish",
        constants$786.g_resolver_lookup_by_name_finish$FUNC
    );
    static final FunctionDescriptor g_resolver_lookup_by_name_with_flags_async$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_lookup_by_name_with_flags_async$MH = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_name_with_flags_async",
        constants$786.g_resolver_lookup_by_name_with_flags_async$FUNC
    );
    static final FunctionDescriptor g_resolver_lookup_by_name_with_flags_finish$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_lookup_by_name_with_flags_finish$MH = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_name_with_flags_finish",
        constants$786.g_resolver_lookup_by_name_with_flags_finish$FUNC
    );
    static final FunctionDescriptor g_resolver_lookup_by_name_with_flags$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_lookup_by_name_with_flags$MH = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_name_with_flags",
        constants$786.g_resolver_lookup_by_name_with_flags$FUNC
    );
    static final FunctionDescriptor g_resolver_free_addresses$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_free_addresses$MH = RuntimeHelper.downcallHandle(
        "g_resolver_free_addresses",
        constants$786.g_resolver_free_addresses$FUNC
    );
    static final FunctionDescriptor g_resolver_lookup_by_address$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_resolver_lookup_by_address$MH = RuntimeHelper.downcallHandle(
        "g_resolver_lookup_by_address",
        constants$786.g_resolver_lookup_by_address$FUNC
    );
}

