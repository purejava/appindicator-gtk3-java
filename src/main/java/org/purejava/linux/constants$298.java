// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$298 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$298() {}
    static final FunctionDescriptor g_scanner_scope_remove_symbol$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_scope_remove_symbol$MH = RuntimeHelper.downcallHandle(
        "g_scanner_scope_remove_symbol",
        constants$298.g_scanner_scope_remove_symbol$FUNC
    );
    static final FunctionDescriptor g_scanner_scope_lookup_symbol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_scope_lookup_symbol$MH = RuntimeHelper.downcallHandle(
        "g_scanner_scope_lookup_symbol",
        constants$298.g_scanner_scope_lookup_symbol$FUNC
    );
    static final FunctionDescriptor g_scanner_scope_foreach_symbol$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_scope_foreach_symbol$MH = RuntimeHelper.downcallHandle(
        "g_scanner_scope_foreach_symbol",
        constants$298.g_scanner_scope_foreach_symbol$FUNC
    );
    static final FunctionDescriptor g_scanner_lookup_symbol$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_lookup_symbol$MH = RuntimeHelper.downcallHandle(
        "g_scanner_lookup_symbol",
        constants$298.g_scanner_lookup_symbol$FUNC
    );
    static final FunctionDescriptor g_scanner_unexp_token$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_scanner_unexp_token$MH = RuntimeHelper.downcallHandle(
        "g_scanner_unexp_token",
        constants$298.g_scanner_unexp_token$FUNC
    );
    static final FunctionDescriptor g_scanner_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_error$MH = RuntimeHelper.downcallHandleVariadic(
        "g_scanner_error",
        constants$298.g_scanner_error$FUNC
    );
}


