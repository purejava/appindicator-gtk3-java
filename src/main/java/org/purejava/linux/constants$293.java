// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$293 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$293() {}
    static final FunctionDescriptor g_match_info_get_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_get_string$MH = RuntimeHelper.downcallHandle(
        "g_match_info_get_string",
        constants$293.g_match_info_get_string$FUNC
    );
    static final FunctionDescriptor g_match_info_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_ref$MH = RuntimeHelper.downcallHandle(
        "g_match_info_ref",
        constants$293.g_match_info_ref$FUNC
    );
    static final FunctionDescriptor g_match_info_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_unref$MH = RuntimeHelper.downcallHandle(
        "g_match_info_unref",
        constants$293.g_match_info_unref$FUNC
    );
    static final FunctionDescriptor g_match_info_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_free$MH = RuntimeHelper.downcallHandle(
        "g_match_info_free",
        constants$293.g_match_info_free$FUNC
    );
    static final FunctionDescriptor g_match_info_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_next$MH = RuntimeHelper.downcallHandle(
        "g_match_info_next",
        constants$293.g_match_info_next$FUNC
    );
    static final FunctionDescriptor g_match_info_matches$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_match_info_matches$MH = RuntimeHelper.downcallHandle(
        "g_match_info_matches",
        constants$293.g_match_info_matches$FUNC
    );
}


