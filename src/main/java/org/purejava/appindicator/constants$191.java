// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$191 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$191() {}
    static final FunctionDescriptor g_utf8_get_char_validated$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_get_char_validated$MH = RuntimeHelper.downcallHandle(
        "g_utf8_get_char_validated",
        constants$191.g_utf8_get_char_validated$FUNC
    );
    static final FunctionDescriptor g_utf8_offset_to_pointer$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_utf8_offset_to_pointer$MH = RuntimeHelper.downcallHandle(
        "g_utf8_offset_to_pointer",
        constants$191.g_utf8_offset_to_pointer$FUNC
    );
    static final FunctionDescriptor g_utf8_pointer_to_offset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_pointer_to_offset$MH = RuntimeHelper.downcallHandle(
        "g_utf8_pointer_to_offset",
        constants$191.g_utf8_pointer_to_offset$FUNC
    );
    static final FunctionDescriptor g_utf8_prev_char$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_prev_char$MH = RuntimeHelper.downcallHandle(
        "g_utf8_prev_char",
        constants$191.g_utf8_prev_char$FUNC
    );
    static final FunctionDescriptor g_utf8_find_next_char$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_find_next_char$MH = RuntimeHelper.downcallHandle(
        "g_utf8_find_next_char",
        constants$191.g_utf8_find_next_char$FUNC
    );
    static final FunctionDescriptor g_utf8_find_prev_char$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_utf8_find_prev_char$MH = RuntimeHelper.downcallHandle(
        "g_utf8_find_prev_char",
        constants$191.g_utf8_find_prev_char$FUNC
    );
}


