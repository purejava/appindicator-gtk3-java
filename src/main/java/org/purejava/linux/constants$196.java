// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$196 {

    static final FunctionDescriptor g_string_insert_len$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_insert_len$MH = RuntimeHelper.downcallHandle(
        "g_string_insert_len",
        constants$196.g_string_insert_len$FUNC
    );
    static final FunctionDescriptor g_string_append$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_append$MH = RuntimeHelper.downcallHandle(
        "g_string_append",
        constants$196.g_string_append$FUNC
    );
    static final FunctionDescriptor g_string_append_len$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_string_append_len$MH = RuntimeHelper.downcallHandle(
        "g_string_append_len",
        constants$196.g_string_append_len$FUNC
    );
    static final FunctionDescriptor g_string_append_c$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle g_string_append_c$MH = RuntimeHelper.downcallHandle(
        "g_string_append_c",
        constants$196.g_string_append_c$FUNC
    );
    static final FunctionDescriptor g_string_append_unichar$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_string_append_unichar$MH = RuntimeHelper.downcallHandle(
        "g_string_append_unichar",
        constants$196.g_string_append_unichar$FUNC
    );
    static final FunctionDescriptor g_string_prepend$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_string_prepend$MH = RuntimeHelper.downcallHandle(
        "g_string_prepend",
        constants$196.g_string_prepend$FUNC
    );
}


