// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$107 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$107() {}
    static final FunctionDescriptor g_filename_to_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_to_utf8$MH = RuntimeHelper.downcallHandle(
        "g_filename_to_utf8",
        constants$107.g_filename_to_utf8$FUNC
    );
    static final FunctionDescriptor g_filename_from_utf8$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_from_utf8$MH = RuntimeHelper.downcallHandle(
        "g_filename_from_utf8",
        constants$107.g_filename_from_utf8$FUNC
    );
    static final FunctionDescriptor g_filename_from_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_from_uri$MH = RuntimeHelper.downcallHandle(
        "g_filename_from_uri",
        constants$107.g_filename_from_uri$FUNC
    );
    static final FunctionDescriptor g_filename_to_uri$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_to_uri$MH = RuntimeHelper.downcallHandle(
        "g_filename_to_uri",
        constants$107.g_filename_to_uri$FUNC
    );
    static final FunctionDescriptor g_filename_display_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_filename_display_name$MH = RuntimeHelper.downcallHandle(
        "g_filename_display_name",
        constants$107.g_filename_display_name$FUNC
    );
    static final FunctionDescriptor g_get_filename_charsets$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_get_filename_charsets$MH = RuntimeHelper.downcallHandle(
        "g_get_filename_charsets",
        constants$107.g_get_filename_charsets$FUNC
    );
}


