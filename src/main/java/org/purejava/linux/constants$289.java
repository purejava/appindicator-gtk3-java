// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$289 {

    static final FunctionDescriptor g_sequence_move_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_move_range$MH = RuntimeHelper.downcallHandle(
        "g_sequence_move_range",
        constants$289.g_sequence_move_range$FUNC
    );
    static final FunctionDescriptor g_sequence_search$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_search$MH = RuntimeHelper.downcallHandle(
        "g_sequence_search",
        constants$289.g_sequence_search$FUNC
    );
    static final FunctionDescriptor g_sequence_search_iter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_search_iter$MH = RuntimeHelper.downcallHandle(
        "g_sequence_search_iter",
        constants$289.g_sequence_search_iter$FUNC
    );
    static final FunctionDescriptor g_sequence_lookup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_lookup$MH = RuntimeHelper.downcallHandle(
        "g_sequence_lookup",
        constants$289.g_sequence_lookup$FUNC
    );
    static final FunctionDescriptor g_sequence_lookup_iter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_lookup_iter$MH = RuntimeHelper.downcallHandle(
        "g_sequence_lookup_iter",
        constants$289.g_sequence_lookup_iter$FUNC
    );
    static final FunctionDescriptor g_sequence_get$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_get$MH = RuntimeHelper.downcallHandle(
        "g_sequence_get",
        constants$289.g_sequence_get$FUNC
    );
}

