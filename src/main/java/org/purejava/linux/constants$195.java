// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$195 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$195() {}
    static final FunctionDescriptor g_utf8_casefold$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_casefold$MH = RuntimeHelper.downcallHandle(
        "g_utf8_casefold",
        constants$195.g_utf8_casefold$FUNC
    );
    static final FunctionDescriptor g_utf8_normalize$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_utf8_normalize$MH = RuntimeHelper.downcallHandle(
        "g_utf8_normalize",
        constants$195.g_utf8_normalize$FUNC
    );
    static final FunctionDescriptor g_utf8_collate$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_collate$MH = RuntimeHelper.downcallHandle(
        "g_utf8_collate",
        constants$195.g_utf8_collate$FUNC
    );
    static final FunctionDescriptor g_utf8_collate_key$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_collate_key$MH = RuntimeHelper.downcallHandle(
        "g_utf8_collate_key",
        constants$195.g_utf8_collate_key$FUNC
    );
    static final FunctionDescriptor g_utf8_collate_key_for_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_collate_key_for_filename$MH = RuntimeHelper.downcallHandle(
        "g_utf8_collate_key_for_filename",
        constants$195.g_utf8_collate_key_for_filename$FUNC
    );
    static final FunctionDescriptor g_utf8_make_valid$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_make_valid$MH = RuntimeHelper.downcallHandle(
        "g_utf8_make_valid",
        constants$195.g_utf8_make_valid$FUNC
    );
}


