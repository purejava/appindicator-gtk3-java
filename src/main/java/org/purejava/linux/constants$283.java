// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$283 {

    static final FunctionDescriptor g_scanner_cur_line$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_cur_line$MH = RuntimeHelper.downcallHandle(
        "g_scanner_cur_line",
        constants$283.g_scanner_cur_line$FUNC
    );
    static final FunctionDescriptor g_scanner_cur_position$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_cur_position$MH = RuntimeHelper.downcallHandle(
        "g_scanner_cur_position",
        constants$283.g_scanner_cur_position$FUNC
    );
    static final FunctionDescriptor g_scanner_eof$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_eof$MH = RuntimeHelper.downcallHandle(
        "g_scanner_eof",
        constants$283.g_scanner_eof$FUNC
    );
    static final FunctionDescriptor g_scanner_set_scope$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_scanner_set_scope$MH = RuntimeHelper.downcallHandle(
        "g_scanner_set_scope",
        constants$283.g_scanner_set_scope$FUNC
    );
    static final FunctionDescriptor g_scanner_scope_add_symbol$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_scope_add_symbol$MH = RuntimeHelper.downcallHandle(
        "g_scanner_scope_add_symbol",
        constants$283.g_scanner_scope_add_symbol$FUNC
    );
    static final FunctionDescriptor g_scanner_scope_remove_symbol$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_scanner_scope_remove_symbol$MH = RuntimeHelper.downcallHandle(
        "g_scanner_scope_remove_symbol",
        constants$283.g_scanner_scope_remove_symbol$FUNC
    );
}

