// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$211 {

    static final FunctionDescriptor g_key_file_get_locale_for_key$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_locale_for_key$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_locale_for_key",
        constants$211.g_key_file_get_locale_for_key$FUNC
    );
    static final FunctionDescriptor g_key_file_set_locale_string$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_set_locale_string$MH = RuntimeHelper.downcallHandle(
        "g_key_file_set_locale_string",
        constants$211.g_key_file_set_locale_string$FUNC
    );
    static final FunctionDescriptor g_key_file_get_boolean$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_boolean$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_boolean",
        constants$211.g_key_file_get_boolean$FUNC
    );
    static final FunctionDescriptor g_key_file_set_boolean$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_key_file_set_boolean$MH = RuntimeHelper.downcallHandle(
        "g_key_file_set_boolean",
        constants$211.g_key_file_set_boolean$FUNC
    );
    static final FunctionDescriptor g_key_file_get_integer$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_key_file_get_integer$MH = RuntimeHelper.downcallHandle(
        "g_key_file_get_integer",
        constants$211.g_key_file_get_integer$FUNC
    );
    static final FunctionDescriptor g_key_file_set_integer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_key_file_set_integer$MH = RuntimeHelper.downcallHandle(
        "g_key_file_set_integer",
        constants$211.g_key_file_set_integer$FUNC
    );
}


